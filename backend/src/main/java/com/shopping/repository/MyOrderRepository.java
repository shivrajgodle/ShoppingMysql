package com.shopping.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Cart;
import com.shopping.entity.Order1;


@Repository
public interface MyOrderRepository extends JpaRepository<Order1, Integer> {

	List<Order1> findAllByUid(String uid);
	
	

	void save(Cart cart);

}
