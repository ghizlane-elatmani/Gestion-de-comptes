package io.javacode.VotreBanque.web;

import io.javacode.VotreBanque.service.IBanqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BanqueController {

    @Autowired
    private IBanqueMetier banqueMetier;

    @RequestMapping("/operations")
    public String index(){
        return "comptes";
    }

}
