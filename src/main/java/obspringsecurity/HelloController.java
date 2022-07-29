package obspringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hi")
    public String hola(){
        return "Helloo People!";
    }
    @GetMapping("/hola")
    public String holao(){
        return "Helloo People desde hola2!";
    }
}
