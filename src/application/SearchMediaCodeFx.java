package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class SearchMediaCodeFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root16 = new BorderPane();// Add borderPane.

			HBox hbox16 = new HBox();// Add horizontal box.

			TextArea txtta4 = new TextArea();
			txtta4.setFont(Font.font(25));
			txtta4.setMinHeight(200);
			txtta4.setMinWidth(70);

			// Add images and buttons next to each other.
			ImageView image16 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-search-logistic-delivery-kiranshastry-gradient-kiranshastry.png");
			image16.setFitHeight(50);
			image16.setFitWidth(50);
			Button search2 = new Button("Search", image16);

			ImageView image17 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image17.setFitHeight(50);
			image17.setFitWidth(50);
			Button back15 = new Button("Back", image17);

			// Increase font.
			search2.setFont(Font.font(35));
			back15.setFont(Font.font(35));

			hbox16.getChildren().addAll(search2, back15);// Add buttons to horizontal box.
			hbox16.setSpacing(200);
			hbox16.setPadding(new Insets(30, 100, 70, 70));
			hbox16.setAlignment(Pos.BOTTOM_CENTER);

			Label lb60 = new Label("Enter Media Code:");// Add labels and TextField.
			lb60.setFont(Font.font(30));// Increasing font.

			TextField txtf60 = new TextField();
			txtf60.setFont(Font.font(30));

			GridPane gp10 = new GridPane();// Add gridPane.
			gp10.add(lb60, 0, 0);
			gp10.add(txtf60, 1, 0);
			gp10.add(txtta4, 1, 1);

			gp10.setHgap(30);// Spacings.
			gp10.setVgap(30);
			gp10.setPadding(new Insets(50, 100, 50, 100));
			gp10.setAlignment(Pos.CENTER_LEFT);
			root16.setLeft(gp10);
			root16.setBottom(hbox16);

			root16.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root16, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Search a media by code");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
