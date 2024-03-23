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

public class DeleteCustomerFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root3 = new BorderPane();// Add borderPane.

			HBox hbox2 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image4 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image4.setFitHeight(50);// Height and width.
			image4.setFitWidth(50);
			Button find = new Button("Find", image4);

			ImageView image5 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
			image5.setFitHeight(50);
			image5.setFitWidth(50);
			Button delete = new Button("Delete", image5);

			ImageView image6 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image6.setFitHeight(50);
			image6.setFitWidth(50);
			Button back2 = new Button("Back", image6);

			find.setFont(Font.font(35));// Increase font.
			delete.setFont(Font.font(35));
			back2.setFont(Font.font(35));

			hbox2.getChildren().addAll(find, delete, back2);// Add buttons to horizontal box.
			hbox2.setSpacing(200);
			hbox2.setPadding(new Insets(100, 100, 70, 70));
			hbox2.setAlignment(Pos.BOTTOM_CENTER);

			Label lb6 = new Label("Customer ID:");// Add labels and TextField.
			lb6.setFont(Font.font(20));// Increasing font.

			TextField txtf6 = new TextField();
			txtf6.setFont(Font.font(20));

			Label lb7 = new Label("Customer Name:");
			lb7.setFont(Font.font(20));

			TextField txtf7 = new TextField();
			txtf7.setFont(Font.font(20));

			Label lb8 = new Label("Customer Address:");
			lb8.setFont(Font.font(20));

			TextField txtf8 = new TextField();
			txtf8.setFont(Font.font(20));

			Label lb9 = new Label("Customer Mobile:");
			lb9.setFont(Font.font(20));

			TextField txtf9 = new TextField();
			txtf9.setFont(Font.font(20));
			Label lb10 = new Label("Customer Plan:");
			lb10.setFont(Font.font(20));

			TextField txtf10 = new TextField();
			txtf10.setFont(Font.font(20));

			GridPane gp2 = new GridPane();// Add gridPane.
			gp2.add(lb6, 0, 0);
			gp2.add(txtf6, 1, 0);
			gp2.add(lb7, 0, 1);
			gp2.add(txtf7, 1, 1);
			gp2.add(lb8, 0, 2);
			gp2.add(txtf8, 1, 2);
			gp2.add(lb9, 0, 3);
			gp2.add(txtf9, 1, 3);
			gp2.add(lb10, 0, 4);
			gp2.add(txtf10, 1, 4);

			gp2.setHgap(30);// Spacings.
			gp2.setVgap(30);
			gp2.setPadding(new Insets(100, 100, 50, 200));
			gp2.setAlignment(Pos.CENTER_LEFT);
			root3.setLeft(gp2);
			root3.setBottom(hbox2);

			root3.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root3, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Delete a customer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
