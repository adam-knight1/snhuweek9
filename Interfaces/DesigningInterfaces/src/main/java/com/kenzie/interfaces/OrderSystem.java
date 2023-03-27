package com.kenzie.interfaces;

public abstract class OrderSystem {
    public Menu[] menuList;
    public String paymentOption;
    public Order currentOrder;
    public Customer currentCustomer;


    public OrderSystem(Menu[] menuList, String paymentOption, Order currentOrder, Customer currentCustomer) {
        this.menuList = menuList;
        this.paymentOption = paymentOption;
        this.currentOrder = currentOrder;
        this.currentCustomer = currentCustomer;
    }

    public abstract void selectMenu(String menu);
    public abstract void makePayment(Order order);





}
