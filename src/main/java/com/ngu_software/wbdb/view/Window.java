package com.ngu_software.wbdb.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Window {
	
	private static final int HEIGHT = 800;
	private static final int WIDTH = 1024;
	
	public Window(Stage primaryStage) {
		VBox box = new VBox();
		Text timeTxt = new Text();

		box.getChildren().add(timeTxt);
		
		box.setAlignment(Pos.CENTER);

		primaryStage.setScene(new Scene(box, WIDTH, HEIGHT));
		primaryStage.show();

		clock(timeTxt);
	}
	
	private void clock(Text time) {
		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
			DateFormat formatter = new SimpleDateFormat("hh:mm:ss aa");
			time.setText(formatter.format(new Date()));
		}), new KeyFrame(Duration.seconds(1)));
		clock.setCycleCount(Animation.INDEFINITE);
		clock.play();
	}
	

}
