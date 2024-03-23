package application;

import java.util.Date;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class AllProject extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			MediaRental mediar = new MediaRental();// Create an object for MediaRental.

			BorderPane root = new BorderPane();// Add borderPane.

			ImageView image = new ImageView(
					"https://www.mobygames.com/images/covers/l/137377-the-movies-windows-front-cover.jpg");
			// Add an image that reflect the content.

			image.setFitHeight(300);// The height and width of the image.

			image.setFitWidth(400);

			image.setLayoutX(900);// image coordinates.

			image.setLayoutY(100);

			Rectangle rec = new Rectangle(950, 550, 410, 70);// Add a rectangle.

			rec.setFill(Color.TRANSPARENT);// Fill the rectangle with transparent color.

			rec.setStroke(Color.BLUE);// Paint the frame with blue color.

			rec.setArcWidth(15);// Bending for rectangle.

			rec.setArcHeight(18);

			Text txt = new Text("Rental Media System");// Add a text.
			txt.setLayoutX(1000);// Text coordinates.
			txt.setLayoutY(600);
			txt.setFont(Font.font(35));// Increase font for a text.

			VBox vbox = new VBox();// Add a vertical box.

			Button bt1 = new Button("Customer");// Add 3 buttons.
			Button bt2 = new Button("Media");
			Button bt3 = new Button("Rent");

			bt1.setFont(Font.font(35));// Increase font for buttons.
			bt2.setFont(Font.font(35));
			bt3.setFont(Font.font(35));

			bt1.setMinHeight(70);// width and height for buttons.
			bt1.setMinWidth(410);
			bt2.setMinHeight(70);
			bt2.setMinWidth(410);
			bt3.setMinHeight(70);
			bt3.setMinWidth(410);

			bt1.setStyle("-fx-background-color:mediumturquoise");// Fill the buttons with transparent color.
			bt2.setStyle("-fx-background-color:mediumturquoise");
			bt3.setStyle("-fx-background-color:mediumturquoise");

			Rectangle rec1 = new Rectangle(410, 70);// Add rectangle and add width and height.
			Rectangle rec2 = new Rectangle(410, 70);
			Rectangle rec3 = new Rectangle(410, 70);

			rec1.setArcWidth(30);
			rec1.setArcHeight(30);

			rec2.setArcWidth(30);
			rec2.setArcHeight(30);

			rec3.setArcWidth(30);
			rec3.setArcHeight(30);

			bt1.setShape(rec1);// Set shape for buttons to rectangle.
			bt2.setShape(rec2);
			bt3.setShape(rec3);

			vbox.getChildren().addAll(bt1, bt2, bt3);// Add buttons to the vertical box.

			vbox.setSpacing(100);// Spacing between buttons.
			vbox.setPadding(new Insets(90, 90, 150, 150));// Spaces from edges.
			root.setLeft(vbox);
			vbox.setAlignment(Pos.CENTER_LEFT);

			root.getChildren().addAll(image, txt, rec);// Add text and rectangle and image to the borderPane.

			VBox vbox2 = new VBox();

			Button b1 = new Button("Add new Customer");// Add 5 buttons.
			Button b2 = new Button("Delete Customer");
			Button b3 = new Button("Update Information about Customer");
			Button b4 = new Button("Search a Customer by id");
			Button b5 = new Button("Return to main page");

			Text txt2 = new Text("Choose one of the following options");// Add text.

			txt2.setFont(Font.font(70));// Increasing font.
			txt2.setFill(Color.DARKRED);// Fill the text with red color.

			HBox c = new HBox();

			CheckBox chbox1 = new CheckBox("bold");// Add CheckBox.
			chbox1.setFont(Font.font(40));

			CheckBox chbox2 = new CheckBox("italic");
			chbox2.setFont(Font.font(40));

			c.getChildren().addAll(chbox1, chbox2);
			c.setSpacing(50);

			vbox2.setAlignment(Pos.CENTER);

			b1.setFont(Font.font(30));// Increasing font for buttons.
			b2.setFont(Font.font(30));
			b3.setFont(Font.font(30));
			b4.setFont(Font.font(30));
			b5.setFont(Font.font(30));

			b1.setPrefSize(600, 600);
			b2.setPrefSize(600, 600);
			b3.setPrefSize(600, 600);
			b4.setPrefSize(600, 600);
			b5.setPrefSize(600, 600);

			Circle b1c = new Circle(600);
			Circle b2c = new Circle(600);
			Circle b3c = new Circle(600);
			Circle b4c = new Circle(600);
			Circle b5c = new Circle(600);

			b1.setShape(b1c);
			b2.setShape(b2c);
			b3.setShape(b3c);
			b4.setShape(b4c);
			b5.setShape(b5c);

			chbox1.setOnAction(new javafx.event.EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {// Type of Line.

					if (chbox1.isSelected()) {
						Font myfont = Font.font(null, FontWeight.BOLD, txt2.getFont().getSize());
						txt2.setFont(myfont);
					}

					else {
						Font myfont = Font.font(null, FontWeight.NORMAL, txt2.getFont().getSize());
						txt2.setFont(myfont);
					}
				}

			});

			chbox2.setOnAction(new javafx.event.EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					if (chbox2.isSelected()) {
						Font myfont = Font.font(null, FontWeight.NORMAL, FontPosture.ITALIC, txt2.getFont().getSize());
						txt2.setFont(myfont);
					}

					else {
						Font myfont = Font.font(null, FontWeight.NORMAL, FontPosture.REGULAR, txt2.getFont().getSize());
						txt2.setFont(myfont);
					}
				}

			});

			vbox2.setSpacing(40);// Spacing between buttons.
			vbox2.setPadding(new Insets(90, 90, 150, 150));
			vbox2.getChildren().addAll(txt2, c, b1, b2, b3, b4, b5);// Add all buttons and text to vertical box.

			root.setStyle("-fx-background-color:moccasin");// Color of screen.
			Scene scene1 = new Scene(root, 1800, 850);// First interface.

			vbox2.setStyle("-fx-background-color:darksalmon");// Color of screen.
			Scene scene2 = new Scene(vbox2, 1800, 850);// Second interface.

			BorderPane root2 = new BorderPane();

			HBox hbox = new HBox();// Add horizontal box.

			ImageView image2 = new ImageView("https://img.icons8.com/color/344/add--v1.png");// Add an image.
			image2.setFitHeight(50);// Height and width.
			image2.setFitWidth(50);
			Button add = new Button("Add", image2);// Add button (add) next an image.

			add.setContentDisplay(ContentDisplay.RIGHT);// Put the image at the right of button.

			ImageView image3 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");// Add
																																// an
																																// image
			image3.setFitHeight(50);// Height and width.
			image3.setFitWidth(50);
			Button back = new Button("Back", image3);// Add button (back) next an image.

			back.setContentDisplay(ContentDisplay.RIGHT);

			add.setFont(Font.font(35));// Increase font for buttons.
			back.setFont(Font.font(35));

			hbox.getChildren().addAll(add, back);// Add buttons to horizontal box.
			hbox.setSpacing(200);// Spacing between buttons.
			hbox.setPadding(new Insets(100, 100, 70, 70));
			hbox.setAlignment(Pos.BOTTOM_CENTER);

			Label lb1 = new Label("Customer ID:");// Add labels and TextField.
			lb1.setFont(Font.font(20));// Increasing font for labels and textField.

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

			HBox buttonh = new HBox();

			RadioButton rl = new RadioButton("LIMITED");// Add 2 radio buttons.
			RadioButton ru = new RadioButton("UNLIMITED");
			rl.setFont(Font.font(20));
			ru.setFont(Font.font(20));

			ToggleGroup group = new ToggleGroup();
			rl.setToggleGroup(group);
			ru.setToggleGroup(group);

			buttonh.getChildren().addAll(rl, ru);// add radio buttons to HBox.

			txtf2.setDisable(true);// Let all text except the first disable.
			txtf3.setDisable(true);
			txtf4.setDisable(true);

			txtf1.setOnAction(e -> {// press enter then the next TextField will open.

				if (txtf1.getText() != "") {// If the first textField has text then the second will open and so on.
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

			ImageView N1 = new ImageView("https://landerapp.com/blog/wp-content/uploads/2018/05/customers.jpg");
			N1.setLayoutX(700);
			N1.setLayoutY(50);
			N1.setFitHeight(550);
			N1.setFitWidth(800);
			root2.getChildren().add(N1);

			GridPane gp1 = new GridPane();// Add gridPane.
			gp1.add(lb1, 0, 0);// Add labels and textField to gridPane.
			gp1.add(txtf1, 1, 0);
			gp1.add(lb2, 0, 1);
			gp1.add(txtf2, 1, 1);
			gp1.add(lb3, 0, 2);
			gp1.add(txtf3, 1, 2);
			gp1.add(lb4, 0, 3);
			gp1.add(txtf4, 1, 3);
			gp1.add(lb5, 0, 4);
			gp1.add(buttonh, 1, 4);

			buttonh.setSpacing(50);
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
			find.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image5 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
			image5.setFitHeight(50);
			image5.setFitWidth(50);
			Button delete = new Button("Delete", image5);
			delete.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image6 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image6.setFitHeight(50);
			image6.setFitWidth(50);
			Button back2 = new Button("Back", image6);
			back2.setContentDisplay(ContentDisplay.RIGHT);

			find.setFont(Font.font(35));// Increase font for buttons.
			delete.setFont(Font.font(35));
			back2.setFont(Font.font(35));

			hbox2.getChildren().addAll(find, delete, back2);// Add buttons to horizontal box.
			hbox2.setSpacing(200);
			hbox2.setPadding(new Insets(100, 100, 70, 70));
			hbox2.setAlignment(Pos.BOTTOM_CENTER);

			Label lb6 = new Label("Customer ID:");// Add labels and TextField.
			lb6.setFont(Font.font(20));// Increasing font for them.

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

			Label s1 = new Label("Print the error: ");
			s1.setFont(Font.font(20));

			TextField t1 = new TextField();
			t1.setFont(Font.font(20));

			HBox buttonh2 = new HBox();

			RadioButton rl2 = new RadioButton("LIMITED");
			RadioButton ru2 = new RadioButton("UNLIMITED");
			rl2.setFont(Font.font(20));
			ru2.setFont(Font.font(20));

			ToggleGroup group2 = new ToggleGroup();
			rl2.setToggleGroup(group2);
			ru2.setToggleGroup(group2);

			buttonh2.getChildren().addAll(rl2, ru2);

			find.setOnAction(e -> {
				int i = mediar.customerExist(txtf6.getText());
				if (i > -1) {// The customer exist.
					txtf7.setText(mediar.getCustomer().get(i).getName());
					txtf8.setText(mediar.getCustomer().get(i).getAddress());
					txtf9.setText(mediar.getCustomer().get(i).getMobile_number());

					if (mediar.getCustomer().get(i).getPlan().equals("LIMITED")) {
						rl2.setSelected(true);
					} else if (mediar.getCustomer().get(i).getPlan().equals("UNLIMITED")) {
						ru2.setSelected(true);
					}
				} else if (i < 0) {
					t1.setText("Customer not found");
				}

			});

			delete.setOnAction(e -> {
				mediar.deleteCustomer(txtf6.getText());

			});

			ImageView N3 = new ImageView("https://blog.accessdevelopment.com/hubfs/customer-base-marketing-2.png");
			N3.setLayoutX(700);
			N3.setLayoutY(50);
			N3.setFitHeight(550);
			N3.setFitWidth(800);
			root3.getChildren().add(N3);

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
			gp2.add(buttonh2, 1, 4);
			gp2.add(s1, 0, 5);
			gp2.add(t1, 1, 5);

			buttonh2.setSpacing(50);
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
			find2.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image8 = new ImageView("https://img.icons8.com/officel/344/available-updates.png");
			image8.setFitHeight(50);
			image8.setFitWidth(50);
			Button update = new Button("Update", image8);
			update.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image9 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image9.setFitHeight(50);
			image9.setFitWidth(50);
			Button back3 = new Button("Back", image9);
			back3.setContentDisplay(ContentDisplay.RIGHT);

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

			Label s2 = new Label("Print the error:");
			s2.setFont(Font.font(20));

			TextField t2 = new TextField();
			t2.setFont(Font.font(20));

			Label lb15 = new Label("Customer Plan:");
			lb15.setFont(Font.font(20));

			HBox buttonh3 = new HBox();

			RadioButton rl3 = new RadioButton("LIMITED");
			RadioButton ru3 = new RadioButton("UNLIMITED");
			rl3.setFont(Font.font(20));
			ru3.setFont(Font.font(20));

			ToggleGroup group3 = new ToggleGroup();
			rl3.setToggleGroup(group3);
			ru3.setToggleGroup(group3);

			buttonh3.getChildren().addAll(rl3, ru3);

			find2.setOnAction(e -> {
				int i = mediar.customerExist(txtf11.getText());
				if (i > -1) {
					txtf12.setText(mediar.getCustomer().get(i).getName());
					txtf13.setText(mediar.getCustomer().get(i).getAddress());
					txtf14.setText(mediar.getCustomer().get(i).getMobile_number());

					if (mediar.getCustomer().get(i).getPlan().equals("LIMITED")) {
						rl3.setSelected(true);
					} else if (mediar.getCustomer().get(i).getPlan().equals("UNLIMITED")) {
						ru3.setSelected(true);
					}
				} else if (i < 0) {
					t2.setText("Customer not found");
				}

			});

			update.setOnAction(e -> {// Update information.
				int i = mediar.customerExist(txtf11.getText());
				mediar.getCustomer().get(i).setName(txtf12.getText());
				mediar.getCustomer().get(i).setAddress(txtf13.getText());
				mediar.getCustomer().get(i).setMobile_number(txtf14.getText());

				if (rl3.isSelected())
					mediar.getCustomer().get(i).setPlan("LIMITED");
				else
					mediar.getCustomer().get(i).setPlan("UNLIMITED");

			});

			ImageView N4 = new ImageView(
					"https://www.customerservicemanager.com/wp-content/uploads/2015/05/customer.jpg");

			N4.setLayoutX(700);
			N4.setLayoutY(50);
			N4.setFitHeight(550);
			N4.setFitWidth(800);
			root4.getChildren().add(N4);

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
			gp3.add(buttonh3, 1, 4);
			gp3.add(s2, 0, 5);
			gp3.add(t2, 1, 5);

			buttonh3.setSpacing(50);

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

			search.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image11 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image11.setFitHeight(50);

			image11.setFitWidth(50);

			Button back4 = new Button("Back", image11);

			back4.setContentDisplay(ContentDisplay.RIGHT);

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

			search.setOnAction(e -> {
				int i = mediar.customerExist(txtf16.getText());
				if (i > -1)
					txtta1.setText(mediar.getCustomer().get(i).toString());// Print customer information in the
																			// textArea.
				else
					txtta1.setText("Customer Not Found");

			});

			ImageView N5 = new ImageView("https://bestirtech.com/blog/wp-content/uploads/2020/04/saved-search.jpg");
			N5.setLayoutY(50);
			N5.setFitHeight(100);
			N5.setFitWidth(100);

			root5.getChildren().add(N5);

			root5.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene6 = new Scene(root5, 1800, 850);

			VBox vbox6 = new VBox();// Add vertical box.

			Button b7 = new Button("Add new Media");// Add 6 buttons.
			Button b8 = new Button("Delete Media");
			Button b9 = new Button("Update Information about Media");
			Button b10 = new Button("Search a Media by code");
			Button b11 = new Button("Print All Media information");
			Button b12 = new Button("Return to main page");

			Text txt3 = new Text("Choose one of the following options");// Add text.

			txt3.setFont(Font.font(70));// Increasing font.
			txt3.setFill(Color.RED);// Fill the text with red color.
			vbox6.setAlignment(Pos.CENTER);

			b7.setFont(Font.font(30));// Increasing font.
			b8.setFont(Font.font(30));
			b9.setFont(Font.font(30));
			b10.setFont(Font.font(30));
			b11.setFont(Font.font(30));
			b12.setFont(Font.font(30));

			b7.setPrefSize(500, 500);
			b8.setPrefSize(500, 500);
			b9.setPrefSize(500, 500);
			b10.setPrefSize(500, 500);
			b11.setPrefSize(500, 500);
			b12.setPrefSize(500, 500);

			Rectangle rb1 = new Rectangle(500, 500);
			Rectangle rb2 = new Rectangle(500, 500);
			Rectangle rb3 = new Rectangle(500, 500);
			Rectangle rb4 = new Rectangle(500, 500);
			Rectangle rb5 = new Rectangle(500, 500);
			Rectangle rb6 = new Rectangle(500, 500);

			b7.setShape(rb1);
			b8.setShape(rb2);
			b9.setShape(rb3);
			b10.setShape(rb4);
			b11.setShape(rb5);
			b12.setShape(rb6);

			rb1.setArcHeight(120);
			rb1.setArcWidth(120);

			rb2.setArcHeight(120);
			rb2.setArcWidth(120);

			rb3.setArcHeight(120);
			rb3.setArcWidth(120);

			rb4.setArcHeight(120);
			rb4.setArcWidth(120);

			rb5.setArcHeight(120);
			rb5.setArcWidth(120);

			rb6.setArcHeight(120);
			rb6.setArcWidth(120);

			vbox6.getChildren().addAll(txt3, b7, b8, b9, b10, b11, b12);// Add all to vertical box.

			vbox6.setSpacing(45);// Spacing between buttons.
			vbox6.setPadding(new Insets(90, 90, 150, 150));

			vbox6.setStyle("-fx-background-color:aqua");// Color of screen.
			Scene scene7 = new Scene(vbox6, 1800, 850);

			VBox vbox7 = new VBox();// Add a vertical box.

			Button g1 = new Button("Enter");// Add 2 buttons.
			g1.setFont(Font.font(50));// Increasing font.
			Button BackMainMedia = new Button("Back");
			BackMainMedia.setFont(Font.font(50));

			ComboBox cb = new ComboBox();// Add ComboBox to choose.
			cb.getItems().add("Game");
			cb.getItems().add("Movie");
			cb.getItems().add("Album");

			Circle c1 = new Circle(200);
			Circle c2 = new Circle(200);

			g1.setShape(c1);
			BackMainMedia.setShape(c2);

			cb.setPromptText("Choose one of the following options");// The text of ComboBox.
			cb.setStyle("-fx-font-size:35 em");// Size of ComboBox.

			vbox7.setAlignment(Pos.TOP_CENTER);
			vbox7.setSpacing(200);// Spacing.
			vbox7.setPadding(new Insets(50, 50, 50, 50));

			vbox7.getChildren().addAll(cb, g1, BackMainMedia);// add ComboBox and buttons to a vertical box.

			vbox7.setStyle("-fx-background-color:chocolate");// Color of screen.
			Scene scene8 = new Scene(vbox7, 1800, 850);

			BorderPane root7 = new BorderPane();// Add borderPane.

			HBox hbox5 = new HBox();// Add horizontal box.

			ImageView image1b = new ImageView("https://img.icons8.com/color/344/add--v1.png");// Add an image.
			image1b.setFitHeight(50);// Height and width.
			image1b.setFitWidth(50);
			Button add4 = new Button("Add", image1b);// Add button add next an image.
			add4.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image2b = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");// Add
																																// an
																																// image
			image2b.setFitHeight(50);// Height and width.
			image2b.setFitWidth(50);
			Button back5 = new Button("Back", image2b);// Add button back next an image.
			back5.setContentDisplay(ContentDisplay.RIGHT);

			add4.setFont(Font.font(35));// Increase font.
			back5.setFont(Font.font(35));

			hbox5.getChildren().addAll(add4, back5);// Add buttons to horizontal box.
			hbox5.setSpacing(200);// Spacing between buttons.
			hbox5.setPadding(new Insets(100, 100, 70, 70));
			hbox5.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X2 = new ImageView(
					"https://i0.wp.com/www.allgamesgh.com/wp-content/uploads/2021/09/fifa-22-ps4.jpg?fit=800%2C800&ssl=1");
			X2.setLayoutX(750);
			X2.setLayoutY(50);
			X2.setFitHeight(550);
			X2.setFitWidth(700);

			ImageView o2 = new ImageView(
					"https://thumbor.forbes.com/thumbor/960x0/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5e21db5aa854780006e8c438%2FHorizon-Zero-Dawn-PC%2F960x0.jpg%3Ffit%3Dscale");
			o2.setLayoutX(100);
			o2.setLayoutY(600);
			o2.setFitHeight(170);
			o2.setFitWidth(300);

			root7.getChildren().addAll(o2, X2);

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

			Label v1 = new Label("Print the error: ");
			v1.setFont(Font.font(20));

			TextField z1 = new TextField();
			z1.setFont(Font.font(20));

			GridPane gp5 = new GridPane();// Add gridPane.

			gp5.add(lb21, 0, 0);

			gp5.add(txtf21, 1, 0);

			gp5.add(lb22, 0, 1);

			gp5.add(txtf22, 1, 1);

			gp5.add(lb23, 0, 2);

			gp5.add(txtf23, 1, 2);

			gp5.add(lb24, 0, 3);

			gp5.add(txtf24, 1, 3);

			gp5.add(v1, 0, 5);

			gp5.add(z1, 1, 5);

			gp5.setHgap(27);// Spacings.

			gp5.setVgap(27);

			gp5.setPadding(new Insets(100, 100, 50, 200));

			gp5.setAlignment(Pos.CENTER_LEFT);

			root7.setLeft(gp5);

			root7.setBottom(hbox5);

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
																																// image.
			add5.setContentDisplay(ContentDisplay.RIGHT);

			image2c.setFitHeight(50);// Height and width.

			image2c.setFitWidth(50);

			Button back6 = new Button("Back", image2c);// Add button back next an image.

			back6.setContentDisplay(ContentDisplay.RIGHT);

			add5.setFont(Font.font(35));// Increase font.

			back6.setFont(Font.font(35));

			hbox6.getChildren().addAll(add5, back6);// Add buttons to horizontal box.

			hbox6.setSpacing(200);// Spacing between buttons.

			hbox6.setPadding(new Insets(100, 100, 70, 70));

			hbox6.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X4 = new ImageView("https://on.notist.cloud/profile/pr-greetbagundal-large-735fa208d0498da9.jpg");
			X4.setLayoutX(750);
			X4.setLayoutY(50);
			X4.setFitHeight(550);
			X4.setFitWidth(700);

			ImageView o5 = new ImageView(
					"https://static1.colliderimages.com/wordpress/wp-content/uploads/2021/08/best-kids-movies-netflix.jpg?q=50&fit=contain&w=750&h=375&dpr=1.5");
			o5.setLayoutX(100);
			o5.setLayoutY(600);
			o5.setFitHeight(170);
			o5.setFitWidth(250);

			root8.getChildren().addAll(X4, o5);

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

			HBox buttonh4 = new HBox();

			RadioButton rm1 = new RadioButton("DR");
			RadioButton rm2 = new RadioButton("HR");
			RadioButton rm3 = new RadioButton("AC");

			rm1.setFont(Font.font(20));
			rm2.setFont(Font.font(20));
			rm3.setFont(Font.font(20));

			ToggleGroup group4 = new ToggleGroup();
			rm1.setToggleGroup(group4);
			rm2.setToggleGroup(group4);
			rm3.setToggleGroup(group4);

			buttonh4.getChildren().addAll(rm1, rm2, rm3);

			Label lb28 = new Label("Movie Code:");
			lb28.setFont(Font.font(20));

			TextField txtf28 = new TextField();
			txtf28.setFont(Font.font(20));
			Label e4 = new Label("Print the error:");
			e4.setFont(Font.font(20));

			TextField f4 = new TextField();
			f4.setFont(Font.font(20));

			GridPane gp6 = new GridPane();// Add gridPane.
			gp6.add(lb25, 0, 0);
			gp6.add(txtf25, 1, 0);
			gp6.add(lb26, 0, 1);
			gp6.add(txtf26, 1, 1);
			gp6.add(lb27, 0, 2);
			gp6.add(buttonh4, 1, 2);
			gp6.add(lb28, 0, 3);
			gp6.add(txtf28, 1, 3);
			gp6.add(e4, 0, 5);
			gp6.add(f4, 1, 5);

			buttonh4.setSpacing(30);
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
			add6.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image2d = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");// Add
																																// an
																																// image
			image2d.setFitHeight(50);// Height and width.
			image2d.setFitWidth(50);
			Button back7 = new Button("Back", image2d);// Add button back next an image.
			back7.setContentDisplay(ContentDisplay.RIGHT);

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

			Label v3 = new Label("Print the error:");
			v3.setFont(Font.font(20));

			TextField z3 = new TextField();
			z3.setFont(Font.font(20));

			ImageView Q1 = new ImageView(
					"https://dvfnvgxhycwzf.cloudfront.net/media/SharedImage/imageFull/.fLObkbzX/SharedImage-127614.jpg?t=97ff103d341dd4ff5f24");
			Q1.setLayoutX(750);
			Q1.setLayoutY(50);
			Q1.setFitHeight(550);
			Q1.setFitWidth(700);

			root9.getChildren().add(Q1);

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
			gp7.add(v3, 0, 6);
			gp7.add(z3, 1, 6);

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
			g2.setFont(Font.font(50));// Increasing font.
			BackMainMedia2.setFont(Font.font(50));

			ComboBox cb2 = new ComboBox();// Add ComboBox to choose.
			cb2.getItems().add("Game");
			cb2.getItems().add("Movie");
			cb2.getItems().add("Album");

			Circle c3 = new Circle(200);
			Circle c4 = new Circle(200);
			Circle c7 = new Circle(100);

			cb2.setShape(c7);

			g2.setShape(c3);
			BackMainMedia2.setShape(c4);

			cb2.setPromptText("Choose one of the following options");
			cb2.setStyle("-fx-font-size:35 em");// Size of ComboBox.

			vboxc2.setAlignment(Pos.TOP_CENTER);
			vboxc2.setSpacing(200);// Spacing.
			vboxc2.setPadding(new Insets(50, 50, 50, 50));

			vboxc2.getChildren().addAll(cb2, g2, BackMainMedia2);// add ComboBox and buttons to a vertical box.

			vboxc2.setStyle("-fx-background-color:tan");// Color of screen.
			Scene scene12 = new Scene(vboxc2, 1800, 850);

			BorderPane root10 = new BorderPane();// Add borderPane.

			HBox hbox8 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1e = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1e.setFitHeight(50);// Height and width.
			image1e.setFitWidth(50);
			Button find3 = new Button("Find", image1e);
			find3.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image2e = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
			image2e.setFitHeight(50);
			image2e.setFitWidth(50);
			Button delete3 = new Button("Delete", image2e);
			delete3.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image3e = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3e.setFitHeight(50);
			image3e.setFitWidth(50);
			Button back8 = new Button("Back", image3e);
			back8.setContentDisplay(ContentDisplay.RIGHT);

			find3.setFont(Font.font(35));// Increase font.
			delete3.setFont(Font.font(35));
			back8.setFont(Font.font(35));

			hbox8.getChildren().addAll(find3, delete3, back8);// Add buttons to horizontal box.
			hbox8.setSpacing(200);
			hbox8.setPadding(new Insets(100, 100, 70, 70));
			hbox8.setAlignment(Pos.BOTTOM_CENTER);

			ImageView I1 = new ImageView(
					"https://s.yimg.com/uu/api/res/1.2/F2cURo7S3LAOorNAlXeejA--~B/Zmk9ZmlsbDtoPTQ1MDt3PTY3NTthcHBpZD15dGFjaHlvbg--/https://s.yimg.com/os/creatr-uploaded-images/2021-12/73e2b000-577c-11ec-bf4f-b28dff737d78.cf.webp");
			I1.setLayoutX(750);
			I1.setLayoutY(50);
			I1.setFitHeight(600);
			I1.setFitWidth(700);

			ImageView o3 = new ImageView(
					"https://s3.gaming-cdn.com/images/products/4055/271x377/disney-pixar-cars-2-the-video-game-pc-game-steam-cover.jpg");
			o3.setLayoutX(100);
			o3.setLayoutY(600);
			o3.setFitHeight(170);
			o3.setFitWidth(250);

			root10.getChildren().addAll(o3, I1);

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

			Label v4 = new Label("Pritnt the error:");
			v4.setFont(Font.font(20));

			TextField z4 = new TextField();
			z4.setFont(Font.font(20));

			txtf34.setDisable(true);
			txtf35.setDisable(true);
			txtf36.setDisable(true);

			find3.setOnAction(e -> {
				int i = mediar.mediaExist(txtf37.getText());
				if (i > -1) {
					txtf34.setText(mediar.getMed().get(i).getTitle());
					txtf35.setText(String.valueOf(mediar.getMed().get(i).getCopiesAvailbale()));// Convert from integer
																								// to String.
					txtf36.setText(String.valueOf(((Game) mediar.getMed().get(i)).getWeight_in_gram()));// Convert from
																										// double to
																										// String.
				} else if (i < 0) {
					z4.setText("Game not found");
				}

			});

			delete3.setOnAction(e -> {
				mediar.deleteMedia(txtf37.getText());
			});

			GridPane gpp = new GridPane();// Add gridPane.
			gpp.add(lb34, 0, 0);
			gpp.add(txtf34, 1, 0);
			gpp.add(lb35, 0, 1);
			gpp.add(txtf35, 1, 1);
			gpp.add(lb36, 0, 2);
			gpp.add(txtf36, 1, 2);
			gpp.add(lb37, 0, 3);
			gpp.add(txtf37, 1, 3);
			gpp.add(v4, 0, 5);
			gpp.add(z4, 1, 5);

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
			find4.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image2f = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
			image2f.setFitHeight(50);
			image2f.setFitWidth(50);
			Button delete4 = new Button("Delete", image2f);
			delete4.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image3f = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3f.setFitHeight(50);
			image3f.setFitWidth(50);
			Button back9 = new Button("Back", image3f);
			back9.setContentDisplay(ContentDisplay.RIGHT);

			find4.setFont(Font.font(35));// Increase font.
			delete4.setFont(Font.font(35));
			back9.setFont(Font.font(35));

			hbox9.getChildren().addAll(find4, delete4, back9);// Add buttons to horizontal box.
			hbox9.setSpacing(200);
			hbox9.setPadding(new Insets(100, 100, 70, 70));
			hbox9.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X5 = new ImageView(
					"https://nbcpalmsprings.com/wp-content/uploads/sites/8/2021/12/BEST-MOVIES-OF-2021.jpeg");
			X5.setLayoutX(750);
			X5.setLayoutY(50);
			X5.setFitHeight(550);
			X5.setFitWidth(700);

			ImageView o6 = new ImageView(
					"https://static.wikia.nocookie.net/disney/images/8/89/Big_Hero_6_film_poster.jpg/revision/latest?cb=20160505193934");
			o6.setLayoutX(100);
			o6.setLayoutY(600);
			o6.setFitHeight(170);
			o6.setFitWidth(250);

			root11.getChildren().addAll(X5, o6);

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

			HBox buttonh5 = new HBox();

			RadioButton rm4 = new RadioButton("DR");
			RadioButton rm5 = new RadioButton("HR");
			RadioButton rm6 = new RadioButton("AC");

			rm4.setFont(Font.font(20));
			rm5.setFont(Font.font(20));
			rm6.setFont(Font.font(20));

			ToggleGroup group5 = new ToggleGroup();
			rm4.setToggleGroup(group5);
			rm5.setToggleGroup(group5);
			rm6.setToggleGroup(group5);

			buttonh5.getChildren().addAll(rm4, rm5, rm6);

			Label lb41 = new Label("Movie Code:");
			lb41.setFont(Font.font(20));

			txtf38.setDisable(true);
			txtf39.setDisable(true);
			buttonh5.setDisable(true);

			TextField txtf41 = new TextField();
			txtf41.setFont(Font.font(20));
			Label e5 = new Label("Print the error:");
			e5.setFont(Font.font(20));

			TextField f5 = new TextField();
			f5.setFont(Font.font(20));

			find4.setOnAction(e -> {
				int i = mediar.mediaExist(txtf41.getText());
				if (i > -1) {
					txtf38.setText(mediar.getMed().get(i).getTitle());
					txtf39.setText(String.valueOf(mediar.getMed().get(i).getCopiesAvailbale()));

					if (((Movie) mediar.getMed().get(i)).getRating().equals("DR")) {
						rm4.setSelected(true);
					} else if (((Movie) mediar.getMed().get(i)).getRating().equals("HR")) {
						rm5.setSelected(true);
					} else
						rm6.setSelected(true);
				} else if (i < 0) {
					f5.setText("Movie not found");
				}
			});

			delete4.setOnAction(e -> {
				mediar.deleteMedia(txtf41.getText());
			});

			GridPane gp17 = new GridPane();// Add gridPane.
			gp17.add(lb38, 0, 0);
			gp17.add(txtf38, 1, 0);
			gp17.add(lb39, 0, 1);
			gp17.add(txtf39, 1, 1);
			gp17.add(lb40, 0, 2);
			gp17.add(buttonh5, 1, 2);
			gp17.add(lb41, 0, 3);
			gp17.add(txtf41, 1, 3);
			gp17.add(e5, 0, 5);
			gp17.add(f5, 1, 5);
			buttonh5.setSpacing(30);

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
			find5.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image2g = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
			image2g.setFitHeight(50);
			image2g.setFitWidth(50);
			Button delete5 = new Button("Delete", image2g);
			delete5.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image3g = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3g.setFitHeight(50);
			image3g.setFitWidth(50);
			Button back10 = new Button("Back", image3g);
			back10.setContentDisplay(ContentDisplay.RIGHT);

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

			Label v6 = new Label("Print the error:");
			v6.setFont(Font.font(20));

			TextField z6 = new TextField();
			z6.setFont(Font.font(20));

			txtf42.setDisable(true);
			txtf43.setDisable(true);
			txtf44.setDisable(true);
			txtf45.setDisable(true);

			ImageView Q2 = new ImageView(
					"https://cdn.sanity.io/images/7g6d2cj1/production/81b67e7af332ce7e4b971bad24c892a114f06448-1000x667.jpg?h=667&q=70&auto=format");
			Q2.setLayoutX(750);
			Q2.setLayoutY(50);
			Q2.setFitHeight(550);
			Q2.setFitWidth(700);

			root12.getChildren().add(Q2);

			find5.setOnAction(e -> {
				int i = mediar.mediaExist(txtf46.getText());
				if (i > -1) {
					txtf42.setText(mediar.getMed().get(i).getTitle());
					txtf43.setText(String.valueOf(mediar.getMed().get(i).getCopiesAvailbale()));
					txtf44.setText(((Album) mediar.getMed().get(i)).getArtist());
					txtf45.setText(((Album) mediar.getMed().get(i)).getSongs());

				} else if (i < 0) {
					z6.setText("Album not found");
				}
			});

			delete5.setOnAction(e -> {
				mediar.deleteMedia(txtf46.getText());

			});

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
			gp11.add(v6, 0, 6);
			gp11.add(z6, 1, 6);

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
			g3.setFont(Font.font(50));// Increasing font.
			BackMainMedia3.setFont(Font.font(50));

			ComboBox cb3 = new ComboBox();// Add ComboBox to choose.
			cb3.getItems().add("Game");
			cb3.getItems().add("Movie");
			cb3.getItems().add("Album");

			Circle c5 = new Circle(200);
			Circle c6 = new Circle(200);

			g3.setShape(c5);
			BackMainMedia3.setShape(c6);

			cb3.setPromptText("Choose one of the following options");
			cb3.setStyle("-fx-font-size:35 em");// Size of ComboBox.

			vboxc3.setAlignment(Pos.TOP_CENTER);
			vboxc3.setSpacing(200);// Spacing.
			vboxc3.setPadding(new Insets(50, 50, 50, 50));

			vboxc3.getChildren().addAll(cb3, g3, BackMainMedia3);// add ComboBox and buttons to a vertical box.

			vboxc3.setStyle("-fx-background-color:peachpuff");// Color of screen.
			Scene scene16 = new Scene(vboxc3, 1800, 850);

			BorderPane root13 = new BorderPane();// Add borderPane.

			HBox hbox11 = new HBox();// Add horizontal box.

			// Add images and buttons next to each other.
			ImageView image1h = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image1h.setFitHeight(50);// Height and width.
			image1h.setFitWidth(50);
			Button find6 = new Button("Find", image1h);
			find6.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image2h = new ImageView("https://img.icons8.com/officel/344/available-updates.png");
			image2h.setFitHeight(50);
			image2h.setFitWidth(50);
			Button update2 = new Button("Update", image2h);
			update2.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image3h = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3h.setFitHeight(50);
			image3h.setFitWidth(50);
			Button back11 = new Button("Back", image3h);
			back11.setContentDisplay(ContentDisplay.RIGHT);

			find6.setFont(Font.font(35));// Increase font.

			update2.setFont(Font.font(35));

			back11.setFont(Font.font(35));

			hbox11.getChildren().addAll(find6, update2, back11);// Add buttons to horizontal box.

			hbox11.setSpacing(200);

			hbox11.setPadding(new Insets(100, 100, 70, 70));

			hbox11.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X3 = new ImageView("https://i.redd.it/5o197dnz6u651.jpg");

			X3.setLayoutX(750);

			X3.setLayoutY(50);

			X3.setFitHeight(500);

			X3.setFitWidth(700);

			ImageView o4 = new ImageView(
					"data:image/jpeg;base64,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");
			o4.setLayoutX(100);
			o4.setLayoutY(600);
			o4.setFitHeight(170);
			o4.setFitWidth(250);

			root13.getChildren().addAll(o4, X3);

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

			Label v7 = new Label("Print the error:");
			v7.setFont(Font.font(20));

			TextField z7 = new TextField();
			z7.setFont(Font.font(20));

			find6.setOnAction(e -> {
				int i = mediar.mediaExist(txtf50.getText());
				if (i > -1) {
					txtf47.setText(mediar.getMed().get(i).getTitle());
					txtf48.setText(String.valueOf(mediar.getMed().get(i).getCopiesAvailbale()));
					txtf49.setText(String.valueOf(((Game) mediar.getMed().get(i)).getWeight_in_gram()));
				}

				else if (i < 0) {
					z7.setText("Game not found");
				}
			});

			update2.setOnAction(e -> {
				int i = mediar.mediaExist(txtf50.getText());
				mediar.getMed().get(i).setTitle(txtf47.getText());
				mediar.getMed().get(i).setCopiesAvailbale(Integer.parseInt(txtf48.getText()));// Convert from String to
																								// integer.
				((Game) mediar.getMed().get(i)).setWeight_in_gram(Double.parseDouble(txtf49.getText()));// Convert from
																										// String to
																										// double.

			});

			GridPane gp12 = new GridPane();// Add gridPane.
			gp12.add(lb47, 0, 0);
			gp12.add(txtf47, 1, 0);
			gp12.add(lb48, 0, 1);
			gp12.add(txtf48, 1, 1);
			gp12.add(lb49, 0, 2);
			gp12.add(txtf49, 1, 2);
			gp12.add(lb50, 0, 3);
			gp12.add(txtf50, 1, 3);
			gp12.add(v7, 0, 5);
			gp12.add(z7, 1, 5);

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
			find7.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image2i = new ImageView("https://img.icons8.com/officel/344/available-updates.png");
			image2i.setFitHeight(50);
			image2i.setFitWidth(50);
			Button update3 = new Button("Update", image2i);
			update3.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image3i = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3i.setFitHeight(50);
			image3i.setFitWidth(50);
			Button back12 = new Button("Back", image3i);
			back12.setContentDisplay(ContentDisplay.RIGHT);

			find7.setFont(Font.font(35));// Increase font.
			update3.setFont(Font.font(35));
			back12.setFont(Font.font(35));

			hbox12.getChildren().addAll(find7, update3, back12);// Add buttons to horizontal box.
			hbox12.setSpacing(200);
			hbox12.setPadding(new Insets(100, 100, 70, 70));
			hbox12.setAlignment(Pos.BOTTOM_CENTER);

			ImageView X6 = new ImageView(
					"https://d2e111jq13me73.cloudfront.net/sites/default/files/styles/review_gallery_thumbnail_large/public/screenshots/csm-movie/monsters-inc-ss1_0.jpg?itok=2uB6uyVi");
			X6.setLayoutX(750);
			X6.setLayoutY(50);
			X6.setFitHeight(550);
			X6.setFitWidth(700);

			ImageView o7 = new ImageView(
					"https://cdn.pastemagazine.com/www/articles/2017/03/07/best-disney-movies-netflix.jpg");
			o7.setLayoutX(100);
			o7.setLayoutY(600);
			o7.setFitHeight(170);
			o7.setFitWidth(250);

			root14.getChildren().addAll(X6, o7);

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

			HBox buttonh6 = new HBox();

			RadioButton rm7 = new RadioButton("DR");
			RadioButton rm8 = new RadioButton("HR");
			RadioButton rm9 = new RadioButton("AC");

			rm7.setFont(Font.font(20));
			rm8.setFont(Font.font(20));
			rm9.setFont(Font.font(20));

			ToggleGroup group6 = new ToggleGroup();
			rm7.setToggleGroup(group6);
			rm8.setToggleGroup(group6);
			rm9.setToggleGroup(group6);

			buttonh6.getChildren().addAll(rm7, rm8, rm9);

			Label lb54 = new Label("Movie Code:");
			lb54.setFont(Font.font(20));

			TextField txtf54 = new TextField();
			txtf54.setFont(Font.font(20));

			Label e6 = new Label("Print the error:");
			e6.setFont(Font.font(20));

			TextField f6 = new TextField();
			f6.setFont(Font.font(20));

			find7.setOnAction(e -> {
				int i = mediar.mediaExist(txtf54.getText());
				if (i > -1) {
					txtf51.setText(mediar.getMed().get(i).getTitle());
					txtf52.setText(String.valueOf(mediar.getMed().get(i).getCopiesAvailbale()));

					if (((Movie) mediar.getMed().get(i)).getRating().equals("DR")) {
						rm7.setSelected(true);
					} else if (((Movie) mediar.getMed().get(i)).getRating().equals("HR")) {
						rm8.setSelected(true);
					} else
						rm9.setSelected(true);
				} else if (i < 0) {
					f6.setText("Movie not found");
				}

			});

			update3.setOnAction(e -> {
				int i = mediar.mediaExist(txtf54.getText());
				mediar.getMed().get(i).setTitle(txtf51.getText());
				mediar.getMed().get(i).setCopiesAvailbale(Integer.parseInt(txtf52.getText()));

				if (rm7.isSelected())
					((Movie) mediar.getMed().get(i)).setRating(rm7.getText());
				else if (rm8.isSelected())
					((Movie) mediar.getMed().get(i)).setRating(rm8.getText());
				else if (rm9.isSelected())
					((Movie) mediar.getMed().get(i)).setRating(rm9.getText());

			});

			GridPane gp13 = new GridPane();// Add gridPane.
			gp13.add(lb51, 0, 0);
			gp13.add(txtf51, 1, 0);
			gp13.add(lb52, 0, 1);
			gp13.add(txtf52, 1, 1);
			gp13.add(lb53, 0, 2);
			gp13.add(buttonh6, 1, 2);
			gp13.add(lb54, 0, 3);
			gp13.add(txtf54, 1, 3);
			gp13.add(e6, 0, 5);
			gp13.add(f6, 1, 5);
			buttonh6.setSpacing(30);
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
			find8.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image2j = new ImageView("https://img.icons8.com/officel/344/available-updates.png");
			image2j.setFitHeight(50);
			image2j.setFitWidth(50);
			Button update4 = new Button("Update", image2j);
			update4.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image3j = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image3j.setFitHeight(50);
			image3j.setFitWidth(50);
			Button back13 = new Button("Back", image3j);

			find8.setFont(Font.font(35));// Increase font.
			update4.setFont(Font.font(35));
			back13.setFont(Font.font(35));
			back13.setContentDisplay(ContentDisplay.RIGHT);

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

			Label v9 = new Label("Print the error:");
			v9.setFont(Font.font(20));

			TextField z9 = new TextField();
			z9.setFont(Font.font(20));

			ImageView Q3 = new ImageView(
					"https://27mi124bz6zg1hqy6n192jkb-wpengine.netdna-ssl.com/wp-content/uploads/2019/10/Our-Top-10-Songs-About-School-1024x759.png");
			Q3.setLayoutX(750);
			Q3.setLayoutY(50);
			Q3.setFitHeight(550);
			Q3.setFitWidth(700);

			root15.getChildren().add(Q3);

			find8.setOnAction(e -> {
				int i = mediar.mediaExist(txtf59.getText());
				if (i > -1) {
					txtf55.setText(mediar.getMed().get(i).getTitle());
					txtf56.setText(String.valueOf(mediar.getMed().get(i).getCopiesAvailbale()));
					txtf57.setText(((Album) mediar.getMed().get(i)).getArtist());
					txtf58.setText(((Album) mediar.getMed().get(i)).getSongs());
				} else if (i < 0) {
					z9.setText("Album not found");
				}

			});

			update4.setOnAction(e -> {
				int i = mediar.mediaExist(txtf59.getText());
				mediar.getMed().get(i).setTitle(txtf55.getText());
				mediar.getMed().get(i).setCopiesAvailbale(Integer.parseInt(txtf56.getText()));
				((Album) mediar.getMed().get(i)).setArtist(txtf57.getText());
				((Album) mediar.getMed().get(i)).setSongs(txtf58.getText());

			});

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
			gp14.add(v9, 0, 6);
			gp14.add(z9, 1, 6);

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
			search2.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image17 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image17.setFitHeight(50);

			image17.setFitWidth(50);

			Button back14 = new Button("Back", image17);

			back14.setContentDisplay(ContentDisplay.RIGHT);

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

			ImageView H1 = new ImageView("https://bestirtech.com/blog/wp-content/uploads/2020/04/saved-search.jpg");
			H1.setLayoutY(50);
			H1.setFitHeight(100);
			H1.setFitWidth(100);

			root16.getChildren().add(H1);

			search2.setOnAction(e -> {
				int i = mediar.mediaExist(txtf60.getText());
				if (i > -1) {
					txtta4.setText(mediar.getMed().get(i).toString());
				} else
					txtta4.setText("Media Not Found");

			});

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
			back15.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image15 = new ImageView("https://img.icons8.com/fluency/452/print.png");
			image15.setFitHeight(50);
			image15.setFitWidth(50);
			Button print1 = new Button("Print", image15);
			back15.setFont(Font.font(35));// Increasing Font.
			print1.setFont(Font.font(35));
			print1.setContentDisplay(ContentDisplay.RIGHT);

			hbox15.setAlignment(Pos.BOTTOM_CENTER);
			hbox15.getChildren().addAll(print1, back15);// Add buttons to horizontal box.
			root20.setBottom(hbox15);
			hbox15.setSpacing(200);// Spacing between buttons.
			hbox15.setPadding(new Insets(30, 100, 70, 70));

			TextArea txta2 = new TextArea();// Add textArea.

			txta2.setFont(Font.font(25));
			txta2.setMinHeight(200);
			txta2.setMinWidth(70);

			ImageView H2 = new ImageView(
					"https://img-16.ccm2.net/SA9kaktpyGM7sd-9btT6FMSfTqs=/2508x/902060b3878a4d3ebf466a17c157694a/ccm-faq/30557375_m.jpg");
			H2.setLayoutY(50);
			H2.setFitHeight(100);
			H2.setFitWidth(100);

			root20.getChildren().add(H2);

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

			btn1.setOnAction(e -> {
				mediar.addToCart(txtf61.getText(), txtf62.getText());
				txtf63.setText(new Date().toString());// Print the current date when Click the button(Rent).

			});

			Scene scene22 = new Scene(root17, 1800, 850);

			BorderPane root22 = new BorderPane();// Add borderPane.
			HBox hbox22 = new HBox();// Add horizontal box.

			ImageView image22 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image22.setFitHeight(50);
			image22.setFitWidth(50);
			Button back17 = new Button("Back", image22);
			back17.setContentDisplay(ContentDisplay.RIGHT);

			ImageView image23 = new ImageView("https://img.icons8.com/fluency/452/print.png");
			image23.setFitHeight(50);
			image23.setFitWidth(50);
			Button print2 = new Button("Print", image23);
			back17.setFont(Font.font(35));// Increasing Font.
			print2.setFont(Font.font(35));
			print2.setContentDisplay(ContentDisplay.RIGHT);

			hbox22.setAlignment(Pos.BOTTOM_CENTER);
			hbox22.getChildren().addAll(print2, back17);// Add buttons to horizontal box.
			root22.setBottom(hbox22);
			hbox22.setSpacing(200);// Spacing between buttons.
			hbox22.setPadding(new Insets(30, 100, 70, 70));

			TextArea txta3 = new TextArea();// Add textArea.

			txta3.setFont(Font.font(25));
			txta3.setMinHeight(200);
			txta3.setMinWidth(70);

			print2.setOnAction(e -> {

				txta3.setText(mediar.processRequests());

			});

			ImageView F2 = new ImageView(
					"https://img-16.ccm2.net/SA9kaktpyGM7sd-9btT6FMSfTqs=/2508x/902060b3878a4d3ebf466a17c157694a/ccm-faq/30557375_m.jpg");
			F2.setLayoutY(50);
			F2.setFitHeight(100);
			F2.setFitWidth(100);

			root22.getChildren().add(F2);

			GridPane gp19 = new GridPane();// Add gridPane.
			gp19.add(txta3, 1, 1);
			gp19.setPadding(new Insets(50, 100, 50, 100));
			gp19.setAlignment(Pos.CENTER_LEFT);
			root22.setLeft(gp19);
			Scene scene23 = new Scene(root22, 1800, 850);

			VBox vbox1r = new VBox();// Add vertical box.

			Button buttonr1 = new Button("Rent Form");// Add 6 buttons.
			Button buttonr2 = new Button("Requested Media");
			Button buttonr3 = new Button("Rented Media");
			Button buttonr4 = new Button("Return Media");
			Button buttonr5 = new Button("Return to main page");

			Text txt4 = new Text("Choose one of the following options");// Add text.

			txt4.setFont(Font.font(70));// Increasing font.
			txt4.setFill(Color.RED);// Fill the text with red color.

			vbox1r.getChildren().addAll(txt4, buttonr1, buttonr2, buttonr3, buttonr4, buttonr5);// Add all to vertical
																								// box.
			vbox1r.setAlignment(Pos.CENTER);

			buttonr1.setFont(Font.font(30));// Increasing font.
			buttonr2.setFont(Font.font(30));
			buttonr3.setFont(Font.font(30));
			buttonr4.setFont(Font.font(30));
			buttonr5.setFont(Font.font(30));

			buttonr1.setPrefSize(500, 500);
			buttonr2.setPrefSize(500, 500);
			buttonr3.setPrefSize(500, 500);
			buttonr4.setPrefSize(500, 500);
			buttonr5.setPrefSize(500, 500);

			vbox1r.setSpacing(45);// Spacing between buttons.
			vbox1r.setPadding(new Insets(90, 90, 150, 150));

			vbox1r.setStyle("-fx-background-color:gold");// Color of screen.
			Scene scene24 = new Scene(vbox1r, 1800, 850);

			BorderPane root24 = new BorderPane();// Add borderPane.

			HBox hbox24 = new HBox();// Add horizontal box.

			TextArea txtta10 = new TextArea();
			txtta10.setFont(Font.font(25));
			txtta10.setMinHeight(200);
			txtta10.setMinWidth(70);

			// Add images and buttons next to each other.
			ImageView image20 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image20.setFitHeight(50);
			image20.setFitWidth(50);
			Button find10 = new Button("Find", image20);

			ImageView image21 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image21.setFitHeight(50);
			image21.setFitWidth(50);
			Button back20 = new Button("Back", image21);

			back20.setContentDisplay(ContentDisplay.RIGHT);
			find10.setContentDisplay(ContentDisplay.RIGHT);

			// Increase font.
			find10.setFont(Font.font(35));
			back20.setFont(Font.font(35));

			hbox24.getChildren().addAll(find10, back20);// Add buttons to horizontal box.
			hbox24.setSpacing(200);
			hbox24.setPadding(new Insets(30, 100, 70, 70));
			hbox24.setAlignment(Pos.BOTTOM_CENTER);

			Label lb70 = new Label("Customer Id:");// Add labels and TextField.
			lb70.setFont(Font.font(30));// Increasing font.

			TextField txtf70 = new TextField();
			txtf70.setFont(Font.font(30));

			find10.setOnAction(e -> {

				int i = mediar.customerExist(txtf70.getText());
				if (i > -1)
					txtta10.setText(mediar.getCustomer().get(i).getReceiving().toString());

				else
					txtta10.setText("Customer Not Found");

			});

			GridPane gp20 = new GridPane();// Add gridPane.
			gp20.add(lb70, 0, 0);
			gp20.add(txtf70, 1, 0);
			gp20.add(txtta10, 1, 1);

			gp20.setHgap(30);// Spacings.
			gp20.setVgap(30);
			gp20.setPadding(new Insets(50, 100, 50, 100));
			gp20.setAlignment(Pos.CENTER_LEFT);
			root24.setLeft(gp20);
			root24.setBottom(hbox24);

			root24.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene25 = new Scene(root24, 1800, 850);

			BorderPane root25 = new BorderPane();// Add borderPane.

			HBox hbox25 = new HBox();// Add horizontal box.

			TextArea txtta11 = new TextArea();
			txtta11.setFont(Font.font(25));
			txtta11.setMinHeight(200);
			txtta11.setMinWidth(70);

			// Add images and buttons next to each other.
			ImageView image24 = new ImageView(
					"https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			image24.setFitHeight(50);
			image24.setFitWidth(50);
			Button find11 = new Button("Find", image24);

			ImageView image25 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image25.setFitHeight(50);
			image25.setFitWidth(50);
			Button back21 = new Button("Back", image25);

			back21.setContentDisplay(ContentDisplay.RIGHT);
			find11.setContentDisplay(ContentDisplay.RIGHT);

			// Increase font.
			find11.setFont(Font.font(35));
			back21.setFont(Font.font(35));

			hbox25.getChildren().addAll(find11, back21);// Add buttons to horizontal box.
			hbox25.setSpacing(200);
			hbox25.setPadding(new Insets(30, 100, 70, 70));
			hbox25.setAlignment(Pos.BOTTOM_CENTER);

			Label lb71 = new Label("Customer Id:");// Add labels and TextField.
			lb71.setFont(Font.font(30));// Increasing font.

			TextField txtf71 = new TextField();
			txtf71.setFont(Font.font(30));

			find11.setOnAction(e -> {

				int i = mediar.customerExist(txtf71.getText());
				if (i > -1)
					txtta11.setText(mediar.getCustomer().get(i).getRented().toString());

				else
					txtta11.setText("Customer Not Found");

			});
			GridPane gp21 = new GridPane();// Add gridPane.
			gp21.add(lb71, 0, 0);
			gp21.add(txtf71, 1, 0);
			gp21.add(txtta11, 1, 1);

			gp21.setHgap(30);// Spacings.
			gp21.setVgap(30);
			gp21.setPadding(new Insets(50, 100, 50, 100));
			gp21.setAlignment(Pos.CENTER_LEFT);
			root25.setLeft(gp21);
			root25.setBottom(hbox25);

			root25.setStyle("-fx-background-color:ghostwhite");// Color of screen.
			Scene scene26 = new Scene(root25, 1800, 850);
			scene26.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			BorderPane root26 = new BorderPane();// Add BorderPane.

			HBox hbox26 = new HBox();// Add horizontal box.

			TextArea txtta12 = new TextArea();// Add 2 TextArea.
			TextArea txtta13 = new TextArea();

			txtta12.setFont(Font.font(20));// Increasing font.
			txtta13.setFont(Font.font(20));

			Label lb72 = new Label("Customer ID:");// Add labels and TextField.
			lb72.setFont(Font.font(20));

			TextField txtf72 = new TextField();
			txtf72.setFont(Font.font(20));

			Label lb73 = new Label("Media Code:");
			lb73.setFont(Font.font(20));

			TextField txtf73 = new TextField();
			txtf73.setFont(Font.font(20));

			GridPane gp22 = new GridPane();// Add gridPane.
			gp22.add(lb72, 0, 0);// Add labels and TextField to the gridPane.
			gp22.add(txtf72, 1, 0);
			gp22.add(txtta12, 1, 1);
			gp22.add(lb73, 0, 2);
			gp22.add(txtf73, 1, 2);
			gp22.add(txtta13, 1, 3);

			gp22.setHgap(20);
			gp22.setVgap(20);
			gp22.setPadding(new Insets(50, 50, 50, 300));
			gp22.setAlignment(Pos.CENTER_LEFT);
			root26.setLeft(gp22);

			ImageView image26 = new ImageView(
					"https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			image26.setFitHeight(50);
			image26.setFitWidth(50);
			Button back22 = new Button("Back", image26);

			ImageView image27 = new ImageView("https://img.icons8.com/plasticine/452/return-purchase.png");
			image27.setFitHeight(50);
			image27.setFitWidth(50);
			Button rm = new Button("Return Media", image27);

			back22.setContentDisplay(ContentDisplay.RIGHT);
			rm.setContentDisplay(ContentDisplay.RIGHT);

			rm.setFont(Font.font(30));
			back22.setFont(Font.font(30));

			rm.setOnAction(e -> {
				mediar.returnMedia(txtf72.getText(), txtf73.getText());
			});

			txtf72.setOnKeyReleased(e -> {

				int i = mediar.customerExist(txtf72.getText());
				if (i > -1)
					txtta12.setText(mediar.getCustomer().get(i).toString());

				else
					txtta12.setText("Customer Not Found");

			});

			txtf73.setOnKeyReleased(e -> {

				int i = mediar.mediaExist(txtf73.getText());

				if (i > -1) {
					txtta13.setText(mediar.getMed().get(i).toString());
				} else
					txtta13.setText("Media Not Found");

			});

			hbox26.getChildren().addAll(rm, back22);// Add buttons to the horizontal box.
			hbox26.setSpacing(400);// Spacing between button.
			hbox26.setPadding(new Insets(60, 60, 60, 400));// from edges.
			hbox26.setAlignment(Pos.BOTTOM_LEFT);
			root26.setBottom(hbox26);

			root26.setStyle("-fx-background-color:pink");

			Scene scene27 = new Scene(root26, 1800, 850);

			// Set on actions for all buttons.
			bt1.setOnAction(e -> {
				primaryStage.setScene(scene2);
			});

			b1.setOnAction(e -> {
				primaryStage.setScene(scene3);
			});

			back.setOnAction(e -> {

				txtf1.clear();// Clear all the textField and radioButtons.
				txtf2.clear();
				txtf3.clear();
				txtf4.clear();
				rl.setSelected(false);
				ru.setSelected(false);
				primaryStage.setScene(scene2);
			});

			b2.setOnAction(e -> {
				primaryStage.setScene(scene4);
			});

			back2.setOnAction(e -> {
				txtf6.clear();
				txtf7.clear();
				txtf8.clear();
				txtf9.clear();
				t1.clear();
				rl2.setSelected(false);
				ru2.setSelected(false);
				primaryStage.setScene(scene2);
			});
			b3.setOnAction(e -> {
				primaryStage.setScene(scene5);
			});
			back3.setOnAction(e -> {
				txtf11.clear();
				txtf12.clear();
				txtf13.clear();
				txtf14.clear();
				t2.clear();
				rl3.setSelected(false);
				ru3.setSelected(false);
				primaryStage.setScene(scene2);
			});
			b4.setOnAction(e -> {
				primaryStage.setScene(scene6);
			});
			back4.setOnAction(e -> {
				txtf16.clear();
				txtta1.clear();
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
// If Game was chosen.
				if (cb.getSelectionModel().isSelected(0)) {
					primaryStage.setScene(scene9);

				}

				// If Movie was chosen.
				else if (cb.getSelectionModel().isSelected(1)) {
					primaryStage.setScene(scene10);

					// If an Album was chosen.
				} else if (cb.getSelectionModel().isSelected(2)) {
					primaryStage.setScene(scene11);

				}

			});

			back5.setOnAction(e -> {

				primaryStage.setScene(scene8);
				txtf21.clear();
				txtf22.clear();
				txtf23.clear();
				txtf24.clear();
				z1.clear();
			});

			back6.setOnAction(e -> {

				primaryStage.setScene(scene8);
				txtf25.clear();
				txtf26.clear();
				txtf28.clear();
				rm1.setSelected(false);
				rm2.setSelected(false);
				rm3.setSelected(false);
				f4.clear();

			});

			back7.setOnAction(e -> {
				primaryStage.setScene(scene8);
				txtf29.clear();
				txtf30.clear();
				txtf31.clear();
				txtf32.clear();
				txtf33.clear();
				z3.clear();
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
				txtf34.clear();
				txtf35.clear();
				txtf36.clear();
				txtf37.clear();
				z4.clear();

			});

			back9.setOnAction(e -> {

				primaryStage.setScene(scene12);
				txtf38.clear();
				txtf39.clear();
				txtf41.clear();
				f5.clear();
				rm4.setSelected(false);
				rm5.setSelected(false);
				rm6.setSelected(false);

			});

			back10.setOnAction(e -> {

				primaryStage.setScene(scene12);
				txtf42.clear();
				txtf43.clear();
				txtf44.clear();
				txtf45.clear();
				txtf46.clear();
				z6.clear();

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
				txtf47.clear();
				txtf48.clear();
				txtf49.clear();
				txtf50.clear();
				z7.clear();

			});

			back12.setOnAction(e -> {

				primaryStage.setScene(scene16);
				txtf51.clear();
				txtf52.clear();
				txtf54.clear();
				f6.clear();
				rm7.setSelected(false);
				rm8.setSelected(false);
				rm9.setSelected(false);
			});

			back13.setOnAction(e -> {

				primaryStage.setScene(scene16);
				txtf56.clear();
				txtf57.clear();
				txtf58.clear();
				txtf59.clear();
				z9.clear();

			});

			b10.setOnAction(e -> {

				primaryStage.setScene(scene20);
			});

			back14.setOnAction(e -> {

				primaryStage.setScene(scene7);
				txtta4.clear();
				txtf60.clear();
			});

			b11.setOnAction(e -> {

				primaryStage.setScene(scene21);

			});
			back15.setOnAction(e -> {

				primaryStage.setScene(scene7);
				txta2.clear();
			});
			b12.setOnAction(e -> {

				primaryStage.setScene(scene1);
			});

			bt3.setOnAction(e -> {
				primaryStage.setScene(scene24);
			});

			buttonr1.setOnAction(e -> {
				primaryStage.setScene(scene22);
			});

			txtf61.setOnKeyReleased(e -> {

				int i = mediar.customerExist(txtf61.getText());
				if (i > -1)
					txta5.setText(mediar.getCustomer().get(i).toString());

				else
					txta5.setText("Customer Not Found");

			});

			txtf62.setOnKeyReleased(e -> {
				int i = mediar.mediaExist(txtf62.getText());
				if (i > -1) {
					txta6.setText(mediar.getMed().get(i).toString());
				} else
					txta6.setText("Media Not Found");

			});

			back16.setOnAction(e -> {
				primaryStage.setScene(scene24);
				txta5.clear();
				txta6.clear();
				txtf61.clear();
				txtf62.clear();
				txtf63.clear();

			});

			btn2.setOnAction(e -> {
				primaryStage.setScene(scene23);
			});

			back17.setOnAction(e -> {
				primaryStage.setScene(scene22);
				txta3.clear();
			});

			buttonr2.setOnAction(e -> {
				primaryStage.setScene(scene25);
			});

			back20.setOnAction(e -> {
				primaryStage.setScene(scene24);
				txtf70.clear();
				txtta10.clear();

			});

			buttonr3.setOnAction(e -> {
				primaryStage.setScene(scene26);

			});

			back21.setOnAction(e -> {
				primaryStage.setScene(scene24);
				txtf71.clear();
				txtta11.clear();

			});

			buttonr4.setOnAction(e -> {
				primaryStage.setScene(scene27);
			});

			back22.setOnAction(e -> {
				primaryStage.setScene(scene24);
				txtf72.clear();
				txtf73.clear();

				txtta12.clear();
				txtta13.clear();

			});

			buttonr5.setOnAction(e -> {
				primaryStage.setScene(scene1);
			});

			add.setOnAction(e -> {// When pressed add in add new customer window, then it add a customer.

				String x = "";// Choosing the radio button.
				if (rl.isSelected()) {

					x = rl.getText();

				} else if (ru.isSelected()) {

					x = ru.getText();

				}

				mediar.addCustomer(txtf2.getText(), txtf3.getText(), x, txtf1.getText(), txtf4.getText());

			});

			print1.setOnAction(e -> {// Print all media information when pressed print.

				txta2.setText(mediar.getAllMediaInfo());
			});

			add4.setOnAction(e -> {// Add in game.

				try {
					mediar.addGame(txtf21.getText(), Integer.parseInt(txtf22.getText()),
							Double.parseDouble(txtf23.getText()), txtf24.getText());
				} catch (NumberFormatException exception2) {
					z1.setText("Number foramt excepion");

				}

			});

			add5.setOnAction(e -> {// Add in movie

				String y = "";

				if (rm1.isSelected()) {
					y = rm1.getText();

				} else if (rm2.isSelected()) {
					y = rm2.getText();

				} else if (rm3.isSelected()) {
					y = rm3.getText();

				}

				try {
					mediar.addMovie(txtf25.getText(), Integer.parseInt(txtf26.getText()), y, txtf28.getText());
				} catch (NumberFormatException exception2) {
					f4.setText("Number foramt excepion");

				}

			});

			add6.setOnAction(e -> {// Add in album.

				try {
					mediar.addAlbum(txtf29.getText(), Integer.parseInt(txtf30.getText()), (txtf31.getText()),
							txtf32.getText(), txtf33.getText());
				} catch (NumberFormatException exception4) {
					z3.setText("Number foramt excepion");
				}

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
			scene23.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene24.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene25.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene26.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene27.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setMaximized(true);// Make the screen max.
			primaryStage.setScene(scene1);
			primaryStage.setTitle("FX project");// The name of screen.
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
