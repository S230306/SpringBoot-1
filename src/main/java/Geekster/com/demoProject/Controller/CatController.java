package Geekster.com.demoProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {
    @GetMapping(value="/cat")
    public static String getinfoCat(){
        return "this is imformation about the cat";
    }
}
