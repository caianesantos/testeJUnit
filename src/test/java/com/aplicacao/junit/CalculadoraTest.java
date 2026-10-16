
package com.aplicacao.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertEquals(15, calculadora.multiplicar(5, 3));
    }
    @Test
    void dividir(){
        assertEquals(5, calculadora.dividir(10, 2));
    }
    @Test
    void naoDevePermitirDivisaoPorZero(){
        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.dividir(10, 0)
        );
    }
}
