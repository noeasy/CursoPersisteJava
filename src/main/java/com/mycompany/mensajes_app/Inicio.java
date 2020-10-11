/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author SIRACUSA
 */
public class Inicio {
    
    public static void main(String []arg ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection cnx=conexion.get_connection();
        
        
        
        
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        
        do{
            System.out.println("-----------------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. crear mensaje");
            System.out.println("2. listar mensajes");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. Salir");
            
            opcion =sc.nextInt();
            
            switch(opcion){
                case 1:
                    MensajeService.crearMensajeDB(cnx);
                case 2:
                    MensajeService.listarMensajes(cnx);
                case 3:
                    MensajeService.borrarMensajeDB(cnx);
                case 4:
                    MensajeService.actualizarMensajeDB(cnx);
                default:
                    break;
            
            }
            
            
        }while(opcion!=5); 
        
        
        
        
        
        
    }
    
}
