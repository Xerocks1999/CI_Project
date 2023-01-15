package com.cloudint.project;

import org.springframework.stereotype.Component;

@Component
public class TakeOrder {

    public Order takeOrder(Order order) {
        String[] meals = {"burger", "tacos", "pizza"};
        String[] supplements = {"fries", "chips", "none"};
        String[] drinks = {"Coca", "Fanta", "Oasis", "none"};
        Order settedOrder = new Order();
        settedOrder.setAmount(order.getAmount());
        settedOrder.setDelivery(order.getDelivery());
        settedOrder.setCmd_number(order.getCmd_number());
        settedOrder.setName(order.getName());
        settedOrder.setMeal(meals[(int) (Math.random() * 2)]);
        settedOrder.setSupplement(supplements[(int) (Math.random() * 2)]);
        settedOrder.setDrink(drinks[(int) (Math.random() * 3)]);
        settedOrder.setPayment(order.getPayment());
        return settedOrder;
    }
}
