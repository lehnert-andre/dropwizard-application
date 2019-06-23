package de.exxcellent.lehnert.dropwizard.application.api.helloworld;

import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import de.exxcellent.lehnert.dropwizard.application.api.helloworld.types.HelloWorldTO;
import de.exxcellent.lehnert.dropwizard.business.helloworld.HelloWorldService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * TODO [AL] class documentation
 *
 * @author Andre Lehnert, eXXcellent solutions consulting & software gmbh
 */
public class HelloWorldFacadeTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private HelloWorldService helloWorldService;

    @InjectMocks
    private HelloWorldFacade underTest;


    @Test
    public void sayHello() {
        String expected = "greeting";

        when(helloWorldService.generateGreeting(any())).thenReturn(expected);

        HelloWorldTO actual = underTest.sayHello(Optional.empty());

        assertThat(actual)
                .isNotNull();
        assertThat(actual.getGreeting())
                .isNotEmpty()
                .isEqualTo(expected);
    }
}