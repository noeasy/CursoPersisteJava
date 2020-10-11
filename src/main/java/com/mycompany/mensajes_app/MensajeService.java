/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author SIRACUSA
 */
public class MensajeService {
    public static void crearMensajeDB(Connection connection)
    {
        String mensaje;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        
        mensaje =sc.nextLine();
        
        System.out.println("Escribe tu nombre");
        nombre = sc.nextLine();
        
        Mensaje nuevoMensaje = new Mensaje();
        nuevoMensaje.setSbMensaje(mensaje);
        nuevoMensaje.setSbAutorMensaje(nombre);
        
        MensajeDAO.crearMensajeDB(nuevoMensaje, connection);
    }
    
    public static void listarMensajes(Connection connection) throws SQLException
    {
        ResultSet rs = MensajeDAO.leerMensajeDB(connection);
        
        while(rs.next()){
            System.out.println("ID "+rs.getInt("id_mensaje"));
            System.out.println("Mensaje "+rs.getString("mensaje"));
            System.out.println("Autor "+rs.getString("autor_mensaje"));
            System.out.println("Fecha "+rs.getString("fecha_mensaje"));
        }
                
    }
    
    public static void borrarMensajeDB(Connection connection) throws SQLException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el identificador del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        
        MensajeDAO.borrarMensajeDB(id_mensaje, connection);
    }
    
    public static void actualizarMensajeDB(Connection connection)throws SQLException
    {
        Mensaje mensaje = new Mensaje();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el identificador del mensaje a editar");
        int id_mensaje = sc.nextInt();
        
        System.out.println("Escribe el mensaje a actualizar");
        String sbMensaje = sc.nextLine();
      
        mensaje.setNuIdMensaje(id_mensaje);
        mensaje.setSbMensaje(sbMensaje);
        
        MensajeDAO.actualizarMensajeDB(mensaje,connection);
        
    }
}
