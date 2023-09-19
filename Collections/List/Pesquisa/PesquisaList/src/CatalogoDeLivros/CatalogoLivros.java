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
	
	public List<Livros> pesquisarPorTitulo(String titulo) {	
		List<Livros> LivroPorTitulo = new ArrayList<>();
		if(!catalogoDeLivros.isEmpty()) {
			for(Livros i : catalogoDeLivros) {
				if(i.getTitulo().equalsIgnoreCase(titulo)) {
					LivroPorTitulo.add(i);
					
				}
			}
		}return LivroPorTitulo;
		
	}
	
	public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livros> LivroPorIntervalo = new ArrayList<>();
		if(!catalogoDeLivros.isEmpty()) {
			for(Livros i: catalogoDeLivros) {
				if(i.getAnoDePublicacao() >= anoInicial && i.getAnoDePublicacao() <= anoFinal) {
					LivroPorIntervalo.add(i);
				}
			}
		}
		return LivroPorIntervalo;
	}
	

		
	
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Harry Potter", "J.K Rowlling", 2000);
		catalogoLivros.adicionarLivro("Mortal Kombat 1", "Eddie", 2007);
		catalogoLivros.adicionarLivro("Mortal Kombat 2", "Eddie", 2016);
		catalogoLivros.adicionarLivro("Mortal Kombat 3", "Eddie", 2020);
		System.out.println(catalogoLivros.pesquisarPorAutor("J.K Rowlling"));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Mortal Kombat 1"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2016, 2020));

	}

}
