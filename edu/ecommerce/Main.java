package edu.ecommerce;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD021", "Tarik");

        Order.OrderItem item1 = order.new OrderItem("Laptop", 7000000, 1);
        Order.OrderItem item2 = order.new OrderItem("Mouse", 200000, 2);
        Order.OrderItem item3 = order.new OrderItem("Keyboard", 500000, 1);

        Order.OrderItem[] items = {item1, item2, item3};

        // hitung total
        order.hitungTotal(items);

        // tampilkan
        order.tampilkanRincian(items);
    }
}
