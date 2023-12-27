package com.suresh.dynamic.multitenant.tenant.repository;

import com.suresh.dynamic.multitenant.tenant.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
