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

public class CustomerChoosingFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox vbox2 = new VBox();// Add vertical box.

			Button b1 = new Button("Add new Customer");// Add 5 buttons.
			Button b2 = new Button("Delete Customer");
			Button b3 = new Button("Update Information about Customer");
			Button b4 = new Button("Search a Customer by id");
			Button b5 = new Button("Return to main page");

			Text txt2 = new Text("Choose what are you want");// Add text.

			txt2.setFont(Font.font(70));// Increasing font.
			txt2.setFill(Color.RED);// Fill the text with red color.

			vbox2.getChildren().addAll(txt2, b1, b2, b3, b4, b5);// Add all to verical box.
			vbox2.setAlignment(Pos.CENTER);

			b1.setFont(Font.font(30));// Increasing font.
			b2.setFont(Font.font(30));
			b3.setFont(Font.font(30));
			b4.setFont(Font.font(30));
			b5.setFont(Font.font(30));

			vbox2.setSpacing(60);// Spacing between buttons.
			vbox2.setPadding(new Insets(90, 90, 150, 150));

			vbox2.setStyle("-fx-background-color:gold");// Color of screen.

			Scene scene = new Scene(vbox2, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Options for customer");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
