package org.sistemaBancario.view;

public class BancoView {

    public void exibirMenu() {
        System.out.println("Banco");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver saldo");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opcao: ");
    }

    public void exibirSaldo(double saldo) {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }

}
