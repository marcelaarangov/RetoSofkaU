/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retopreguntas;

import Jugador.Jugador;
import Nivel1.Nivel1;
import Nivel2.Nivel2;
import Nivel3.Nivel3;
import Nivel4.Nivel4;
import Nivel5.Nivel5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class RetoPreguntas {

    // variables para establecer la conexion a la base de datos
    Conexion cn = new Conexion();
    Connection con;
    Statement st;
    ResultSet rs;

    private Scanner teclado;
    private String respuesta, nombre;
    int resp, acerto = 1, ran, puntos = 0;
    int vec[] = new int[5];
    Nivel1 Nivel1 = new Nivel1();
    Nivel2 Nivel2 = new Nivel2();
    Nivel3 Nivel3 = new Nivel3();
    Nivel4 Nivel4 = new Nivel4();
    Nivel5 Nivel5 = new Nivel5();
    Jugador Participante = new Jugador();

    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.println("Bienvenido a quien quiere ser millonario:");
        System.out.println(".........................................");
        System.out.println("Te hare cinco (5) preguntas, cada pregunta tendrá cuatro (4) opciones de respuesta ");
        System.out.println("solo una (1) será la correcta, debes responder solo con la letra que corresponde a cada respuesta");
        System.out.println("Si contestas correctamente podemos continuar con la otra pregunta, de lo contrario, el juego acabara");
        System.out.println("Sabiendo esto, ¿Quieres jugar? A:SI, B:NO");
        respuesta = teclado.next().toUpperCase();
        if (respuesta.equals("A")) {
            jugar();
        } else {
            System.exit(0);
        }
    }

    public void jugar() {
        Participante.RegistrarJugador();
    }

    public void asignarPreguntasPorNivel(int nivel) {
        switch (nivel) {
            case (1):
                Nivel1.Preguntas1(vec[0]);
                resp = RespDefi();
                acerto = Nivel1.Respuesta1(vec[0], resp);
                break;
            case (2):
                Nivel2.Preguntas(vec[0]);
                resp = RespDefi();
                acerto = Nivel2.Respuesta(vec[0], resp);
                break;
            case (3):
                Nivel3.Preguntas(vec[0]);
                resp = RespDefi();
                acerto = Nivel3.Respuesta(vec[0], resp);
                break;
            case (4):
                Nivel4.Preguntas(vec[0]);
                resp = RespDefi();
                acerto = Nivel4.Respuesta(vec[0], resp);
            case (5):
                Nivel5.Preguntas(vec[0]);
                resp = RespDefi();
                acerto = Nivel5.Respuesta(vec[0], resp);
                break;
        }

    }

    public void jugando() throws IOException {
        int i = 1;
        while (i <= 5 && acerto == 1) {
            Rand(vec);
            asignarPreguntasPorNivel(i);
            Participante.setPuntaje(Participante.getPuntaje() + 10);
            System.out.println("\nPASAS AL  NIVEL " + i + "TU PUNTAJE ACTUAL ES " + Participante.getPuntaje());
            continuarJugando();
            i++;
        }
        if (acerto == 0) {
            System.out.println("HAS PERDIDO \n GRACIAS POR JUGAR");
            System.exit(0);

        } else {
            System.out.println("\n FELICITACIONES HAS GANADO EL JUEGO");
        }
    }

    public void continuarJugando() throws IOException {
        BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nDESEAS ABANDONAR??\ns = SI\t n = NO\n-> ");
        String opc = ent.readLine();
        int salir = opc.charAt(0);
        if (salir == 's') {
            System.out.println("\nSUS PUNTOS SON: " + Participante.getPuntaje());
            System.exit(0);

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        RetoPreguntas juego;
        juego = new RetoPreguntas();
        juego.inicializar();
        juego.jugando();

    }

    static int RespDefi() {
        int resp = 0, defi = 'n';
        try {
            BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
            String res, def;

            while (defi != 's') {
                res = ent.readLine();
                resp = res.charAt(0);
                System.out.print("\nRESPUESTA DEFINITIVA??\ns = SI\t n = NO\n-> ");
                def = ent.readLine();
                defi = def.charAt(0);
                if (defi == 'n') {
                    System.out.print("\nELiga una nueva opcion\t-> ");
                }
            }
        } catch (Exception e) {
        }
        return resp;
    }

    static void Rand(int vec[]) {
        for (int i = 0; i < 5; i++) {
            vec[i] = (int) (Math.random() * 5) + 1;

        }
    }

    // metodo para guardar la lista de ganadores en la base de datos
    public void InsertarPodio() {
        try {
            String sql = "insert into jugador (nombre,puntaje) values"
                    + "('" + Participante.getNombre() + "','" + Participante.getPuntaje() + "')";
            con = cn.getConnection();
            st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Participante Registrado con Exito");
        } catch (Exception e) {
        }
    }
}
