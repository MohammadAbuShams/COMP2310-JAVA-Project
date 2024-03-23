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

public class AddNewGameFx extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root7 = new BorderPane();// Add borderPane.

			HBox hbox5 = new HBox();// Add horizontal box.

			ImageView image1b = new ImageView("https://img.icons8.com/color/344/add--v1.png");// Add an image.
			image1b.setFitHeight(50);// Height and width.
			image1b.setFitWidth(50);
			Button add4 = new Button("Add", image1b);// Add button add next an image.

			ImageView image2b = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");// Add
																																// an
																																// image
			image2b.setFitHeight(50);// Height and width.
			image2b.setFitWidth(50);
			Button back4 = new Button("Back", image2b);// Add button back next an image.

			add4.setFont(Font.font(35));// Increase font.
			back4.setFont(Font.font(35));

			hbox5.getChildren().addAll(add4, back4);// Add buttons to horizontal box.
			hbox5.setSpacing(200);// Spacing between buttons.
			hbox5.setPadding(new Insets(100, 100, 70, 70));
			hbox5.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X2 = new ImageView(
					"https://i0.wp.com/www.allgamesgh.com/wp-content/uploads/2021/09/fifa-22-ps4.jpg?fit=800%2C800&ssl=1");
			X2.setLayoutX(700);
			X2.setLayoutY(50);
			X2.setFitHeight(550);
			X2.setFitWidth(800);

			root7.getChildren().add(X2);

			
			
			Label lb21 = new Label("Game Title:");// Add labels and TextField.
			lb21.setFont(Font.font(20));// Increasing font.

			TextField txtf21 = new TextField();
			txtf21.setFont(Font.font(20));

			Label lb22 = new Label("Game Copies:");
			lb22.setFont(Font.font(20));

			TextField txtf22 = new TextField();
			txtf22.setFont(Font.font(20));

			Label lb23 = new Label("Game Weight:");
			lb23.setFont(Font.font(20));

			TextField txtf23 = new TextField();
			txtf23.setFont(Font.font(20));

			Label lb24 = new Label("Game Code:");
			lb24.setFont(Font.font(20));

			TextField txtf24 = new TextField();
			txtf24.setFont(Font.font(20));

			GridPane gp5 = new GridPane();// Add gridPane.
			gp5.add(lb21, 0, 0);
			gp5.add(txtf21, 1, 0);
			gp5.add(lb22, 0, 1);
			gp5.add(txtf22, 1, 1);
			gp5.add(lb23, 0, 2);
			gp5.add(txtf23, 1, 2);
			gp5.add(lb24, 0, 3);
			gp5.add(txtf24, 1, 3);

			gp5.setHgap(30);// Spacings.
			gp5.setVgap(30);
			gp5.setPadding(new Insets(100, 100, 50, 200));
			gp5.setAlignment(Pos.CENTER_LEFT);
			root7.setLeft(gp5);
			root7.setBottom(hbox5);

			root7.setStyle("-fx-background-image:url('');-fx-background-size:cover,auto");
			Scene scene = new Scene(root7, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Add new game");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
