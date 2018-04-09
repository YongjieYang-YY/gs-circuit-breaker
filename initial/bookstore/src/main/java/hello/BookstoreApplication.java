package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eyoeyag on 4/9/2018.
 */
@RestController
@SpringBootApplication
public class BookstoreApplication {

    @RequestMapping(value = "/recommended")
    public String readingList() {
        return "Spring in Action (manning), Cloud Native Java (O'Reilly), Learning Spring Boot (packt)";
    }

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }
}
