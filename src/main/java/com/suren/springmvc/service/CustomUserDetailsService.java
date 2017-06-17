package com.suren.springmvc.service;

import com.suren.springmvc.dao.CustomUserDao;
import com.suren.springmvc.model.CustomUserDetails;
import com.suren.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

/**
 * Created by Surendirababu on 6/13/2017.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    CustomUserDao userDao;

    @Override
    @Transactional(value = "transactionManager")
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User user =userDao.findByUserName(username);
        if(user ==null)
        {
            new UsernameNotFoundException("usename not found");
        }
        return getCustomUserDetails(user);
    }

    private CustomUserDetails getCustomUserDetails(User user) {
       return  new CustomUserDetails(user);
    }



}
