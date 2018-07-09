package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @description: TODO
 * @author: Katherine
 * @create: 2018/5/29 14:33
 */
@Controller
@RequestMapping(value = {"/", "homepage"})
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }
}
