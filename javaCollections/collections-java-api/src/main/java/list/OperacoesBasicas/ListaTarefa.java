package main.java.list.OperacoesBasicas;

import java.util.ArrayList; 
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList; 

    public ListaTarefa() { 
        this.tarefaList = new ArrayList<>(); 
    }

    public void adicionarTarefa(String descricao) { 
        tarefaList.add(new Tarefa(descricao)); 
    }

    public void removerTarefa(String descricao) { 
        tarefaList.removeIf(tarefa -> tarefa.getDescricao().equals(descricao)); 
    }

    public int obterNumeroTotalTarefas() { 
        return tarefaList.size(); 
    }

    public void obterDescricTarefas() { 
        System.out.println(tarefaList); 
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa(); 
        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefas()); 
        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefas()); 
        listaTarefa.removerTarefa("Tarefa 1"); 
        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefas()); 
        listaTarefa.obterDescricTarefas(); 
    }
}
