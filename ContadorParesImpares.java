

import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int pares = 0;
        int impares = 0;
        String continuar;

        while (true) {
            System.out.print("Ingresa un número entero: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            System.out.print("¿Deseas ingresar otro número? (si/no): ");
            continuar = scanner.next();

            if (continuar.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        scanner.close();
    }
}
