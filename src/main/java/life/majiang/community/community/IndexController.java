package life.majiang.community.community;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by gy403 on 2020/4/23
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){return "index";}
}
