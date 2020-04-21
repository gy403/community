package life.majiang.community.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class CommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

    /**
     * Created by gy403 on 2020/4/20
     */
    @Controller
    public static class HelloController {
        @GetMapping("/hello")
        public String hello(@RequestParam(name = "name") String name, Model model) {
            model.addAttribute("name", name);
            return "hello";

        }
    }
}
