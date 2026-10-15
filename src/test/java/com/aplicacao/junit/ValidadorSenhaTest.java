
package com.aplicacao.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    private final ValidadorSenha validador = new ValidadorSenha();

    @Test
    void deveAceitarSenhaValida() {
        boolean resultado = validador.validacao("Senha123");

        assertTrue(resultado);
    }

    @Test
    void naoDeveAceitarSenhaCurta() {
        boolean resultado = validador.validacao("Ab1");

        assertFalse(resultado);
    }

    @Test
    void naoDeveAceitarSenhaSemNumero() {
        boolean resultado = validador.validacao("SenhaTeste");

        assertFalse(resultado);
    }

    @Test
    void naoDeveAceitarSenhaSemMinuscula() {
        boolean resultado = validador.validacao("SENHA123");

        assertFalse(resultado);
    }

    @Test
    void naoDeveAceitarSenhaNula() {
        boolean resultado = validador.validacao(null);

        assertFalse(resultado);
    }
}
