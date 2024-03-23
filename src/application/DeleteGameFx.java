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

public class DeleteGameFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root10 = new BorderPane();// Add borderPane.

			HBox hbox8 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1e = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1e.setFitHeight(50);// Height and width.
			image1e.setFitWidth(50);
			Button find3 = new Button("Find", image1e);

			ImageView image2e = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
			image2e.setFitHeight(50);
			image2e.setFitWidth(50);
			Button delete3 = new Button("Delete", image2e);

			ImageView image3e = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3e.setFitHeight(50);
			image3e.setFitWidth(50);
			Button back7 = new Button("Back", image3e);

			find3.setFont(Font.font(35));// Increase font.
			delete3.setFont(Font.font(35));
			back7.setFont(Font.font(35));

			hbox8.getChildren().addAll(find3, delete3, back7);// Add buttons to horizontal box.
			hbox8.setSpacing(200);
			hbox8.setPadding(new Insets(100, 100, 70, 70));
			hbox8.setAlignment(Pos.BOTTOM_CENTER);

			ImageView I1 = new ImageView(
					"https://s.yimg.com/uu/api/res/1.2/F2cURo7S3LAOorNAlXeejA--~B/Zmk9ZmlsbDtoPTQ1MDt3PTY3NTthcHBpZD15dGFjaHlvbg--/https://s.yimg.com/os/creatr-uploaded-images/2021-12/73e2b000-577c-11ec-bf4f-b28dff737d78.cf.webp");
			I1.setLayoutX(700);
			I1.setLayoutY(50);
			I1.setFitHeight(600);
			I1.setFitWidth(800);

			root10.getChildren().add(I1);

			Label lb34 = new Label("Game Title:");// Add labels and TextField.
			lb34.setFont(Font.font(20));// Increasing font.

			TextField txtf34 = new TextField();
			txtf34.setFont(Font.font(20));

			Label lb35 = new Label("Game Copies:");
			lb35.setFont(Font.font(20));

			TextField txtf35 = new TextField();
			txtf35.setFont(Font.font(20));

			Label lb36 = new Label("Game Weight:");
			lb36.setFont(Font.font(20));

			TextField txtf36 = new TextField();
			txtf36.setFont(Font.font(20));

			Label lb37 = new Label("Game Code:");
			lb37.setFont(Font.font(20));

			TextField txtf37 = new TextField();
			txtf37.setFont(Font.font(20));

			GridPane gp6 = new GridPane();// Add gridPane.
			gp6.add(lb34, 0, 0);
			gp6.add(txtf34, 1, 0);
			gp6.add(lb35, 0, 1);
			gp6.add(txtf35, 1, 1);
			gp6.add(lb36, 0, 2);
			gp6.add(txtf36, 1, 2);
			gp6.add(lb37, 0, 3);
			gp6.add(txtf37, 1, 3);

			gp6.setHgap(30);// Spacings.
			gp6.setVgap(30);
			gp6.setPadding(new Insets(100, 100, 50, 200));
			gp6.setAlignment(Pos.CENTER_LEFT);
			root10.setLeft(gp6);
			root10.setBottom(hbox8);

			root10.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene = new Scene(root10, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Delete a game");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
