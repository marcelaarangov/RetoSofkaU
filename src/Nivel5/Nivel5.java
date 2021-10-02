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
     String [] preguntas = new String[6];
    public void Preguntas(int nivel5){
        preguntas[1]=("¿Dónde está la Universidad de Harvard?\na) Peru\tb) Mexico\nc) Estados Unidos\td)  Colombia\n -> ");
        preguntas[2]=("\n¿Qué enfermedad provocó la muerte de Stephen Hawking?\na) Cancer\tb) Sida\nc) ELA\td) Pulmonia\n -> ");
        preguntas[3]=("\n  ¿Cuántos corazones tiene un gusano de tierra?\na) 1\tb) 3\nc) 10\td) 5\n -> ");
        preguntas[4]=("\n  ¿Cuál fue la primera película de Disney?\na) Blancanieves y los 7 enanitos \tb) Cruella\nc) La bella y la bestia\td) El rey leon\n -> ");
        preguntas[5]=("\n ¿Cuándo asesinaron al presidente John F. Kennedy?\na) 1962\tb) 1893\nc) 1963d) 1940\n -> ");
        System.out.println(preguntas[nivel5]);
    }
    
    public int Respuesta(int nivel5, int resp){
        int acerto=0;
        switch (nivel5){
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
