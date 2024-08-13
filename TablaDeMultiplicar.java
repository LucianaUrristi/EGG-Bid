
import java.util.Scanner;


public class TablaDeMultiplicar {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        imprimirTablaMultiplicar();
    }

    public static void imprimirTablaMultiplicar(){
        int numero = pedirNumero();
        System.out.println("Tabla de multiplicar del " + numero + ":");
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
        
    }
    
    public static int pedirNumero(){
        System.out.print("Ingresa un número entero: ");
        int numero = 0;
        numero = scanner.nextInt();

        return numero;
    }

}
