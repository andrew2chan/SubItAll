package org.andrew2chan.subitall;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    final int WINDOW_WIDTH = 800;
    final int WINDOW_HEIGHT = 800;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("SubItAll!");

        StackPane layout = new StackPane();

        Scene scene = new Scene(layout, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}