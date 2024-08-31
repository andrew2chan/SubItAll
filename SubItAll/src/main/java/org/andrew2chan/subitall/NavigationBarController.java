package org.andrew2chan.subitall;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebHistory;

public class NavigationBarController {
    private HBox navigationBox;
    private WebController webController;
    private WebHistory webHistory;

    public NavigationBarController(WebController webController) {
        navigationBox = new HBox();
        navigationBox.setPadding(new Insets(10,5,10,5));
        navigationBox.setSpacing(5);

        this.webController = webController;
        Button reloadButton = getReloadButton();
        Button backButton = getBackButton();
        Button forwardButton = getForwardButton();

        navigationBox.getChildren().addAll(backButton, reloadButton, forwardButton, getUrlTextField());
    }

    private TextField getUrlTextField() {
        TextField urlTextField = new TextField();
        urlTextField.setMinWidth(500);
        urlTextField.setOnAction(e -> {
            webController.getWebView().getEngine().load(urlTextField.getText());
        });
        urlTextField.setPromptText("Enter a complete url");

        return urlTextField;
    }

    private Button getReloadButton() {
        Button button = new Button("Reload");
        button.setOnAction(e -> {
           webController.getWebView().getEngine().reload();
        });

        return button;
    }

    private Button getBackButton() {
        Button button = new Button("Back");
        webHistory = webController.getWebView().getEngine().getHistory();

        button.setOnAction(e -> {
            webHistory.go(-1);
        });

        return button;
    }

    private Button getForwardButton() {
        Button button = new Button("Forward");
        webHistory = webController.getWebView().getEngine().getHistory();

        button.setOnAction(e -> {
            webHistory.go(1);
        });

        return button;
    }

    public HBox getNavigationBox() {
        return navigationBox;
    }
}
