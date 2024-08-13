
import java.util.Scanner;

public class SumaAcumulada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;
        String continuar = "";

        do {
            System.out.print("Ingresa un número entero positivo: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                suma += numero;
            } else {
                System.out.println("El número no es positivo. Inténtalo de nuevo.");
                continue;
            }

            System.out.print("¿Deseas ingresar otro número? (si/no): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("La suma acumulada de todos los números ingresados es: " + suma);

        scanner.close();
    }
}
