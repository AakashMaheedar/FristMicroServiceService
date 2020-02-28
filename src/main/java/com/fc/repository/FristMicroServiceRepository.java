package com.fc.repository;

import com.fc.domain.FristMicroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class FristMicroServiceRepository {

    private static final String template = "Hello, %s!";

}
