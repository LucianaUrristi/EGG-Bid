
import java.util.Scanner;


public class TablaDeMultiplicar2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = pedirNumero();
        imprimirTablaMultiplicar(numeros);
    }

    public static void imprimirTablaMultiplicar(int[] numeros) {
        for (int j = 0; j < numeros.length; j++) {
            int numero = numeros[j];
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.println();
        }       
    }
    
    public static int[] pedirNumero(){        
        int[] numeros = new int[3];
        System.out.println("Por favor, ingresa 3 numeros: " + "\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son: ");
        for (int i : numeros) {
            System.out.println(i);
        }
        
        scanner.close();
        
        return numeros;
    }

}
