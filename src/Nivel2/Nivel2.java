/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel2;

/**
 *
 * @author Home
 */
public class Nivel2 {
    String [] preguntas = new String[6];
    public void Preguntas(int nivel2){
        preguntas[1]=("¿Cuál es el río más largo del mundo?\na) El nilo\tb) El amazonas\nc) Congo\td) Amur\n -> ");
        preguntas[2]=("\n ¿Cuál es el país con más habitantes del mundo?\na) Japon\tb) India\nc) EEUU\td) China \n -> ");
        preguntas[3]=("\n ¿Dónde está Transilvania?\na) Rumania\tb) India\nc) Dubai\td) Mexico\n -> ");
        preguntas[4]=("\n ¿Cuál es el océano más grande del mundo?\na) Pacifico\tb) Atlantico\nc) Artico\td) Antartico\n -> ");
        preguntas[5]=("\n¿Cuántos lados tiene un heptágono?\na) 5\tb) 6\nc) 7\td) 4\n -> ");
        System.out.println(preguntas[nivel2]);
            
    }
    
    public int Respuesta(int nivel2, int resp){
        int acerto=0;
        switch (nivel2){
            case(1):
                if(resp == 'a')
                   acerto = 1;
                else
                   acerto = 0;
                break;
                
            case(2):
                if(resp == 'd')
                   acerto = 1;
                else
                   acerto = 0;
                break;
            
            case(3):
                if(resp == 'a')
                   acerto = 1;
                else
                   acerto = 0;
                break;
                
            case(4):
                if(resp == 'a')
                   acerto = 1;
                else
                   acerto = 0;
                break;
                
            case(5):
                if(resp == 'c')
                   acerto = 1;
                else
                   acerto = 0;
                break;
                   
        }
        return(acerto);
    }
}

