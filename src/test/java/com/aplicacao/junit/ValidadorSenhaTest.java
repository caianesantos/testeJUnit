
package com.aplicacao.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
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
    void naoDeveAceitarSenhaSemMaiuscula() {
        boolean resultado = validador.validacao("senha123");

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

    @ParameterizedTest
    @ValueSource(strings = {"Senha123", "Abcdefg1", "JUnit2026"})
    void deveAceitarVariasSenhasValidas(String senha) {
        assertTrue(validador.validacao(senha));
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", "Ab1", "senha123", "SENHA123", "SenhaTeste"})
    void naoDeveAceitarVariasSenhasInvalidas(String senha) {
        assertFalse(validador.validacao(senha));
    }
}
