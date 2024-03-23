package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class KindOfMedia extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox vbox7 = new VBox();// Add a vertical box.

			Button bu1 = new Button("Go");// Add 2 buttons.
			Button bu2 = new Button("Back");
			bu1.setFont(Font.font(30));// Increasing font.
			bu2.setFont(Font.font(30));

			ComboBox b = new ComboBox();// Add ComboBox to choose.
			b.getItems().add("Game");
			b.getItems().add("Movie");
			b.getItems().add("Album");

			b.setPromptText("Choose what are you want");
			b.setStyle("-fx-font-size:35 em");// Size of ComboBox.

			vbox7.setAlignment(Pos.TOP_CENTER);
			vbox7.setSpacing(200);// Spacing.
			vbox7.setPadding(new Insets(50, 50, 50, 50));

			vbox7.getChildren().addAll(b, bu1, bu2);// add ComboBox and buttons to a vertical box.

			vbox7.setStyle("-fx-background-color:gray");// Color of screen.
			Scene scene = new Scene(vbox7, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
