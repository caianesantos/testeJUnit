
package com.aplicacao.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    void deveDepositarValorCorretamente() {

        ContaBancaria conta = new ContaBancaria("Ana", 100.0);

        conta.depositar(50.0);

        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    void naoDevePermitirDepositoNegativo() {

        ContaBancaria conta = new ContaBancaria("Ana", 100.0);

        assertThrows(
                IllegalArgumentException.class,
                () -> conta.depositar(-50.0)
        );
    }

    @Test
    void sacar() {
        ContaBancaria conta = new ContaBancaria("Ana", 100);
        conta.sacar(150);

        assertEquals(120, conta.getSaldo());
    }

    @Test
    void naoDevePermitirSaqueMaiorQueSaldo() {
        ContaBancaria conta = new ContaBancaria("Ana", 100.0);

        assertThrows(
                IllegalStateException.class,
                () -> conta.sacar(150.0)
        );
    }

    @Test
    void deveManterSaldoAposSaqueNegado() {
        ContaBancaria conta = new ContaBancaria("Ana", 100.0);

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
