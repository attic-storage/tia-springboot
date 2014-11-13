import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.stereotype.*
import org.springframework.web.bind.annotation.*

@Controller
public class HelloWorldControler {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
