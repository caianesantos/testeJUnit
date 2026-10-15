package com.aplicacao.junit;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
    public int subtrair(int a, int b) {
        return a - b;
    }
    public int multiplicar(int a, int b) {
        return a * b;
    }
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero é indeterminada. Por favor, digite uma divisão valida");
        }
        return (double) a / b;
    }
}

