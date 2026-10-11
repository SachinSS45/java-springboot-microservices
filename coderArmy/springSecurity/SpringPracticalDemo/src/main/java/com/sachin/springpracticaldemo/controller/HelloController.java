package com.sachin.springpracticaldemo.controller;

import com.sachin.springpracticaldemo.dto.UserRegisterRequestDto;
import com.sachin.springpracticaldemo.dto.UserRegisterResponseDto;
import com.sachin.springpracticaldemo.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class HelloController {

    private final AuthService authService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Sachin";
    }

    @PostMapping("/register")
    public ResponseEntity<UserRegisterResponseDto> register(
            @RequestBody  UserRegisterRequestDto registerRequestDto){
            UserRegisterResponseDto responseDto = authService.register(registerRequestDto);
            return ResponseEntity.ok(responseDto);
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(
            @RequestBody  UserRegisterRequestDto registerRequestDto){
        Boolean loggedin = authService.login(registerRequestDto);
        return ResponseEntity.ok(loggedin);
    }

    @GetMapping("/token")
    public CsrfToken getToken(CsrfToken token){
        return token;
    }
}
