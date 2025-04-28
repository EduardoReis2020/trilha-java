package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("A palavra '" + palavra + "' não está no conjunto.");
            }
            
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println("Palavras únicas no conjunto:");
                System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("JavaScript");
        conjunto.adicionarPalavra("Java"); 

        conjunto.exibirPalavrasUnicas(); 

        System.out.println("Verificando se 'Java' está no conjunto: " + conjunto.verificarPalavra("Java"));
        System.out.println("Verificando se 'C++' está no conjunto: " + conjunto.verificarPalavra("C++"));

        conjunto.removerPalavra("Python");
        conjunto.exibirPalavrasUnicas();
        conjunto.removerPalavra("C++"); 
    }
}
