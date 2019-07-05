package com.infobelt.aadhaar.sample;

import org.springframework.boot.SpringApplication;
import com.github.vanroy.springboot.autoconfigure.data.jest.ElasticsearchJestAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebMvc
@SpringBootApplication(exclude = ElasticsearchJestAutoConfiguration.class)
@EnableJpaRepositories(basePackages = "com.infobelt.aadhaar.repository")
@ComponentScan("com.infobelt.*")
@EntityScan("com.infobelt.*")
public class SampleApplication{
    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}
