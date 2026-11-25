import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("JavaFX Berhasil Jalan di Mac!");
        Scene scene = new Scene(label, 350, 150);
        stage.setTitle("Tes JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}