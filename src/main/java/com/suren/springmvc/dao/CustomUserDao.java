package com.suren.springmvc.dao;

import com.suren.springmvc.model.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by Surendirababu on 6/17/2017.
 */
public interface CustomUserDao {

   User findByUserName(String userName);
}
