package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class AddNewCustomerFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root2 = new BorderPane();// Add borderPane.

			HBox hbox = new HBox();// Add horizontal box.

			ImageView image2 = new ImageView("https://img.icons8.com/color/344/add--v1.png");// Add an image.
			image2.setFitHeight(50);// Height and width.
			image2.setFitWidth(50);
			Button add = new Button("Add", image2);// Add button add next an image.

			ImageView image3 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");// Add
																																// an
																																// image
			image3.setFitHeight(50);// Height and width.
			image3.setFitWidth(50);
			Button back = new Button("Back", image3);// Add button back next an image.

			add.setFont(Font.font(35));// Increase font.
			back.setFont(Font.font(35));

			hbox.getChildren().addAll(add, back);// Add buttons to horizontal box.
			hbox.setSpacing(200);// Spacing between buttons.
			hbox.setPadding(new Insets(100, 100, 70, 70));
			hbox.setAlignment(Pos.BOTTOM_CENTER);

			Label lb1 = new Label("Customer ID:");// Add labels and TextField.
			lb1.setFont(Font.font(20));// Increasing font.

			TextField txtf1 = new TextField();
			txtf1.setFont(Font.font(20));

			Label lb2 = new Label("Customer Name:");
			lb2.setFont(Font.font(20));

			TextField txtf2 = new TextField();
			txtf2.setFont(Font.font(20));

			Label lb3 = new Label("Customer Address:");
			lb3.setFont(Font.font(20));

			TextField txtf3 = new TextField();
			txtf3.setFont(Font.font(20));

			Label lb4 = new Label("Customer Mobile:");
			lb4.setFont(Font.font(20));

			TextField txtf4 = new TextField();
			txtf4.setFont(Font.font(20));

			Label lb5 = new Label("Customer Plan:");
			lb5.setFont(Font.font(20));

			HBox buttonh1 = new HBox();

			RadioButton rl = new RadioButton("LIMITED");
			RadioButton ru = new RadioButton("UNLIMITED");
			rl.setFont(Font.font(20));
			ru.setFont(Font.font(20));

			ToggleGroup group = new ToggleGroup();
			rl.setToggleGroup(group);
			ru.setToggleGroup(group);

			buttonh1.getChildren().addAll(rl, ru);

			txtf2.setDisable(true);
			txtf3.setDisable(true);
			txtf4.setDisable(true);

			txtf1.setOnAction(e -> {// press enter then the next TextField will open.

				if (txtf1.getText() != "") {
					txtf2.setDisable(false);

				}

			});

			txtf2.setOnAction(e -> {

				if (txtf2.getText() != "") {
					txtf3.setDisable(false);

				}

			});

			txtf3.setOnAction(e -> {

				if (txtf3.getText() != "") {
					txtf4.setDisable(false);

				}

			});

			GridPane gp1 = new GridPane();// Add gridPane.
			gp1.add(lb1, 0, 0);
			gp1.add(txtf1, 1, 0);
			gp1.add(lb2, 0, 1);
			gp1.add(txtf2, 1, 1);
			gp1.add(lb3, 0, 2);
			gp1.add(txtf3, 1, 2);
			gp1.add(lb4, 0, 3);
			gp1.add(txtf4, 1, 3);
			gp1.add(lb5, 0, 4);
			gp1.add(buttonh1, 1, 4);

			gp1.setHgap(10);// Spacings.
			gp1.setVgap(30);
			gp1.setPadding(new Insets(100, 100, 50, 200));
			gp1.setAlignment(Pos.CENTER_LEFT);
			root2.setLeft(gp1);
			root2.setBottom(hbox);

			// root2.setStyle("-fx-background-color:antiquewhite");// Color of screen.
			// WallPaper.
			// root2.setStyle(
			// "-fx-background-image:url('https://img.icons8.com/officel/452/bookmark-ribbon.png');-fx-background-size:cover");
			Scene scene = new Scene(root2, 1800, 850);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Add new customer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
