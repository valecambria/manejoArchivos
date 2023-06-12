package org.example;

import org.example.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "D:\\EJERCICIOS JAVA\\archivo\\java.txt";

        ArchivoServicio servicio = new ArchivoServicio();

        servicio.crearArchivo(nombreArchivo);

        servicio.crearArchivo2(nombreArchivo);

    }
}