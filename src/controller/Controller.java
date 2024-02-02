package controller;
import model.BaseModel;
import model.Customer;
import model.DeliveryModel;
import model.Product;
import utilities.Rounder;
import view.View;

public class Controller {

    private final String CURRENCY = "USD";
    View v1 = new view.View();


    public void getPayment() {
        String[] data = v1.getData();
        Customer customer = getCustomer(data);
        Product product = getProduct(data);
        String output;
        if ((data[data.length-1]).equals("1")) {
            BaseModel model = new BaseModel();
            String payment = Rounder.roundValue(model.calcPayment(product));
            output = "\nCustomer: " + customer.getName() + ", " + customer.getPhone() +
                    "\nPayment is " + CURRENCY + " " + payment;
            output += "\nThe customer should pick up the product by himself";
            v1.getOutput(output);
        } else {
            DeliveryModel model = new DeliveryModel();
            String payment = Rounder.roundValue(model.calcPayment(product));
            output = "\nCustomer: " + customer.getName() + ", " + customer.getPhone() +
                    "\nPayment is " + CURRENCY + " " + payment;
            output += "\nThe product will be delivered";
            v1.getOutput(output);
        }
    }

    private Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    private Product getProduct(String[] data) {
        return new Product(Integer.parseInt(data[2]),
                Double.parseDouble(data[3]));
    }
}
