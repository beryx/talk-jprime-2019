package org.example.jpms.hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//tag::class[]
public class HelloFX extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, jPrime!");
        label.setFont(Font.font(48));
        StackPane pane = new StackPane(label);
        Scene scene = new Scene(pane, 480, 320);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//end::class[]
