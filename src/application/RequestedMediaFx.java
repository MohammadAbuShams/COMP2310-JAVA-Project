package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class RequestedMediaFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root24 = new BorderPane();// Add borderPane.

			HBox hbox24 = new HBox();// Add horizontal box.

			TextArea txtta10 = new TextArea();
			txtta10.setFont(Font.font(25));
			txtta10.setMinHeight(200);
			txtta10.setMinWidth(70);

			// Add images and buttons next to each other.
			ImageView image20 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image20.setFitHeight(50);
			image20.setFitWidth(50);
			Button find10 = new Button("Find", image20);

			ImageView image21 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image21.setFitHeight(50);
			image21.setFitWidth(50);
			Button back20 = new Button("Back", image21);

			back20.setContentDisplay(ContentDisplay.RIGHT);
			find10.setContentDisplay(ContentDisplay.RIGHT);

			// Increase font.
			find10.setFont(Font.font(35));
			back20.setFont(Font.font(35));

			hbox24.getChildren().addAll(find10, back20);// Add buttons to horizontal box.
			hbox24.setSpacing(200);
			hbox24.setPadding(new Insets(30, 100, 70, 70));
			hbox24.setAlignment(Pos.BOTTOM_CENTER);

			Label lb70 = new Label("Customer Code:");// Add labels and TextField.
			lb70.setFont(Font.font(30));// Increasing font.

			TextField txtf70 = new TextField();
			txtf70.setFont(Font.font(30));

			GridPane gp20 = new GridPane();// Add gridPane.
			gp20.add(lb70, 0, 0);
			gp20.add(txtf70, 1, 0);
			gp20.add(txtta10, 1, 1);

			gp20.setHgap(30);// Spacings.
			gp20.setVgap(30);
			gp20.setPadding(new Insets(50, 100, 50, 100));
			gp20.setAlignment(Pos.CENTER_LEFT);
			root24.setLeft(gp20);
			root24.setBottom(hbox24);

			root24.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root24, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Requested Media");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
