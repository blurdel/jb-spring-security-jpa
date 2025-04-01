package com.blurdel.ssc.config;

import com.blurdel.ssc.model.User;
import com.blurdel.ssc.repositories.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@Data
@RequiredArgsConstructor
@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepo.findByUsername(username);

        user.orElseThrow(() -> new UsernameNotFoundException("User Not Found: " + username));

        Set<GrantedAuthority> authorities = user.get().getRoles().stream()
                .map((roles) -> new SimpleGrantedAuthority(roles.getName()))
                .collect(Collectors.toSet());

        log.debug("##### username={}, authorities={}", username, authorities.stream().toList());

        return new org.springframework.security.core.userdetails.User(
                username,
                user.get().getPassword(),
                authorities
        );
    }
}
