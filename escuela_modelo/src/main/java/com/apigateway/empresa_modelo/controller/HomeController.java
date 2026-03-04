package com.apigateway.empresa_modelo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String home() {
        logger.info("Endpoint '/' fue llamado en API Gateway");
		return "hola soy el api gateway";
	}

    @GetMapping(path = "/status", produces = MediaType.TEXT_PLAIN_VALUE)
    public String status() {
        logger.info("Endpoint '/status' fue llamado en API Gateway");
        return "API Gateway está funcionando correctamente";
    }
}

