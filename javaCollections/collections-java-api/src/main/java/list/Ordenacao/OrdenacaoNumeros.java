package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }
    
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendetes = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendetes);
            return numerosAscendetes;
        }else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendetes = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosDescendetes, Collections.reverseOrder());
            return numerosDescendetes;
        }else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println("Lista de números: " + this.numerosList);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
        ordenacao.adicionarNumero(5);
        ordenacao.adicionarNumero(2);
        ordenacao.adicionarNumero(8);
        ordenacao.adicionarNumero(1);
        ordenacao.adicionarNumero(4);

        System.out.println("Lista original:");
        ordenacao.exibirNumeros();

        System.out.println("Lista ordenada em ordem ascendente:");
        System.out.println(ordenacao.ordenarAscendente());
        ordenacao.exibirNumeros();

        System.out.println("Lista ordenada em ordem descendente:");
        System.out.println(ordenacao.ordenarDescendente());
        ordenacao.exibirNumeros();
    }
}
