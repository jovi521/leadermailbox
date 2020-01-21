package com.skybrian.leadermailbox;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jovi
 */
@EnableAdminServer
@SpringBootApplication
public class LeaderMailboxAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeaderMailboxAdminApplication.class, args);
    }

}
