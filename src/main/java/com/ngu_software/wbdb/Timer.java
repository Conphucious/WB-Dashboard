package com.ngu_software.wbdb;

import java.time.Clock;
import java.time.Instant;

public class Timer {

	public Timer() {

		while (true) {
			Clock clock = Clock.systemDefaultZone();
			Instant instant = clock.instant();
			System.out.println(instant);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
