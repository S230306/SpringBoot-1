package Geekster.com.demoProject.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping(value="/Student")
    public static String StudentgetInfo(){
        return "this information about student";
    }
    @DeleteMapping(value="/Student")
    public static String StudentDeletInfo(){
        return "this information about delete  student";
    }
    @PutMapping(value="/Student")
    public static String StudentputInfo(){
        return "this information about put student";
    }
}
