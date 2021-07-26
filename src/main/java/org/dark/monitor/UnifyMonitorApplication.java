package org.dark.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableEurekaClient
@SpringBootApplication
public class UnifyMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnifyMonitorApplication.class, args);
    }

}
