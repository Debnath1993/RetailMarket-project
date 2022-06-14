package com.niit.backend.dao;

import java.util.List;

import com.niit.Backend.DolphinBackend.dto.Cart;
import com.niit.Backend.DolphinBackend.dto.CartLine;
import com.niit.Backend.DolphinBackend.dto.OrderDetail;

public interface CartLineDAO 
{
	public List<CartLine> list(int cartId);
	public CartLine get(int id);	
	public boolean add(CartLine cartLine);
	public boolean update(CartLine cartLine);
	public boolean remove(CartLine cartLine);
	
	// fetch the CartLine based on cartId and productId
	public CartLine getByCartAndProduct(int cartId, int productId);		
		
	// updating the cart
	boolean updateCart(Cart cart);
	
	// list of available cartLine
	public List<CartLine> listAvailable(int cartId);
	
	boolean addOrderDetail(OrderDetail orderDetail);
	
}
