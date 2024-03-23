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

public class UpdateInformationMovieFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root14 = new BorderPane();// Add borderPane.

			HBox hbox12 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1i = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1i.setFitHeight(50);// Height and width.
			image1i.setFitWidth(50);
			Button find7 = new Button("Find", image1i);

			ImageView image2i = new ImageView("https://img.icons8.com/officel/344/available-updates.png");
			image2i.setFitHeight(50);
			image2i.setFitWidth(50);
			Button update3 = new Button("Update", image2i);

			ImageView image3i = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3i.setFitHeight(50);
			image3i.setFitWidth(50);
			Button back11 = new Button("Back", image3i);

			find7.setFont(Font.font(35));// Increase font.
			update3.setFont(Font.font(35));
			back11.setFont(Font.font(35));

			hbox12.getChildren().addAll(find7, update3, back11);// Add buttons to horizontal box.
			hbox12.setSpacing(200);
			hbox12.setPadding(new Insets(100, 100, 70, 70));
			hbox12.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X6 = new ImageView(
					"https://d2e111jq13me73.cloudfront.net/sites/default/files/styles/review_gallery_thumbnail_large/public/screenshots/csm-movie/monsters-inc-ss1_0.jpg?itok=2uB6uyVi");
			X6.setLayoutX(700);
			X6.setLayoutY(50);
			X6.setFitHeight(550);
			X6.setFitWidth(800);

			root14.getChildren().add(X6);

			Label lb51 = new Label("Movie Title:");// Add labels and TextField.
			lb51.setFont(Font.font(20));// Increasing font.

			TextField txtf51 = new TextField();
			txtf51.setFont(Font.font(20));

			Label lb52 = new Label("Movie Copies:");
			lb52.setFont(Font.font(20));

			TextField txtf52 = new TextField();
			txtf52.setFont(Font.font(20));

			Label lb53 = new Label("Movie Rating:");
			lb53.setFont(Font.font(20));

			TextField txtf53 = new TextField();
			txtf53.setFont(Font.font(20));

			Label lb54 = new Label("Movie Code:");
			lb54.setFont(Font.font(20));

			TextField txtf54 = new TextField();
			txtf54.setFont(Font.font(20));

			GridPane gp9 = new GridPane();// Add gridPane.
			gp9.add(lb51, 0, 0);
			gp9.add(txtf51, 1, 0);
			gp9.add(lb52, 0, 1);
			gp9.add(txtf52, 1, 1);
			gp9.add(lb53, 0, 2);
			gp9.add(txtf53, 1, 2);
			gp9.add(lb54, 0, 3);
			gp9.add(txtf54, 1, 3);

			gp9.setHgap(30);// Spacings.
			gp9.setVgap(30);
			gp9.setPadding(new Insets(100, 100, 50, 200));
			gp9.setAlignment(Pos.CENTER_LEFT);
			root14.setLeft(gp9);
			root14.setBottom(hbox12);

			root14.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root14, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Update information about movie");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
