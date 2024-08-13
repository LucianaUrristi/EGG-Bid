
import java.util.Scanner;

public class TablaMultiplicar {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numero = 0;
        multiplicacion(numero);
        
    }

    public static int multiplicacion(int numero){
        
        while (true) {
            System.out.print("Ingresa un número entero (0 para salir): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            System.out.println("Tabla de multiplicar del " + numero + ":");
            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }
        }
        return numero;
    }
} 
    

