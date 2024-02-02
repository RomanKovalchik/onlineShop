package model;

public class Product {
    private final int quota;
    private final double price;



    public Product(int quota, double price) {
        this.quota = quota;
        this.price = price;
    }

    public int getQuota() {
        return quota;
    }

    public double getPrice() {
        return price;
    }

}
