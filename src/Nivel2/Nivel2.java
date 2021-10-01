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
    public void Preguntas(int nivel1){
        switch(nivel1){
            case(1):System.out.print("¿Cuál es el río más largo del mundo?\na) El nilo\tb) El amazonas\nc) Congo\td) Amur\n -> ");
                    break;
            case(2):System.out.print("\n ¿Cuál es el país con más habitantes del mundo?\na) Japon\tb) India\nc) EEUU\td) China I\n -> ");
                 break;
            case(3): System.out.print("\n ¿Dónde está Transilvania?\na) Rumania\tb) India\nc) Dubai\td) Mexico\n -> ");
                 break;
            case(4): System.out.print("\n ¿Cuál es el océano más grande del mundo?\na) Pacifico\tb) Atlantico\nc) Artico\td) Antartico\n -> ");
                 break;
           case(5): System.out.print("\n¿Cuántos lados tiene un heptágono?\na) 5\tb) 6\nc) 7td) 4\n -> ");
                 break;
                    
        }
    }
    
    public int Respuesta(int nivel1, int resp){
        int acerto=0;
        switch (nivel1){
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

