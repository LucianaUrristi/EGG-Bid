
import java.util.InputMismatchException;
import java.util.Scanner;

public class GraficoDeBarras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        // Solicitar 4 números entre 1 y 20
        System.out.println("Introduce 4 números entre 1 y 20:");

        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                try {
                    numbers[i] = scanner.nextInt();
                    if (numbers[i] >= 1 && numbers[i] <= 20) {
                        break;
                    } else {
                        System.out.println("Error: El número debe estar entre 1 y 20.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Se esperaba un número entero.");
                    scanner.next(); // Limpiar el buffer del scanner
                }
            }
        }

        // Imprimir el gráfico de barras
        System.out.println("\nGráfico de Barras:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        scanner.close();
    }
}
