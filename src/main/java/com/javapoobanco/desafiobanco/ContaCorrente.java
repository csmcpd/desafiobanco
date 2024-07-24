package com.javapoobanco.desafiobanco;
public class ContaCorrente extends Conta {

    public ContaCorrente(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato conta corrente ===");

        super.imprimirInfosComuns();
    }

}
