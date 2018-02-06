package calculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox entryPane = new VBox();
            TextField tfNumber1 = new TextField();
            TextField tfNumber2 = new TextField();
            TextField tfResult = new TextField();
                tfResult.setEditable(false); // makes the text-field unable to be edited
                tfNumber1.setPrefColumnCount(3);
                tfNumber2.setPrefColumnCount(3);
                tfResult.setPrefColumnCount(3);
        entryPane.getChildren().addAll(new Label("Number 1: "),tfNumber1, 
                                       new Label("Number 2: "),tfNumber2,
                                       new Label("Result: "),tfResult);
        
        //create 4 buttons
        HBox hBox = new HBox(6);
            Button btAdd = new Button("Add");
            Button btSubtract = new Button("Subtract");
            Button btMultiply = new Button("Multiply");
            Button btDivide = new Button("Divide");
            Button btClear = new Button("Clear");
            hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide, btClear);
                                    
        BorderPane borderPane = new BorderPane();
            borderPane.setCenter(entryPane);
            borderPane.setBottom(hBox);
        
        //create scene
        Scene scene = new Scene(borderPane, 350, 150);
        
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //Addition
        btAdd.setOnAction(e->{
           tfResult.setText(Double.parseDouble(tfNumber1.getText()) +
                            Double.parseDouble(tfNumber2.getText()) + ""); 
        });
        
        //Subtraction
        btSubtract.setOnAction(e->{
           tfResult.setText(Double.parseDouble(tfNumber1.getText()) -
                            Double.parseDouble(tfNumber2.getText()) + ""); 
        });
        
        //Multiplication
        btMultiply.setOnAction(e->{
           tfResult.setText(Double.parseDouble(tfNumber1.getText()) *
                            Double.parseDouble(tfNumber2.getText()) + ""); 
        });
        
        //Division
        btDivide.setOnAction(e->{
           tfResult.setText(Double.parseDouble(tfNumber1.getText()) /
                            Double.parseDouble(tfNumber2.getText()) + ""); 
        });

        
        //Clear
        btClear.setOnAction(e->{
           tfNumber1.setText("");
           tfNumber2.setText("");
           tfResult.setText(""); 
        });
                

    }

    public static void main(String[] args) {
        launch(args);
    }

}
