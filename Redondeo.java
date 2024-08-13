
// Actividad: Redondeo de números
// Escribe un programa que pida al usuario un 
// número decimal y muestra en pantalla su valor 
// redondeado utilizando el método round() de la clase Math.


public class Redondeo {
    public static void main(String[] args) {
        double n1 = 7.68;
        double n2 = 5.3;

        double redondeado1 = Math.round(n1);
        double redondeado2 = Math.round(n2);
        
        System.out.println("Número 1 redondeado: " + (int) redondeado1);
        System.out.println("Número 2 redondeado: " + redondeado2);                                
    }
}
