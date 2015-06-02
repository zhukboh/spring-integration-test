package com.cogniance.jobs;

import com.cogniance.gateways.HttpGateway;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class PollingJob implements Job {

    @Autowired
    private HttpGateway httpGateway;

    private final RestTemplate rest = new RestTemplate();

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String response = rest.getForObject("http://graph.facebook.com/pivotalsoftware", String.class);
        httpGateway.placeReply(response);
    }
}
