package com.example.openlecture_backend.Authentication;

import com.example.openlecture_backend.DTO.LoginRequestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDTO loginRequest){
        return "Login Success";
    }
}
