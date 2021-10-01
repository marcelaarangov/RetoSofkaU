/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel3;

/**
 *
 * @author Home
 */
public class Nivel3 {
  public void Preguntas(int nivel1){
        switch(nivel1){
            case(1):System.out.print("¿Cuál es el animal que más muertes provoca cada año?\na) Leon\tb) tigre\nc) Mosquito\td) raton\n -> ");
                    break;
            case(2):System.out.print("\n¿Cuál es el nombre de especie de los seres humanos?\na) Homo sapiens sapiens\tb) Homo sapiens\nc) Personas\td) Humanos\n -> ");
                 break;
            case(3): System.out.print("\n ¿Qué religión tiene la Torá como su libro sagrado?\na) Cristiana\tb) Judia\nc) Budista\td) Catolica\n -> ");
                 break;
            case(4): System.out.print("\n  ¿Cuántos huesos tiene el cuerpo humano?\na) 206\tb) 105\nc) 200\td) 320\n -> ");
                 break;
           case(5): System.out.print("\n¿Cuál es el animal más grande de la Tierra?\na) Jirafa\tb) Hipopotamo\nc) Ballena azultd) Elefante\n -> ");
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
                if(resp == 'a')
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


