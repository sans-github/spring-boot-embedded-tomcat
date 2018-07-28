package com.spring.boot.controller;

import com.spring.boot.model.Request;
import com.spring.boot.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@RequestMapping(value = "/", produces = "application/json")
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value = "/request", method = POST)
    @ResponseBody
    public Response request(@RequestBody final Request request) {
        logger.info("Request received. name={}", request.getName());

        final Response response  = generateResponse(request);

        logger.info("Dispatching response. name={}, time={}", response.getRequest().getName(), response.getTime());
        return response;
    }

    private Response generateResponse(final Request request) {
        return new Response(request);
    }
}
