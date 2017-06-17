package com.suren.springmvc.dao;

import com.suren.springmvc.model.Employee;
import com.suren.springmvc.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Surendirababu on 6/17/2017.
 */
@Repository("userDao")
public class CustomUserDaoImpl extends  AbstractDao<Integer, User> implements CustomUserDao {

    @Override
    public User findByUserName(String userName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("userName", userName));

        return (User)criteria.uniqueResult();    }
}
