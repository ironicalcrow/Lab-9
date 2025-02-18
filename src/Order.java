import java.util.ArrayList;
import java.util.UUID;
public class Order {
    private UUID orderID;
    private ArrayList<OrderedItem> orderedItems;
    private boolean glass_jar;
    public Order() {
        orderID = UUID.randomUUID();
    }
    public UUID getOrderID() {
        return orderID;
    }
    public void addFlavor(Yogurt_Flavor flavor, int quantity) {
        OrderedItem or= new OrderedItem(flavor.getFlavor(), flavor.getPrice(),quantity);
        orderedItems.add(or);
    }
    public void addToping(Yogurt_Topings toping,int quantity) {
        OrderedItem or= new OrderedItem(toping.getToppings(), toping.getPrice(),quantity);
        orderedItems.add(or);
    }
    public boolean isGlass_jar() {
        return glass_jar;
    }
    public void setGlass_jar(boolean glass_jar) {
        this.glass_jar = glass_jar;
    }
    public ArrayList<OrderedItem> getOrderedItems() {
        return orderedItems;
    }
    public double SubTotal()
    {
        double total = 0;
        for(OrderedItem o:orderedItems)
        {
            total= total+ o.getItemPrice();
        }
        return total;
    }
    public double tax(double subTotal)
    {
        return subTotal*0.08;
    }


}
