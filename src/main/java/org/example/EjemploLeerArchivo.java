package org.example;

import org.example.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "D:\\EJERCICIOS JAVA\\archivo\\java.txt";

        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo2(nombreArchivo));
    }
}
