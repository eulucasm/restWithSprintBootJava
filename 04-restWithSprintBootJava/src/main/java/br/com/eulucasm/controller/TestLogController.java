package br.com.eulucasm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLogController {

    private final Logger logger = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping("/test")
    public String testLog() {

        logger.info("This is an Info Log");
        logger.warn("This is an Warn Log");
        logger.debug("This is an Debug Log");
        logger.error("This is an Info Log");
        return "Logs generated successfully";
    }
}
