package koreatech.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(value = "home")
    public String home(){
        return "home";
    }
}
