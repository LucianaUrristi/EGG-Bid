
import java.util.Scanner;

public class MiPrimerPrograma{
    public static void main(String[] args) {
    
        int numero = 5;

        numero = numero+ numero;
        System.out.println("el numero es: " + numero);
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero");
        int numero2 = leer.nextInt();
        System.out.println(numero2);

        leer.close();
    }


}

