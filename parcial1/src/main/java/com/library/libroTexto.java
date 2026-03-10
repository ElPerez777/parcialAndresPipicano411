package com.library;

public class libroTexto extends libro {
    private String curso;

    public libroTexto() {
        super();
        curso = "";
    }

    public libroTexto(String titulo, String autor, int numEjemplares, int numPrestados, String curso) {
        super(titulo, autor, numEjemplares, numPrestados);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return super.toString() + " curso" + curso;
    }
}