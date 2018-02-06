package drawlines;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawLines extends Application {

    private double x = 100;
    private double y = 100;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    pane.getChildren().add(new Line(x, y, x, y - 10));
                    y -= 10;
                    break;
                case DOWN:
                    pane.getChildren().add(new Line(x, y, x, y + 10));
                    y += 10;
                    break;
                case LEFT:
                    pane.getChildren().add(new Line(x, y, x-10,y));
                    x -= 10;
                    break;
                case RIGHT:
                    pane.getChildren().add(new Line(x, y, x+10, y));
                    x += 10;
                    break;

            }
        });

        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setTitle("Draw Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
        x = pane.getWidth() / 2;
        y = pane.getHeight() / 2;

    }

    public static void main(String[] args) {
        launch(args);
    }

}
