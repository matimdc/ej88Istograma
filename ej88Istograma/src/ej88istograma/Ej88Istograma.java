/*
https://github.com/matimdc/ej88Istograma.git
8.8) En un colegio existe la posibilidad de elegir, en la materia "lengua extranjera", entre las
siguientes opciones: [I]nglés, [F]rancés, [P]ortugués y [A]lemán. Se ingresa, para cada
alumno, la lengua elegida. La computadora muestra el porcentaje de alumnos que eligió cada
lengua, en forma de número y en forma gráfica (histograma), utilizando líneas hechas con
asteriscos.
 */
package ej88istograma;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ej88Istograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

      String [] alumnos = {"Alberti", "Azcuénaga", "Belgrano", "Castelli", "Larrea", "Matheu", "Moreno", "Paso", "Saavedra"};
        
        for (int i = 0; i < alumnos.length; i++) {
            
          
          System.out.println(alumnos[i]); 
            
            
        }
        
        
    }
    
}
