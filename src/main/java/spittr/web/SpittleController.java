package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.domain.Spittle;
import spittr.data.SpittleRepository;

import java.util.List;

/**
 * @description: TODO
 * @author: Katherine
 * @create: 2018/6/27 15:12
 */
@Controller
@RequestMapping({"/spittles", "/spittle"})
public class SpittleController {

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    public SpittleController() {
    }

    //    @RequestMapping(method = RequestMethod.GET)
//    public String spittles(Model model) {
//        model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//        return "spittles";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(
            @RequestParam(value = "max", defaultValue = "100000000") long max,
            @RequestParam(value = "count", defaultValue = "20") int count
    ) {
        return spittleRepository.findSpittles(max, count);
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(
            @PathVariable("spittleId") long spittleId,
            Model model
    ) {
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }
}
