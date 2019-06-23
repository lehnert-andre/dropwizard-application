package de.exxcellent.lehnert.dropwizard.application.api.helloworld.types;

/**
 * HelloWorld response payload
 *
 * @author Andre Lehnert, eXXcellent solutions consulting & software gmbh
 */
public class HelloWorldTO {
    private String greeting;


    public String getGreeting() {
        return greeting;
    }


    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
