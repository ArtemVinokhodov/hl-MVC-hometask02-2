package viewModal;

import deliveryOrder.DeliveryOrder;
import instoreOrder.InStoreOrder;
import model.Model;
import modelComponent.ModelComponent;

import java.util.Scanner;

public class View {
    public void viewMethod() {
    Model model = new Model();
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity: ");
    int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
    double price = scanner.nextDouble();
        System.out.print("Delivery needed? (true/false): ");
    boolean deliveryNeeded = scanner.nextBoolean();

    ModelComponent order;
        if (deliveryNeeded) {
        order = new DeliveryOrder(quantity, price, true);
    } else {
        order = new InStoreOrder(quantity, price);
    }

        model.addOrder(order);

    double totalCost = model.calculateTotalCost();
        System.out.println("Total cost: $" + totalCost);
    }
}
