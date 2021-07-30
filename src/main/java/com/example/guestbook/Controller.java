package com.example.guestbook;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {

    ArrayList<Guest> guests = new ArrayList<>();

    public static long idCounter = 0;

    @RequestMapping("/home")
    public String homePage(){
        return "home";
    }

    @GetMapping("/newGuest")
    public String newPost(Model model){
        Guest newGuest = new Guest();
        idSetter(newGuest);
        model.addAttribute("guest", newGuest);
        return "newGuest";
    }

    @PostMapping("/confirmPost")
    public String confirmPost(@Valid Guest guest, BindingResult result){
        if(result.hasErrors()){
            return "newGuest";
        }
        guests.add(guest);
        return "confirmPost";
    }

    @RequestMapping("/posts")
    public String posts(Model model){
        model.addAttribute("guests", guests);
        return "posts";
    }

    @RequestMapping("/detail/{id}")
    public String detailItem(@PathVariable("id") long id, Model model){
        for (Guest guest: guests){
            if(id == guest.getId()){
                model.addAttribute("guest", guest);
                break;
            }
        }
        return "confirmPost";
    }

    private void idSetter(Guest guest){
        idCounter += 1;
        guest.setId(idCounter);
    }
}
