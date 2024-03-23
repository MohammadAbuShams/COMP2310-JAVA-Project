package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class PrintMediaInformationFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox vbox15 = new VBox();// Add a vertical box.
			BorderPane root20 = new BorderPane();// Add borderPane.
			HBox hbox15 = new HBox();// Add horizontal box.

			ImageView image14 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image14.setFitHeight(70);
			image14.setFitWidth(70);
			Button back15 = new Button("Back", image14);
			back15.setFont(Font.font(50));// Increasing Font.

			ImageView image15 = new ImageView("https://img.icons8.com/fluency/452/print.png");
			image15.setFitHeight(70);
			image15.setFitWidth(70);
			Button print1 = new Button("Print", image15);
			back15.setFont(Font.font(50));// Increasing Font.
			print1.setFont(Font.font(50));

			hbox15.setAlignment(Pos.BOTTOM_CENTER);
			hbox15.getChildren().addAll(print1, back15);// Add buttons to horizontal box.
			root20.setBottom(hbox15);
			hbox15.setSpacing(200);// Spacing between buttons.
			hbox15.setPadding(new Insets(50, 50, 50, 50));

			TextArea txta2 = new TextArea();// Add textArea.
			txta2.setFont(Font.font(30));// Increasing Font.
			vbox15.getChildren().add(txta2);// Add TextArea to a vertical box.
			vbox15.setAlignment(Pos.CENTER);
			vbox15.setPadding(new Insets(100, 100, 200, 200));
			txta2.setMinSize(300, 300);
			root20.setCenter(vbox15);

			Scene scene = new Scene(root20, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Print All Media Information");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
