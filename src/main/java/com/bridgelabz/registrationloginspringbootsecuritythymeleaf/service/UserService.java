package com.bridgelabz.registrationloginspringbootsecuritythymeleaf.service;


import com.bridgelabz.registrationloginspringbootsecuritythymeleaf.model.User;
import com.bridgelabz.registrationloginspringbootsecuritythymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}