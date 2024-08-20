/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor con parámetros
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Constructor vacio
    public Libro() {
    }

    //Setters y Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para establecer el número de páginas basado en el cálculo
    public void setPaginas(int numeroIngresado) {
        this.paginas = numeroIngresado * 7;
    }
    
    // Método para imprimir los detalles del libro
    public void imprimirDetalles() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.paginas);
    }

    // Array para almacenar todas las instancias de libros creados
    private static ArrayList<Libro> libros = new ArrayList<>();

    // Método estático para agregar un libro al array
    public static void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método estático para imprimir los títulos de todos los libros disponibles
    public static void imprimirTodosLosLibros() {
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }

    // Método para ingresar los detalles del libro desde el usuario
    public static void ingreso() {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Por favor, ingrese el título del libro.");
            String titulo = leer.nextLine();    
            System.out.println("Por favor, ingrese el número de páginas del libro.");
            int numeroIngresado = leer.nextInt();
            leer.nextLine();
            System.out.println("Por favor, ingrese el autor del libro.");
            String autor = leer.nextLine();
            

        

            // Crear la instancia de Libro y establecer las páginas
            Libro miLibro = new Libro();
            miLibro.setTitulo(titulo);
            miLibro.setAutor(autor);
            miLibro.setPaginas(numeroIngresado);

            // Agregar el libro al array
            agregarLibro(miLibro);

            // Imprimir los detalles del libro
            miLibro.imprimirDetalles();

            // Preguntar al usuario si quiere ingresar otro libro
            System.out.println("¿Desea ingresar otro libro? (s/n):");
            String respuesta = leer.nextLine();

            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        //Imprimir los titulos de todos los libros
        imprimirTodosLosLibros();
    }
}



