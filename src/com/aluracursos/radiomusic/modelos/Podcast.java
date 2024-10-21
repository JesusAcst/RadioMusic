package com.aluracursos.radiomusic.modelos;

import com.aluracursos.radiomusic.calculos.Clasificacion;

public class Podcast extends Audio {
    private String presentador;
    private String desccripcion;

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDesccripcion() {
        return desccripcion;
    }

    public void setDesccripcion(String desccripcion) {
        this.desccripcion = desccripcion;
    }

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() >= 2000) {
            return 9;
        } else {
            return 2;
        }
    }

}
