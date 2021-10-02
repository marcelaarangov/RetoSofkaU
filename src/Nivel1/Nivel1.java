/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel1;

/**
 *
 * @author Home
 */
public class Nivel1 {
    String [] preguntas = new String[6];
    public void Preguntas1(int nivel1){
        preguntas[1]=("¿Quien es el actual presidente de Colombia?\na) Alvaro Uribe\tb) Juan M Santos\nc) Ivan Duque\td) Pastrana\n -> ");
        preguntas[2]=("\n¿Quien descubrio America?\na) Napoleon\tb) Policarpa\nc) Cristobal Colon\td) Carlos I\n -> ");
        preguntas[3]=("\n¿Cual es la capital de Colombia?\na) Medellin\tb) Bogota\nc) Cali\td) Amazonas\n -> ");
        preguntas[4]=("\n¿Cuanto es 10*0+1?\na) 0\tb) 1\nc) 10\td) 11\n -> ");
        preguntas[5]=("\n¿Cual no es un estado de la materia?\na) Liquido\tb) Gaseoso\nc) Espumoso\td) Solido\n -> ");
        System.out.println(preguntas[nivel1]);
        
    }
    
    public int Respuesta1(int nivel1, int resp){
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
                if(resp == 'b')
                   acerto = 1;
                else
                   acerto = 0;
                break;
                
            case(4):
                if(resp == 'b')
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
