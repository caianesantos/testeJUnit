
package com.aplicacao.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    private ContaBancaria conta;

    @BeforeEach
    void criarConta() {
        conta = new ContaBancaria("Ana", 100.0);
    }

    @Test
    void deveDepositarValorCorretamente() {

        conta.depositar(50.0);

        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    void naoDevePermitirDepositoNegativo() {

        assertThrows(
                IllegalArgumentException.class,
                () -> conta.depositar(-50.0)
        );
    }

    @Test
    void sacar() {
        conta.sacar(30.0);

        assertEquals(70.0, conta.getSaldo());
    }

    @Test
    void naoDevePermitirSaqueMaiorQueSaldo() {

        assertThrows(
                IllegalStateException.class,
                () -> conta.sacar(150.0)
        );
    }

    @Test
    void deveManterSaldoAposSaqueNegado() {

        assertThrows(
                IllegalStateException.class,
                () -> conta.sacar(150.0)
        );

        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    void naoDevePermitirSaldoInicialNegativo() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new ContaBancaria("Ana", -100.0)
        );
    }
}
