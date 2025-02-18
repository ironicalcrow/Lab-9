import java.util.ArrayList;

public class Invoice {
    private Order order;
    Invoice(Order order) {
        this.order = order;
    }
    public void printText() {
        System.out.println("Yogurt Shop Invoice:- ");
        System.out.println("Order ID: " + order.getOrderID());
        ArrayList<OrderedItem> orderedItems = order.getOrderedItems();
        for (OrderedItem orderedItem : orderedItems) {
            System.out.println(orderedItem.getItemName()+" -"+ orderedItem.getItemQuantity()+ " Scoop : $"+ orderedItem.getItemPrice());
        }
        double subtotal= order.SubTotal();
        System.out.println("Subtotal: " + subtotal);
        double tax= order.tax(subtotal);
        System.out.println("Tax: " + tax);
        double total= subtotal + tax;
        System.out.println("Total: " + total);
    }
    public void printCSV()
    {
        System.out.println("Ingredients, Amount, Price");
        for(OrderedItem orderedItem : order.getOrderedItems())
        {
            System.out.println(orderedItem.getItemName()+", "+orderedItem.getItemQuantity()+", "+orderedItem.getItemPrice());
        }
        double subtotal= order.SubTotal();
        System.out.println("Subtotal: " + subtotal);
        double tax= order.tax(subtotal);
        System.out.println("Tax: " + tax);
        double total= subtotal + tax;
        System.out.println("Total: " + total);
    }
}
