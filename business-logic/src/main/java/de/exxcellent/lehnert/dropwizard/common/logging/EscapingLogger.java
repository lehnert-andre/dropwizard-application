package de.exxcellent.lehnert.dropwizard.common.logging;

import org.apache.commons.text.StringEscapeUtils;

public class EscapingLogger {

    private final org.slf4j.Logger LOGGER;

    public <T> EscapingLogger(Class<T> clazz) {
        LOGGER = org.slf4j.LoggerFactory.getLogger(clazz);
    }

    public void trace(String message) {
        message = StringEscapeUtils.escapeJson(message);
        LOGGER.trace(message);
    }

    public void trace(String message, Throwable t) {
        message = StringEscapeUtils.escapeJson(message);
        LOGGER.trace(message, t);
    }

    public void debug(String message) {
        message = StringEscapeUtils.escapeJson(message);
        LOGGER.debug(message);
    }

    public void debug(String message, Throwable t) {
        message = StringEscapeUtils.escapeJson(message);
        LOGGER.debug(message, t);
    }

    public void info(String message) {
        message = StringEscapeUtils.escapeJson(message);
        LOGGER.info(message);
    }

    public void info(String message, Throwable t) {
        message = StringEscapeUtils.escapeJson(message);
        LOGGER.info(message, t);
    }

    public void warn(String message) {
        message = StringEscapeUtils.escapeJson(message);
        LOGGER.warn(message);
    }

    public void warn(String message, Throwable t) {
        message = StringEscapeUtils.escapeJson(message);
        LOGGER.warn(message, t);
    }

    public void error(String message) {
        message = StringEscapeUtils.escapeJson(message);
        LOGGER.error(message);
    }

    public void error(String message, Throwable t) {
        message = StringEscapeUtils.escapeJson(message);
        LOGGER.error(message, t);
    }
}
