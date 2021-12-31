package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.shopping.entity.UserReg;

@Repository
public interface UserRepository extends JpaRepository<UserReg, Integer>{

	public UserReg findByUsername(String username);

	public UserReg findByUsernameAndPassword(String username,String password);

}
