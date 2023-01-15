package com.cloudint.project;

public class ConsolePrinter {

    public void printOrder(Order order) {
        if (order.getPayment()){
            switch (order.getDelivery()) {
                case "on site" -> {
                    System.out.println("------------------ On Site Orders --------------------");
                    printAllOrders(order);
                }
                case "take away" -> {
                    System.out.println("------------------ Take Away Orders --------------------");
                    printAllOrders(order);
                }
                case "" -> {
                    System.out.println("------------------ No Delivery Type Mentionned --------------------");
                    printAllOrders(order);
                }
            }
        }
        else{
            System.out.println("------------------ Rejected Orders --------------------");
            printAllOrders(order);
        }
    }

    public void printAllOrders(Order order) {
        System.out.println("Nom : " + order.getName());
        System.out.println("Numéro de commande : " + order.getCmd_number());
        System.out.println("Livraison : " + order.getDelivery());
        System.out.println("Plat : " + order.getMeal());
        System.out.println("Suppléments : " + order.getSupplement());
        System.out.println("Boisson : " + order.getDrink());
        System.out.println("Prix de la commande : " + order.getAmount());
        System.out.println("Payé ? : " + order.getPayment());
    }

    public void printOrderTest(Order order) {
        System.out.println(order.getPayment());
    }
}
