package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ClaseCadenaTest {

    @org.junit.jupiter.api.Test
    void devuelveIniciales() throws FormatoIncorrectoException {
        String nombreCompleto = "Juan Perez";
        String resultado = ClaseCadena.devuelveIniciales(nombreCompleto);
        assertEquals("JP", resultado);
        String nombreCompleto2 = "Juan Perez Garcia";
        String resultado2 = ClaseCadena.devuelveIniciales(nombreCompleto2);
        assertEquals("JPG", resultado2);
    }
    @org.junit.jupiter.api.Test
    void mostrarMain() {
    }
    @org.junit.jupiter.api.Test
    void auxiliar() {
    }

}