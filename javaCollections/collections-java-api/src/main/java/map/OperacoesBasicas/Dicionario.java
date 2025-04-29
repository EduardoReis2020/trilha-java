package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }else{
            System.out.println("O dicionário está vazio!");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionarioMap.get(palavra);
        if (!dicionarioMap.isEmpty()) {
            if (definicao == null) {
                System.out.println("Palavra não encontrada!");               
            }
        } else {
            System.out.println("O dicionário está vazio!");
        }
        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
    
        // Adicionar palavras e definições
        dicionario.adicionarPalavra("Java", "Uma linguagem de programação.");
        dicionario.adicionarPalavra("Python", "Uma linguagem de programação de alto nível.");
        dicionario.adicionarPalavra("JavaScript", "Uma linguagem de programação para desenvolvimento web.");
        dicionario.adicionarPalavra("HTML", "Linguagem de marcação para criar páginas web.");
        dicionario.adicionarPalavra("CSS", "Linguagem de estilo para estilizar páginas web.");
    
        dicionario.exibirPalavras();
    
        // Remover uma palavra
        dicionario.removerPalavra("JavaScript");

        dicionario.exibirPalavras();
    
        // Pesquisar por uma palavra
        String definicao = dicionario.pesquisarPorPalavra("Java");
        System.out.println("Definição: " + definicao);
    }
}
