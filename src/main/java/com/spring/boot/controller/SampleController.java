package com.spring.boot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.boot.model.SampleRequest;
import com.spring.boot.model.SampleResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@RequestMapping(value = "/", produces = "application/json")
public class SampleController {

    @RequestMapping(value = "/hello", method = GET)
    @ResponseBody
    public String hello() {
        return "hello there\n";
    }

    @RequestMapping(value = "/samplepost", method = POST)
    @ResponseBody
    public SampleResponse samplepost(@RequestBody final SampleRequest sampleRequest) {
        printObject(sampleRequest);
        return new SampleResponse(sampleRequest);
    }

    private static void printObject(final Object object) {
        final ObjectMapper objectMapper = new ObjectMapper() {{
            enable(INDENT_OUTPUT);
        }};

        try {
            System.out.println(objectMapper.writeValueAsString(object));
        } catch (final JsonProcessingException ex) {
            System.out.println("Error printing object " + ex.getMessage());
        }

    }
}
