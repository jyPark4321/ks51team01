package ks51team01.user.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("userCommonController")
public class CommonController {

    @GetMapping("/")
    public String userMainPage(Model model) {
        model.addAttribute("title", "Pet All life");
        return "user/main";
    }
}
