package br.com.diogoleite.sorteador;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Pane root = FXMLLoader.load(getClass().getResource("view/layout_sorteador.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Sorteador");
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String args[]) {
		launch();
	}
}
