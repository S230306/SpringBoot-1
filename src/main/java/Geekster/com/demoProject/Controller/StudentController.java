package Geekster.com.demoProject.Controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping(value="/Student")
    public static String StudentSaveInfo(@RequestBody String requestData){
        JSONObject obj = new JSONObject(requestData);
        System.out.print(requestData);
        System.out.println(obj.getString("name"));
        System.out.println(obj.getInt("age"));
        System.out.println(obj.getString("username"));
        return "Saved"+requestData;
    }
}
