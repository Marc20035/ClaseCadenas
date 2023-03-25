package org.example;

import java.util.Scanner;

public class ClaseCadena {
    public static String devuelveIniciales(String nombreCompleto) throws FormatoIncorrectoException {
        String[] palabras = nombreCompleto.split(" ");
        String iniciales = "";
        if (nombreCompleto.isEmpty() || nombreCompleto.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (!nombreCompleto.matches("^[a-zA-Z\\s']+$")) {
           throw new FormatoIncorrectoException("El nombre no puede contener números ni caracteres especiales");
        }
        for (String palabra : palabras) {
            iniciales += palabra.charAt(0);
        }
        System.out.println(iniciales);
        return iniciales;
    }
    public void MostrarMain(){
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir){
            try {
                System.out.println("Introduce tu nombre completo: ");
                String nombreCompleto = sc.nextLine();
                devuelveIniciales(nombreCompleto);
                salir = true;
            } catch (FormatoIncorrectoException e){
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    public static void auxiliar(){
        ClaseCadena c = new ClaseCadena();
        c.MostrarMain();
    }
}
