package user.tokenauthorization.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @GetMapping("/")
    public String hello() {
        return "Iniciamos os Trabalhos";
    }
}
