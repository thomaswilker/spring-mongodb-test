package mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan
@EnableAutoConfiguration
@EnableMongoRepositories
@EnableSpringDataWebSupport
public class SpringMongodbTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongodbTestApplication.class, args);
    }
}
