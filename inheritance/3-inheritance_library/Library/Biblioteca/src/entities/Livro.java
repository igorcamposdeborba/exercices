package entities;

public class Livro extends ItemBibliografico {
	private String autor;
	
	public Livro(String titulo, int anoPublicacao, String autor) {
		super(titulo, anoPublicacao); 
		
		this.autor = autor;
	}
	
	// Access methods
	public String getAutor() {
		return autor;
	}
	
	// Logic methods						// Comparar se os objetos são do tipo Livro
	public <T> boolean equalsLivro(T obj) { // tipo genérico do tipo T (generics): porque posso receber por parâmetro Livro ou Revista
		if (obj instanceof Livro) {
			Livro varLivro = (Livro) obj; // downcasting
			return this.autor.equals(varLivro.getAutor()); // é equals porque é da classe String. Objetos ficam no heap da memória ram
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return super.getTitulo() + " - " + super.getAnoPublicacao() + " - " + this.autor;
	}
}
