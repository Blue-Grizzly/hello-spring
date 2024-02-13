package bluegrizzly.example.jpaintro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaIntroApplication {

    public static final Logger logger = LoggerFactory.getLogger(JpaIntroApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(JpaIntroApplication.class, args);
    }

}
