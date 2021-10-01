/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retopreguntas;

import Nivel1.Nivel1;
import Nivel2.Nivel2;
import Nivel3.Nivel3;
import Nivel4.Nivel4;
import Nivel5.Nivel5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class RetoPreguntas {
    private Scanner teclado;
    private String respuesta, nombre;
    
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
    
    public void jugar (){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = teclado.next();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        RetoPreguntas juego;
        juego = new RetoPreguntas();
        juego.inicializar();
        int resp, acerto, ran;
        int vec[]= new int [5];
        Nivel1 Nivel1 = new Nivel1();
        Nivel2 Nivel2 = new Nivel2();
        Nivel3 Nivel3 = new Nivel3();
        Nivel4 Nivel4 = new Nivel4();
        Nivel5 Nivel5 = new Nivel5();
        
        try {
            Rand(vec);
            Nivel1.Preguntas1(vec[0]);
            resp = RespDefi();
            acerto =Nivel1.Respuesta1(vec[0], resp);
            if(acerto==0){
                System.out.println("HAS PERDIDO \n GRACIAS POR JUGAR");
                System.exit(0);
            }
            else {
                   System.out.println("\nPASAS A LA SIGUIENTE PREGUNTA PUNTOS 10");
                   
                   BufferedReader ent = new BufferedReader (new InputStreamReader (System.in));
                   System.out.print("\nDESEAS ABANDONAR??\ns = SI\t n = NO\n-> ");
                   String opc = ent.readLine();
                   int salir = opc.charAt(0);
                   if (salir == 's'){
                       System.out.println("\nSUS PUNTOS SON: 10");
                       System.exit(0);
                       
                   }
                    
             }
        }catch(Exception e){}
        
        try {
            Rand(vec);
            Nivel2.Preguntas(vec[0]);
            resp = RespDefi();
            acerto =Nivel2.Respuesta(vec[0], resp);
            if(acerto==0){
                System.out.println("HAS PERDIDO \n GRACIAS POR JUGAR");
                System.exit(0);
            }
            else {
                   System.out.println("\nPASAS A LA SIGUIENTE PREGUNTA PUNTOS 20");
                   
                   BufferedReader ent = new BufferedReader (new InputStreamReader (System.in));
                   System.out.print("\nDESEAS ABANDONAR??\ns = SI\t n = NO\n-> ");
                   String opc = ent.readLine();
                   int salir = opc.charAt(0);
                   if (salir == 's'){
                       System.out.println("\nSUS PUNTOS SON: 20");
                       System.exit(0);
                       
                   }
                    
             }
        }catch(Exception e){}
        
        
        try {
            Rand(vec);
            Nivel3.Preguntas(vec[0]);
            resp = RespDefi();
            acerto =Nivel3.Respuesta(vec[0], resp);
            if(acerto==0){
                System.out.println("HAS PERDIDO \n GRACIAS POR JUGAR");
                System.exit(0);
            }
            else {
                   System.out.println("\nPASAS A LA SIGUIENTE PREGUNTA PUNTOS 30");
                   
                   BufferedReader ent = new BufferedReader (new InputStreamReader (System.in));
                   System.out.print("\nDESEAS ABANDONAR??\ns = SI\t n = NO\n-> ");
                   String opc = ent.readLine();
                   int salir = opc.charAt(0);
                   if (salir == 's'){
                       System.out.println("\nSUS PUNTOS SON: 30");
                       System.exit(0);
                       
                   }
                    
             }
        }catch(Exception e){}
        
        try {
            Rand(vec);
            Nivel4.Preguntas(vec[0]);
            resp = RespDefi();
            acerto =Nivel4.Respuesta(vec[0], resp);
            if(acerto==0){
                System.out.println("HAS PERDIDO \n GRACIAS POR JUGAR");
                System.exit(0);
            }
            else {
                   System.out.println("\nPASAS A LA SIGUIENTE PREGUNTA PUNTOS 40");
                   
                   BufferedReader ent = new BufferedReader (new InputStreamReader (System.in));
                   System.out.print("\nDESEAS ABANDONAR??\ns = SI\t n = NO\n-> ");
                   String opc = ent.readLine();
                   int salir = opc.charAt(0);
                   if (salir == 's'){
                       System.out.println("\nSUS PUNTOS SON: 40");
                       System.exit(0);
                       
                   }
                    
             }
        }catch(Exception e){}
        
        try {
            Rand(vec);
            Nivel5.Preguntas(vec[0]);
            resp = RespDefi();
            acerto =Nivel5.Respuesta(vec[0], resp);
            if(acerto==0){
                System.out.println("HAS PERDIDO \n GRACIAS POR JUGAR");
                System.exit(0);
            }
            else {
                   System.out.println("\nHAS GANADO PUNTOS: 50");
                   
                    
             }
        }catch(Exception e){}
        
    }
    static int RespDefi(){
        int resp=0, defi='n';
        try
      {
         BufferedReader ent = new BufferedReader (new InputStreamReader (System.in));
         String res,def;
         
         while(defi!='s')
          {
             res = ent.readLine();
             resp= res.charAt(0);
             System.out.print("\nRESPUESTA DEFINITIVA??\ns = SI\t n = NO\n-> ");
             def = ent.readLine();
             defi = def.charAt(0);
             if(defi == 'n')
                System.out.print("\nELiga una nueva opcion\t-> ");
          }
      }
      catch(Exception e){}
       return resp;
    }
    
    static void Rand(int vec[]){
        for(int i=0; i<5; i++){
            vec[i]= (int)(Math.random()*5)+1;
        for(int j=0;j<5;j++)
            if(vec[i]==vec[j] && i!=j && i>0) //aseguramos que no se repitan los numeros
               i--;
        }
    }
    
    
}
