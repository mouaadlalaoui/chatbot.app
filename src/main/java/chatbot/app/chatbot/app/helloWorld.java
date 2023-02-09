package chatbot.app.chatbot.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";}

}
