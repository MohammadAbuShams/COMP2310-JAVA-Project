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

public class DeleteAlbumFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root12 = new BorderPane();// Add borderPane.

			HBox hbox10 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1g = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1g.setFitHeight(50);// Height and width.
			image1g.setFitWidth(50);
			Button find5 = new Button("Find", image1g);

			ImageView image2g = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
			image2g.setFitHeight(50);
			image2g.setFitWidth(50);
			Button delete5 = new Button("Delete", image2g);

			ImageView image3g = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3g.setFitHeight(50);
			image3g.setFitWidth(50);
			Button back9 = new Button("Back", image3g);

			find5.setFont(Font.font(35));// Increase font.
			delete5.setFont(Font.font(35));
			back9.setFont(Font.font(35));

			hbox10.getChildren().addAll(find5, delete5, back9);// Add buttons to horizontal box.
			hbox10.setSpacing(200);
			hbox10.setPadding(new Insets(100, 100, 70, 70));
			hbox10.setAlignment(Pos.BOTTOM_CENTER);

			Label lb42 = new Label("Album Title:");// Add labels and TextField.
			lb42.setFont(Font.font(20));// Increasing font.

			TextField txtf42 = new TextField();
			txtf42.setFont(Font.font(20));

			Label lb43 = new Label("Album Copies:");
			lb43.setFont(Font.font(20));

			TextField txtf43 = new TextField();
			txtf43.setFont(Font.font(20));

			Label lb44 = new Label("Album Artist:");
			lb44.setFont(Font.font(20));

			TextField txtf44 = new TextField();
			txtf44.setFont(Font.font(20));

			Label lb45 = new Label("Album Song:");
			lb45.setFont(Font.font(20));

			TextField txtf45 = new TextField();
			txtf45.setFont(Font.font(20));

			Label lb46 = new Label("Album Code:");
			lb46.setFont(Font.font(20));

			TextField txtf46 = new TextField();
			txtf46.setFont(Font.font(20));

			GridPane gp9 = new GridPane();// Add gridPane.
			gp9.add(lb42, 0, 0);
			gp9.add(txtf42, 1, 0);
			gp9.add(lb43, 0, 1);
			gp9.add(txtf43, 1, 1);
			gp9.add(lb44, 0, 2);
			gp9.add(txtf44, 1, 2);
			gp9.add(lb45, 0, 3);
			gp9.add(txtf45, 1, 3);
			gp9.add(lb46, 0, 4);
			gp9.add(txtf46, 1, 4);

			gp9.setHgap(30);// Spacings.
			gp9.setVgap(30);
			gp9.setPadding(new Insets(100, 100, 50, 200));
			gp9.setAlignment(Pos.CENTER_LEFT);
			root12.setLeft(gp9);
			root12.setBottom(hbox10);

			root12.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root12, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Delete an album");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
