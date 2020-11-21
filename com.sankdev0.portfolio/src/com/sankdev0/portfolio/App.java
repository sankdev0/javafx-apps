package com.sankdev0.portfolio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1. Get localized GUI resources
		// for dev purposes - TODO later switch to Default Locale
		Locale currentLocale = new Locale("ru", "RU");
		// TODO remove
		System.out.println(">> Inside start method. Chosen locale: " + currentLocale);
		ResourceBundle theGUIBundle = ResourceBundle.getBundle("com.sankdev0.portfolio.GUIBundle", currentLocale);

		// 2. Construct primaryStage
		primaryStage.setTitle(theGUIBundle.getString("appTitle"));

		URL fxmlURL = getClass().getResource("main-layout.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlURL);

		VBox primaryVBox = loader.<VBox>load();
		Scene primaryScene = new Scene(primaryVBox, 800, 500);
		primaryStage.setScene(primaryScene);

		primaryStage.show();

		// 3. Construct editStage
		Stage editStage = new Stage();
		editStage.setTitle(theGUIBundle.getString("editWindowTitle"));
		editStage.initOwner(primaryStage);
		editStage.initModality(Modality.WINDOW_MODAL);


		Scene editScene = new Scene(new Label ("stub label"), 600, 400);
		editStage.setScene(editScene);

		editStage.showAndWait();

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
