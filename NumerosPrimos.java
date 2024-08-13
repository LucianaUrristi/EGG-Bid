
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPrimos {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count;
        int num = 2; // Primer número a verificar
        int index = 0;

        // Solicitar la cantidad deseada de números primos
        System.out.print("¿Cuántos números primos deseas obtener? ");
        try {
            count = scanner.nextInt();
            if (count <= 0) {
                System.out.println("La cantidad debe ser un número positivo.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Se esperaba un número entero.");
            return;
        }

        // Crear un array para almacenar los números primos
        int[] primos = new int[count];

        // Generar los números primos
        while (index < count) {
            boolean esPrimo = true;

            // Verificar si 'num' es primo
            if (num <= 1) {
                esPrimo = false;
            } else if (num == 2) {
                esPrimo = true; // El 2 es el único número primo par
            } else if (num % 2 == 0) {
                esPrimo = false; // Excluir números pares
            } else {
                // Verificar divisibilidad hasta la raíz cuadrada del número
                for (int i = 3; i <= Math.sqrt(num); i += 2) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            // Si es primo, agregar al array
            if (esPrimo) {
                primos[index] = num;
                index++;
            }

            // Pasar al siguiente número
            num++;
        }

        // Mostrar los números primos
        System.out.print("Los primeros " + count + " números primos son: ");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}