public class OrderedItem {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    public OrderedItem(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
    public String getItemName() {
        return itemName;
    }
    public double getItemPrice() {
        return itemPrice*itemQuantity;
    }
    public int getItemQuantity() {
        return itemQuantity;
    }

}
