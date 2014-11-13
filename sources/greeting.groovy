@Grab("org.springframework.boot:spring-boot-starter-thymeleaf:1.1.9.RELEASE")

@Grab("org.springframework.boot:spring-boot-starter-actuator:1.1.9.RELEASE")
@Grab("org.springframework.boot:spring-boot-starter-remote-shell:1.1.9.RELEASE")

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.stereotype.*
import org.springframework.web.bind.annotation.*

@Controller
public class HelloWorldControler {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello, World!";
    }
}

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(
        @RequestParam(value="name", required=false, defaultValue="World") String name,
        Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
