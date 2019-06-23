package de.exxcellent.lehnert.dropwizard.business;

import com.google.inject.AbstractModule;
import de.exxcellent.lehnert.dropwizard.business.helloworld.HelloWorldService;
import de.exxcellent.lehnert.dropwizard.business.helloworld.HelloWorldServiceImpl;

/**
 * Guice dependency injection configuration for the maven application module
 *
 * @author Andre Lehnert, eXXcellent solutions consulting & software gmbh
 */
public class BusinessLogicModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloWorldService.class).to(HelloWorldServiceImpl.class);
    }
}
