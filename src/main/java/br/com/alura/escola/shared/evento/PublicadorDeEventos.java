package br.com.alura.escola.shared.evento;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {
    private List<Ouvinte> ouvintes = new ArrayList<>();

    public void adicionar(Ouvinte ouvinte) {
        this.ouvintes.add(ouvinte);
    }

    public void publicar(Evento evento) {
        this.ouvintes.forEach(ouvinte -> {
            ouvinte.processa(evento);
        });
    }
}
