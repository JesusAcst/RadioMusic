package com.aluracursos.radiomusic.principal;

import com.aluracursos.radiomusic.modelos.Cancion;
import com.aluracursos.radiomusic.modelos.Favoritos;
import com.aluracursos.radiomusic.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        cancion1.setAlbum("Forever");
        cancion1.setCantante("Kiss");
        cancion1.setTitulo("cafe");

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("afsdaf");
        podcast1.setPresentador("gbaiolair");

        for (int i = 0; i < 100; i++) {
            cancion1.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            cancion1.reproducir();
        }

        for (int i = 0; i < 100; i++) {
            podcast1.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            podcast1.reproducir();
        }

        System.out.println("Total de reproducciones: "+cancion1.getTotalDeReproducciones());
        System.out.println("Total de megustas: "+cancion1.getTotalDeMegustas());

        Favoritos favoritos = new Favoritos();
        favoritos.adicione(cancion1);
        favoritos.adicione(podcast1);

    }
}