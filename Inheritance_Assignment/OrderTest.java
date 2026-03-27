package Inheritance_Assignment;

class Order {
    int orderId;
    String orderDate;

    Order(int id, String date) {
        this.orderId = id;
        this.orderDate = date;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int id, String date, String tracking) {
        super(id, date);
        this.trackingNumber = tracking;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped, Tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

public class OrderTest {
    public static void main(String[] args) {
        Order o = new DeliveredOrder(101, "2023-05-10", "TRK123", "2023-05-15");
        System.out.println(o.getOrderStatus());
    }
}
