package Panes;

import Main.MainApp;
import Scenes.CreditsScene;
import Scenes.InstructionScene;
import Scenes.MainScene;
import javafx.animation.ScaleTransition;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.util.Duration;

//intro screen that uses a stackpane to layout elements
//this contains the menu buttons - for the help screen, main screen and credits screen

public class IntroPane extends StackPane {
    /**
     * @author Farzana Moury
     */
    public IntroPane() {
        //main image that resembles a book
        ImageView image = new ImageView(new Image("Backgrounds/intro.png"));
        this.getChildren().add(image);

        //hbox container - lays out the menu buttons horizontally
        HBox buttonBox = new HBox();

        //help button
        ImageView helpButton = new ImageView(new Image("ButtonImages/introbut1.png"));
        helpButton.setFitWidth(100);
        helpButton.setFitHeight(100);
        //when you click on the button, it enlarges and shrinks so it has a "pressed" effect
        helpButton.setOnMouseClicked(e->{
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(500),helpButton);
            scaleTransition.setByX(.15);
            scaleTransition.setByY(.15);
            scaleTransition.setAutoReverse(true);
            scaleTransition.setCycleCount(2);
            scaleTransition.play();

            MainApp.mainStage.setScene(new InstructionScene());
        });

        //play button
        ImageView playButton = new ImageView(new Image("ButtonImages/introbut2.png"));
        playButton.setFitWidth(100);
        playButton.setFitHeight(100);
        //button press animation
        playButton.setOnMouseClicked(e->{
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(500),playButton);
            scaleTransition.setByX(.15);
            scaleTransition.setByY(.15);
            scaleTransition.setAutoReverse(true);
            scaleTransition.setCycleCount(2);
            scaleTransition.play();

            MainApp.mainStage.setScene(new MainScene());
        });

        //credits button
        ImageView credsButton = new ImageView(new Image("ButtonImages/introbut3.png"));
        credsButton.setFitWidth(100);
        credsButton.setFitHeight(100);
        //button press animation
        credsButton.setOnMouseClicked(e->{
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(500),credsButton);
            scaleTransition.setByX(.15);
            scaleTransition.setByY(.15);
            scaleTransition.setAutoReverse(true);
            scaleTransition.setCycleCount(2);
            scaleTransition.play();

            MainApp.mainStage.setScene(new CreditsScene());
        });

        //adding the buttons to the button holder and setting the layout
        buttonBox.getChildren().addAll(helpButton, playButton, credsButton);
        buttonBox.setSpacing(200);
        buttonBox.setAlignment(Pos.BOTTOM_CENTER);

        //text displayed for respective buttons
        Text help = new Text("  Help");
        help.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 50));
        help.setTextAlignment(TextAlignment.CENTER);

        Text play = new Text("  Play");
        play.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 50));

        Text creds = new Text("Credits");
        creds.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 50));

        //container that will hold the buttons in a horizontal layout
        HBox textBox = new HBox();
        textBox.getChildren().addAll(help, play, creds);
        textBox.setSpacing(165);
        textBox.setAlignment(Pos.BOTTOM_CENTER);

        //laying out the buttons and text vertically (so text appears ahove the buttons)
        VBox buttonsText = new VBox();
        buttonsText.getChildren().addAll(textBox, buttonBox);
        //borderpane that will display the buttons and text at the bottom of the stackpane
        BorderPane menu = new BorderPane();
        menu.setBottom(buttonsText);
        this.getChildren().add(menu);
    }
}
