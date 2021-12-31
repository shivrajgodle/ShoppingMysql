package com.shopping.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
	List<Cart> findAllByUid(String uid);

	void deleteByUid(String uid);

}
