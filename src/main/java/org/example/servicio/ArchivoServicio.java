package org.example.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true));) {
            buffer.append("Hola que tal amigos\n")
                    .append("Todo bien?\n")
                    .append("Hasta luego\n");
            //buffer.close();
            System.out.println("El archivo se ha creado con exito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try(PrintWriter print = new PrintWriter(new FileWriter(archivo, true));) {
            print.println("Hola");
            print.println("Todo bien?");
            print.println("Hasta luego\n");
            //buffer.close();
            System.out.println("El archivo se ha creado con exito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            Scanner s = new Scanner(archivo);
            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }
            s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
