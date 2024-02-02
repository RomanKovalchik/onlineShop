package model;

public class DeliveryModel implements Payable{

    public double calcPayment(Product product) {

        double originPrice = product.getQuota() * product.getPrice();
        double finalPrice = originPrice * 0.01 + originPrice;

        return finalPrice;
    }
}
