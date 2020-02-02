package com.ngu_software.wbdb;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
		
		primaryStage.setScene(new Scene(box, 200, 200));
		primaryStage.show();
		
		clock(timeTxt);
	}
	
	private void clock(Text time) {
		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {   
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        LocalTime currentTime = LocalTime.now();
//	        time.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
	        time.setText(LocalDateTime.now().format(formatter));
	    }),
	         new KeyFrame(Duration.seconds(1))
	    );
	    clock.setCycleCount(Animation.INDEFINITE);
	    clock.play();
	}
	
}
