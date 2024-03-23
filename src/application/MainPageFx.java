package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MainPageFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();// Add borderPane.

			ImageView image = new ImageView(
					"https://scontent.fjrs1-3.fna.fbcdn.net/v/t1.18169-9/12219616_470244829844073_5644542477775497212_n.jpg?_nc_cat=110&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=kfYYA2GrHb0AX-EctDm&_nc_ht=scontent.fjrs1-3.fna&oh=00_AT89pj8uPha9iqgUfrkcLu4_QcdNjf4wm8tllUusmgjfWA&oe=61FF00F5");
			// Add an image that reflect the content.

			image.setFitHeight(200);// The height and width of the image.
			image.setFitWidth(400);
			image.setLayoutX(900);// image coordinates.
			image.setLayoutY(100);

			Rectangle rec = new Rectangle(950, 550, 410, 70);// Add a rectangle.
			rec.setFill(Color.TRANSPARENT);// Fill the rectangle with transparent color.
			rec.setStroke(Color.BLUE);// Paint the frame with blue.
			rec.setArcWidth(15);// Bending.
			rec.setArcHeight(18);

			Text txt = new Text("Rental Media System");// Add a text.
			txt.setLayoutX(1000);// Text coordinates.
			txt.setLayoutY(600);
			txt.setFont(Font.font(35));// Increase font.

			VBox vbox = new VBox();// Add a vertical box.

			Button bt1 = new Button("Customer");// Add 3 buttons.
			Button bt2 = new Button("Media");
			Button bt3 = new Button("Rent");

			bt1.setFont(Font.font(35));// Increase font.
			bt2.setFont(Font.font(35));
			bt3.setFont(Font.font(35));

			bt1.setMinHeight(70);// width and height.
			bt1.setMinWidth(410);
			bt2.setMinHeight(70);
			bt2.setMinWidth(410);
			bt3.setMinHeight(70);
			bt3.setMinWidth(410);

			bt1.setStyle("-fx-background-color:aqua");// Fill the buttons with transparent color.
			bt2.setStyle("-fx-background-color:aqua");
			bt3.setStyle("-fx-background-color:aqua");

			Rectangle rec1 = new Rectangle(410, 70);// Add rectangle and add width and height.
			Rectangle rec2 = new Rectangle(410, 70);
			Rectangle rec3 = new Rectangle(410, 70);

			rec1.setArcWidth(30);// Bending.
			rec1.setArcHeight(30);

			rec2.setArcWidth(30);
			rec2.setArcHeight(30);

			rec3.setArcWidth(30);
			rec3.setArcHeight(30);

			bt1.setShape(rec1);
			bt2.setShape(rec2);
			bt3.setShape(rec3);

			vbox.getChildren().addAll(bt1, bt2, bt3);// Add buttons to the vertical box.

			vbox.setSpacing(100);// Spacing between buttons.
			vbox.setPadding(new Insets(90, 90, 150, 150));// from edges.
			root.setLeft(vbox);
			vbox.setAlignment(Pos.CENTER_LEFT);

			root.getChildren().addAll(image, txt, rec);// Add text and rectangle and image to the borderPane.

			root.setStyle("-fx-background-color:lightgoldenrodyellow");// Color of screen.
			Scene scene = new Scene(root, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Main Page");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
