/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SIRACUSA
 */
public class MensajeDAO {
    
    public static void crearMensajeDB(Mensaje mensaje,Connection connection)
    {
        PreparedStatement ps = null;
        
        try{
            String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
            ps=connection.prepareStatement(query);
            ps.setString(1,mensaje.getSbMensaje());
            ps.setString(2,mensaje.getSbAutorMensaje());
            ps.executeUpdate();
            System.out.println("Mensaje creado correctamente");
            
        }catch(SQLException e){
            System.out.println("Error en conexión!! " + e);
        } 
        
        
    }
    
    public static ResultSet leerMensajeDB(Connection connection)
    {
        PreparedStatement ps = null;
        ResultSet         rs = null;
        
        try{
            String query = "select * from mensajes";
            ps=connection.prepareStatement(query);
            rs=ps.executeQuery();
            
        }catch(SQLException e){
            System.out.println("Error en conexión!! " + e);
        }
        return rs; 
            
    }
    
    public static void borrarMensajeDB(int id_mensaje,Connection connection) throws SQLException
    {
        String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id_mensaje);
        int countRowsUpdated = statement.executeUpdate();
        if (countRowsUpdated != 0) {
               System.out.println("..... has been deleted successfully.");
        } else {
              System.out.println("..... was not found.");
         }
        
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje,Connection connection)
    {
        PreparedStatement ps = null;
        
        try{
            String query = "update mensajes set mensaje=? where id_mensaje=?";
            ps=connection.prepareStatement(query);
            ps.setString(1,mensaje.getSbMensaje());
            ps.setInt(2,mensaje.getNuIdMensaje());
            ps.executeUpdate();
            System.out.println("Mensaje creado correctamente");
            
        }catch(SQLException e){
            System.out.println("Error en conexión!! " + e);
        }
    }
    
    
    
    
}
