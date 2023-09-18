package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List<Tarefa> tarefaList;
	
	public ListaTarefa() {
		// TODO Auto-generated constructor stub
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t: tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);		}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalDeTarfas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O numero total de elementos na lista é de: " + listaTarefa.obterNumeroTotalDeTarfas());
		listaTarefa.adicionarTarefa("Tarfe 1");
		System.out.println("O numero total de elementos na lista é de: " + listaTarefa.obterNumeroTotalDeTarfas());
		System.out.println("O numero total de elementos na lista é de: " + listaTarefa.obterNumeroTotalDeTarfas());
		listaTarefa.obterDescricoesTarefas();
	}
}
