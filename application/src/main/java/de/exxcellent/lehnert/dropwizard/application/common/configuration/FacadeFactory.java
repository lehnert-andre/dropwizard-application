package de.exxcellent.lehnert.dropwizard.application.common.configuration;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.exxcellent.lehnert.dropwizard.application.api.helloworld.HelloWorldFacade;
import de.exxcellent.lehnert.dropwizard.business.BusinessLogicModule;
import de.exxcellent.lehnert.dropwizard.business.helloworld.HelloWorldService;
import de.exxcellent.lehnert.dropwizard.common.logging.EscapingLogger;
import de.exxcellent.lehnert.dropwizard.common.logging.LogUtils;

/**
 * Facade factory
 *
 * @author Andre Lehnert, eXXcellent solutions consulting & software gmbh
 */
public final class FacadeFactory {
    private static final EscapingLogger LOGGER = LogUtils.getLogger(FacadeFactory.class);

    public static HelloWorldFacade createHelloWorldFacade() {
        Injector injector = Guice.createInjector(new BusinessLogicModule());

        LOGGER.info("Get instance");
        HelloWorldService helloWorldService = injector.getInstance(HelloWorldService.class);

        return new HelloWorldFacade(helloWorldService);
    }
}
