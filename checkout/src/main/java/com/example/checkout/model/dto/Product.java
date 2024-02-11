package com.example.checkout.model.dto;

public class Product {

    private String id;
    private String type;
    private double price;
    private String instanceId;

    public Product(String id, String type, double price, String instanceId) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.instanceId = instanceId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
