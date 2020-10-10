/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
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
    
    public static void listarMensajes()
    {
    }
    
    public static void borrarMensajeDB()
    {
        
    }
    
    public static void actualizarMensajeDB()
    {
    }
}
