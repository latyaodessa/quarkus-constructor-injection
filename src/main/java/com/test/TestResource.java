package com.test;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Validator;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class TestResource implements TestEndpoint {
    private static final Logger LOG = Logger.getLogger(TestResource.class);

    private final Validator validator;


    @Inject
    public TestResource(
            final Validator validator) {
        this.validator = validator;
    }

    @Override
    public Response hello() {
        LOG.info("hello");

        return Response.ok().entity("hello").build();
    }


}
