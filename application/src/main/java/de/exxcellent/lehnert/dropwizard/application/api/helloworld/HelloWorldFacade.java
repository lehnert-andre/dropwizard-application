package de.exxcellent.lehnert.dropwizard.application.api.helloworld;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import com.google.inject.Inject;
import de.exxcellent.lehnert.dropwizard.application.api.helloworld.types.HelloWorldTO;
import de.exxcellent.lehnert.dropwizard.business.helloworld.HelloWorldService;
import de.exxcellent.lehnert.dropwizard.common.logging.EscapingLogger;
import de.exxcellent.lehnert.dropwizard.common.logging.LogUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "HelloWorld")
@Path("v1")
public class HelloWorldFacade {

    private HelloWorldService helloWorldService;

    private static final EscapingLogger LOGGER = LogUtils.getLogger(HelloWorldFacade.class);

    @Inject
    public HelloWorldFacade(HelloWorldService helloWorldService) {
        LOGGER.info("Injecting HelloWorldService.class");
        this.helloWorldService = helloWorldService;
    }

    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Say Hello")
    public HelloWorldTO sayHello(
            @ApiParam(value = "Define your name.") @QueryParam("name") Optional<String> name) {

        LOGGER.info("/v1/hello received");

        HelloWorldTO helloWorldTO = new HelloWorldTO();

        helloWorldTO.setGreeting(helloWorldService.generateGreeting(name));

        return helloWorldTO;
    }
}
