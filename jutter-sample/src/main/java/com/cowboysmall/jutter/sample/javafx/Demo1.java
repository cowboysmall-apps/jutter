package com.cowboysmall.jutter.sample.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Demo1 extends Application {

    @Override
    public void start(Stage stage) {

        stage.setScene(
                new Scene(
                        new StackPane(
                                new Label(
                                        "Hello, JavaFX %s, running on Java %s.".formatted(
                                                System.getProperty("javafx.version"),
                                                System.getProperty("java.version")
                                        )
                                )
                        ),
                        640,
                        480
                )
        );
        stage.show();
    }

    public static void main(String... args) {

        launch();
    }
}