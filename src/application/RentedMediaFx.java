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

public class RentedMediaFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root25 = new BorderPane();// Add borderPane.

			HBox hbox25 = new HBox();// Add horizontal box.

			TextArea txtta11 = new TextArea();
			txtta11.setFont(Font.font(25));
			txtta11.setMinHeight(200);
			txtta11.setMinWidth(70);

			// Add images and buttons next to each other.
			ImageView image22 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image22.setFitHeight(50);
			image22.setFitWidth(50);
			Button find11 = new Button("Find", image22);

			ImageView image23 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image23.setFitHeight(50);
			image23.setFitWidth(50);
			Button back21 = new Button("Back", image23);

			back21.setContentDisplay(ContentDisplay.RIGHT);
			find11.setContentDisplay(ContentDisplay.RIGHT);

			// Increase font.
			find11.setFont(Font.font(35));
			back21.setFont(Font.font(35));

			hbox25.getChildren().addAll(find11, back21);// Add buttons to horizontal box.
			hbox25.setSpacing(200);
			hbox25.setPadding(new Insets(30, 100, 70, 70));
			hbox25.setAlignment(Pos.BOTTOM_CENTER);

			Label lb71 = new Label("Customer Code:");// Add labels and TextField.
			lb71.setFont(Font.font(30));// Increasing font.

			TextField txtf71 = new TextField();
			txtf71.setFont(Font.font(30));

			GridPane gp21 = new GridPane();// Add gridPane.
			gp21.add(lb71, 0, 0);
			gp21.add(txtf71, 1, 0);
			gp21.add(txtta11, 1, 1);

			gp21.setHgap(30);// Spacings.
			gp21.setVgap(30);
			gp21.setPadding(new Insets(50, 100, 50, 100));
			gp21.setAlignment(Pos.CENTER_LEFT);
			root25.setLeft(gp21);
			root25.setBottom(hbox25);

			root25.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root25, 1800, 850);
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
