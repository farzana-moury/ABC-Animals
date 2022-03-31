package Panes;

import Classes.Animal;
import Main.MainApp;
import Scenes.IntroScene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/** MainPane that represents the inside of the ABC Animals book
 * @author Omar Yousef, Farzana Moury
 */
public class MainPane extends StackPane {
    /**
     * Make variables that store the values of each element
     * buttons to store sounds
     * navigation buttons
     * files to store music files
     * MediaPlayer/Media duo to play music
     * Animal ArrayList that will store all 26 instances of the Animal Class
     */
    ImageView leftButton, rightButton, animalImage, letterButton, wordButton, soundButton;

    File letterSound, animalSound, wordSound;

    MediaPlayer player = null;
    Media media = null;
    ArrayList<Animal> animalArrayList = new ArrayList<>();

    /*
     * Make a count variable to change the animalImage depending on which button did the user click (left or right):
     */
    int count = 0;

    public MainPane() {

        BorderPane root = new BorderPane();

        /*
         * Background ImageView:
         */
        ImageView background = new ImageView("Backgrounds/page.png");
        setAlignment(background, Pos.CENTER);
        this.getChildren().add(background);



        /*
        Will loop through every word stored in the animals.txt file.. and
        store them in a string that will be used in the instantiation as a constant representing each
        individual animal name taken from the file
         */
        try {
            // Scanner to store the animals in the arrayList
            Scanner scanner = new Scanner(new File("animals/animals.txt"));
            while (scanner.hasNext()){
                String animalName = scanner.next();
                animalArrayList.add(new Animal(new Image("Images/" + animalName + ".png"),
                        new File("letterSounds/" + animalName + ".m4a"),
                        new File("animalSounds/" + animalName + ".mp3"),
                        new File("wordSounds/" + animalName + ".m4a")));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        /*
         * Make the sounds
         */
        letterSound = animalArrayList.get(count).getLetterSound();
        wordSound = animalArrayList.get(count).getWordSound();
        animalSound = animalArrayList.get(count).getAnimalSound();


        /*
         * Fix the sizes of the nodes
         */
        animalImage = new ImageView(animalArrayList.get(count).getAnimalImage());
        animalImage.setFitWidth(370);
        animalImage.setFitHeight(530);

        letterButton = new ImageView(new Image("ButtonImages/letterbut.png"));
        letterButton.setFitWidth(100);
        letterButton.setFitHeight(100);

        soundButton = new ImageView(new Image("ButtonImages/soundbut.png"));
        soundButton.setFitWidth(100);
        soundButton.setFitHeight(100);

        wordButton = new ImageView(new Image("ButtonImages/wordbut.png"));
        wordButton.setFitWidth(100);
        wordButton.setFitHeight(100);



        /*
         * Left button that will take you to the previous animal:
         */
        leftButton = new ImageView("ButtonImages/left.png");
        leftButton.setFitWidth(100);
        leftButton.setFitHeight(100);
        leftButton.setOnMouseClicked(e->{
            count--;
            //making sure we don't go out of bounds.. less than the first
            if (count < 0){
                count = 0;
            }
            animalImage.setImage(animalArrayList.get(count).getAnimalImage());
            letterSound = animalArrayList.get(count).getLetterSound();
            wordSound = animalArrayList.get(count).getWordSound();
            animalSound = animalArrayList.get(count).getAnimalSound();
        });


        /*
         * Right button that will take you to the next animal:
         */
        rightButton = new ImageView("ButtonImages/right.png");
        rightButton.setFitWidth(100);
        rightButton.setFitHeight(100);
        rightButton.setOnMouseClicked(e->{
            count++;
            //making sure we don't go out of bounds.. past the last
            if (count > 25){
                count = 25;
            }
            animalImage.setImage(animalArrayList.get(count).getAnimalImage());
            letterSound = animalArrayList.get(count).getLetterSound();
            wordSound = animalArrayList.get(count).getWordSound();
            animalSound = animalArrayList.get(count).getAnimalSound();
        });


        /*
         * Play sounds
         */
        letterButton.setOnMouseClicked(e->{
            media = new Media(letterSound.toURI().toString());
            player = new MediaPlayer(media);
            player.play();
        });


        wordButton.setOnMouseClicked(e->{
            media = new Media(wordSound.toURI().toString());
            player = new MediaPlayer(media);
            player.play();
        });


        soundButton.setOnMouseClicked(e->{
            media = new Media(animalSound.toURI().toString());
            player = new MediaPlayer(media);
            player.play();
        });


        /*
         * HBox to align the three buttons horizontally
         */
        HBox hBox = new HBox();
        hBox.getChildren().addAll(letterButton, soundButton, wordButton);
        hBox.setSpacing(100);
        hBox.setAlignment(Pos.CENTER);
        root.setCenter(hBox);


        /*
         * Home ImageView Button that takes you to Intro the screen
         */
        ImageView homeButton = new ImageView("ButtonImages/homebut.png");
        setAlignment(homeButton, Pos.TOP_LEFT);
        HBox hBox1 = new HBox();
        hBox1.getChildren().add(homeButton);
        hBox1.setPadding(new Insets(12, 0, 0, 100));
        homeButton.setFitHeight(100);
        homeButton.setFitWidth(100);
        homeButton.setOnMouseClicked(e->{
            MainApp.mainStage.setScene(new IntroScene());
        });
        hBox1.setMaxWidth(100);
        hBox1.setMaxHeight(100);
        StackPane.setAlignment(hBox1, Pos.TOP_LEFT);

        /*
         * HBox to align the animalImage with the left and right buttons:
         */
        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(leftButton, animalImage, rightButton);
        hBox2.setSpacing(50);
        hBox2.setAlignment(Pos.CENTER);
        root.setTop(hBox2);

        this.getChildren().addAll(root, hBox1);
    }
}
