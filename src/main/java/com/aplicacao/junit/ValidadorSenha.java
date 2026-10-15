package com.aplicacao.junit;

public class ValidadorSenha {

    private static final int tamanhoMinimo = 8;

    public boolean validacao(String senha) {
        if (senha == null || senha.length() < tamanhoMinimo) {
            return false;
        }
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temDigito = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            } else if (Character.isLowerCase(c)) {
                temMinuscula = true;
            } else if (Character.isDigit(c)) {
                temDigito = true;
            }
        }
        return temMaiuscula && temMinuscula && temDigito;
    }
}

