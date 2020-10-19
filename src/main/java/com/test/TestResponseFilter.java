package com.test;

import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class TestResponseFilter implements ContainerResponseFilter {


    final Test test;

    @Inject
    public TestResponseFilter(final Test test) {
        this.test = test;
    }


    @Override
    public void filter(final ContainerRequestContext requestContext, final ContainerResponseContext responseContext) {

    }

}
