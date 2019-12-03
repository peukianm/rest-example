package com.test.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class ScoreApplication extends ResourceConfig {
	public ScoreApplication() {
		packages("com.mcnz.rest.tomcat.eclipse");
	}
}

/*
@ApplicationPath("/")
public class ScoreApplication extends Application{
	public Set<Class<?>> getClasses() {return new HashSet<Class<?>>(ArrayList.asList(com.test.rest.ScoreService))}
}
 */