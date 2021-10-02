/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Jugador {

    public Scanner teclado;
    public String nombre;
    int puntaje=0;

    public void RegistrarJugador() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = teclado.next();
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }
    
 
}
