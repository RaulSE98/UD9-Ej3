

public class Libro {

	int isbn;
	String titulo;
	String autor;
	int n_pag;
	
	public Libro(int isbn, String titulo, String autor, int n_pag) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.n_pag = n_pag;
	}
	
	public int compareTo(Object a) {
		Libro libro1 = (Libro) a;
		if (this.n_pag > libro1.n_pag) {
			return 1;
		} else if (this.n_pag < libro1.n_pag) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Libro con isbn" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", n_pag=" + n_pag + "]";
	}

	public int getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getN_pag() {
		return n_pag;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setN_pag(int n_pag) {
		this.n_pag = n_pag;
	}
	
	
}
