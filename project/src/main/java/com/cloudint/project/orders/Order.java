package com.cloudint.project.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

    private String name;
    private int cmd_number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCmd_number() {
        return cmd_number;
    }

    public void setCmd_number(int cmd_number) {
        this.cmd_number = cmd_number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public Order(@JsonProperty("delivery") String delivery) {
        this.delivery = delivery;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    private int amount;
    private String delivery;
    private String meal;
    private String supplement;
    private String drink;
}
