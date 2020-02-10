package com.ngu_software.wbdb.modules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Time {

	private void clock(Text text) {
//		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
//			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
//			text.setText(formatter.format(new Date()));
//		}), new KeyFrame(Duration.seconds(1)));
//		clock.setCycleCount(Animation.INDEFINITE);
//		clock.play();
		
		getTime(text);
		getDate(text);
	}
	
	private void getTime(Text text) {
		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
			DateFormat formatter = new SimpleDateFormat("hh:mm:ss aa");
			text.setText(formatter.format(new Date()));
		}), new KeyFrame(Duration.seconds(1)));
		clock.setCycleCount(Animation.INDEFINITE);
		clock.play();
	}
	
	private void getDate(Text text) {
		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			text.setText(formatter.format(new Date()));
		}), new KeyFrame(Duration.seconds(1)));
		clock.setCycleCount(Animation.INDEFINITE);
		clock.play();
	}

}
