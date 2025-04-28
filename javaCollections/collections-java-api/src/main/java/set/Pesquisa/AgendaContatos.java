package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!contatosSet.isEmpty()) {
            System.out.println(contatosSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        if (!contatosSet.isEmpty()) {
            for (Contato contato : contatosSet) {
                if (contato.getNome().startsWith(nome)) {
                    contatosEncontrados.add(contato);
                }
            }
            return contatosEncontrados;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        if (!contatosSet.isEmpty()) {
            for (Contato contato : contatosSet) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumero(numero);
                    contatoAtualizado = contato;
                    break;
                }
            }
            return contatoAtualizado;
        } else { 
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Lucas", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("João", 456789123);
        agenda.adicionarContato("Ana", 321654987);
        agenda.adicionarContato("Luana", 654321789);
        agenda.adicionarContato("Maria Feitosa", 789123456);

        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        System.out.println("\nPesquisando contatos que começam com 'Lu':");
        Set<Contato> contatosEncontrados = agenda.pesquisarPorNome("Lu");
        System.out.println(contatosEncontrados);

        System.out.println("\nAtualizando o número do contato 'Maria' para 111222333:");
        Contato contatoAtualizado = agenda.atualizarNumeroContato("Maria", 111222333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("\nContatos na agenda após atualização:");
        agenda.exibirContatos();
    }
}
