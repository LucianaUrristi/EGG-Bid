
// Actividad: Calculando el valor absoluto
// Escribe un programa que  pida al usuario un 
// número entero y muestra en pantalla su valor 
// absoluto utilizando el método abs() de la clase Math.

import java.util.Scanner;

public class Absoluto{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingreso un numero: ");
        int numero1 = leer.nextInt();

        int n1 = -1;
        int n2 = 3;

        int absV = Math.abs(n1);
        int absV2 = Math.abs(n2);

        System.out.println("valor absoluto 1: " + absV);
        System.out.println("valor absoluto 2: " + absV2);

        System.out.println("el valor absoluto del número ingresado es: " + Math.abs(numero1));
        leer.close();
    }
    
    
    
}
