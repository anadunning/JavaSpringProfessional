package com.anadunning.challenge_components_dependency_injection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anadunning.challenge_components_dependency_injection.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		
		return order.getBasic() - (order.getBasic() * order.getDiscount() / 100) + shippingService.shipment(order);
	}
}
