package deliveryOrder;

import modelComponent.ModelComponent;

public class DeliveryOrder implements ModelComponent {
    private int quantity;
    private double price;
    private boolean deliveryNeeded;

    public DeliveryOrder(int quantity, double price, boolean deliveryNeeded) {
        this.quantity = quantity;
        this.price = price;
        this.deliveryNeeded = deliveryNeeded;
    }

    @Override
    public double calculateOrderCost() {
        double cost = quantity * price;
        if (deliveryNeeded) {
            cost += cost * 0.1;
        }
        return cost;
    }
}
