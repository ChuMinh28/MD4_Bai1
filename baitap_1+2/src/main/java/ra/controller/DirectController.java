package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("transController")
public class DirectController {
        public static String[] foods = {"Tree","Car","Hat"};
        public static String[] trans = {"Cây","Xe","Mũ"};
        @RequestMapping("trans")
        public String sayHello(){
            return "translate";
        }
        @GetMapping("translate")
        public String translate(Model model, @RequestParam String text){
            for (int i = 0; i < foods.length; i++) {
                if (text.equals(foods[i])){
                    String translate = trans[i];
                    model.addAttribute("textOut",translate);
                    break;
                }  else {
                    String notify = "Không có kết quả !";
                    model.addAttribute("textOut",notify);
                }
            }
            return "translate";
        }
    }
