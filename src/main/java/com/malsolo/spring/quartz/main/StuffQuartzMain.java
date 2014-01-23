package com.malsolo.spring.quartz.main;

import java.util.concurrent.TimeUnit;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StuffQuartzMain {
	
	private static final long TIEMPO_ESPERA_POR_QUARTZ = TimeUnit.SECONDS.toMillis(3);

	public static void main(String... args) throws InterruptedException {
		
		System.out.println(">>>>> BEGIN ");
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:META-INF/spring/applicationContext-quartz-simple.xml");
		
		System.out.println("A esperar por QUARTZ");
		Thread.sleep(TIEMPO_ESPERA_POR_QUARTZ);
		System.out.println("FIN. A esperar por QUARTZ");
		
		context.close();
		
		System.out.println("<<<<< END ");
	}

}
