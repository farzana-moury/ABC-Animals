package Main;
import Scenes.IntroScene;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 * Main Running Class
 */
public class MainApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        //setting the mainStage equal to primary stage so that we can switch between scenes
        mainStage = primaryStage;
        mainStage.setResizable(false);
        mainStage.setTitle("ABC Animals");
        mainStage.setScene(new IntroScene());
        mainStage.show();
    }
}
