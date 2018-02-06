
package twomessages;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoMessages extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        String textString = "Today is a wonderful day to...";
        String replaceString = "...do your work.";
        String stageTitle = "Two Messages";
        
        //Create UI
        StackPane pane = new StackPane();
        Text text = new Text(textString);
        pane.getChildren().add(text);
        pane.setOnMouseClicked(e->{ //see if button was pushed
            if(text.getText().equals(textString)){
                text.setText(replaceString);
            } else {
                text.setText(textString);
            }
        });
        
        //Create Scene
        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setTitle(stageTitle);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
