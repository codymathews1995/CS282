package TrafficLight;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;



public class TrafficLight extends Application {
    int paneWidth = 200;
    int paneHeight = 90;
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        
        //Circle Definitions
        Circle circleRed = new Circle(paneWidth/2, 20, 10);
        circleRed.setStroke(Color.BLACK);
        circleRed.setFill(Color.WHITE);
        
        Circle circleYellow = new Circle(paneWidth/2, 50, 10);
        circleYellow.setStroke(Color.BLACK);
        circleYellow.setFill(Color.WHITE);
        
        Circle circleGreen = new Circle(paneWidth/2, 80, 10);
        circleGreen.setStroke(Color.BLACK);
        circleGreen.setFill(Color.GREEN);
        
        //Rectangle Definition
        Rectangle rectangle = new Rectangle(paneWidth/2-15, 5, 30,90);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        
        //add circle and rectangle to pane
        pane.getChildren().addAll(rectangle,circleRed,circleYellow,circleGreen);
        
        //Rb definition
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbGreen = new RadioButton("Green");
        
        //Toggle group definition
        ToggleGroup rbGroup = new ToggleGroup();
        rbRed.setToggleGroup(rbGroup);
        rbYellow.setToggleGroup(rbGroup);
        rbGreen.setToggleGroup(rbGroup);
        rbGreen.setSelected(true);
        
        //Hbox definition
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(rbRed, rbYellow, rbGreen);
        hBox.setAlignment(Pos.CENTER);
        
        //BorderPane defintion
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        
        //when click on rbRed -> light turn red
        rbRed.setOnAction(e->{
            circleRed.setFill(Color.RED);
            circleYellow.setFill(Color.WHITE);
            circleGreen.setFill(Color.WHITE);
            
        });
        
        //when click on rbYellow -> light turn yellow
        rbYellow.setOnAction(e->{
            circleRed.setFill(Color.WHITE);
            circleYellow.setFill(Color.YELLOW);
            circleGreen.setFill(Color.WHITE);
            
        });
        
        //when click on rbGreen -> light turn green
        rbGreen.setOnAction(e->{
            circleRed.setFill(Color.WHITE);
            circleYellow.setFill(Color.WHITE);
            circleGreen.setFill(Color.GREEN);
            
        });
        
        
        //Scene defintion to border pane
        Scene scene = new Scene(borderPane, paneHeight*2, paneWidth/1.5);
        primaryStage.setTitle("Traffic Light");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
