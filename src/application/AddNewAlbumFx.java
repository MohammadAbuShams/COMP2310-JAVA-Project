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

public class AddNewAlbumFx extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root9 = new BorderPane();// Add borderPane.

			HBox hbox7 = new HBox();// Add horizontal box.

			ImageView image1d = new ImageView("https://img.icons8.com/color/344/add--v1.png");// Add an image.
			image1d.setFitHeight(50);// Height and width.
			image1d.setFitWidth(50);
			Button add6 = new Button("Add", image1d);// Add button add next an image.

			ImageView image2d = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");// Add
																																// an
																																// image
			image2d.setFitHeight(50);// Height and width.
			image2d.setFitWidth(50);
			Button back6 = new Button("Back", image2d);// Add button back next an image.

			add6.setFont(Font.font(35));// Increase font.
			back6.setFont(Font.font(35));

			hbox7.getChildren().addAll(add6, back6);// Add buttons to horizontal box.
			hbox7.setSpacing(200);// Spacing between buttons.
			hbox7.setPadding(new Insets(100, 100, 70, 70));
			hbox7.setAlignment(Pos.BOTTOM_CENTER);

			Label lb29 = new Label("Album Title:");// Add labels and TextField.
			lb29.setFont(Font.font(20));// Increasing font.

			TextField txtf29 = new TextField();
			txtf29.setFont(Font.font(20));

			Label lb30 = new Label("Album Copies:");
			lb30.setFont(Font.font(20));

			TextField txtf30 = new TextField();
			txtf30.setFont(Font.font(20));

			Label lb31 = new Label("Album Artist:");
			lb31.setFont(Font.font(20));

			TextField txtf31 = new TextField();
			txtf31.setFont(Font.font(20));

			Label lb32 = new Label("Album Song:");
			lb32.setFont(Font.font(20));

			TextField txtf32 = new TextField();
			txtf32.setFont(Font.font(20));

			Label lb33 = new Label("Album Code:");
			lb33.setFont(Font.font(20));

			TextField txtf33 = new TextField();
			txtf33.setFont(Font.font(20));

			GridPane gp7 = new GridPane();// Add gridPane.
			gp7.add(lb29, 0, 0);
			gp7.add(txtf29, 1, 0);
			gp7.add(lb30, 0, 1);
			gp7.add(txtf30, 1, 1);
			gp7.add(lb31, 0, 2);
			gp7.add(txtf31, 1, 2);
			gp7.add(lb32, 0, 3);
			gp7.add(txtf32, 1, 3);
			gp7.add(lb33, 0, 4);
			gp7.add(txtf33, 1, 4);

			gp7.setHgap(30);// Spacings.
			gp7.setVgap(30);
			gp7.setPadding(new Insets(100, 100, 50, 200));
			gp7.setAlignment(Pos.CENTER_LEFT);
			root9.setLeft(gp7);
			root9.setBottom(hbox7);

			root9.setStyle("-fx-background-color:antiquewhite");// Color of screen.

			Scene scene = new Scene(root9, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Add new album");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
