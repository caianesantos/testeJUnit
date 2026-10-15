
package com.aplicacao.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void testeSomar() {
        assertEquals(8, calculadora.somar(5, 3));
    }
    @Test
    void testeSubtrair() {
        assertEquals(2, calculadora.subtrair(5, 3));
    }
    @Test
    void multiplicar(){
        assertEquals(2, calculadora.multiplicar(5, 3));
    }
    @Test
    void dividir(){
        assertEquals(2, calculadora.dividir(5, 3));
    }
}