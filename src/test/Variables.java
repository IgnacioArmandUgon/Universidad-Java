package test;

public class Variables {

         public static void main(String args[]) {
             int a = (int)10E2;
             String name = "Chris";
             System.out.println();
             System.out.println("¡Hola, mundo!");

             char decimalUnicode = 92;
             System.out.println(decimalUnicode);

             boolean mayor = a > 100;

             int num = 2;
             String resultado = (num % 2 == 0) ? "es par" : "no es par";
             System.out.println(num + " " + resultado);
         }
}
