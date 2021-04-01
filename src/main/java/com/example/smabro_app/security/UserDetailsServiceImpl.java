package com.example.smabro_app.security;

import com.example.smabro_app.infrastructure.mapper.UsersMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsersMapper usersMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if (username == null || "".equals(username)) {
//            throw new UsernameNotFoundException("Username is empty");
//        }

        UserAccount user = usersMapper.findByName(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found: " + username);
//        }

//        return new UserDetailsImpl(user,getAuthorities(user));

        Collection<GrantedAuthority> list = AuthorityUtils.createAuthorityList("ROLE_ADMIN","ROLE_USER");

        return new UserDetailsImpl(user, list);
    }

//    private Collection<GrantedAuthority> getAuthorities(UserAccount account){
//
//        if(account.isAdmin()){
//            return AuthorityUtils.createAuthorityList("ROLE_ADMIN","ROLE_USER");
//        }else{
//            return AuthorityUtils.createAuthorityList("ROLE_USER");
//        }
//
//    }

//    @Transactional
//    public void registerAdmin(String username, String password) {
//        UserAccount user = new UserAccount(username, encoder.encode(password),true);
//        repository.save(user);
//    }
//
//    @Transactional
//    public void registerUser(String username, String password) {
//        UserAccount user = new UserAccount(username, encoder.encode(password),false);
//        repository.save(user);
//    }

}