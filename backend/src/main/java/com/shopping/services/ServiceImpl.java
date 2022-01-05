package com.shopping.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.Cart;
import com.shopping.entity.Order1;
import com.shopping.entity.Product;
import com.shopping.entity.UserLogin;
import com.shopping.entity.UserReg;
import com.shopping.repository.CartRepository;
import com.shopping.repository.MyOrderRepository;
import com.shopping.repository.ProductRepository;
import com.shopping.repository.UserRepository;

@Service
public class ServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private CartRepository cartRepo;

	@Autowired
	private MyOrderRepository morder;

//	@Autowired
//	private SequenceGenerator service;

	@Override
	public UserReg addUser(UserReg userReg) throws Exception {
		UserReg local = this.userRepo.findByUsername(userReg.getUsername());
		if (local != null) {
			System.out.println("User is already present");
			throw new Exception("user already present");
		} else {
			return this.userRepo.save(userReg);
		}
	}

	@Override
	public UserReg userLogin(UserLogin userLogin) throws Exception {
		UserReg local = userRepo.findByUsernameAndPassword(userLogin.getUsername(), userLogin.getPassword());
		if (local != null) {
			return local;
		} else {
			throw new Exception("Invalid Credentials");
		}
	}

	@Override
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public List<Product> allProduct() {
		List<Product> product = productRepo.findAll();
		return product;
	}

	@Override
	public Optional<Product> getProduct(int id) {
		Optional<Product> local = productRepo.findById(id);
		return local;
	}

	@Override
	public Cart addCart(Cart cart) {
		return cartRepo.save(cart);
	}

	@Override
	public List<Cart> getCartProduct(String uid) {
		return cartRepo.findAllByUid(uid);
	}

	@Override
	public void deleteFromCart(int id) {
		cartRepo.deleteById(id);
	}

	@Override
	public Order1 myOrder(Order1 order) {
		
		return morder.save(order);
	}

	@Override
	public void clearCart(String uid) {
		// TODO Auto-generated method stub
		cartRepo.deleteByUid(uid);
		
	}

	@Override
	public List<Order1> getOrderDetails(String uid) {
		// TODO Auto-generated method stub
		
		return morder.findAllByUid(uid);
	}

	//@Override
//	public void clearCart(int id) {
//		cartRepo.deleteById(id);
//	}
	
	
	public void deleteCart(){
		cartRepo.deleteAll();
		//return "done...!!";
	}
}





