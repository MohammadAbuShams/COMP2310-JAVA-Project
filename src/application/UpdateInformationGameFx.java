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

public class UpdateInformationGameFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root13 = new BorderPane();// Add borderPane.

			HBox hbox11 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1h = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1h.setFitHeight(50);// Height and width.
			image1h.setFitWidth(50);
			Button find6 = new Button("Find", image1h);

			ImageView image2h = new ImageView("https://img.icons8.com/officel/344/available-updates.png");
			image2h.setFitHeight(50);
			image2h.setFitWidth(50);
			Button update2 = new Button("Update", image2h);

			ImageView image3h = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3h.setFitHeight(50);
			image3h.setFitWidth(50);
			Button back10 = new Button("Back", image3h);

			find6.setFont(Font.font(35));// Increase font.
			update2.setFont(Font.font(35));
			back10.setFont(Font.font(35));

			hbox11.getChildren().addAll(find6, update2, back10);// Add buttons to horizontal box.
			hbox11.setSpacing(200);
			hbox11.setPadding(new Insets(100, 100, 70, 70));
			hbox11.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X3 = new ImageView("https://i.redd.it/5o197dnz6u651.jpg");
			X3.setLayoutX(700);
			X3.setLayoutY(50);
			X3.setFitHeight(500);
			X3.setFitWidth(800);

			root13.getChildren().add(X3);

			Label lb47 = new Label("Game Title:");// Add labels and TextField.
			lb47.setFont(Font.font(20));// Increasing font.

			TextField txtf47 = new TextField();
			txtf47.setFont(Font.font(20));

			Label lb48 = new Label("Game Copies:");
			lb48.setFont(Font.font(20));

			TextField txtf48 = new TextField();
			txtf48.setFont(Font.font(20));

			Label lb49 = new Label("Game Weight:");
			lb49.setFont(Font.font(20));

			TextField txtf49 = new TextField();
			txtf49.setFont(Font.font(20));

			Label lb50 = new Label("Game Code:");
			lb50.setFont(Font.font(20));

			TextField txtf50 = new TextField();
			txtf50.setFont(Font.font(20));

			GridPane gp8 = new GridPane();// Add gridPane.
			gp8.add(lb47, 0, 0);
			gp8.add(txtf47, 1, 0);
			gp8.add(lb48, 0, 1);
			gp8.add(txtf48, 1, 1);
			gp8.add(lb49, 0, 2);
			gp8.add(txtf49, 1, 2);
			gp8.add(lb50, 0, 3);
			gp8.add(txtf50, 1, 3);

			gp8.setHgap(30);// Spacings.
			gp8.setVgap(30);
			gp8.setPadding(new Insets(100, 100, 50, 200));
			gp8.setAlignment(Pos.CENTER_LEFT);
			root13.setLeft(gp8);
			root13.setBottom(hbox11);

			root13.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root13, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Update information about game");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
