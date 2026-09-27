import javax.swing.*;
import java.util.Scanner;

public class Entrada {
   public static void main(String[] args){
      Scanner leer = new Scanner(System.in);

      int edad, futuro, resultado;
      System.out.println("INGRESE SU EDAD:");

      edad = Integer.parseInt(leer.nextLine());
      System.out.println("INGRESE LOS AÑOS QUE QUIERE SUMAR");

      futuro = Integer.parseInt(leer.nextLine());
         System.out.println("NUMERO DE AÑOS AGREGADOS");

         resultado = (edad + futuro);
                 System.out.println("SU EDAD FUTURA ES...");
                 System.out.println(resultado);


   }
    }

