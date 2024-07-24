package com.javapoobanco.desafiobanco;
public class ContaPoupanca extends Conta{

    public ContaPoupanca(Pessoa pessoa) {
        super(pessoa); 
    }

    @Override
    public void imprimirExtrato() {
       System.out.println("\n=== Extrato conta poupança ===");

       super.imprimirInfosComuns();
    }

    
}
