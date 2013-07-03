package com.zazzercode.robot;

import javax.swing.SwingUtilities;

import com.zazzercode.robot.models.util.RobotScheduler;
import com.zazzercode.robot.views.RobotFrame;

/**
 * @author prayag
 * 
 */
public class App {
	public static void main(String[] args) {
		try {
			RobotScheduler.startSchedule();
		} catch (Exception e) {
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new RobotFrame().setVisible(true);

			}
		});

	}
}
