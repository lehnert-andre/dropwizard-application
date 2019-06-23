package de.exxcellent.lehnert.dropwizard.business.helloworld;

import de.exxcellent.lehnert.dropwizard.common.logging.EscapingLogger;
import de.exxcellent.lehnert.dropwizard.common.logging.LogUtils;

/**
 * TODO [AL] class documentation
 *
 * @author Andre Lehnert, eXXcellent solutions consulting & software gmbh
 */
public class GreetingBuilder {
    private static final EscapingLogger LOGGER = LogUtils.getLogger(GreetingBuilder.class);

    private static final String GREETING_TEMPLATE = "Hallo %s!";

    public String generate(String name) {
        LOGGER.info(String.format("generate() with name: %s", name));

        return String.format(GREETING_TEMPLATE, name);
    }
}
