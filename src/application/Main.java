package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	Stage escenario;
	@Override
	public void start(Stage primaryStage) {
		try
		{
			escenario = primaryStage;
			mainWindow();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void mainWindow() throws IOException	//aqui es donde vamos a crear y cargar la escena
	{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Ventana.fxml"));

		AnchorPane root = loader.load();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		escenario.setScene(scene);
		escenario.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}