package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MediaChoosingFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox vbox6 = new VBox();// Add vertical box.

			Button b7 = new Button("Add new Media");// Add 6 buttons.
			Button b8 = new Button("Delete Media");
			Button b9 = new Button("Update Information about Media");
			Button b10 = new Button("Search a Media by code");
			Button b11 = new Button("Print All Media information");
			Button b12 = new Button("Return to main page");

			Text txt2 = new Text("Choose what are you want");// Add text.

			txt2.setFont(Font.font(70));// Increasing font.
			txt2.setFill(Color.RED);// Fill the text with red color.

			vbox6.getChildren().addAll(txt2, b7, b8, b9, b10, b11,b12);// Add all to vertical box.
			vbox6.setAlignment(Pos.CENTER);

			b7.setFont(Font.font(30));// Increasing font.
			b8.setFont(Font.font(30));
			b9.setFont(Font.font(30));
			b10.setFont(Font.font(30));
			b11.setFont(Font.font(30));
			b12.setFont(Font.font(30));

			vbox6.setSpacing(45);// Spacing between buttons.
			vbox6.setPadding(new Insets(90, 90, 150, 150));
			
			vbox6.setStyle("-fx-background-color:green");// Color of screen.
			Scene scene = new Scene(vbox6, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Options for media");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
