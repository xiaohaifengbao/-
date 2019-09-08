package com.city.demo.dao;

import com.city.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yuminghao
 * @Date 2019/9/8 14:44
 * @About
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(long id);
    Long deleteById(Long id);
}
