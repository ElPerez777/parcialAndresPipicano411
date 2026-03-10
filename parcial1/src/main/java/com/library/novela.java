package com.library;

public class novela extends libro {
    private String tipo;

    public novela() {
        super();
        tipo = "";
    }

    public novela(String titulo, String autor, int numEjemplares, int numPrestados, String tipo) {
        super(titulo, autor, numEjemplares, numPrestados);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return super.toString() + " tipo novela:" + tipo;
    }
}