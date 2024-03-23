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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class RentFormFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root17 = new BorderPane();// Add BorderPane.

			HBox hbox17 = new HBox();// Add horizontal box.

			TextArea txta5 = new TextArea();// Add 2 TextArea.
			TextArea txta6 = new TextArea();

			txta5.setFont(Font.font(20));// Increasing font.
			txta6.setFont(Font.font(20));

			Label lb61 = new Label("Customer ID:");// Add labels and TextField.
			lb61.setFont(Font.font(20));

			TextField txtf61 = new TextField();
			txtf61.setFont(Font.font(20));

			Label lb62 = new Label("Media Code:");
			lb62.setFont(Font.font(20));

			TextField txtf62 = new TextField();
			txtf62.setFont(Font.font(20));

			Label lb63 = new Label("Rented Date:");
			lb63.setFont(Font.font(20));

			TextField txtf63 = new TextField();
			txtf63.setFont(Font.font(20));

			GridPane gp12 = new GridPane();// Add gridPane.
			gp12.add(lb61, 0, 0);// Add labels and TextField to the gridPane.
			gp12.add(txtf61, 1, 0);
			gp12.add(txta5, 1, 1);
			gp12.add(lb62, 0, 2);
			gp12.add(txtf62, 1, 2);
			gp12.add(txta6, 1, 3);
			gp12.add(lb63, 0, 4);
			gp12.add(txtf63, 1, 4);

			gp12.setHgap(20);
			gp12.setVgap(20);
			gp12.setPadding(new Insets(50, 50, 50, 300));
			gp12.setAlignment(Pos.CENTER_LEFT);
			root17.setLeft(gp12);

			Button btn1 = new Button("Add To Cart");// Add 3 buttons.
			Button btn2 = new Button("Process Cart");
			Button btn3 = new Button("Back");

			btn1.setFont(Font.font(30));
			btn2.setFont(Font.font(30));
			btn3.setFont(Font.font(30));

			Rectangle rec11 = new Rectangle(210, 70);// Add rectangle and add width and height.
			Rectangle rec12 = new Rectangle(210, 70);
			Rectangle rec13 = new Rectangle(210, 70);

			btn1.setShape(rec11);
			rec11.setArcHeight(30);
			rec11.setArcWidth(30);

			btn2.setShape(rec12);
			rec12.setArcHeight(30);
			rec12.setArcWidth(30);

			btn3.setShape(rec13);
			rec13.setArcHeight(30);
			rec13.setArcWidth(30);

			btn1.setMinHeight(70);// width and height.
			btn1.setMinWidth(210);
			btn2.setMinHeight(70);
			btn2.setMinWidth(210);
			btn3.setMinHeight(70);
			btn3.setMinWidth(210);

			hbox17.getChildren().addAll(btn1, btn2, btn3);// Add buttons to the horizontal box.
			hbox17.setSpacing(200);// Spacing between button.
			hbox17.setPadding(new Insets(60, 60, 60, 60));// from edges.
			hbox17.setAlignment(Pos.BOTTOM_LEFT);
			root17.setBottom(hbox17);

			 root17.setStyle("-fx-background-color:pink");

			Scene scene = new Scene(root17, 1800, 850);
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
