package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao) {
        Tarefa tarefaARemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaARemover = tarefa;
                    break;
                }
            }
            tarefasSet.remove(tarefaARemover);
        } else {
            System.out.println("O conjunto está vazio!");
        }

        if (tarefaARemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (tarefa.isConcluida()) {
                    tarefasConcluidas.add(tarefa);
                }
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (!tarefa.isConcluida()) {
                    tarefasPendentes.add(tarefa);
                }
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa.setConcluida(true);
                    break;
                }
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa.setConcluida(false);
                    break;
                }
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
    
    public void limparListaTarefas() {
        if (!tarefasSet.isEmpty()) {
            tarefasSet.clear();
            System.out.println("Lista de tarefas limpa!");
        }else{
            System.out.println("O conjunto já está vazio!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer compras");
        lista.adicionarTarefa("Limpar a casa");
        lista.adicionarTarefa("Ler um livro");
        lista.adicionarTarefa("Praticar esportes");

        System.out.println("Lista de tarefas:");
        lista.exibirTarefas();

        System.out.println("\nContando tarefas:");
        System.out.println(lista.contarTarefas());

        System.out.println("\nMarcar tarefa concluída:");
        lista.marcarTarefaConcluida("Estudar Java");
        lista.marcarTarefaConcluida("Ler um livro");
        System.out.println(lista.obterTarefasConcluidas());

        System.out.println("\nMarcar tarefa pendente:");
        lista.marcarTarefaPendente("Estudar Java");
        System.out.println(lista.obterTarefasPendentes());

        System.out.println("\nRemover tarefa:");
        lista.removerTarefa("Fazer compras");
        lista.exibirTarefas();

        System.out.println("\nLimpar lista de tarefas:");
        lista.limparListaTarefas();
        lista.exibirTarefas();
    }
}
