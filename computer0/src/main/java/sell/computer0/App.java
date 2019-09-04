package sell.computer0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sell.computer0.App;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class App {
public static void main(String[] args) {
SpringApplication.run(App.class, args);
}
@RequestMapping("/")
String home() {
return "Hello World!";
}
}