/**
 *
 */
package com.zazzercode.robot.models.util;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author prayag
 *
 */
public class RobotScheduler {
    public static void startSchedule() throws Exception {
        JobDetail jobDetail = new JobDetail("robotJob", null, RobotJob.class);

        CronTrigger trigger = new CronTrigger();
        trigger.setName("robotTrigger");
        trigger.setCronExpression("0/50 * * * * ?");

        // schedule it
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail, trigger);

    }
}
