package com.database.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.database.demo.Entity.UserType;
import com.database.demo.Repo.Repo;
@Controller
public class mainController {
    @Autowired
    Repo repo;
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/register")
    public String addUsers(@RequestParam String name , @RequestParam String email, @RequestParam String phone, @RequestParam String pass, @RequestParam String rpass){

        UserType newUser  = new UserType();

        newUser.setFname(name);
        newUser.setEmail(email);            
        newUser.setNum(Integer.parseInt(phone));
        newUser.setPass(pass);
        newUser.setRpass(rpass);

        repo.save(newUser);

        return "index";
    }
}
