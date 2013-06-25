/**
 * 
 */
package com.zazzercode.robot.controllers;

import com.zazzercode.robot.models.SurgeryRobot;

/**
 * @author prayag
 * 
 */
public class SurgeryRobotController {
	/**
	 * save surgery robot to database
	 */
	public void create(SurgeryRobot robot) {
		robot.save();
	}
}
