package de.exxcellent.lehnert.dropwizard.application;

import java.text.DateFormat;
import org.apache.http.client.HttpClient;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import de.exxcellent.lehnert.dropwizard.application.common.configuration.FacadeFactory;
import io.dropwizard.Application;
import io.dropwizard.server.DefaultServerFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.client.HttpClientBuilder;

import de.exxcellent.lehnert.dropwizard.application.common.configuration.DropWizardConfiguration;

public class DropWizardApplication extends Application<DropWizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropWizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-application";
    }

    @Override
    public void initialize(final Bootstrap<DropWizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropWizardConfiguration configuration,
                    final Environment environment) {

        final DefaultServerFactory serverFactory = (DefaultServerFactory) configuration.getServerFactory();
        serverFactory.setApplicationContextPath("/");
        serverFactory.setJerseyRootPath("/api");

        environment.jersey().register(FacadeFactory.createHelloWorldFacade());

    }

}
