package com.spring.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.annotation")
@PropertySource("classpath:fortune.properties")
public class SportConfig {
	
}
