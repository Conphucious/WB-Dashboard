package com.ngu_software.wbdb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox box = new VBox();
		Text timeTxt = new Text();

		box.getChildren().add(timeTxt);

		primaryStage.setScene(new Scene(box, 1024, 800));
		primaryStage.show();

		clock(timeTxt);
	}

	private void clock(Text time) {
		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
			time.setText(formatter.format(new Date()));
		}), new KeyFrame(Duration.seconds(1)));
		clock.setCycleCount(Animation.INDEFINITE);
		clock.play();
	}

}
