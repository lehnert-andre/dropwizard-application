package de.exxcellent.lehnert.dropwizard.common.logging;

public class LogUtils {

    private LogUtils() {}

    public static <T> EscapingLogger getLogger(Class<T> clazz) {

        return new EscapingLogger(clazz);
    }
}
