package com.javapoobanco.desafiobanco;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("pessoaFisica");

        Conta cc = new ContaCorrente(pf);

        Conta cp = new ContaPoupanca(pf);

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha 1 para cp e 2 para cc");
        int tipoConta = scan.nextInt();

        if (tipoConta == 1) {
            int opcao = 0;
            while (opcao != 4) {
                System.out.println("Escolha um opção");

                System.out.println("1 - Saldo\n"
                        + "2 - Deposito\n"
                        + "3 - Transferência\n"
                        + "4 - Sair\n");

                opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        cp.imprimirExtrato();
                        break;
                    case 2:
                        cp.depositar(456);
                        break;
                    case 3:
                        cp.transferir(100, cc);
                        break;

                    default:
                        break;
                }
            }
        } else {
            int opcao = 0;
            while (opcao != 4) {
                System.out.println("Escolha um opção");

                System.out.println("1 - Saldo\n"
                        + "2 - Deposito\n"
                        + "3 - Transferência\n"
                        + "4 - Sair\n");

                opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        cc.imprimirExtrato();
                        break;
                    case 2:
                        cc.depositar(456);
                        break;
                    case 3:
                        cc.transferir(100, cp);
                        break;

                    default:
                        break;
                }
            }
        }
        
        scan.close();
    }
}
