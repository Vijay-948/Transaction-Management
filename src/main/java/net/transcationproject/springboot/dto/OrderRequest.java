package net.transcationproject.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import net.transcationproject.springboot.entity.Order;
import net.transcationproject.springboot.entity.Payment;


@Getter
@Setter
public class OrderRequest {

    private Order order;
    private Payment payment;
}
