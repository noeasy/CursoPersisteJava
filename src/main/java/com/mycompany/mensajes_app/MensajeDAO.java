/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    public static void leerMensajeDB()
    {
    }
    
    public static void borrarMensajeDB(int id_mensaje)
    {
        
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje)
    {
    }
    
    
    
    
}
