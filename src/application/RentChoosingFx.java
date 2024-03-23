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

public class RentChoosingFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox vbox1r = new VBox();// Add vertical box.

			Button buttonr1 = new Button("Rent Form");// Add 6 buttons.
			Button buttonr2 = new Button("Requested Media");
			Button buttonr3 = new Button("Rented Media");
			Button buttonr4 = new Button("Return Media");
			Button buttonr5 = new Button("Return to main page");

			Text txt4 = new Text("Choose one of the following options");// Add text.

			txt4.setFont(Font.font(70));// Increasing font.
			txt4.setFill(Color.RED);// Fill the text with red color.

			vbox1r.getChildren().addAll(txt4, buttonr1, buttonr2, buttonr3, buttonr4, buttonr5);// Add all to vertical
																								// box.
			vbox1r.setAlignment(Pos.CENTER);

			buttonr1.setFont(Font.font(30));// Increasing font.
			buttonr2.setFont(Font.font(30));
			buttonr3.setFont(Font.font(30));
			buttonr4.setFont(Font.font(30));
			buttonr5.setFont(Font.font(30));

			buttonr1.setPrefSize(500, 500);
			buttonr2.setPrefSize(500, 500);
			buttonr3.setPrefSize(500, 500);
			buttonr4.setPrefSize(500, 500);
			buttonr5.setPrefSize(500, 500);

			vbox1r.setSpacing(45);// Spacing between buttons.
			vbox1r.setPadding(new Insets(90, 90, 150, 150));

			vbox1r.setStyle("-fx-background-color:gold");// Color of screen.
			Scene scene = new Scene(vbox1r, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Options for rent");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
