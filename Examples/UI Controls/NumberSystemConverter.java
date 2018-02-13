package numbersystemconverter;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;

public class NumberSystemConverter extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //tf defintions
        TextField tfDecimal = new TextField();
        TextField tfHex = new TextField();
        TextField tfBinary = new TextField();
        
        //tf set alignment property values
        tfDecimal.setAlignment(Pos.BOTTOM_RIGHT);
        tfHex.setAlignment(Pos.BOTTOM_RIGHT);
        tfBinary.setAlignment(Pos.BOTTOM_RIGHT);
        
        //grid pane definition
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        
        //add labels and tf to pane
        pane.add(new Label("Decimal"),0,0);
        pane.add(tfDecimal, 1, 0);
        pane.add(new Label("Hex"),0,1);
        pane.add(tfHex, 1, 1);
        pane.add(new Label("Binary"),0,2);
        pane.add(tfBinary, 1, 2);
        
        //pane.getChildren().addAll(tfDecimal, tfHex, tfBinary);
        
        //when enter decimal, convert to hex and binary
        tfDecimal.setOnAction(e->{
            int decimal = Integer.parseInt(tfDecimal.getText());
            tfHex.setText(Integer.toHexString(decimal));
            tfBinary.setText(Integer.toBinaryString(decimal));
        });
        
        //when enter hex, convert to decimal and binary
        tfHex.setOnAction(e->{
            int decimal = Integer.parseInt(tfHex.getText(), 16);
            tfDecimal.setText(decimal + "");
            tfBinary.setText(Integer.toBinaryString(decimal));
        });
        
        //when enter binary, convert to decimal and hex
        tfBinary.setOnAction(e->{
            int decimal = Integer.parseInt(tfHex.getText(), 2);
            tfDecimal.setText(decimal + "");
            tfHex.setText(Integer.toHexString(decimal));
        });
        
        //scene defintion
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Number System Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
