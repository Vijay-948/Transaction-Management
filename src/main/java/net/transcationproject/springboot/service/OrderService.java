package net.transcationproject.springboot.service;

import net.transcationproject.springboot.dto.OrderRequest;
import net.transcationproject.springboot.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
