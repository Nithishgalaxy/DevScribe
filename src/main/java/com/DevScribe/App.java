package com.DevScribe;

import com.DevScribe.ui.screen.LauncherScreen;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        new LauncherScreen().start(stage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}