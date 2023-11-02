package com.example.demo5.RestControllers;

import com.example.demo5.Dao.Entity.User;
import com.example.demo5.Services.IUserService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NoArgsConstructor
@RestController
@RequestMapping("user")

public class UserRestController {
    IUserService iUserService;
    @GetMapping("findAll")
    List<User> findAll(){
        return iUserService.findAll();
    }
    @PostMapping("User")
    User addUser(@RequestBody User b){
        return iUserService.addUser(b);
    }
    @PutMapping("editUser")
    User editUser(@RequestBody User c){
        return iUserService.editUser(c);
    }
    @GetMapping("findById")
    User findById(@RequestParam long d){
        return iUserService.findById(d);
    }
    @DeleteMapping("deleteById")
    public void deleteById(@RequestParam long e){
        iUserService.deleteById(e);
    }
    @DeleteMapping("delete")
    public void delete(@RequestParam User f){
        iUserService.delete(f);
    }
    @PostMapping("addUser")
    List<User> addUser(@RequestBody List<User> Users) {
        return iUserService.addUser(Users);
    }

}
