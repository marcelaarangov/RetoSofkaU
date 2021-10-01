/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel5;

/**
 *
 * @author Home
 */
public class Nivel5 {
   public void Preguntas(int nivel1){
        switch(nivel1){
            case(1):System.out.print("¿Dónde está la Universidad de Harvard?\na) Peru\tb) Mexico\nc) Estados Unidos\td)  Colombia\n -> ");
                    break;
            case(2):System.out.print("\n¿Qué enfermedad provocó la muerte de Stephen Hawking?\na) Cancer\tb) Sida\nc) ELA\td) Pulmonia\n -> ");
                 break;
            case(3): System.out.print("\n  ¿Cuántos corazones tiene un gusano de tierra?\na) 1\tb) 3\nc) 10\td) 5\n -> ");
                 break;
            case(4): System.out.print("\n  ¿Cuál fue la primera película de Disney?\na) Blancanieves y los 7 enanitos \tb) Cruella\nc) La bella y la bestia\td) El rey leon\n -> ");
                 break;
           case(5): System.out.print("\n ¿Cuándo asesinaron al presidente John F. Kennedy?\na) 1962\tb) 1893\nc) 1963d) 1940\n -> ");
                 break;
                    
        }
    }
    
    public int Respuesta(int nivel1, int resp){
        int acerto=0;
        switch (nivel1){
            case(1):
                if(resp == 'c')
                   acerto = 1;
                else
                   acerto = 0;
                break;
                
            case(2):
                if(resp == 'c')
                   acerto = 1;
                else
                   acerto = 0;
                break;
            
            case(3):
                if(resp == 'd')
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
