package com.fc.resources;

import com.fc.domain.FristMicroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class FristMicroServiceController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public FristMicroService greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new FristMicroService(counter.incrementAndGet(),
                String.format(template, name));
    }
}
