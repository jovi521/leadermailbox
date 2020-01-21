package com.skybrian.leadermailbox;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author jovi
 */
@EnableSwagger2Doc
@SpringBootApplication
public class LeaderMailboxMainApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(LeaderMailboxMainApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LeaderMailboxMainApplication.class);
    }
}
