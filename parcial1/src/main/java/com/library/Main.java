package com.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        libro libro1 = new libro("LOS MARCIANOS", "KIM STANLEY ROBINSON", 5, 2);
        System.out.println(libro1);

        libro libro2 = new libro();
        Scanner entrada = new Scanner(System.in);

        System.out.println("datos para el libro");
        System.out.print("titulo: ");
        libro2.setTitulo(entrada.nextLine());
        System.out.print("autor: ");
        libro2.setAutor(entrada.nextLine());
        System.out.print("numero de ejemplares");
        libro2.setNumEjemplares(entrada.nextInt());
        System.out.print("numero de ejemplares prestados");
        libro2.setNumPrestados(entrada.nextInt());
        entrada.nextLine(); 
        System.out.println(libro2);

        textoUniajc libroUniajc = new textoUniajc(
            "Matematicas Basicas",
            "Carlos Lopez",
            10,
            4,
            "Calculo 1",
            "Ingenieria"
        );
        System.out.println("\n" + libroUniajc);

        novela novela = new novela("2001", "Sangre de campeon sin cadenas", 8, 1, "superacion personal");
        System.out.println(novela);

        System.out.println("\n--- Pruebas de prestamo y devolucion ---");
        System.out.println("libro1: " + libro1);
        System.out.println("Intentando prestamo de libro1: " + libro1.prestamo());
        System.out.println("Despues del prestamo: " + libro1);
        System.out.println("Intentando devolucion de libro1: " + libro1.devolucion());
        System.out.println("Despues de la devolucion: " + libro1);

        System.out.println("\n" + libroUniajc);
        System.out.println("Intentando prestamo de libroUniajc: " + libroUniajc.prestamo());
        System.out.println("Despues del prestamo: " + libroUniajc);

        libroUniajc.setNumPrestados(libroUniajc.getNumEjemplares());
        System.out.println("Ahora todos los ejemplares prestados, disponibilidad: " +
            (libroUniajc.getNumEjemplares() - libroUniajc.getNumPrestados()));
        System.out.println("Intentando prestamo otra vez: " + libroUniajc.prestamo());
    }
}