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

public class UpdateInformationCustomerFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root4 = new BorderPane();// Add borderPane.

			HBox hbox3 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image7 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image7.setFitHeight(50);// Height and width.
			image7.setFitWidth(50);
			Button find2 = new Button("Find", image7);

			ImageView image8 = new ImageView("https://img.icons8.com/officel/344/available-updates.png");
			image8.setFitHeight(50);
			image8.setFitWidth(50);
			Button update = new Button("Update", image8);

			ImageView image9 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image9.setFitHeight(50);
			image9.setFitWidth(50);
			Button back3 = new Button("Back", image9);

			find2.setFont(Font.font(35));// Increase font.
			update.setFont(Font.font(35));
			back3.setFont(Font.font(35));

			hbox3.getChildren().addAll(find2, update, back3);// Add buttons to horizontal box.
			hbox3.setSpacing(200);
			hbox3.setPadding(new Insets(100, 100, 70, 70));
			hbox3.setAlignment(Pos.BOTTOM_CENTER);

			Label lb11 = new Label("Customer ID:");// Add labels and TextField.
			lb11.setFont(Font.font(20));// Increasing font.

			TextField txtf11 = new TextField();
			txtf11.setFont(Font.font(20));

			Label lb12 = new Label("Customer Name:");
			lb12.setFont(Font.font(20));

			TextField txtf12 = new TextField();
			txtf12.setFont(Font.font(20));

			Label lb13 = new Label("Customer Address:");
			lb13.setFont(Font.font(20));

			TextField txtf13 = new TextField();
			txtf13.setFont(Font.font(20));

			Label lb14 = new Label("Customer Mobile:");
			lb14.setFont(Font.font(20));

			TextField txtf14 = new TextField();
			txtf14.setFont(Font.font(20));
			Label lb15 = new Label("Customer Plan:");
			lb15.setFont(Font.font(20));

			TextField txtf15 = new TextField();
			txtf15.setFont(Font.font(20));

			GridPane gp3 = new GridPane();// Add gridPane.
			gp3.add(lb11, 0, 0);
			gp3.add(txtf11, 1, 0);
			gp3.add(lb12, 0, 1);
			gp3.add(txtf12, 1, 1);
			gp3.add(lb13, 0, 2);
			gp3.add(txtf13, 1, 2);
			gp3.add(lb14, 0, 3);
			gp3.add(txtf14, 1, 3);
			gp3.add(lb15, 0, 4);
			gp3.add(txtf15, 1, 4);

			gp3.setHgap(30);// Spacings.
			gp3.setVgap(30);
			gp3.setPadding(new Insets(100, 100, 50, 200));
			gp3.setAlignment(Pos.CENTER_LEFT);
			root4.setLeft(gp3);
			root4.setBottom(hbox3);

			root4.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root4, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Update information about customer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
