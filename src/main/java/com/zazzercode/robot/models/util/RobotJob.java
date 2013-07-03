/**
 * 
 */
package com.zazzercode.robot.models.util;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author prayag
 * 
 */
public class RobotJob implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {
		sendReminder();
	}

	private void sendReminder() {
		System.out.println("Sending Reminder");

	}

}
