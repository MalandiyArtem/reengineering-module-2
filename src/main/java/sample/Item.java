package main.java.sample;

public class Item {
    private String title;
    private double price;
    private int quantity;
    private ShoppingCart.ItemType type;
    private double total;
    private int discount;

    public Item(String title, double price, int quantity, ShoppingCart.ItemType type) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ShoppingCart.ItemType getType() {
        return type;
    }

    public void setType(ShoppingCart.ItemType type) {
        this.type = type;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}