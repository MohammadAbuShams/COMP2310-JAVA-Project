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

public class DeleteMovieFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root11 = new BorderPane();// Add borderPane.

			HBox hbox9 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1f = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1f.setFitHeight(50);// Height and width.
			image1f.setFitWidth(50);
			Button find4 = new Button("Find", image1f);

			ImageView image2f = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
			image2f.setFitHeight(50);
			image2f.setFitWidth(50);
			Button delete4 = new Button("Delete", image2f);

			ImageView image3f = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3f.setFitHeight(50);
			image3f.setFitWidth(50);
			Button back8 = new Button("Back", image3f);

			find4.setFont(Font.font(35));// Increase font.
			delete4.setFont(Font.font(35));
			back8.setFont(Font.font(35));

			hbox9.getChildren().addAll(find4, delete4, back8);// Add buttons to horizontal box.
			hbox9.setSpacing(200);
			hbox9.setPadding(new Insets(100, 100, 70, 70));
			hbox9.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X5 = new ImageView(
					"https://nbcpalmsprings.com/wp-content/uploads/sites/8/2021/12/BEST-MOVIES-OF-2021.jpeg");
			X5.setLayoutX(700);
			X5.setLayoutY(50);
			X5.setFitHeight(550);
			X5.setFitWidth(800);

			root11.getChildren().add(X5);

			Label lb38 = new Label("Movie Title:");// Add labels and TextField.
			lb38.setFont(Font.font(20));// Increasing font.

			TextField txtf38 = new TextField();
			txtf38.setFont(Font.font(20));

			Label lb39 = new Label("Movie Copies:");
			lb39.setFont(Font.font(20));

			TextField txtf39 = new TextField();
			txtf39.setFont(Font.font(20));

			Label lb40 = new Label("Movie Rating:");
			lb40.setFont(Font.font(20));

			TextField txtf40 = new TextField();
			txtf40.setFont(Font.font(20));

			Label lb41 = new Label("Movie Code:");
			lb41.setFont(Font.font(20));

			TextField txtf41 = new TextField();
			txtf41.setFont(Font.font(20));

			GridPane gp7 = new GridPane();// Add gridPane.
			gp7.add(lb38, 0, 0);
			gp7.add(txtf38, 1, 0);
			gp7.add(lb39, 0, 1);
			gp7.add(txtf39, 1, 1);
			gp7.add(lb40, 0, 2);
			gp7.add(txtf40, 1, 2);
			gp7.add(lb41, 0, 3);
			gp7.add(txtf41, 1, 3);

			gp7.setHgap(30);// Spacings.
			gp7.setVgap(30);
			gp7.setPadding(new Insets(100, 100, 50, 200));
			gp7.setAlignment(Pos.CENTER_LEFT);
			root11.setLeft(gp7);
			root11.setBottom(hbox9);

			root11.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root11, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Delete a movie");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
