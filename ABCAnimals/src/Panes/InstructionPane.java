package Panes;

import Main.MainApp;
import Scenes.IntroScene;
import javafx.animation.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class InstructionPane extends StackPane {
    /**
     * @author Yousif Fadi
     */

    public InstructionPane(){

        /*
        * TITLE TEXT
        */
        Text title = new Text("Instructions");
        title.setFill(Color.RED);
        title.setStroke(Color.BLACK);
        title.setStrokeWidth(2);
        title.setFont(Font.font("Impact", 70));

        HBox titleBox = new HBox();
        titleBox.setAlignment(Pos.TOP_CENTER);
        titleBox.setSpacing(10);
        titleBox.getChildren().add(title);
        titleBox.setPadding(new Insets(25, 10, 10, 85));


        /*
        * INSTRUCTION - STEP 1
        */
        Text step1 = new Text("Step 1");
        step1.setFont(Font.font("Impact", 40));

        Text step1Info1 = new Text("If you click the Credits Button in the Main Scene,");
        step1Info1.setFill(Color.BLACK);
        step1Info1.setFont(Font.font("Comic Sans MS", 20));

        Text step1Info2 = new Text("It will show names of people that were a part of the ABC Group Project.");
        step1Info2.setFill(Color.BLACK);
        step1Info2.setFont(Font.font("Comic Sans MS", 20));

        Text step1Info3 = new Text("Such as the pictures for the animals, and audios.");
        step1Info3.setFill(Color.BLACK);
        step1Info3.setFont(Font.font("Comic Sans MS", 20));

        Text step1Info4 = new Text("At the top left there is a home button that you click to bring you back to the Main Scene.");
        step1Info4.setFill(Color.BLACK);
        step1Info4.setFont(Font.font("Comic Sans MS", 20));

        ImageView image1 = new ImageView("ButtonImages/homebut.png");
        image1.setFitWidth(100);
        image1.setFitHeight(100);

        HBox bottomImages1 = new HBox();
        bottomImages1.setAlignment(Pos.BOTTOM_CENTER);
        bottomImages1.setPadding(new Insets(10,10,10,10));
        bottomImages1.setSpacing(5);
        bottomImages1.getChildren().add(image1);

        VBox step1Box = new VBox();
        step1Box.setSpacing(10);
        step1Box.setAlignment(Pos.CENTER);
        step1Box.setPadding(new Insets(10,10,10,85));
        step1Box.getChildren().addAll(step1, step1Info1, step1Info2, step1Info3, step1Info4, bottomImages1);

        /*
         * INSTRUCTION - STEP 2
         */
        Text step2 = new Text("Step 2");
        step2.setFont(Font.font("Impact", 40));

        Text step2Info1 = new Text("If you click the Play Button in the Main Scene,");
        step2Info1.setFill(Color.BLACK);
        step2Info1.setFont(Font.font("Comic Sans MS", 20));

        Text step2Info2 = new Text("It will show the first letter of the animal, a picture, name.");
        step2Info2.setFill(Color.BLACK);
        step2Info2.setFont(Font.font("Comic Sans MS", 20));

        Text step2Info3 = new Text("In the bottom it will show buttons that will have sounds and when you click them you will hear:");
        step2Info3.setFill(Color.BLACK);
        step2Info3.setFont(Font.font("Comic Sans MS", 20));

        Text step2Info4 = new Text("The first letter of the animal, the sound of the animal, and the word of the animal.");
        step2Info4.setFill(Color.BLACK);
        step2Info4.setFont(Font.font("Comic Sans MS", 20));

        Text step2Info5 = new Text("At the top left there is a home button that you click to bring you back to the Main Scene.");
        step2Info5.setFill(Color.BLACK);
        step2Info5.setFont(Font.font("Comic Sans MS", 20));

        ImageView image2 = new ImageView("ButtonImages/letterbut.png");
        image2.setFitWidth(100);
        image2.setFitHeight(100);

        ImageView image3 = new ImageView("ButtonImages/soundbut.png");
        image3.setFitWidth(100);
        image3.setFitHeight(100);

        ImageView image4 = new ImageView("ButtonImages/wordbut.png");
        image4.setFitWidth(100);
        image4.setFitHeight(100);

        HBox bottomImages2 = new HBox();
        bottomImages2.setAlignment(Pos.BOTTOM_CENTER);
        bottomImages2.setPadding(new Insets(10,10,10,10));
        bottomImages2.setSpacing(5);
        bottomImages2.getChildren().addAll(image2, image3, image4);

        VBox step2Box = new VBox();
        step2Box.setSpacing(10);
        step2Box.setAlignment(Pos.CENTER);
        step2Box.setPadding(new Insets(10,10,10,90));
        step2Box.getChildren().addAll(step2, step2Info1, step2Info2, step2Info3, step2Info4, step2Info5, bottomImages2);

        /**
         * Home ImageView Button that takes you to Intro the screen
         * @author Omar Yousef
         */
        ImageView homeButton = new ImageView("ButtonImages/homebut.png");
        setAlignment(homeButton, Pos.TOP_LEFT);
        HBox hBox1 = new HBox();
        hBox1.getChildren().add(homeButton);
        hBox1.setAlignment(Pos.TOP_LEFT);
        hBox1.setPadding(new Insets(10, 10, 10, 100));
        homeButton.setFitHeight(100);
        homeButton.setFitWidth(100);
        homeButton.setOnMouseClicked(e->{
            MainApp.mainStage.setScene(new IntroScene());
        });


        /*
         * BACKGROUND IMAGE
         */
        ImageView background = new ImageView("Backgrounds/page.png");
        setAlignment(background, Pos.CENTER);
        this.getChildren().addAll(background, titleBox, step1Box, step2Box, hBox1);


        /*
         * TITLE TRANSITIONS
         */
        FillTransition titleFill = new FillTransition(Duration.millis(2000), title);
        titleFill.setFromValue(Color.BLUE);
        titleFill.setToValue(Color.RED);
        titleFill.setCycleCount(Timeline.INDEFINITE);
        titleFill.setAutoReverse(true);
        titleFill.play();

        TranslateTransition titleTranslation = new TranslateTransition(Duration.millis(3000), title);
        titleTranslation.setFromX(0);
        titleTranslation.setFromY(-1000);
        titleTranslation.setToX(0);
        titleTranslation.setToY(0);


        /*
         * STEP 1 BOX TRANSITIONS
         */
        TranslateTransition step1Translate = new TranslateTransition(Duration.millis(4000), step1Box);
        step1Translate.setFromX(0);
        step1Translate.setFromY(1000);
        step1Translate.setToX(0);
        step1Translate.setToY(0);

        FadeTransition step1Fade = new FadeTransition(Duration.millis(7000), step1Box);
        step1Fade.setFromValue(0);
        step1Fade.setToValue(100);
        step1Fade.setCycleCount(2);
        step1Fade.setAutoReverse(true);

        FillTransition step1Fill = new FillTransition(Duration.millis(2000), step1);
        step1Fill.setFromValue(Color.BLUE);
        step1Fill.setToValue(Color.RED);
        step1Fill.setCycleCount(Timeline.INDEFINITE);
        step1Fill.setAutoReverse(true);
        step1Fill.play();


        /*
         * STEP 2 BOX TRANSITIONS
         */
        TranslateTransition step2Translate = new TranslateTransition(Duration.millis(4000), step2Box);
        step2Translate.setFromX(0);
        step2Translate.setFromY(1000);
        step2Translate.setToX(0);
        step2Translate.setToY(0);

        FadeTransition step2Fade = new FadeTransition(Duration.millis(3000), step2Box);
        step2Fade.setFromValue(0);
        step2Fade.setToValue(100);
        step2Fade.setCycleCount(1);
        step2Fade.setAutoReverse(true);

        FillTransition step2Fill = new FillTransition(Duration.millis(2000), step2);
        step2Fill.setFromValue(Color.BLUE);
        step2Fill.setToValue(Color.RED);
        step2Fill.setCycleCount(Timeline.INDEFINITE);
        step2Fill.setAutoReverse(true);
        step2Fill.play();

        SequentialTransition step2Sequential = new SequentialTransition();
        step2Sequential.getChildren().addAll(titleTranslation, step1Fade, step2Fade);
        step2Sequential.setCycleCount(1);
        step2Sequential.play();


        TranslateTransition bottomImagesTranslate = new TranslateTransition(Duration.millis(4000), bottomImages1);
        bottomImagesTranslate.setFromX(1100);
        bottomImagesTranslate.setFromY(0);
        bottomImagesTranslate.setToX(0);
        bottomImagesTranslate.setToY(0);
        bottomImagesTranslate.play();


    }
}
