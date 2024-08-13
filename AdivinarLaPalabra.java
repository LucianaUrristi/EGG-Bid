import java.util.Arrays;
import java.util.Scanner;

public class AdivinarLaPalabra {

    public static void main(String[] args) {
        // Utiliza un array de strings para almacenar una lista de palabras predefinidas.
        String[] listaPalabras = {"casa", "perro", "gato", "computadora", "java", "programacion", "teclado"};

        //palabraSecreta llama a la funcion seleccionar palabra aleatoria pasandole el array de palabras como parametro
        String palabraSecreta = seleccionarPalabraAleatoria(listaPalabras);

        //pista llama a la funcion obtenerPista pasandole la palabra secreta como parametro
        String pista = obtenerPista(palabraSecreta);

        int intentosMaximos = 10, intentosRealizados = 0;
        boolean adivinado = false;
        //Crea un nuevo arreglo de caracteres con una longitud igual a la longitud de palabraSecreta.
        char[] progreso = new char[palabraSecreta.length()];

        //llena todo el arreglo pista con el carácter '_'. Esto establece todos los elementos del arreglo como '_'
        Arrays.fill(progreso, '_');

        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido al juego de adivinar la palabra!");
        System.out.println("Tienes " + intentosMaximos + " intentos para adivinar la palabra.");
        System.out.println("Pista: " + pista);

        while (intentosRealizados < intentosMaximos && !adivinado) {
            System.out.print("Ingresa una letra: ");
            char letra = scan.next().charAt(0);

            //llama a comprobarLetra pasandole varios parametros
            if (comprobarLetra(palabraSecreta, progreso, letra, 0)) {
                System.out.println("¡Correcto! La letra " + letra + " está en la palabra.");
            } else {
                System.out.println("La letra " + letra + " no está en la palabra.");
            }

            intentosRealizados++;
            System.out.println("Progreso: " + new String(progreso));

            if (new String(progreso).equals(palabraSecreta)) {
                adivinado = true;
            }
        }

        if (adivinado) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Lo siento, no has adivinado la palabra. La palabra era: " + palabraSecreta);
        }

        scan.close();
    }

    // Método para seleccionar una palabra aleatoria del array
    public static String seleccionarPalabraAleatoria(String[] listaPalabras) {
        int indice = (int) (Math.random() * listaPalabras.length);
        return listaPalabras[indice];
    }

    // Método para obtener una pista de la palabra seleccionada
    public static String obtenerPista(String palabraSecreta) {
        //Crea un nuevo arreglo de caracteres con una longitud igual a la longitud de palabraSecreta.
        char[] pista = new char[palabraSecreta.length()];

        //llena todo el arreglo pista con el carácter '_'. Esto establece todos los elementos del arreglo como '_'
        Arrays.fill(pista, '_');
        
        //Crea un nuevo objeto String usando el arreglo de caracteres pista. El constructor de String convierte el
        // arreglo de caracteres en una cadena de texto.
        return new String(pista);
    }
    
    // Método recursivo para comprobar si una letra está en la palabra y actualizar el progreso
    public static boolean comprobarLetra(String palabraSecreta, char[] progreso, char letra, int indice) {
        if (indice >= palabraSecreta.length()) {
            return false;
        }
        // Variable para rastrear si la letra fue encontrada
        boolean encontrada = false;

        // Comparar cada carácter de la palabra secreta con la letra proporcionada
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                // Actualizar progreso con la letra encontrada
                progreso[i] = letra;
                // Marcar que se encontró la letra
                encontrada = true;
            }
        }
        // Llamada recursiva para continuar comprobando en el siguiente índice
        return encontrada || comprobarLetra(palabraSecreta, progreso, letra, indice + 1);
    }

}