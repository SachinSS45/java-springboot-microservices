package com.sachin.springpracticaldemo.service;

import com.sachin.springpracticaldemo.dto.UserRegisterRequestDto;
import com.sachin.springpracticaldemo.dto.UserRegisterResponseDto;
import com.sachin.springpracticaldemo.entity.User;
import com.sachin.springpracticaldemo.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public AuthService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public UserRegisterResponseDto register(
            UserRegisterRequestDto registerRequestDto) {
        User user = new User();
        user.setUsername(registerRequestDto.getUsername());
        String encodedPassword = passwordEncoder.encode(registerRequestDto.getPassword());
        user.setPassword(encodedPassword);
        user.setEnabled(true);
        userRepository.save(user);

        UserRegisterResponseDto responseDto = new
                UserRegisterResponseDto();
        responseDto.setUsername(user.getUsername());
        responseDto.setMessage("User saved successfully");
        return responseDto;
    }

    public Boolean login(UserRegisterRequestDto registerRequestDto) {
        Optional<User> userOptional = userRepository.findByUsername(registerRequestDto.getUsername());
        User user = userOptional.get();

        String encodedPassword = user.getPassword();
        return passwordEncoder.matches(registerRequestDto.getPassword(),encodedPassword);
    }
}
