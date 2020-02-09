package com.example.springsecurityjpa.services;

import com.example.springsecurityjpa.entity.User;
import com.example.springsecurityjpa.model.MyUserDetails;
import com.example.springsecurityjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findByUserName(userName);
        optionalUser.orElseThrow(() -> new UsernameNotFoundException("not found: " + userName));
        return optionalUser.map(MyUserDetails::new).get();
    }
}
