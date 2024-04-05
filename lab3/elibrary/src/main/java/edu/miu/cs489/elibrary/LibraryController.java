package edu.miu.cs489.elibrary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryController {
    @GetMapping("/")
    public String homepage(){
        return "home/index";
    }
}
