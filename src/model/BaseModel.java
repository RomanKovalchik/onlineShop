package model;

import view.View;

public class BaseModel implements Payable{

    public double calcPayment(Product product) {

        return product.getQuota() * product.getPrice();
    }
}
