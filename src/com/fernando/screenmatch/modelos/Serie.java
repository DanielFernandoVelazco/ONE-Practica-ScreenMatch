package com.fernando.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int episodioPorTemporada;
    private int minutoPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public int getMinutoPorEpisodio() {
        return minutoPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public void setMinutoPorEpisodio(int minutoPorEpisodio) {
        this.minutoPorEpisodio = minutoPorEpisodio;
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodioPorTemporada * minutoPorEpisodio;
    }

}
