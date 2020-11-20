package com.sankdev0.portfolio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.net.URL;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Портфолио");
		
		URL fxmlURL = getClass().getResource("main-layout.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlURL);
		
		Label labelOne = new Label("Записи портфолио");
		Scene primaryScene = new Scene(labelOne, 400, 300);
		primaryStage.setScene(primaryScene);
		
		primaryStage.show();
		
		
		Stage editStage = new Stage();
		editStage.initOwner(primaryStage);
		editStage.initModality(Modality.WINDOW_MODAL);
		
		VBox editVBox = loader.<VBox>load();
		
		Scene editScene = new Scene(editVBox, 200, 150);
		editScene.setCursor(Cursor.OPEN_HAND);
		editStage.setScene(editScene);
		
		editStage.setOnCloseRequest((event) -> {
			labelOne.setText("Окно редактирования закрыто");
		});
		
		editStage.addEventHandler(KeyEvent.KEY_PRESSED, (event) -> {
			System.out.println("Событие: "+ event.toString());
			
			switch (event.getCode().getCode()){
				case 27: { //ESC
					editStage.close();
					break;
				}
				case 10: { //RETURN
					editStage.setWidth(editStage.getWidth()*2);
				}
				default: {
					System.out.println("Key is not recognized");
				}
				
			}
			
			
		});
		
		editStage.showAndWait();
		
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
