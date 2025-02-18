package com.javapoobanco.desafiobanco.conta;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta destino);

    void imprimirExtrato();

}
