package edu.ecommerce;

public class Order {
    private String orderId;
    private String customerName;
    private double total;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    // Inner Class
    public class OrderItem {
        private String productName;
        private double price;
        private int quantity;

        public OrderItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double getSubtotal() {
            return price * quantity;
        }

        public String getProductName() {
            return productName;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }
    }

    // hitung total semua item
    public double hitungTotal(OrderItem[] items) {
        total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    // tampilkan rincian
    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("-=- Rincian Pesanan -=-");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);

        for (OrderItem item : items) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Produk: " + item.getProductName());
            System.out.println("Harga: " + item.getPrice());
            System.out.println("Qty: " + item.getQuantity());
            System.out.println("Subtotal: " + item.getSubtotal());
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("TOTAL: " + total);
    }
}
