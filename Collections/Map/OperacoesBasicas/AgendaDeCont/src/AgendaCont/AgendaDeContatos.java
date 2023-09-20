package AgendaCont;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
	private Map<String, Integer> agendaContatoMap;
	
	public AgendaDeContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisaPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaDeContatos agendaDeContatos = new AgendaDeContatos();
		
		agendaDeContatos.adicionarContato("João", 1234);
		agendaDeContatos.adicionarContato("Laura", 123);
		agendaDeContatos.adicionarContato("Nunes", 12);
		agendaDeContatos.adicionarContato("Natan", 1);
		
		agendaDeContatos.exibirContato();
		
		agendaDeContatos.removerContato("João");
		
		System.out.println("Número do nome pesquisado é: " + agendaDeContatos.pesquisaPorNome("Laura"));
		
	}
	
}
