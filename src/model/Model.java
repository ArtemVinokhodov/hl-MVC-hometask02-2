package model;

import modelComponent.ModelComponent;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<ModelComponent> orders;

    public Model() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(ModelComponent order) {
        orders.add(order);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (ModelComponent order : orders) {
            totalCost += order.calculateOrderCost();
        }
        return totalCost;
    }
}
