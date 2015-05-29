package com.cogniance.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

public class PollingJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        Message<String> triggerMessage = MessageBuilder.build();
    }
}
