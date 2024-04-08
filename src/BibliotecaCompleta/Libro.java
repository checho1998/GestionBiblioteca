package BibliotecaCompleta;

class Libro {
    private String titulo;
    private String autor;
    private int periodoPublicacion;
    private int idLibro;

    public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public Libro(String titulo, String autor, int periodoPublicacion,int idLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.periodoPublicacion = periodoPublicacion;
        this.idLibro = idLibro;
    }

    @Override
    public String toString() {
        return "Libro " +
                "Titulo: " + titulo + ' ' +
                " Autor: " + autor + ' ' +
                " Año Publicacion: " + periodoPublicacion + ' ' +
                " Id Libro:" + idLibro ;
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPeriodoPublicacion() {
		return periodoPublicacion;
	}

	public void setPeriodoPublicacion(int periodoPublicacion) {
		this.periodoPublicacion = periodoPublicacion;
	}
    
}
