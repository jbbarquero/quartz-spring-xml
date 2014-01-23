package com.malsolo.spring.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class StuffJob extends QuartzJobBean {
	
	StuffService stuffService;

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		
		System.err.println(this.stuffService.dostuff());
		
	}

	public void setStuffService(StuffService stuffService) {
		this.stuffService = stuffService;
	}
	
}
