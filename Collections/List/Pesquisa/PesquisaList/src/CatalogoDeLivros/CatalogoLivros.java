package CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

import Books.Livros;

public class CatalogoLivros {
	private List<Livros> catalogoDeLivros = new ArrayList<>();
	
	public CatalogoLivros() {
		this.catalogoDeLivros = new ArrayList<>();
	}
	
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao){
			catalogoDeLivros.add(new Livros(titulo, autor, anoPublicacao));	
	}
	
	public List<Livros> pesquisarPorAutor(String autor) {	
		List<Livros> LivroPorAutor = new ArrayList<>();
		if(!catalogoDeLivros.isEmpty()) {
			for(Livros i : catalogoDeLivros) {
				if(i.getAutor().equalsIgnoreCase(autor)) {
					LivroPorAutor.add(i);
					
				}
			}
		}return LivroPorAutor;
	}

		
	
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Harry Potter", "J.K Rowlling", 2000);
		System.out.println(catalogoLivros.pesquisarPorAutor("J.K Rowlling"));

	}

}
