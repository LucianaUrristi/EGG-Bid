
import java.util.Scanner;

public class ContarOcurrencias {
    public static void main(String[] args) {
        
        char[] array = new char[50];
        String frase = "aprendiendojava";
        for (int i = 0; i < frase.length() && i < 50; i++) {
            array[i] = frase.charAt(i);
        }

        
        for (int i = frase.length(); i < 50; i++) {
            array[i] = ' ';
        }

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingresa un carácter objetivo:");
        char target = scanner.next().charAt(0);

        
        int count = 0;
        for (char c : array) {
            if (c == target) {
                count++;
            }
        }

        
        if (count > 0) {
            System.out.println("El carácter \"" + target + "\" aparece " + count + " veces.");
        } else {
            System.out.println("El carácter \"" + target + "\" no aparece en la frase.");
        }

        
        scanner.close();
    }
}
