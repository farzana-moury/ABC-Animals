package Scenes;

import Panes.IntroPane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class IntroScene extends Scene {
    public IntroScene() {
        super(new IntroPane(),  1024, 768);
        this.setFill(Color.LIGHTBLUE);
    }
}
