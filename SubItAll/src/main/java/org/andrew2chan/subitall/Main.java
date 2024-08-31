package org.andrew2chan.subitall;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    final int WINDOW_WIDTH = 800;
    final int WINDOW_HEIGHT = 800;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("SubItAll!");
        stage.setResizable(true);

        BorderPane layout = new BorderPane();
        WebController webController = new WebController();
        webController.loadURL("https://www.google.com");

        layout.setCenter(webController.getWebView());

        NavigationBarController navigationBarController = new NavigationBarController(webController);
        layout.setTop(navigationBarController.getNavigationBox());

        Scene scene = new Scene(layout, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}