
import java.util.InputMismatchException;
import java.util.Scanner;

public class CuadradoDeAsteriscos {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N;

        // Solicitar el tamaño del cuadrado
        System.out.print("Introduce el tamaño del cuadrado (N): ");
        try {
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("El tamaño debe ser un número entero positivo.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Se esperaba un número entero.");
            return;
        }

        // Imprimir el cuadrado hueco de N x N
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Imprimir '*' en los bordes del cuadrado
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' '); // Espacio en el centro
                }
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        scanner.close();
    }
}

