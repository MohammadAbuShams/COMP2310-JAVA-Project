package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class CustomerWindowsFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();// Add borderPane.

			ImageView image = new ImageView(
					"https://scontent.fjrs1-3.fna.fbcdn.net/v/t1.18169-9/12219616_470244829844073_5644542477775497212_n.jpg?_nc_cat=110&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=kfYYA2GrHb0AX-EctDm&_nc_ht=scontent.fjrs1-3.fna&oh=00_AT89pj8uPha9iqgUfrkcLu4_QcdNjf4wm8tllUusmgjfWA&oe=61FF00F5");
			// Add an image that reflect the content.

			image.setFitHeight(300);// The height and width of the image.
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

			VBox vbox2 = new VBox();// Add vertical box.

			Button b1 = new Button("Add new Customer");// Add 5 buttons.
			Button b2 = new Button("Delete Customer");
			Button b3 = new Button("Update Information about Customer");
			Button b4 = new Button("Search a Customer by id");
			Button b5 = new Button("Return to main page");

			Text txt2 = new Text("Choose what are you want");// Add text.

			txt2.setFont(Font.font(70));// Increasing font.
			txt2.setFill(Color.RED);// Fill the text with red color.

			vbox2.getChildren().addAll(txt2, b1, b2, b3, b4, b5);// Add all to verical box.
			vbox2.setAlignment(Pos.CENTER);

			b1.setFont(Font.font(30));// Increasing font.
			b2.setFont(Font.font(30));
			b3.setFont(Font.font(30));
			b4.setFont(Font.font(30));
			b5.setFont(Font.font(30));

			vbox2.setSpacing(60);// Spacing between buttons.
			vbox2.setPadding(new Insets(90, 90, 150, 150));

			root.setStyle("-fx-background-color:lightgoldenrodyellow");// Color of screen.
			Scene scene1 = new Scene(root, 1800, 850);

			vbox2.setStyle("-fx-background-color:gold");// Color of screen.
			Scene scene2 = new Scene(vbox2, 1800, 850);

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

			TextField txtf5 = new TextField();
			txtf5.setFont(Font.font(20));

			txtf2.setDisable(true);
			txtf3.setDisable(true);
			txtf4.setDisable(true);
			txtf5.setDisable(true);

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

			txtf4.setOnAction(e -> {

				if (txtf4.getText() != "") {
					txtf5.setDisable(false);

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
			gp1.add(txtf5, 1, 4);

			gp1.setHgap(30);// Spacings.
			gp1.setVgap(30);
			gp1.setPadding(new Insets(100, 100, 50, 200));
			gp1.setAlignment(Pos.CENTER_LEFT);
			root2.setLeft(gp1);
			root2.setBottom(hbox);

			root2.setStyle("-fx-background-color:antiquewhite");// Color of screen.
			Scene scene3 = new Scene(root2, 1800, 850);

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
			Scene scene4 = new Scene(root3, 1800, 850);

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
			Scene scene5 = new Scene(root4, 1800, 850);

			BorderPane root5 = new BorderPane();// Add borderPane.

			HBox hbox4 = new HBox();// Add horizontal box.

			TextArea txtta1 = new TextArea();
			txtta1.setFont(Font.font(25));
			txtta1.setMinHeight(200);
			txtta1.setMinWidth(70);

			// Add images and buttons next to each other.
			ImageView image10 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-search-logistic-delivery-kiranshastry-gradient-kiranshastry.png");
			image10.setFitHeight(50);
			image10.setFitWidth(50);
			Button search = new Button("Search", image10);

			ImageView image11 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image11.setFitHeight(50);
			image11.setFitWidth(50);
			Button back4 = new Button("Back", image11);

			// Increase font.
			search.setFont(Font.font(35));
			back4.setFont(Font.font(35));

			hbox4.getChildren().addAll(search, back4);// Add buttons to horizontal box.
			hbox4.setSpacing(200);
			hbox4.setPadding(new Insets(30, 100, 70, 70));
			hbox4.setAlignment(Pos.BOTTOM_CENTER);

			Label lb16 = new Label("Enter Customer ID:");// Add labels and TextField.
			lb16.setFont(Font.font(20));// Increasing font.

			TextField txtf16 = new TextField();
			txtf16.setFont(Font.font(30));

			GridPane gp4 = new GridPane();// Add gridPane.
			gp4.add(lb16, 0, 0);
			gp4.add(txtf16, 1, 0);
			gp4.add(txtta1, 1, 1);

			gp4.setHgap(30);// Spacings.
			gp4.setVgap(30);
			gp4.setPadding(new Insets(50, 100, 50, 100));
			gp4.setAlignment(Pos.CENTER_LEFT);
			root5.setLeft(gp4);
			root5.setBottom(hbox4);

			root5.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene6 = new Scene(root5, 1800, 850);

			VBox vbox6 = new VBox();// Add vertical box.

			Button b7 = new Button("Add new Media");// Add 6 buttons.
			Button b8 = new Button("Delete Media");
			Button b9 = new Button("Update Information about Media");
			Button b10 = new Button("Search a Media by code");
			Button b11 = new Button("Print All Media information");
			Button b12 = new Button("Return to main page");

			Text txt3 = new Text("Choose what are you want");// Add text.

			txt3.setFont(Font.font(70));// Increasing font.
			txt3.setFill(Color.RED);// Fill the text with red color.

			vbox6.getChildren().addAll(txt3, b7, b8, b9, b10, b11, b12);// Add all to vertical box.
			vbox6.setAlignment(Pos.CENTER);

			b7.setFont(Font.font(30));// Increasing font.
			b8.setFont(Font.font(30));
			b9.setFont(Font.font(30));
			b10.setFont(Font.font(30));
			b11.setFont(Font.font(30));
			b12.setFont(Font.font(30));

			vbox6.setSpacing(45);// Spacing between buttons.
			vbox6.setPadding(new Insets(90, 90, 150, 150));

			vbox6.setStyle("-fx-background-color:aqua");// Color of screen.
			Scene scene7 = new Scene(vbox6, 1800, 850);

			VBox vbox7 = new VBox();// Add a vertical box.

			Button g1 = new Button("Enter");// Add 2 buttons.
			Button BackMainMedia = new Button("Back");
			g1.setFont(Font.font(30));// Increasing font.
			BackMainMedia.setFont(Font.font(30));

			ComboBox cb = new ComboBox();// Add ComboBox to choose.
			cb.getItems().add("Game");
			cb.getItems().add("Movie");
			cb.getItems().add("Album");

			cb.setPromptText("Choose what are you want");
			cb.setStyle("-fx-font-size:35 em");// Size of ComboBox.

			vbox7.setAlignment(Pos.TOP_CENTER);
			vbox7.setSpacing(200);// Spacing.
			vbox7.setPadding(new Insets(50, 50, 50, 50));

			vbox7.getChildren().addAll(cb, g1, BackMainMedia);// add ComboBox and buttons to a vertical box.

			vbox7.setStyle("-fx-background-color:gray");// Color of screen.
			Scene scene8 = new Scene(vbox7, 1800, 850);

			BorderPane root7 = new BorderPane();// Add borderPane.

			HBox hbox5 = new HBox();// Add horizontal box.

			ImageView image1b = new ImageView("https://img.icons8.com/color/344/add--v1.png");// Add an image.
			image1b.setFitHeight(50);// Height and width.
			image1b.setFitWidth(50);
			Button add4 = new Button("Add", image1b);// Add button add next an image.

			ImageView image2b = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");// Add
																																// an
																																// image
			image2b.setFitHeight(50);// Height and width.
			image2b.setFitWidth(50);
			Button back5 = new Button("Back", image2b);// Add button back next an image.

			add4.setFont(Font.font(35));// Increase font.
			back5.setFont(Font.font(35));

			hbox5.getChildren().addAll(add4, back5);// Add buttons to horizontal box.
			hbox5.setSpacing(200);// Spacing between buttons.
			hbox5.setPadding(new Insets(100, 100, 70, 70));
			hbox5.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X2 = new ImageView(
					"https://i0.wp.com/www.allgamesgh.com/wp-content/uploads/2021/09/fifa-22-ps4.jpg?fit=800%2C800&ssl=1");
			X2.setLayoutX(700);
			X2.setLayoutY(50);
			X2.setFitHeight(550);
			X2.setFitWidth(800);

			root7.getChildren().add(X2);

			Label lb21 = new Label("Game Title:");// Add labels and TextField.
			lb21.setFont(Font.font(20));// Increasing font.

			TextField txtf21 = new TextField();
			txtf21.setFont(Font.font(20));

			Label lb22 = new Label("Game Copies:");
			lb22.setFont(Font.font(20));

			TextField txtf22 = new TextField();
			txtf22.setFont(Font.font(20));

			Label lb23 = new Label("Game Weight:");
			lb23.setFont(Font.font(20));

			TextField txtf23 = new TextField();
			txtf23.setFont(Font.font(20));

			Label lb24 = new Label("Game Code:");
			lb24.setFont(Font.font(20));

			TextField txtf24 = new TextField();
			txtf24.setFont(Font.font(20));

			GridPane gp5 = new GridPane();// Add gridPane.
			gp5.add(lb21, 0, 0);
			gp5.add(txtf21, 1, 0);
			gp5.add(lb22, 0, 1);
			gp5.add(txtf22, 1, 1);
			gp5.add(lb23, 0, 2);
			gp5.add(txtf23, 1, 2);
			gp5.add(lb24, 0, 3);
			gp5.add(txtf24, 1, 3);

			gp5.setHgap(30);// Spacings.
			gp5.setVgap(30);
			gp5.setPadding(new Insets(100, 100, 50, 200));
			gp5.setAlignment(Pos.CENTER_LEFT);
			root7.setLeft(gp5);
			root7.setBottom(hbox5);

			// root7.setStyle("-fx-background-image:url('');-fx-background-size:cover");
			Scene scene9 = new Scene(root7, 1800, 850);

			BorderPane root8 = new BorderPane();// Add borderPane.

			HBox hbox6 = new HBox();// Add horizontal box.

			ImageView image1c = new ImageView("https://img.icons8.com/color/344/add--v1.png");// Add an image.
			image1c.setFitHeight(50);// Height and width.
			image1c.setFitWidth(50);
			Button add5 = new Button("Add", image1c);// Add button add next an image.

			ImageView image2c = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");// Add
																																// an
																																// image
			image2c.setFitHeight(50);// Height and width.
			image2c.setFitWidth(50);
			Button back6 = new Button("Back", image2c);// Add button back next an image.

			add5.setFont(Font.font(35));// Increase font.
			back6.setFont(Font.font(35));

			hbox6.getChildren().addAll(add5, back6);// Add buttons to horizontal box.
			hbox6.setSpacing(200);// Spacing between buttons.
			hbox6.setPadding(new Insets(100, 100, 70, 70));
			hbox6.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X4 = new ImageView("https://on.notist.cloud/profile/pr-greetbagundal-large-735fa208d0498da9.jpg");
			X4.setLayoutX(700);
			X4.setLayoutY(50);
			X4.setFitHeight(550);
			X4.setFitWidth(800);

			root8.getChildren().add(X4);

			Label lb25 = new Label("Movie Title:");// Add labels and TextField.
			lb25.setFont(Font.font(20));// Increasing font.

			TextField txtf25 = new TextField();
			txtf25.setFont(Font.font(20));

			Label lb26 = new Label("Movie Copies:");
			lb26.setFont(Font.font(20));

			TextField txtf26 = new TextField();
			txtf26.setFont(Font.font(20));

			Label lb27 = new Label("Movie Rating:");
			lb27.setFont(Font.font(20));

			TextField txtf27 = new TextField();
			txtf27.setFont(Font.font(20));

			Label lb28 = new Label("Movie Code:");
			lb28.setFont(Font.font(20));

			TextField txtf28 = new TextField();
			txtf28.setFont(Font.font(20));

			GridPane gp6 = new GridPane();// Add gridPane.
			gp6.add(lb25, 0, 0);
			gp6.add(txtf25, 1, 0);
			gp6.add(lb26, 0, 1);
			gp6.add(txtf26, 1, 1);
			gp6.add(lb27, 0, 2);
			gp6.add(txtf27, 1, 2);
			gp6.add(lb28, 0, 3);
			gp6.add(txtf28, 1, 3);

			gp6.setHgap(30);// Spacings.
			gp6.setVgap(30);
			gp6.setPadding(new Insets(100, 100, 50, 200));
			gp6.setAlignment(Pos.CENTER_LEFT);
			root8.setLeft(gp6);
			root8.setBottom(hbox6);

			root8.setStyle("-fx-background-color:antiquewhite");// Color of screen.

			Scene scene10 = new Scene(root8, 1800, 850);
			scene10.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

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
			Button back7 = new Button("Back", image2d);// Add button back next an image.

			add6.setFont(Font.font(35));// Increase font.
			back7.setFont(Font.font(35));

			hbox7.getChildren().addAll(add6, back7);// Add buttons to horizontal box.
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
			Scene scene11 = new Scene(root9, 1800, 850);

			VBox vboxc2 = new VBox();// Add a vertical box.

			Button g2 = new Button("Enter");// Add 2 buttons.
			Button BackMainMedia2 = new Button("Back");
			g2.setFont(Font.font(30));// Increasing font.
			BackMainMedia2.setFont(Font.font(30));

			ComboBox cb2 = new ComboBox();// Add ComboBox to choose.
			cb2.getItems().add("Game");
			cb2.getItems().add("Movie");
			cb2.getItems().add("Album");

			cb2.setPromptText("Choose what are you want");
			cb2.setStyle("-fx-font-size:35 em");// Size of ComboBox.

			vboxc2.setAlignment(Pos.TOP_CENTER);
			vboxc2.setSpacing(200);// Spacing.
			vboxc2.setPadding(new Insets(50, 50, 50, 50));

			vboxc2.getChildren().addAll(cb2, g2, BackMainMedia2);// add ComboBox and buttons to a vertical box.

			vboxc2.setStyle("-fx-background-color:gray");// Color of screen.
			Scene scene12 = new Scene(vboxc2, 1800, 850);

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
			Button back8 = new Button("Back", image3e);

			find3.setFont(Font.font(35));// Increase font.
			delete3.setFont(Font.font(35));
			back8.setFont(Font.font(35));

			hbox8.getChildren().addAll(find3, delete3, back8);// Add buttons to horizontal box.
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

			GridPane gpp = new GridPane();// Add gridPane.
			gpp.add(lb34, 0, 0);
			gpp.add(txtf34, 1, 0);
			gpp.add(lb35, 0, 1);
			gpp.add(txtf35, 1, 1);
			gpp.add(lb36, 0, 2);
			gpp.add(txtf36, 1, 2);
			gpp.add(lb37, 0, 3);
			gpp.add(txtf37, 1, 3);

			gpp.setHgap(30);// Spacings.
			gpp.setVgap(30);
			gpp.setPadding(new Insets(100, 100, 50, 200));
			gpp.setAlignment(Pos.CENTER_LEFT);
			root10.setLeft(gpp);
			root10.setBottom(hbox8);

			root10.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene13 = new Scene(root10, 1800, 850);

			BorderPane root11 = new BorderPane();// Add borderPane.

			HBox hbox9 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1f = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1f.setFitHeight(50);// Height and width.
			image1f.setFitWidth(50);
			Button find4 = new Button("Find", image1f);

			ImageView image2f = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
			image2f.setFitHeight(50);
			image2f.setFitWidth(50);
			Button delete4 = new Button("Delete", image2f);

			ImageView image3f = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3f.setFitHeight(50);
			image3f.setFitWidth(50);
			Button back9 = new Button("Back", image3f);

			find4.setFont(Font.font(35));// Increase font.
			delete4.setFont(Font.font(35));
			back9.setFont(Font.font(35));

			hbox9.getChildren().addAll(find4, delete4, back9);// Add buttons to horizontal box.
			hbox9.setSpacing(200);
			hbox9.setPadding(new Insets(100, 100, 70, 70));
			hbox9.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X5 = new ImageView(
					"https://nbcpalmsprings.com/wp-content/uploads/sites/8/2021/12/BEST-MOVIES-OF-2021.jpeg");
			X5.setLayoutX(700);
			X5.setLayoutY(50);
			X5.setFitHeight(550);
			X5.setFitWidth(800);

			root11.getChildren().add(X5);

			Label lb38 = new Label("Movie Title:");// Add labels and TextField.
			lb38.setFont(Font.font(20));// Increasing font.

			TextField txtf38 = new TextField();
			txtf38.setFont(Font.font(20));

			Label lb39 = new Label("Movie Copies:");
			lb39.setFont(Font.font(20));

			TextField txtf39 = new TextField();
			txtf39.setFont(Font.font(20));

			Label lb40 = new Label("Movie Rating:");
			lb40.setFont(Font.font(20));

			TextField txtf40 = new TextField();
			txtf40.setFont(Font.font(20));

			Label lb41 = new Label("Movie Code:");
			lb41.setFont(Font.font(20));

			TextField txtf41 = new TextField();
			txtf41.setFont(Font.font(20));

			GridPane gp17 = new GridPane();// Add gridPane.
			gp17.add(lb38, 0, 0);
			gp17.add(txtf38, 1, 0);
			gp17.add(lb39, 0, 1);
			gp17.add(txtf39, 1, 1);
			gp17.add(lb40, 0, 2);
			gp17.add(txtf40, 1, 2);
			gp17.add(lb41, 0, 3);
			gp17.add(txtf41, 1, 3);

			gp17.setHgap(30);// Spacings.
			gp17.setVgap(30);
			gp17.setPadding(new Insets(100, 100, 50, 200));
			gp17.setAlignment(Pos.CENTER_LEFT);
			root11.setLeft(gp17);
			root11.setBottom(hbox9);

			root11.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene14 = new Scene(root11, 1800, 850);

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
			Button back10 = new Button("Back", image3g);

			find5.setFont(Font.font(35));// Increase font.
			delete5.setFont(Font.font(35));
			back10.setFont(Font.font(35));

			hbox10.getChildren().addAll(find5, delete5, back10);// Add buttons to horizontal box.
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

			GridPane gp11 = new GridPane();// Add gridPane.
			gp11.add(lb42, 0, 0);
			gp11.add(txtf42, 1, 0);
			gp11.add(lb43, 0, 1);
			gp11.add(txtf43, 1, 1);
			gp11.add(lb44, 0, 2);
			gp11.add(txtf44, 1, 2);
			gp11.add(lb45, 0, 3);
			gp11.add(txtf45, 1, 3);
			gp11.add(lb46, 0, 4);
			gp11.add(txtf46, 1, 4);

			gp11.setHgap(30);// Spacings.
			gp11.setVgap(30);
			gp11.setPadding(new Insets(100, 100, 50, 200));
			gp11.setAlignment(Pos.CENTER_LEFT);
			root12.setLeft(gp11);
			root12.setBottom(hbox10);

			root12.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene15 = new Scene(root12, 1800, 850);

			VBox vboxc3 = new VBox();// Add a vertical box.

			Button g3 = new Button("Enter");// Add 2 buttons.
			Button BackMainMedia3 = new Button("Back");
			g3.setFont(Font.font(30));// Increasing font.
			BackMainMedia3.setFont(Font.font(30));

			ComboBox cb3 = new ComboBox();// Add ComboBox to choose.
			cb3.getItems().add("Game");
			cb3.getItems().add("Movie");
			cb3.getItems().add("Album");

			cb3.setPromptText("Choose what are you want");
			cb3.setStyle("-fx-font-size:35 em");// Size of ComboBox.

			vboxc3.setAlignment(Pos.TOP_CENTER);
			vboxc3.setSpacing(200);// Spacing.
			vboxc3.setPadding(new Insets(50, 50, 50, 50));

			vboxc3.getChildren().addAll(cb3, g3, BackMainMedia3);// add ComboBox and buttons to a vertical box.

			vboxc3.setStyle("-fx-background-color:gray");// Color of screen.
			Scene scene16 = new Scene(vboxc3, 1800, 850);

			BorderPane root13 = new BorderPane();// Add borderPane.

			HBox hbox11 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1h = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1h.setFitHeight(50);// Height and width.
			image1h.setFitWidth(50);
			Button find6 = new Button("Find", image1h);

			ImageView image2h = new ImageView("https://img.icons8.com/officel/344/available-updates.png");
			image2h.setFitHeight(50);
			image2h.setFitWidth(50);
			Button update2 = new Button("Update", image2h);

			ImageView image3h = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3h.setFitHeight(50);
			image3h.setFitWidth(50);
			Button back11 = new Button("Back", image3h);

			find6.setFont(Font.font(35));// Increase font.
			update2.setFont(Font.font(35));
			back11.setFont(Font.font(35));

			hbox11.getChildren().addAll(find6, update2, back11);// Add buttons to horizontal box.
			hbox11.setSpacing(200);
			hbox11.setPadding(new Insets(100, 100, 70, 70));
			hbox11.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X3 = new ImageView("https://i.redd.it/5o197dnz6u651.jpg");
			X3.setLayoutX(700);
			X3.setLayoutY(50);
			X3.setFitHeight(500);
			X3.setFitWidth(800);

			root13.getChildren().add(X3);

			Label lb47 = new Label("Game Title:");// Add labels and TextField.
			lb47.setFont(Font.font(20));// Increasing font.

			TextField txtf47 = new TextField();
			txtf47.setFont(Font.font(20));

			Label lb48 = new Label("Game Copies:");
			lb48.setFont(Font.font(20));

			TextField txtf48 = new TextField();
			txtf48.setFont(Font.font(20));

			Label lb49 = new Label("Game Weight:");
			lb49.setFont(Font.font(20));

			TextField txtf49 = new TextField();
			txtf49.setFont(Font.font(20));

			Label lb50 = new Label("Game Code:");
			lb50.setFont(Font.font(20));

			TextField txtf50 = new TextField();
			txtf50.setFont(Font.font(20));

			GridPane gp12 = new GridPane();// Add gridPane.
			gp12.add(lb47, 0, 0);
			gp12.add(txtf47, 1, 0);
			gp12.add(lb48, 0, 1);
			gp12.add(txtf48, 1, 1);
			gp12.add(lb49, 0, 2);
			gp12.add(txtf49, 1, 2);
			gp12.add(lb50, 0, 3);
			gp12.add(txtf50, 1, 3);

			gp12.setHgap(30);// Spacings.
			gp12.setVgap(30);
			gp12.setPadding(new Insets(100, 100, 50, 200));
			gp12.setAlignment(Pos.CENTER_LEFT);
			root13.setLeft(gp12);
			root13.setBottom(hbox11);

			root13.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene17 = new Scene(root13, 1800, 850);

			BorderPane root14 = new BorderPane();// Add borderPane.

			HBox hbox12 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1i = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1i.setFitHeight(50);// Height and width.
			image1i.setFitWidth(50);
			Button find7 = new Button("Find", image1i);

			ImageView image2i = new ImageView("https://img.icons8.com/officel/344/available-updates.png");
			image2i.setFitHeight(50);
			image2i.setFitWidth(50);
			Button update3 = new Button("Update", image2i);

			ImageView image3i = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3i.setFitHeight(50);
			image3i.setFitWidth(50);
			Button back12 = new Button("Back", image3i);

			find7.setFont(Font.font(35));// Increase font.
			update3.setFont(Font.font(35));
			back12.setFont(Font.font(35));

			hbox12.getChildren().addAll(find7, update3, back12);// Add buttons to horizontal box.
			hbox12.setSpacing(200);
			hbox12.setPadding(new Insets(100, 100, 70, 70));
			hbox12.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X6 = new ImageView(
					"https://d2e111jq13me73.cloudfront.net/sites/default/files/styles/review_gallery_thumbnail_large/public/screenshots/csm-movie/monsters-inc-ss1_0.jpg?itok=2uB6uyVi");
			X6.setLayoutX(700);
			X6.setLayoutY(50);
			X6.setFitHeight(550);
			X6.setFitWidth(800);

			root14.getChildren().add(X6);

			Label lb51 = new Label("Movie Title:");// Add labels and TextField.
			lb51.setFont(Font.font(20));// Increasing font.

			TextField txtf51 = new TextField();
			txtf51.setFont(Font.font(20));

			Label lb52 = new Label("Movie Copies:");
			lb52.setFont(Font.font(20));

			TextField txtf52 = new TextField();
			txtf52.setFont(Font.font(20));

			Label lb53 = new Label("Movie Rating:");
			lb53.setFont(Font.font(20));

			TextField txtf53 = new TextField();
			txtf53.setFont(Font.font(20));

			Label lb54 = new Label("Movie Code:");
			lb54.setFont(Font.font(20));

			TextField txtf54 = new TextField();
			txtf54.setFont(Font.font(20));

			GridPane gp13 = new GridPane();// Add gridPane.
			gp13.add(lb51, 0, 0);
			gp13.add(txtf51, 1, 0);
			gp13.add(lb52, 0, 1);
			gp13.add(txtf52, 1, 1);
			gp13.add(lb53, 0, 2);
			gp13.add(txtf53, 1, 2);
			gp13.add(lb54, 0, 3);
			gp13.add(txtf54, 1, 3);

			gp13.setHgap(30);// Spacings.
			gp13.setVgap(30);
			gp13.setPadding(new Insets(100, 100, 50, 200));
			gp13.setAlignment(Pos.CENTER_LEFT);
			root14.setLeft(gp13);
			root14.setBottom(hbox12);

			root14.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene18 = new Scene(root14, 1800, 850);

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
			Button back13 = new Button("Back", image3j);

			find8.setFont(Font.font(35));// Increase font.
			update4.setFont(Font.font(35));
			back13.setFont(Font.font(35));

			hbox13.getChildren().addAll(find8, update4, back13);// Add buttons to horizontal box.
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

			GridPane gp14 = new GridPane();// Add gridPane.
			gp14.add(lb55, 0, 0);
			gp14.add(txtf55, 1, 0);
			gp14.add(lb56, 0, 1);
			gp14.add(txtf56, 1, 1);
			gp14.add(lb57, 0, 2);
			gp14.add(txtf57, 1, 2);
			gp14.add(lb58, 0, 3);
			gp14.add(txtf58, 1, 3);
			gp14.add(lb59, 0, 4);
			gp14.add(txtf59, 1, 4);

			gp14.setHgap(30);// Spacings.
			gp14.setVgap(30);
			gp14.setPadding(new Insets(100, 100, 50, 200));
			gp14.setAlignment(Pos.CENTER_LEFT);
			root15.setLeft(gp14);
			root15.setBottom(hbox13);

			root15.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene19 = new Scene(root15, 1800, 850);

			BorderPane root16 = new BorderPane();// Add borderPane.

			HBox hbox16 = new HBox();// Add horizontal box.

			TextArea txtta4 = new TextArea();
			txtta4.setFont(Font.font(25));
			txtta4.setMinHeight(200);
			txtta4.setMinWidth(70);

			// Add images and buttons next to each other.
			ImageView image16 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-search-logistic-delivery-kiranshastry-gradient-kiranshastry.png");
			image16.setFitHeight(50);
			image16.setFitWidth(50);
			Button search2 = new Button("Search", image16);

			ImageView image17 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image17.setFitHeight(50);
			image17.setFitWidth(50);
			Button back14 = new Button("Back", image17);

			// Increase font.
			search2.setFont(Font.font(35));
			back14.setFont(Font.font(35));

			hbox16.getChildren().addAll(search2, back14);// Add buttons to horizontal box.
			hbox16.setSpacing(200);
			hbox16.setPadding(new Insets(30, 100, 70, 70));
			hbox16.setAlignment(Pos.BOTTOM_CENTER);

			Label lb60 = new Label("Enter Media Code:");// Add labels and TextField.
			lb60.setFont(Font.font(30));// Increasing font.

			TextField txtf60 = new TextField();
			txtf60.setFont(Font.font(30));

			GridPane gp15 = new GridPane();// Add gridPane.
			gp15.add(lb60, 0, 0);
			gp15.add(txtf60, 1, 0);
			gp15.add(txtta4, 1, 1);

			gp15.setHgap(30);// Spacings.
			gp15.setVgap(30);
			gp15.setPadding(new Insets(50, 100, 50, 100));
			gp15.setAlignment(Pos.CENTER_LEFT);
			root16.setLeft(gp15);
			root16.setBottom(hbox16);

			root16.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene20 = new Scene(root16, 1800, 850);

			BorderPane root20 = new BorderPane();// Add borderPane.
			HBox hbox15 = new HBox();// Add horizontal box.

			ImageView image14 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image14.setFitHeight(50);
			image14.setFitWidth(50);
			Button back15 = new Button("Back", image14);
			back15.setFont(Font.font(50));// Increasing Font.

			ImageView image15 = new ImageView("https://img.icons8.com/fluency/452/print.png");
			image15.setFitHeight(50);
			image15.setFitWidth(50);
			Button print1 = new Button("Print", image15);
			back15.setFont(Font.font(35));// Increasing Font.
			print1.setFont(Font.font(35));

			hbox15.setAlignment(Pos.BOTTOM_CENTER);
			hbox15.getChildren().addAll(print1, back15);// Add buttons to horizontal box.
			root20.setBottom(hbox15);
			hbox15.setSpacing(200);// Spacing between buttons.
			hbox15.setPadding(new Insets(30, 100, 70, 70));

			TextArea txta2 = new TextArea();// Add textArea.

			txta2.setFont(Font.font(25));
			txta2.setMinHeight(200);
			txta2.setMinWidth(70);

			GridPane gp16 = new GridPane();// Add gridPane.
			gp16.add(txta2, 1, 1);
			gp16.setPadding(new Insets(50, 100, 50, 100));
			gp16.setAlignment(Pos.CENTER_LEFT);
			root20.setLeft(gp16);

			Scene scene21 = new Scene(root20, 1800, 850);

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

			GridPane gp18 = new GridPane();// Add gridPane.
			gp18.add(lb61, 0, 0);// Add labels and TextField to the gridPane.
			gp18.add(txtf61, 1, 0);
			gp18.add(txta5, 1, 1);
			gp18.add(lb62, 0, 2);
			gp18.add(txtf62, 1, 2);
			gp18.add(txta6, 1, 3);
			gp18.add(lb63, 0, 4);
			gp18.add(txtf63, 1, 4);

			gp18.setHgap(20);
			gp18.setVgap(20);
			gp18.setPadding(new Insets(50, 50, 50, 300));
			gp18.setAlignment(Pos.CENTER_LEFT);
			root17.setLeft(gp18);

			Button btn1 = new Button("Add To Cart");// Add 3 buttons.
			Button btn2 = new Button("Process Cart");
			Button back16 = new Button("Back");

			btn1.setFont(Font.font(30));
			btn2.setFont(Font.font(30));
			back16.setFont(Font.font(30));

			Rectangle rec11 = new Rectangle(210, 70);// Add rectangle and add width and height.
			Rectangle rec12 = new Rectangle(210, 70);
			Rectangle rec13 = new Rectangle(210, 70);

			btn1.setShape(rec11);
			rec11.setArcHeight(30);
			rec11.setArcWidth(30);

			btn2.setShape(rec12);
			rec12.setArcHeight(30);
			rec12.setArcWidth(30);

			back16.setShape(rec13);
			rec13.setArcHeight(30);
			rec13.setArcWidth(30);

			btn1.setMinHeight(70);// width and height.
			btn1.setMinWidth(210);
			btn2.setMinHeight(70);
			btn2.setMinWidth(210);
			back16.setMinHeight(70);
			back16.setMinWidth(210);

			hbox17.getChildren().addAll(btn1, btn2, back16);// Add buttons to the horizontal box.
			hbox17.setSpacing(200);// Spacing between button.
			hbox17.setPadding(new Insets(60, 60, 60, 60));// from edges.
			hbox17.setAlignment(Pos.BOTTOM_LEFT);
			root17.setBottom(hbox17);

			root17.setStyle("-fx-background-color:pink");

			Scene scene22 = new Scene(root17, 1800, 850);

			bt1.setOnAction(e -> {
				primaryStage.setScene(scene2);
			});

			b1.setOnAction(e -> {
				primaryStage.setScene(scene3);
			});

			back.setOnAction(e -> {

				primaryStage.setScene(scene2);
			});

			b2.setOnAction(e -> {
				primaryStage.setScene(scene4);
			});

			back2.setOnAction(e -> {

				primaryStage.setScene(scene2);
			});
			b3.setOnAction(e -> {
				primaryStage.setScene(scene5);
			});
			back3.setOnAction(e -> {

				primaryStage.setScene(scene2);
			});
			b4.setOnAction(e -> {
				primaryStage.setScene(scene6);
			});
			back4.setOnAction(e -> {

				primaryStage.setScene(scene2);
			});
			b5.setOnAction(e -> {
				primaryStage.setScene(scene1);
			});
			bt2.setOnAction(e -> {
				primaryStage.setScene(scene7);
			});
			b7.setOnAction(e -> {

				primaryStage.setScene(scene8);
			});

			BackMainMedia.setOnAction(e -> {
				primaryStage.setScene(scene7);
			});

			g1.setOnAction(e -> {

				if (cb.getSelectionModel().isSelected(0)) {
					primaryStage.setScene(scene9);

				}

				else if (cb.getSelectionModel().isSelected(1)) {
					primaryStage.setScene(scene10);

				} else if (cb.getSelectionModel().isSelected(2)) {
					primaryStage.setScene(scene11);

				}

			});

			back5.setOnAction(e -> {

				primaryStage.setScene(scene8);
			});

			back6.setOnAction(e -> {

				primaryStage.setScene(scene8);
			});

			back7.setOnAction(e -> {

				primaryStage.setScene(scene8);
			});

			b8.setOnAction(e -> {

				primaryStage.setScene(scene12);
			});

			BackMainMedia2.setOnAction(e -> {
				primaryStage.setScene(scene7);
			});

			g2.setOnAction(e -> {

				if (cb2.getSelectionModel().isSelected(0)) {
					primaryStage.setScene(scene13);

				}

				else if (cb2.getSelectionModel().isSelected(1)) {
					primaryStage.setScene(scene14);

				} else if (cb2.getSelectionModel().isSelected(2)) {
					primaryStage.setScene(scene15);

				}

			});

			back8.setOnAction(e -> {

				primaryStage.setScene(scene12);
			});

			back9.setOnAction(e -> {

				primaryStage.setScene(scene12);
			});

			back10.setOnAction(e -> {

				primaryStage.setScene(scene12);
			});

			b9.setOnAction(e -> {

				primaryStage.setScene(scene16);
			});

			BackMainMedia3.setOnAction(e -> {
				primaryStage.setScene(scene7);
			});

			g3.setOnAction(e -> {

				if (cb3.getSelectionModel().isSelected(0)) {
					primaryStage.setScene(scene17);

				}

				else if (cb3.getSelectionModel().isSelected(1)) {
					primaryStage.setScene(scene18);

				} else if (cb3.getSelectionModel().isSelected(2)) {
					primaryStage.setScene(scene19);

				}

			});

			back11.setOnAction(e -> {

				primaryStage.setScene(scene16);
			});

			back12.setOnAction(e -> {

				primaryStage.setScene(scene16);
			});

			back13.setOnAction(e -> {

				primaryStage.setScene(scene16);
			});

			b10.setOnAction(e -> {

				primaryStage.setScene(scene20);
			});

			back14.setOnAction(e -> {

				primaryStage.setScene(scene7);
			});

			b11.setOnAction(e -> {

				primaryStage.setScene(scene21);
			});
			back15.setOnAction(e -> {

				primaryStage.setScene(scene7);
			});
			b12.setOnAction(e -> {

				primaryStage.setScene(scene1);
			});

			bt3.setOnAction(e -> {
				primaryStage.setScene(scene22);
			});

			back16.setOnAction(e -> {
				primaryStage.setScene(scene1);
			});

			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene4.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene5.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene6.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene7.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene8.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene9.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene10.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene11.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene12.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene13.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene14.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene15.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene16.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene17.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene18.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene19.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene20.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene21.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene22.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setMaximized(true);
			primaryStage.setScene(scene1);
			primaryStage.setTitle("FX project");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
