package com.javapoobanco.desafiobanco.services;

import java.util.Scanner;

import com.javapoobanco.desafiobanco.conta.Conta;

public class ServiceConta {

    Scanner scan = new Scanner(System.in);

    public void contaGeral(Conta conta, Conta contaGeral) {

        System.out.println("Seja bem vindo ao Banco Sr. " + conta.getPessoa().getNome());

        System.out.println("Por favor informe qual opração deseja realizar\n\n");

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
                    conta.imprimirExtrato();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado");
                    int valor = scan.nextInt();
                    conta.depositar(valor);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido");
                    int valorTransferido = scan.nextInt();

                    conta.transferir(valorTransferido, conta);
                    break;

                default:
                    break;
            }
        }
    }

}
