package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("changeMoney")
public class ConvertController {

    @GetMapping("trans")
    public String transUsd(Model mode, @RequestParam(defaultValue = "0") Integer usd) {
        if (usd != 0) {
            Integer trans = usd * 23000;
            mode.addAttribute("vnd", trans);
        }
        return "convert";
    }
}

