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

public class SearchCustomerIdFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root5 = new BorderPane();// Add borderPane.

			HBox hbox4 = new HBox();// Add horizontal box.

			TextArea txtta1 = new TextArea();
			txtta1.setFont(Font.font(25));
			txtta1.setMinHeight(200);
			txtta1.setMinWidth(70);

			// Add images and buttons next to each other.
			ImageView image10 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-search-logistic-delivery-kiranshastry-gradient-kiranshastry.png");
			image10.setFitHeight(50);
			image10.setFitWidth(50);
			Button search = new Button("Search", image10);

			ImageView image11 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image11.setFitHeight(50);
			image11.setFitWidth(50);
			Button backk = new Button("Back", image11);

			// Increase font.
			search.setFont(Font.font(35));
			backk.setFont(Font.font(35));

			hbox4.getChildren().addAll(search, backk);// Add buttons to horizontal box.
			hbox4.setSpacing(200);
			hbox4.setPadding(new Insets(30, 100, 70, 70));
			hbox4.setAlignment(Pos.BOTTOM_CENTER);

			Label lb16 = new Label("Enter Customer ID:");// Add labels and TextField.
			lb16.setFont(Font.font(20));// Increasing font.

			TextField txtf16 = new TextField();
			txtf16.setFont(Font.font(30));

			GridPane gp4 = new GridPane();// Add gridPane.
			gp4.add(lb16, 0, 0);
			gp4.add(txtf16, 1, 0);
			gp4.add(txtta1, 1, 1);

			gp4.setHgap(30);// Spacings.
			gp4.setVgap(30);
			gp4.setPadding(new Insets(50, 100, 50, 100));
			gp4.setAlignment(Pos.CENTER_LEFT);
			root5.setLeft(gp4);
			root5.setBottom(hbox4);

			root5.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root5, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Search a customer by id");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
