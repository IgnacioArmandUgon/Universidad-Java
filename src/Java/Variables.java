package Java;

import java.net.StandardSocketOptions;

public class Variables {

         public static void main(String args[]) {
             int a = (int)10E2;
             var laVar = "asd";
             String name = "Nacho";
             System.out.println();
             System.out.println("Hola mundo");

             char decimalUnicode = 92;
             System.out.println(decimalUnicode);

             boolean mayor = a>100;

             var num = 2;
             var resultado = (num % 2 == 0) ? "es par" : "no es par";
             System.out.println(num + " " + resultado);

         }

}
