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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class ReturnMediaFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root26 = new BorderPane();// Add BorderPane.

			HBox hbox26 = new HBox();// Add horizontal box.

			TextArea txtta12 = new TextArea();// Add 2 TextArea.
			TextArea txtta13 = new TextArea();

			txtta12.setFont(Font.font(20));// Increasing font.
			txtta13.setFont(Font.font(20));

			Label lb72 = new Label("Customer ID:");// Add labels and TextField.
			lb72.setFont(Font.font(20));

			TextField txtf72 = new TextField();
			txtf72.setFont(Font.font(20));

			Label lb73 = new Label("Media Code:");
			lb73.setFont(Font.font(20));

			TextField txtf73 = new TextField();
			txtf73.setFont(Font.font(20));

			GridPane gp22 = new GridPane();// Add gridPane.
			gp22.add(lb72, 0, 0);// Add labels and TextField to the gridPane.
			gp22.add(txtf72, 1, 0);
			gp22.add(txtta12, 1, 1);
			gp22.add(lb73, 0, 2);
			gp22.add(txtf73, 1, 2);
			gp22.add(txtta13, 1, 3);

			gp22.setHgap(20);
			gp22.setVgap(20);
			gp22.setPadding(new Insets(50, 50, 50, 300));
			gp22.setAlignment(Pos.CENTER_LEFT);
			root26.setLeft(gp22);

			ImageView image26 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image26.setFitHeight(50);
			image26.setFitWidth(50);
			Button back22 = new Button("Back", image26);

			ImageView image27 = new ImageView("https://img.icons8.com/plasticine/452/return-purchase.png");
			image27.setFitHeight(50);
			image27.setFitWidth(50);
			Button rm = new Button("Return Media", image27);

			back22.setContentDisplay(ContentDisplay.RIGHT);
			rm.setContentDisplay(ContentDisplay.RIGHT);

			rm.setFont(Font.font(30));
			back22.setFont(Font.font(30));

			hbox26.getChildren().addAll(rm, back22);// Add buttons to the horizontal box.
			hbox26.setSpacing(400);// Spacing between button.
			hbox26.setPadding(new Insets(60, 60, 60, 400));// from edges.
			hbox26.setAlignment(Pos.BOTTOM_LEFT);
			root26.setBottom(hbox26);

			root26.setStyle("-fx-background-color:pink");

			Scene scene = new Scene(root26, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Rent Form");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
