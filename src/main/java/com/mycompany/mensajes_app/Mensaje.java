/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

/**
 *
 * @author SIRACUSA
 */
public class Mensaje {
    int nuIdMensaje;
    String sbMensaje;
    String sbAutorMensaje;
    String dtFechaMensaje;

    public Mensaje() {
    }

    public Mensaje(int nuIdMensaje, String sbMensaje, String sbAutorMensaje, String dtFechaMensaje) {
        this.nuIdMensaje = nuIdMensaje;
        this.sbMensaje = sbMensaje;
        this.sbAutorMensaje = sbAutorMensaje;
        this.dtFechaMensaje = dtFechaMensaje;
    }

    public int getNuIdMensaje() {
        return nuIdMensaje;
    }

    public void setNuIdMensaje(int nuIdMensaje) {
        this.nuIdMensaje = nuIdMensaje;
    }

    public String getSbMensaje() {
        return sbMensaje;
    }

    public void setSbMensaje(String sbMensaje) {
        this.sbMensaje = sbMensaje;
    }

    public String getSbAutorMensaje() {
        return sbAutorMensaje;
    }

    public void setSbAutorMensaje(String sbAutorMensaje) {
        this.sbAutorMensaje = sbAutorMensaje;
    }

    public String getDtFechaMensaje() {
        return dtFechaMensaje;
    }

    public void setDtFechaMensaje(String dtFechaMensaje) {
        this.dtFechaMensaje = dtFechaMensaje;
    }
    
    
}
