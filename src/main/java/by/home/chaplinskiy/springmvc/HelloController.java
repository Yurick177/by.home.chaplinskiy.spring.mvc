package by.home.chaplinskiy.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/yura")
    public String sayHello() {
        return "hello_yura";
    }
}
