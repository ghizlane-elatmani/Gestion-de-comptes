package io.javacode.VotreBanque.web;

import io.javacode.VotreBanque.entities.Compte;
import io.javacode.VotreBanque.service.IBanqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BanqueController {

    @Autowired
    private IBanqueMetier banqueMetier;

    @RequestMapping("/operations")
    public String index(){
        return "comptes";
    }

    @RequestMapping("/consultercompte")
    public String consulter(Model model, String codeCompte){
        Compte cp = banqueMetier.consulterCompte(codeCompte);
        model.addAttribute("compte", cp);
        return "comptes";
    }

}
