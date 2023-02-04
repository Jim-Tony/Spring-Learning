package com.spring.annotation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ChessCoach implements Coach {
	
	
	//Field Injection
	@Autowired
	@Qualifier("funHappyFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public void injectDependency(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	
	
	@PostConstruct
	public void doStartStuff() throws IOException {
		Stream<String> lines = Files.lines(Path.of("sample.txt"));
		lines.forEach(System.out::println);
		System.out.println("This method is called after bean instantiation and dependenct injection");
		lines.close();
	}
	
	
	@PreDestroy
	public void doOnDestroy() {
		System.out.println("The bean is completed");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Knock the king fast";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
