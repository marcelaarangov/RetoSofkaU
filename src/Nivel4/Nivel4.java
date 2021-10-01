/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel4;

/**
 *
 * @author Home
 */
public class Nivel4 {
 public void Preguntas(int nivel1){
        switch(nivel1){
            case(1):System.out.print("¿Cuál es el álbum musical más vendido de la historia?\na) Fiebre del sábado noche\tb) Colores\nc) Thriller\td)  Back in Black\n -> ");
                    break;
            case(2):System.out.print("\n¿Quién ganó el mundial de fútbol de 2010?\na) Alemania\tb) España\nc) Colombia\td) Chile\n -> ");
                 break;
            case(3): System.out.print("\n ¿Cuál es el futbolista con más balones de oro?\na) Leonel Messi\tb) Cristiano Ronaldo\nc) Maradona\td) James Rodriguez\n -> ");
                 break;
            case(4): System.out.print("\n  ¿Cuántas notas musicales existen?\na) 5\tb) 8\nc) 12\td) 6\n -> ");
                 break;
           case(5): System.out.print("\n¿Dónde se lanzaron las primeras bombas atómicas?\na) China\tb) EEUU\nc) Rusiad) Japon\n -> ");
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
                if(resp == 'b')
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
                if(resp == 'c')
                   acerto = 1;
                else
                   acerto = 0;
                break;
                
            case(5):
                if(resp == 'd')
                   acerto = 1;
                else
                   acerto = 0;
                break;
                   
        }
        return(acerto);
    }
}



