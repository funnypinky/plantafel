package org.funnypinky.planTableElectron.Controller;

import org.funnypinky.planTableElectron.Service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("modals")
public class ModalController {

    @Autowired
    EntityService entityService;

    @GetMapping("modal1")
    public String modal1(Model model) {
        model.addAttribute("entities",entityService.findAll());
        model.addAttribute("username",System.getenv("USER"));
        Map<String, String> env =  System.getenv();
        System.out.println(env);
        return "modal1";
    }

    @GetMapping("modal2")
    public String modal2(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "modal2";
    }
}
