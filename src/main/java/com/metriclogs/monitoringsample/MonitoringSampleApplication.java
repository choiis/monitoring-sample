package com.metriclogs.monitoringsample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MonitoringSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitoringSampleApplication.class, args);
    }

    private Logger logger = LoggerFactory.getLogger(MonitoringSampleApplication.class);

    @GetMapping(value = "check")
    public ResponseEntity<String> check() {
        logger.info("check log");
        return new ResponseEntity<>("check",HttpStatus.OK);
    }

    @GetMapping(value = "get")
    public ResponseEntity<String> get() {
        logger.info("get log");
        return new ResponseEntity<>("get",HttpStatus.OK);
    }
}
