package org.example;

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
}
