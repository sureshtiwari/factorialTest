package com.suresh.dynamic.multitenant.controller;

import com.suresh.dynamic.multitenant.dto.MetricDTO;
import com.suresh.dynamic.multitenant.security.RequestAuthorization;
import com.suresh.dynamic.multitenant.tenant.service.MetricService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/api")
public class MetricController implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    MetricService metricService;

    @RequestAuthorization
    @RequestMapping(value = "/metrics", method = RequestMethod.GET)
    public ResponseEntity<Object> getMetrics() {
        LOGGER.info("getAllMetrics method call...");
        return new ResponseEntity<>(metricService.getMetrics(),HttpStatus.OK);
    }

    @RequestAuthorization
    @RequestMapping(value = "/metrics", method = RequestMethod.POST)
    public ResponseEntity<Object> postMetrics(@RequestBody MetricDTO metricDTO) {
        LOGGER.info("saving metric" + metricDTO.toString());
        return new ResponseEntity<>(metricService.save(metricDTO),HttpStatus.OK);
    }

    @RequestAuthorization
    @RequestMapping(value = "/metrics/averages", method = RequestMethod.GET)
    public ResponseEntity<Object> postMetrics() {
        LOGGER.info("getting averages metric");
        return new ResponseEntity<>(metricService.getAverages(),HttpStatus.OK);
    }

}
