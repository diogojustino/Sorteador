package br.com.diogoleite.sorteador.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SorteadorController {

    @FXML
    private TextField txfIntervaloInicial;

    @FXML
    private TextField txfIntervaloFinal;

    @FXML
    private Button btnSortear;

    @FXML
    private TextField txfNumerosSorteados;

    @FXML
    private Label lbMensagem;

	@FXML
	private void initialize() {

	}

	@FXML
	private void sortearNumeros() {
		lbMensagem.setVisible(false);
		
		if (txfIntervaloInicial.getText().isEmpty()
				|| txfIntervaloFinal.getText().isEmpty()) {
			lbMensagem.setVisible(true);
		}else {
		
			int numeroInicial = Integer.parseInt(txfIntervaloInicial.getText());
			int numeroFinal = Integer.parseInt(txfIntervaloFinal.getText());
			
			if(numeroInicial > numeroFinal) {
				int aux = numeroInicial;
				numeroInicial = numeroFinal;
				numeroFinal = aux;
				txfIntervaloInicial.setText(String.valueOf(numeroInicial));
				txfIntervaloFinal.setText(String.valueOf(numeroFinal));
			}
			
			java.util.Random random = new java.util.Random();
			
			int valor = random.nextInt(numeroFinal) + 1;
			
			
			if(valor < numeroInicial) {
				
				valor = numeroInicial + random.nextInt(numeroFinal - numeroInicial + 1);
			}
			
			txfNumerosSorteados.setText(String.valueOf(valor));
		}
	}
}
