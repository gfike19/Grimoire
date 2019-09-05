package com.gfike.Grimoire.controllers;

import com.gfike.Grimoire.models.Monster;
import com.gfike.Grimoire.models.Sighting;
import com.gfike.Grimoire.models.data.MonsterDao;
import com.gfike.Grimoire.models.data.SightingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Optional;

@Controller
public class MonsterController {

    @Autowired
    MonsterDao monsterDao;

    @Autowired
    SightingDao sightDao;

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
        String msg = newMons.getName() + " has been added to the Grimoire!";
        model.addAttribute("msg", msg);
        return "redirect:addMons";
    }

    @RequestMapping(value = "/addSighting",method = RequestMethod.GET)
    public String addSightingGet(Model model){
        model.addAttribute(new Sighting());
        ArrayList<Sighting> sights = (ArrayList<Sighting>) sightDao.findAll();
        model.addAttribute("sights", sights);
        return "addSighting";
    }

    @RequestMapping(value = "/addSighting",method = RequestMethod.POST)
    public String addSightingPost(@ModelAttribute @Valid Sighting newSighting,
                              Errors errors, Model model){
        if (errors.hasErrors()) {
            return "addSighting";
        }
        sightDao.save(newSighting);
        return "redirect:addSighting";
    }

    @RequestMapping(value="/error", method = RequestMethod.GET)
    public String error () {
        return "error";
    }
}
