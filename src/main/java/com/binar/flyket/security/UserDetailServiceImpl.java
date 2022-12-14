package com.binar.flyket.security;

import com.binar.flyket.model.user.User;
import com.binar.flyket.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    private final UserRepository userRepo;

    public UserDetailServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User with email:  " + email + " not found."));
        return new UserDetailsImpl(user);
    }
}
