package de.exxcellent.lehnert.dropwizard.business.helloworld;

import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * TODO [AL] class documentation
 *
 * @author Andre Lehnert, eXXcellent solutions consulting & software gmbh
 */
public class HelloWorldServiceImplTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private GreetingBuilder greetingBuilder;

    @InjectMocks
    private HelloWorldServiceImpl underTest;

    @Captor
    private ArgumentCaptor<String> argumentCaptor;

    @Test
    public void generateGreeting() {
        String expected = "greeting";

        when(greetingBuilder.generate(anyString())).thenReturn(expected);

        String actual = underTest.generateGreeting(Optional.empty());

        assertThat(actual).isNotEmpty().isEqualTo(expected);

        verify(greetingBuilder).generate(argumentCaptor.capture());

        String actualName = argumentCaptor.getValue();

        assertThat(actualName).isEqualTo("Welt");
    }
}