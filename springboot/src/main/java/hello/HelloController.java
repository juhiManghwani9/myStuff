package hello;

import model.ProductDetailsBean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        ProductDetailsBean p1 = new ProductDetailsBean();
        return "Greetings from Spring Boot!";
    }

}
