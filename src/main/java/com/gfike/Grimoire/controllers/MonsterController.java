package com.gfike.Grimoire.controllers;

import com.gfike.Grimoire.models.Monster;
import com.gfike.Grimoire.models.MonsterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class MonsterController {

    @Autowired
    MonsterDao monsterDao;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/addMons",method = RequestMethod.GET)
    public String addMonsGet(Model model){
        model.addAttribute(new Monster());
        return "addMons";
    }

    @RequestMapping(value = "/addMons",method = RequestMethod.POST)
    public String addMonsPost(@ModelAttribute @Valid Monster newMons,
    Errors errors, Model model){
        if (errors.hasErrors()) {
            return "addMons";
        }
        monsterDao.save(newMons);
        return "redirect:addMons";
    }

    @RequestMapping(value="/error", method = RequestMethod.GET)
    public String error () {
        return "error";
    }
}
