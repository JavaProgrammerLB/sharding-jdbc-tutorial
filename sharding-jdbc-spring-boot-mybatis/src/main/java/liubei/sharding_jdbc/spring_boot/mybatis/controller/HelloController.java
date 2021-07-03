package liubei.sharding_jdbc.spring_boot.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String sayHi(){
        return "Hello, World!";
    }

}
