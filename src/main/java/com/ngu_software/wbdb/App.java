package com.ngu_software.wbdb;

import com.ngu_software.wbdb.view.Window;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		new Window(primaryStage);
	}

}
