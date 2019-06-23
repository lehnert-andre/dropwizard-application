package de.exxcellent.lehnert.dropwizard.business.helloworld;

import java.util.Optional;
import com.google.inject.Inject;
import de.exxcellent.lehnert.dropwizard.common.logging.EscapingLogger;
import de.exxcellent.lehnert.dropwizard.common.logging.LogUtils;

/**
 * TODO [AL] class documentation
 *
 * @author Andre Lehnert, eXXcellent solutions consulting & software gmbh
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    private static final EscapingLogger LOGGER = LogUtils.getLogger(HelloWorldServiceImpl.class);

    private GreetingBuilder greetingBuilder;
    @Inject
    public HelloWorldServiceImpl(GreetingBuilder greetingBuilder) {
        LOGGER.info("Injecting GreetingBuilder.class");

        this.greetingBuilder = greetingBuilder;
    }

    @Override
    public String generateGreeting(Optional<String> name) {

        LOGGER.info("generateGreeting()");

        return greetingBuilder.generate(name.orElse("Welt"));

    }
}
