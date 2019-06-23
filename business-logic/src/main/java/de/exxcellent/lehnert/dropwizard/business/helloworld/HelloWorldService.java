package de.exxcellent.lehnert.dropwizard.business.helloworld;

import java.util.Optional;

/**
 * TODO [AL] class documentation
 *
 * @author Andre Lehnert, eXXcellent solutions consulting & software gmbh
 */
public interface HelloWorldService {
    String generateGreeting(Optional<String> name);
}
