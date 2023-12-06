package com.devsuperior.desafiocomponentes.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafiocomponentes.entities.Order;

@Service
public class OrderService {

    private ShippingService shippingService;
    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order)
    {
        return (order.getBasic() - order.getDiscount()) + this.shippingService.shipment(order);
    }
}
