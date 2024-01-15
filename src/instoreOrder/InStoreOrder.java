package instoreOrder;

import modelComponent.ModelComponent;

public class InStoreOrder implements ModelComponent {
    private int quantity;
    private double price;

    public InStoreOrder(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public double calculateOrderCost() {
        return quantity * price;
    }
}
