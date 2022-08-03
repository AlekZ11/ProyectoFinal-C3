/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.dao;

import controlador.Conexion;
import controlador.tda.lista.ListaEnlazada;
import controlador.utiles.Utilidades;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LENOVO LEGION 5
 */
public class AdaptadorDao<T> implements InterfazDao<T> {

    private Connection conexion;
    private Class clazz;
    private String ALL = "Select * from ";
    private String ALL_ID;

    public AdaptadorDao(Class clazz) {
        this.clazz = clazz;
        this.conexion = Conexion.getConexion();
        ALL += clazz.getSimpleName().toUpperCase() + " ";
        ALL_ID = ALL + "Where id =";
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public ListaEnlazada<T> listar() {
        ListaEnlazada<T> lista = new ListaEnlazada<>();
        try {

            PreparedStatement stmt = getConexion().prepareStatement(ALL);
            System.out.println("Comando : " + ALL);
            ResultSet resultSet = stmt.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            String[] columna = new String[resultSetMetaData.getColumnCount()];
            for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                columna[i] = resultSetMetaData.getColumnLabel(i + 1);
            }

            while (resultSet.next()) {
                T obj = (T) clazz.getConstructor().newInstance();
                for (int i = 0; i < columna.length; i++) {
                    Object objeto = resultSet.getObject(i + 1);
                    if (objeto != null && objeto.getClass().getName().equals("java.sql.Timestamp")) {
                        Timestamp aux = (Timestamp) objeto;
                        Date fecha = new Date(aux.getTime());
                        Utilidades.cambiarDatos(fecha, columna[i], obj);
                    } else {
                        Utilidades.cambiarDatos(objeto, columna[i], obj);
                    }
                }
                System.out.print(obj.toString());
                lista.insertarCabecera(obj);
            }
            System.out.println("");

        } catch (Exception e) {
            System.out.println("Error al cargar " + e);
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public void guardar(T dato) throws Exception {
        String[] columnas = columnas();
        String comando = "Insert Into " + clazz.getSimpleName().toUpperCase();
        String variables = "";
        String datos = "";
        for (int i = 0; i < columnas.length; i++) {
            if (i == columnas.length - 1) {
                variables += columnas[i];//id, nombres, external_id, ...
                datos += tipoDato(columnas[i], dato);//0, "casa", "343-545
            } else {
                variables += columnas[i] + " , ";
                datos += tipoDato(columnas[i], dato) + " , ";
            }
        }
        comando += " (" + variables + ") values (" + datos + ") ";
        System.out.println("Comando : " + comando);
        try {
            PreparedStatement stmt = getConexion().prepareStatement(comando);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en guardar " + e);
        }
    }

    @Override
    public void modificar(T dato) throws Exception {

        //objeto a modificar ya lo envian desde el metodo
        //reemplazar por valores nuevos
        //enviar el comando
        String[] columnas = columnas();
        String comando = "update  " + clazz.getSimpleName().toLowerCase() + " SET ";
        //String variables = "";
        Object id = null;
        String datos = "";
        for (int i = 0; i < columnas.length; i++) {
            if (!columnas[i].equalsIgnoreCase("id")) {
                if (i == columnas.length - 1) {
                    //variables += columnas[i];//id, nombres, external_id, ...
                    datos += columnas[i] + "=" + tipoDato(columnas[i], dato);//0, "casa", "343-545
                } else {
                    //variables += columnas[i] + " , ";
                    datos += columnas[i] + "=" + tipoDato(columnas[i], dato) + " , ";//0, "casa", "343-545
                }
            } else {
                id = tipoDato(columnas[i], dato);
            }

        }
        comando += datos + " where id = " + id.toString();
        System.out.println("Comando : " + comando);
        try {
            PreparedStatement stmt = getConexion().prepareStatement(comando);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en guardar " + e);
        }

        System.out.println(comando);

    }

    @Override
    public T obtener(Integer id) throws Exception {
        T obj = null;
        String[] columna = columnas();
        PreparedStatement stmt = getConexion().prepareStatement(ALL_ID + id.toString());
        System.out.println("Comando : " + ALL_ID + id);
        ResultSet resultSet = stmt.executeQuery();
        while (resultSet.next()) {
            obj = (T) clazz.getConstructor().newInstance();
            for (int i = 0; i < columna.length; i++) {
                Object objeto = resultSet.getObject(i + 1);
                if (objeto != null && objeto.getClass().getName().equals("java.sql.Timestamp")) {
                    Timestamp aux = (Timestamp) objeto;
                    Date fecha = new Date(aux.getTime());
                    Utilidades.cambiarDatos(fecha, columna[i], obj);
                } else {
                    Utilidades.cambiarDatos(objeto, columna[i], obj);
                }
            }
            System.out.println(obj.toString());
        }
        return obj;
    }

    private String[] columnas() {
        String[] columna = null;
        try {
            String seleccion = ALL;
            PreparedStatement stmt = getConexion().prepareStatement(seleccion);
            ResultSet resultSet = stmt.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            columna = new String[resultSetMetaData.getColumnCount()];
            for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                columna[i] = resultSetMetaData.getColumnLabel(i + 1);
            }
        } catch (Exception ex) {

        }
        return columna;
    }

    private Object tipoDato(String name, T objeto) {
        String aux = "";
        try {
            Field field = (Field) Utilidades.getField(name, clazz);
            char[] arr = name.toCharArray();
            arr[0] = Character.toUpperCase(arr[0]);
            Method method = Utilidades.getMethod("get" + new String(arr), clazz);
            Object dato = method.invoke(objeto);

            if (field.getType().getSimpleName().equals("Date")) {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                aux = (dato != null) ? "\'" + formato.format((Date) dato) + "\'" : "null";
            } else if (field.getType().getSuperclass().getSimpleName().equalsIgnoreCase("Number")) {
                aux = (dato != null) ? dato.toString() : "0";
            } else if (field.getType().getSimpleName().equals("Boolean")) {
                aux = (dato != null) ? dato.toString() : Boolean.FALSE.toString();
            } else {
                aux = (dato != null) ? "\'" + dato + "\'" : "null";
            }
        } catch (Exception e) {
            System.out.println("xxxx " + e);

        }

        return aux;
    }
}
