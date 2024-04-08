package BibliotecaCompleta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Biblioteca;
import Libro;
import Usuario;



public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int idLibro = 3;
        int idUsuario = 1;
        

        while (true) {
        	System.out.println("\n");
            System.out.println("\n Bievenido al Sistema de Gestion de Biblioteca");
            System.out.println("\n");
            System.out.println("1. Agregar un nuevo libro");
            System.out.println("2. Prestar Libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar el Catalogo");
            System.out.println("5. Mostrar Libros Prestados");
            System.out.println("6. Salir");

            System.out.print("Por favor, Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\n Ingrese el titulo del libro: ");
                    scanner.nextLine(); 
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicacion del libro: ");
                    int periodoPublicacion = scanner.nextInt();
                    Libro libro = new Libro(titulo, autor, periodoPublicacion,idLibro);
                    idLibro +=1;
                    biblioteca.agregarLibro(libro);
                    System.out.println("\n 1Libro agregado al catalogo.");
                    break;
                case 2:
                    System.out.print("\n Ingrese el idLibro del libro que desea prestar: ");
                    int idLibroRes = scanner.nextInt();
                    System.out.print("Ingrese el nombre del usuario que tomara prestado el libro: ");
                    scanner.nextLine(); 
                    String nombreUsuario = scanner.nextLine();
                    Usuario usuario = new Usuario(nombreUsuario, idUsuario);
                    idUsuario +=1;
                    biblioteca.prestarLibro(biblioteca.traerLibro(idLibroRes), usuario);
                    System.out.print("\n Libro prestado correctamente a" + nombreUsuario);
                    break;
                case 3:
                    System.out.print("\n Ingrese el indice del libro que desea devolver: ");
                    int indiceDevolucion = scanner.nextInt();
                    biblioteca.devolverLibro(biblioteca.librosPrestados.get(indiceDevolucion));
                    break;
                case 4:
                    biblioteca.mostrarCatalogo();
                    break;
                case 5:
                    biblioteca.mostrarLibrosPrestados();
                    break;
                case 6:
                    System.out.println("\n Adios!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\n Opcion invalida. Por favor, seleccione una opcion valida del menu.");
            }
        }
    }
}

