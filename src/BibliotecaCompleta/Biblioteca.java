package BibliotecaCompleta;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> librosDisponibles;
    List<Libro> librosPrestados;

    public Biblioteca() {
        this.librosDisponibles = new ArrayList<>();
        this.librosPrestados = new ArrayList<>();
        this.librosDisponibles.add(new Libro("La hojarasca","gabriel garcia marquez",1955,0));
        this.librosDisponibles.add(new Libro("El coronel no tiene quien le escriba","gabriel garcia marquez",1961,1));
        this.librosDisponibles.add(new Libro("Cien años de soledad","gabriel garcia marquez",1967,2));
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        librosDisponibles.remove(libro);
        librosPrestados.add(libro);
        System.out.println("\n El libro '" + libro.toString() + "' ha sido prestado a " + usuario.toString());
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
        librosDisponibles.add(libro);
        System.out.println("\n El libro '" + libro.toString() + "' ha sido devuelto.");
    }

    public void mostrarCatalogo() {
        System.out.println("\n Catalogo de la biblioteca: \n");
        for (Libro libro : librosDisponibles) {
            System.out.println(libro.toString());
        }
    }

    public void mostrarLibrosPrestados() {
        System.out.println("\n Libros prestados: \n");
        for (Libro libro : librosPrestados) {
            System.out.println(libro.toString());
        }
    }
    
    public List<Libro> getLibrosPrestados(){
    	return librosPrestados;
    }

	public List<Libro> getLibrosDisponibles() {
		return librosDisponibles;
	}

	public void setLibrosDisponibles(List<Libro> librosDisponibles) {
		this.librosDisponibles = librosDisponibles;
	}

	public void setLibrosPrestados(List<Libro> librosPrestados) {
		this.librosPrestados = librosPrestados;
	} 
	public Libro traerLibro(int idLibroRes) {
		Libro res = new Libro("no existe libro","no exixte",0000,0);
		for (Libro libro : librosDisponibles  ) {
			if(libro.getIdLibro()==idLibroRes) {
				res = libro;
			}
		}
		return res;
		
		
	} 
    
}
