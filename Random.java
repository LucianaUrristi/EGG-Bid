
// Actividad: Generando números aleatorios
// Escribe un programa que genere y muestre en pantalla 
// un número aleatorio en el rango del 1 al 355  utilizando el 
// método random() de la clase Math. Puedes utilizar el método floor() 
// para redondear el número aleatorio hacia abajo.


public class Random {
    public static void main(String[] args) {
        // double nrandom = Math.random();

        // System.out.println(nrandom); //entre 0 y 1

        int randomInt = (int) (Math.random() * 355);
        System.out.println(randomInt);
    }
}
