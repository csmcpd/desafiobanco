package com.javapoobanco.desafiobanco;


import com.javapoobanco.desafiobanco.conta.Conta;
import com.javapoobanco.desafiobanco.conta.ContaCorrente;
import com.javapoobanco.desafiobanco.conta.ContaPoupanca;
import com.javapoobanco.desafiobanco.pessoas.PessoaFisica;
import com.javapoobanco.desafiobanco.pessoas.PessoaJuridica;
import com.javapoobanco.desafiobanco.services.ServiceConta;

public class Teste {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("PessoaFisica");

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Pessoa Juridica");

        Conta cc = new ContaCorrente(pf);

        Conta cp = new ContaPoupanca(pj);

        ServiceConta servico = new ServiceConta();
        servico.contaGeral(cp, cc);
        servico.contaGeral(cc, cp);
        
    }
}
