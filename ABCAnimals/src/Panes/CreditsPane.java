package Panes;

import Main.MainApp;
import Scenes.IntroScene;
import javafx.animation.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class CreditsPane extends StackPane {

    /**
     * @author Omar Yousef
     * 1. A title (ABC animals)
     * 2. Right side images
     * 3. Image sources
     * 4. Audio sources
     * 5. Group members names
     */

    public CreditsPane(){

        /*
        * The title text:
         */
        Text title = new Text("ABC Animals Credits");
        title.setFill(Color.RED);
        title.setStroke(Color.BLACK);
        title.setStrokeWidth(2);
        title.setFont(Font.font("Impact", 70));

        HBox titleBox = new HBox();
        titleBox.setAlignment(Pos.TOP_CENTER);
        titleBox.setSpacing(10);
        titleBox.getChildren().add(title);
        titleBox.setPadding(new Insets(25, 10, 10, 100));


        /*
         * First: Team members Credits
         */
        Text namesTitle = new Text("Group Members");
        namesTitle.setFont(Font.font("Impact", 40));

        Text firstName = new Text("Omar Yousef");
        firstName.setFill(Color.BLACK);
        firstName.setFont(Font.font("Comic Sans MS", 30));

        Text secondName = new Text("Yousif Fadi");
        secondName.setFill(Color.BLACK);
        secondName.setFont(Font.font("Comic Sans MS", 30));

        Text thirdName = new Text("Farzana Moury");
        thirdName.setFill(Color.BLACK);
        thirdName.setFont(Font.font("Comic Sans MS", 30));

        VBox membersBox = new VBox();
        membersBox.setSpacing(10);
        membersBox.setAlignment(Pos.CENTER);
        membersBox.setPadding(new Insets(10,10,10,10));
        membersBox.getChildren().addAll(namesTitle, firstName, secondName, thirdName);



        /*
         * The images credits:
         */
        Text imagesTitle = new Text("Image Sources");
        imagesTitle.setFill(Color.DARKGREEN);
        imagesTitle.setStroke(Color.BLACK);
        imagesTitle.setStrokeWidth(2);
        imagesTitle.setFont(Font.font("Impact", 50));

        /*
         * Vecteezy sources
         */
        Text vecteezy = new Text("Vecteezy");
        vecteezy.setFill(Color.DARKGREEN);
        vecteezy.setFont(Font.font("Impact", 40));


        Text vecteezyfirstSource = new Text("Goff.brian");
        vecteezyfirstSource.setFill(Color.BLACK);
        vecteezyfirstSource.setFont(Font.font("Comic Sans MS", 20));


        Text vecteezysecondSource = new Text("GraphicsRF");
        vecteezysecondSource.setFill(Color.BLACK);
        vecteezysecondSource.setFont(Font.font("Comic Sans MS", 20));

        Text vecteezyThirdSource = new Text("vihaanlight");
        vecteezyThirdSource.setFill(Color.BLACK);
        vecteezyThirdSource.setFont(Font.font("Comic Sans MS", 20));

        Text vecteezyFourthSource = new Text("misfitblue");
        vecteezyFourthSource.setFill(Color.BLACK);
        vecteezyFourthSource.setFont(Font.font("Comic Sans MS", 20));


        Text vecteezyFifthSource = new Text("xiayamoon");
        vecteezyFifthSource.setFill(Color.BLACK);
        vecteezyFifthSource.setFont(Font.font("Comic Sans MS", 20));

        VBox vecteezyBox = new VBox();
        vecteezyBox.setAlignment(Pos.CENTER);
        vecteezyBox.setPadding(new Insets(10,10,10,10));
        vecteezyBox.getChildren().addAll(vecteezy, vecteezyfirstSource, vecteezysecondSource, vecteezyThirdSource, vecteezyFourthSource, vecteezyFifthSource);


        /*
         * Second: Pixabay sources
         */
        Text pixabay = new Text("Pixabay");
        pixabay.setFill(Color.DARKGREEN);
        pixabay.setFont(Font.font("Impact", 40));


        Text pixabayFirstSource = new Text("Clker-Free-Vector-Images");
        pixabayFirstSource.setFill(Color.BLACK);
        pixabayFirstSource.setFont(Font.font("Comic Sans MS", 20));



        Text pixabaySecondSource = new Text("b0red");
        pixabaySecondSource.setFill(Color.BLACK);
        pixabaySecondSource.setFont(Font.font("Comic Sans MS", 20));


        Text pixabayThirdSource = new Text("OpenClipart-Vectors");
        pixabayThirdSource.setFill(Color.BLACK);
        pixabayThirdSource.setFont(Font.font("Comic Sans MS", 20));


        VBox pixabayBox = new VBox();
        pixabayBox.setSpacing(10);
        pixabayBox.setAlignment(Pos.CENTER);
        pixabayBox.setPadding(new Insets(10,10,10,10));
        pixabayBox.getChildren().addAll(pixabay, pixabayFirstSource, pixabaySecondSource, pixabayThirdSource);



        /*
         * Other sources:
         */
        Text otherTitle = new Text("Other");
        otherTitle.setFill(Color.DARKGREEN);
        otherTitle.setFont(Font.font("Impact", 40));

        Text otherFirstSource = new Text("Sketchify from Canva");
        otherFirstSource.setFill(Color.BLACK);
        otherFirstSource.setFont(Font.font("Comic Sans MS", 20));

        Text otherSecondSource = new Text("Farzana Moury");
        otherSecondSource.setFill(Color.BLACK);
        otherSecondSource.setFont(Font.font("Comic Sans MS", 20));

        VBox otherBox = new VBox();
        otherBox.setSpacing(10);
        otherBox.setAlignment(Pos.CENTER);
        otherBox.setPadding(new Insets(10,10,10,10));
        otherBox.getChildren().addAll(otherTitle, otherFirstSource, otherSecondSource);


        /*
         * Audio source:
         */

        Text audioTitle = new Text("Audios");
        audioTitle.setFill(Color.DARKGREEN);
        audioTitle.setFont(Font.font("Impact", 40));

        Text audioFirstSource = new Text("Sound effects obtained from https://www.zapsplat.com");
        audioFirstSource.setFill(Color.BLACK);
        audioFirstSource.setFont(Font.font("Comic Sans MS", 20));

        Text audioSecondSource = new Text("Elephant sounds from soundbible");
        audioSecondSource.setFill(Color.BLACK);
        audioSecondSource.setFont(Font.font("Comic Sans MS", 20));

        VBox audioBox = new VBox();
        audioBox.setSpacing(10);
        audioBox.setAlignment(Pos.CENTER);
        audioBox.setPadding(new Insets(10,10,10,10));
        audioBox.getChildren().addAll(audioTitle, audioFirstSource, audioSecondSource);


        /*
         * The right images:
         */
        ImageView firstImage = new ImageView("Pictures/bird.png");
        firstImage.setFitWidth(100);
        firstImage.setFitHeight(100);

        ImageView secondImage = new ImageView("Pictures/dog.png");
        secondImage.setFitWidth(100);
        secondImage.setFitHeight(100);

        ImageView thirdImage = new ImageView("Pictures/elephant.png");
        thirdImage.setFitWidth(100);
        thirdImage.setFitHeight(100);

        ImageView fourthImage = new ImageView("Pictures/kangaroo.png");
        fourthImage.setFitWidth(100);
        fourthImage.setFitHeight(100);

        ImageView fifthImage = new ImageView("Pictures/giraffe.png");
        fifthImage.setFitWidth(100);
        fifthImage.setFitHeight(100);

        ImageView sixthImage = new ImageView("Pictures/horse.png");
        sixthImage.setFitWidth(100);
        sixthImage.setFitHeight(100);

        ImageView seventhImage = new ImageView("Pictures/jaguar.png");
        seventhImage.setFitWidth(100);
        seventhImage.setFitHeight(100);

        VBox rightImages = new VBox();
        rightImages.setAlignment(Pos.TOP_RIGHT);
        rightImages.setPadding(new Insets(10,10,10,10));
        rightImages.setSpacing(5);
        rightImages.getChildren().addAll(firstImage, secondImage, thirdImage, fourthImage, fifthImage, sixthImage, seventhImage);


        /*
         * The  background image
         */
        ImageView background = new ImageView("Backgrounds/page.png");
        this.getChildren().add(background);
        this.setAlignment(background, Pos.CENTER);


        /*
         * title Animations --> Translation & Fill (Come from top)
         * members names --> Translation (Come from the bottom)
         * Image sources & Audio sources --> Fade Transition(Show & disappear)
         * side images --> Translation(Come from the right)
         */

        /*
         * Title animations:
         */
        FillTransition fillTransition = new FillTransition(Duration.millis(2000), title);
        fillTransition.setFromValue(Color.RED);
        fillTransition.setToValue(Color.BLUE);
        fillTransition.setCycleCount(Timeline.INDEFINITE);
        fillTransition.setAutoReverse(true);
        fillTransition.play();

        TranslateTransition titleTranslation = new TranslateTransition(Duration.millis(3000), title);
        titleTranslation.setFromX(0);
        titleTranslation.setFromY(-1000);
        titleTranslation.setToX(0);
        titleTranslation.setToY(0);



        /*
         * Right images animations:
         */
        TranslateTransition rightImagesTranslation = new TranslateTransition(Duration.millis(2000), rightImages);
        rightImagesTranslation.setFromX(1100);
        rightImagesTranslation.setFromY(0);
        rightImagesTranslation.setToX(0);
        rightImagesTranslation.setToY(0);
        rightImagesTranslation.play();


        /*
         * Members animations:
         */
        TranslateTransition membersTranslation = new TranslateTransition(Duration.millis(4000), membersBox);
        membersTranslation.setFromX(0);
        membersTranslation.setFromY(1000);
        membersTranslation.setToX(0);
        membersTranslation.setToY(0);



        /*
         * Image sources title animations:
         */
        FadeTransition imgTitleSourcesFade = new FadeTransition(Duration.millis(3000), imagesTitle);
        imgTitleSourcesFade.setFromValue(0);
        imgTitleSourcesFade.setToValue(100);
        imgTitleSourcesFade.setCycleCount(2);
        imgTitleSourcesFade.setAutoReverse(true);

        FadeTransition vecteezySourcesFade = new FadeTransition(Duration.millis(3000), vecteezyBox);
        vecteezySourcesFade.setFromValue(0);
        vecteezySourcesFade.setToValue(100);
        vecteezySourcesFade.setCycleCount(2);
        vecteezySourcesFade.setAutoReverse(true);

        FadeTransition pixabaySourcesFade = new FadeTransition(Duration.millis(3000), pixabayBox);
        pixabaySourcesFade.setFromValue(0);
        pixabaySourcesFade.setToValue(100);
        pixabaySourcesFade.setCycleCount(2);
        pixabaySourcesFade.setAutoReverse(true);

        FadeTransition otherSourcesFade = new FadeTransition(Duration.millis(3000), otherBox);
        otherSourcesFade.setFromValue(0);
        otherSourcesFade.setToValue(100);
        otherSourcesFade.setCycleCount(2);
        otherSourcesFade.setAutoReverse(true);

        /*
         * Audio sources title animations:
         */
        FadeTransition audioSourcesTransition = new FadeTransition(Duration.millis(3000), audioBox);
        audioSourcesTransition.setFromValue(0);
        audioSourcesTransition.setToValue(100);
        audioSourcesTransition.setCycleCount(2);
        audioSourcesTransition.setAutoReverse(true);


        SequentialTransition sequentialTransition =
                new SequentialTransition();
        sequentialTransition.getChildren().addAll(titleTranslation,imgTitleSourcesFade, vecteezySourcesFade, pixabaySourcesFade,otherSourcesFade,audioSourcesTransition, membersTranslation);
        sequentialTransition.setCycleCount(1);
        sequentialTransition.play();

        FillTransition membersFill = new FillTransition(Duration.millis(2000), namesTitle);
        membersFill.setFromValue(Color.DARKGREEN);
        membersFill.setToValue(Color.LIGHTGREEN);
        membersFill.setCycleCount(Timeline.INDEFINITE);
        membersFill.setAutoReverse(true);
        membersFill.play();



        /*
         * Home ImageView Button that takes you to Intro the screen
         */
        ImageView homeButton = new ImageView("ButtonImages/homebut.png");
        setAlignment(homeButton, Pos.BOTTOM_LEFT);
        HBox hBox1 = new HBox();
        hBox1.getChildren().addAll(homeButton);
        hBox1.setPadding(new Insets(12, 0, 0, 100));
        homeButton.setFitHeight(100);
        homeButton.setFitWidth(100);
        homeButton.setOnMouseClicked(e->{
            MainApp.mainStage.setScene(new IntroScene());
        });


        this.getChildren().addAll(titleBox, membersBox,imagesTitle, vecteezyBox, pixabayBox,otherBox,audioBox, rightImages,hBox1);
    }
}
