package chain_of_responsibility.order_processing;


public class Order {

    private String itemName;
    double price;

    public Order(String name, double price) {
        this.itemName = name;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
