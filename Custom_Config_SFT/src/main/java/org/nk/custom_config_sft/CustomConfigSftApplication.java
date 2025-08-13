package org.nk.custom_config_sft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"org.nk.custom_config_sft", "org.nk.csrf_token"})
@EntityScan("org.nk.csrf_token.model")
@EnableJpaRepositories("org.nk.csrf_token.repo")
public class CustomConfigSftApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomConfigSftApplication.class, args);
    }

}
