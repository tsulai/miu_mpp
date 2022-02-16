package level2_diff_layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBox_Experiment extends Application  {

  @Override
  public void start(Stage primaryStage) throws Exception { 
    primaryStage.setTitle("HBox Experiment");

    Button button1 = new Button("Button Number 1");
    Button button2 = new Button("Button Number 2");

    HBox hbox = new HBox(button1, button2);

    Scene scene = new Scene(hbox, 200, 100);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}