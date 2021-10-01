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
    public void Preguntas1(int nivel1){
        switch(nivel1){
            case(1):System.out.print("¿Quien es el actual presidente de Colombia?\na) Alvaro Uribe\tb) Juan M Santos\nc) Ivan Duque\td) Pastrana\n -> ");
                    break;
            case(2):System.out.print("\n¿Quien descubrio America?\na) Napoleon\tb) Policarpa\nc) Cristobal Colon\td) Carlos I\n -> ");
                 break;
            case(3): System.out.print("\n¿Cual es la capital de Colombia?\na) Medellin\tb) Bogota\nc) Cali\td) Amazonas\n -> ");
                 break;
            case(4): System.out.print("\n¿Cuanto es 10*0+1?\na) 0\tb) 1\nc) 10\td) 11\n -> ");
                 break;
           case(5): System.out.print("\n¿Cual no es un estado de la materia?\na) Liquido\tb) Gaseoso\nc) Espumoso\td) Solido\n -> ");
                 break;
                    
        }
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
