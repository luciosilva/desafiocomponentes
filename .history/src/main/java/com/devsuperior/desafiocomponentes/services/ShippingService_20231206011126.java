package com.devsuperior.desafiocomponentes.services;

import com.devsuperior.desafiocomponentes.entities.Order;

public class ShippingService {
    public Double shipment(Order order)
    {
        if(order.getBasic() < 100)
            return 20.0;
        if(order.getBasic() > 100 && order.getBasic() < 200)
            return 12.0;
        return 
    }
}
