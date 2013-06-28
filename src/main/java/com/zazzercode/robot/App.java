package com.zazzercode.robot;

import javax.swing.SwingUtilities;

import com.zazzercode.robot.views.RobotFrame;

/**
 * @author prayag
 * 
 */
public class App {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new RobotFrame().setVisible(true);

			}
		});

	}
}
