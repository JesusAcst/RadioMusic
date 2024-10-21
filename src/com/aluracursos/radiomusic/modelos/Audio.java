package com.aluracursos.radiomusic.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int totalDeMegustas;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getTotalDeMegustas() {
        return totalDeMegustas;
    }

    public void setTotalDeMegustas(int totalDeMegustas) {
        this.totalDeMegustas = totalDeMegustas;
    }



    public void meGusta(){
        this.totalDeMegustas++;
    }

    public void reproducir(){
        this.totalDeReproducciones++;
    }


}
