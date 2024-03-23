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

public class UpdateInformationAlbumFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root15 = new BorderPane();// Add borderPane.

			HBox hbox13 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1j = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1j.setFitHeight(50);// Height and width.
			image1j.setFitWidth(50);
			Button find8 = new Button("Find", image1j);

			ImageView image2j = new ImageView("https://img.icons8.com/officel/344/available-updates.png");
			image2j.setFitHeight(50);
			image2j.setFitWidth(50);
			Button update4 = new Button("Update", image2j);

			ImageView image3j = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3j.setFitHeight(50);
			image3j.setFitWidth(50);
			Button back12 = new Button("Back", image3j);

			find8.setFont(Font.font(35));// Increase font.
			update4.setFont(Font.font(35));
			back12.setFont(Font.font(35));

			hbox13.getChildren().addAll(find8, update4, back12);// Add buttons to horizontal box.
			hbox13.setSpacing(200);
			hbox13.setPadding(new Insets(100, 100, 70, 70));
			hbox13.setAlignment(Pos.BOTTOM_CENTER);

			Label lb55 = new Label("Album Title:");// Add labels and TextField.
			lb55.setFont(Font.font(20));// Increasing font.

			TextField txtf55 = new TextField();
			txtf55.setFont(Font.font(20));

			Label lb56 = new Label("Album Copies:");
			lb56.setFont(Font.font(20));

			TextField txtf56 = new TextField();
			txtf56.setFont(Font.font(20));

			Label lb57 = new Label("Album Artist:");
			lb57.setFont(Font.font(20));

			TextField txtf57 = new TextField();
			txtf57.setFont(Font.font(20));

			Label lb58 = new Label("Album Song:");
			lb58.setFont(Font.font(20));

			TextField txtf58 = new TextField();
			txtf58.setFont(Font.font(20));

			Label lb59 = new Label("Album Code:");
			lb59.setFont(Font.font(20));

			TextField txtf59 = new TextField();
			txtf59.setFont(Font.font(20));

			GridPane gp10 = new GridPane();// Add gridPane.
			gp10.add(lb55, 0, 0);
			gp10.add(txtf55, 1, 0);
			gp10.add(lb56, 0, 1);
			gp10.add(txtf56, 1, 1);
			gp10.add(lb57, 0, 2);
			gp10.add(txtf57, 1, 2);
			gp10.add(lb58, 0, 3);
			gp10.add(txtf58, 1, 3);
			gp10.add(lb59, 0, 4);
			gp10.add(txtf59, 1, 4);

			gp10.setHgap(30);// Spacings.
			gp10.setVgap(30);
			gp10.setPadding(new Insets(100, 100, 50, 200));
			gp10.setAlignment(Pos.CENTER_LEFT);
			root15.setLeft(gp10);
			root15.setBottom(hbox13);

			root15.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root15, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Update information about an album");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
