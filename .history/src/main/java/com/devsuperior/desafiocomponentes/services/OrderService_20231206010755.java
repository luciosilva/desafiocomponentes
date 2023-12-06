package com.devsuperior.desafiocomponentes.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafiocomponentes.entities.Order;

@Service
public class OrderService {

    public OrderService(ShippingService shippingService) {
        
    }

    public Double total(Order order)
    {
        return order.getBasic() - order.getDiscount() -;
    }
}
