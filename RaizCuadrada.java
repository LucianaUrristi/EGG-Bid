
// Actividad: Calculando la raíz cuadrada
// Escribe un programa que pida al usuario un número positivo
// y calcule su raíz cuadrada utilizando el método sqrt() 
// de la clase Math. Si el número ingresado es negativo, muestra 
// un mensaje adecuado en pantalla.

public class RaizCuadrada {
    public static void main(String[] args) {
        double numero1 = 16;
        
        if(numero1 < 0){
            System.out.println("debe ingresar un número positivo");
        }
        double resultado = (int) Math.sqrt(numero1);

        System.out.println("el resultado es: " + resultado);

    }
}
