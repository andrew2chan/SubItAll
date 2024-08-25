module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens org.andrew2chan.subitall to javafx.fxml;
    exports org.andrew2chan.subitall;
}