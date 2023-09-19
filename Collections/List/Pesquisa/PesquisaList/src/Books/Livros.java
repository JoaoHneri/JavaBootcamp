package Books;

public class Livros {
	private String titulo;
	private String Autor;
	private int AnoDePublicacao;
	
	public Livros(String titulo,String Autor, int AnoDePublicacao) {
		// TODO Auto-generated constructor stub
		this.titulo = titulo;
		this.AnoDePublicacao = AnoDePublicacao;
		this.Autor = Autor;
	}
	
	public int getAnoDePublicacao() {
		return AnoDePublicacao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return Autor;
	}
	
	public void setAnoDePublicacao(int anoDePublicacao) {
		AnoDePublicacao = anoDePublicacao;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	@Override
	  public String toString() {
	    return "Livro{" +
	        "titulo='" + titulo + '\'' +
	        ", autor='" + Autor + '\'' +
	        ", anoPublicacao=" + AnoDePublicacao +
	        '}';
	  }
}
