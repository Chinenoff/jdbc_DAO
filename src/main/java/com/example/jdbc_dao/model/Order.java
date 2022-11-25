package com.example.jdbc_dao.model;

import java.util.Date;

public class Order {

    private int id;
    private Date date;
    private int customer_id;
    private String product_name;
    private String amount;

    public Order(int id, Date date, int customer_id, String product_name, String amount) {
        this.id = id;
        this.date = date;
        this.customer_id = customer_id;
        this.product_name = product_name;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}