package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.domain.Spitter;
import spittr.data.SpitterRepository;

@Controller
@RequestMapping(value = "/spitter")
public class SpitterController {
    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    public SpitterController() {
    }

    //展现表单，允许用户注册
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(Spitter spitter) {
        System.out.println(spitter);
        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }
}
