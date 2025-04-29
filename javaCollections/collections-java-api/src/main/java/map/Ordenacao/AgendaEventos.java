package main.java.map.Ordenacao;

import java.time.LocalDate;
//import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventosMap);
        System.out.println(eventosOrdenados);
    }

    public void obterProximoEvento() {
        //Set<LocalDate> datas = eventosMap.keySet();
        //Collection<Evento> eventos = eventosMap.values();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Próximo evento: " + proximoEvento + " na data: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2023, 10, 15), "Show de Rock", "Banda X");
        agenda.adicionarEvento(LocalDate.of(2023, 11, 20), "Festival de Jazz", "Artista Y");
        agenda.adicionarEvento(LocalDate.of(2023, 12, 5), "Teatro", "Peça Z");
        agenda.adicionarEvento(LocalDate.of(2025, 04, 27), "Festa de Aniversário", "Amigo A");
        agenda.adicionarEvento(LocalDate.of(2025, 04, 29), "Exposição de Arte", "Artista B");
        agenda.adicionarEvento(LocalDate.of(2025, 05, 01), "Concerto de Música Clássica", "Orquestra C");
        agenda.adicionarEvento(LocalDate.of(2025, 05, 02), "Feira de Artesanato", "Artista D");
        agenda.adicionarEvento(LocalDate.now(), "Festival Gastronômico", "Chef E");
        
        System.out.println("Agenda de Eventos:");
        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }

}
