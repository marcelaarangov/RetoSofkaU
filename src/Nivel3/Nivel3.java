
package Nivel3;

/**
 *
 * @author Home
 */
public class Nivel3 {
    String [] preguntas = new String[6];
    public void Preguntas(int nivel3){
        preguntas[1]=("¿Cuál es el animal que más muertes provoca cada año?\na) Leon\tb) tigre\nc) Mosquito\td) raton\n -> ");
        preguntas[2]=("\n¿Cuál es el nombre de especie de los seres humanos?\na) Homo sapiens sapiens\tb) Homo sapiens\nc) Personas\td) Humanos\n -> ");
        preguntas[3]=("\n ¿Qué religión tiene la Torá como su libro sagrado?\na) Cristiana\tb) Judia\nc) Budista\td) Catolica\n -> ");
        preguntas[4]=("\n  ¿Cuántos huesos tiene el cuerpo humano?\na) 206\tb) 105\nc) 200\td) 320\n -> ");
        preguntas[5]=("\n¿Cuál es el animal más grande de la Tierra?\na) Jirafa\tb) Hipopotamo\nc) Ballena azultd) Elefante\n -> ");
        System.out.println(preguntas[nivel3]);
    }
    
    public int Respuesta(int nivel3, int resp){
        int acerto=0;
        switch (nivel3){
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


