package com.javapoobanco.desafiobanco.conta;

import com.javapoobanco.desafiobanco.pessoas.Pessoa;

import lombok.*;

@Getter
@Setter
public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;

    public static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Pessoa pessoa;

    public Conta(Pessoa pessoa) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.pessoa = pessoa;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void imprimirInfosComuns() {
        System.out.printf(String.format("\nTitular: %s", this.pessoa.getNome()));
        System.out.printf(String.format("\nAgência: %d ", this.agencia));
        System.out.printf(String.format("\nNúmero: %d ", this.numero));
        System.out.printf(String.format("\nSaldo: %,2f ", this.saldo));
    }
}
