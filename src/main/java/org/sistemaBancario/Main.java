package org.sistemaBancario;

import org.sistemaBancario.controller.BancoController;
import org.sistemaBancario.model.ContaModel;
import org.sistemaBancario.view.BancoView;

public class Main {

    public static void main(String[] args) {

        ContaModel minhaConta = new ContaModel("João", 1000.0);
        BancoView view = new BancoView();
        BancoController controller = new BancoController(minhaConta, view);
        controller.iniciar();

    }
}