package org.andrew2chan.subitall;

import javafx.scene.control.ProgressBar;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebController {
    private WebView webView;
    private ProgressBar progressBar;

    //create a new webview
    public WebController() {
        progressBar = new ProgressBar();
        webView = new WebView();
    }

    //returns the engine
    private WebEngine webEngine() {
        return webView.getEngine();
    }

    //load a url into the engine
    public void loadURL(String url) {
        webEngine().load(url);
    }

    public WebView getWebView() {
        return webView;
    }
}
