package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class AddNewMovieFx extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root8 = new BorderPane();// Add borderPane.

			HBox hbox6 = new HBox();// Add horizontal box.

			ImageView image1c = new ImageView("https://img.icons8.com/color/344/add--v1.png");// Add an image.
			image1c.setFitHeight(50);// Height and width.
			image1c.setFitWidth(50);
			Button add5 = new Button("Add", image1c);// Add button add next an image.

			ImageView image2c = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");// Add
																																// an
																																// image
			image2c.setFitHeight(50);// Height and width.
			image2c.setFitWidth(50);
			Button back5 = new Button("Back", image2c);// Add button back next an image.

			add5.setFont(Font.font(35));// Increase font.
			back5.setFont(Font.font(35));

			hbox6.getChildren().addAll(add5, back5);// Add buttons to horizontal box.
			hbox6.setSpacing(200);// Spacing between buttons.
			hbox6.setPadding(new Insets(100, 100, 70, 70));
			hbox6.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X4 = new ImageView("https://on.notist.cloud/profile/pr-greetbagundal-large-735fa208d0498da9.jpg");
			X4.setLayoutX(700);
			X4.setLayoutY(50);
			X4.setFitHeight(550);
			X4.setFitWidth(800);

			root8.getChildren().add(X4);

			Label lb25 = new Label("Movie Title:");// Add labels and TextField.
			lb25.setFont(Font.font(20));// Increasing font.

			TextField txtf25 = new TextField();
			txtf25.setFont(Font.font(20));

			Label lb26 = new Label("Movie Copies:");
			lb26.setFont(Font.font(20));

			TextField txtf26 = new TextField();
			txtf26.setFont(Font.font(20));

			Label lb27 = new Label("Movie Rating:");
			lb27.setFont(Font.font(20));

			TextField txtf27 = new TextField();
			txtf27.setFont(Font.font(20));

			Label lb28 = new Label("Movie Code:");
			lb28.setFont(Font.font(20));

			TextField txtf28 = new TextField();
			txtf28.setFont(Font.font(20));

			GridPane gp6 = new GridPane();// Add gridPane.
			gp6.add(lb25, 0, 0);
			gp6.add(txtf25, 1, 0);
			gp6.add(lb26, 0, 1);
			gp6.add(txtf26, 1, 1);
			gp6.add(lb27, 0, 2);
			gp6.add(txtf27, 1, 2);
			gp6.add(lb28, 0, 3);
			gp6.add(txtf28, 1, 3);

			gp6.setHgap(30);// Spacings.
			gp6.setVgap(30);
			gp6.setPadding(new Insets(100, 100, 50, 200));
			gp6.setAlignment(Pos.CENTER_LEFT);
			root8.setLeft(gp6);
			root8.setBottom(hbox6);

			root8.setStyle("-fx-background-color:antiquewhite");// Color of screen.

			Scene scene = new Scene(root8, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Add new movie");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
