package org.sistemaBancario.controller;

import org.sistemaBancario.model.ContaModel;
import org.sistemaBancario.view.BancoView;

import java.util.Scanner;

public class BancoController {

    private ContaModel model;
    private BancoView view;
    private Scanner sc = new Scanner(System.in);

    public BancoController(ContaModel model, BancoView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            view.exibirMenu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depósito: ");
                    double valorDep = sc.nextDouble();
                    model.depositar(valorDep);
                    break;
                case 2:
                    System.out.print("Valor para saque: ");
                    double valorSaq = sc.nextDouble();
                    model.sacar(valorSaq);
                    break;
                case 3:
                    view.exibirSaldo(model.getSaldo());
                    break;
                case 0:
                    break;
                default:
                    view.exibirMensagem("Opção inválida.");
            }
        } while (opcao != 0);
        sc.close();
    }

}
