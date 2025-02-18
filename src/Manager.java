import java.util.ArrayList;

public class Manager {
    private ArrayList<Yogurt_Flavor> flavors;
    private ArrayList<Yogurt_Topings> topings;
    private int totalFlavor = 0;

    public Manager() {
        this.flavors = new ArrayList<>(); // Initialize the flavors list
        this.topings = new ArrayList<>(); // Initialize the toppings list
    }

    public void addFlavor(Yogurt_Flavor flavor) {
        if (flavor == null) return;

        for (Yogurt_Flavor f : flavors) {
            if (f.getFlavor().equals(flavor.getFlavor())) {
                System.out.println("Flavor Exists. You can adjust flavor price");
                return;
            }
        }
        flavors.add(flavor);
        totalFlavor++;
    }

    public void addToppings(Yogurt_Topings topping) {
        if (topping == null) return;

        for (Yogurt_Topings t : topings) {
            if (t.getToppings().equals(topping.getToppings())) {
                System.out.println("Toppings Exists. You can adjust Toppings price");
                return;
            }
        }
        topings.add(topping);
    }

    public void FlavorPriceAdjustment(String flavorName, double price) {
        for (Yogurt_Flavor f : flavors) {
            if (f.getFlavor().equals(flavorName)) {
                f.setPrice(price);
                System.out.println("Price Adjusted");
                return;
            }
        }
        System.out.println("Flavor not found");
    }

    public void ToppingPriceAdjustment(String toppingName, double price) {
        for (Yogurt_Topings t : topings) {
            if (t.getToppings().equals(toppingName)) {
                t.setPrice(price);
                System.out.println("Price Adjusted");
                return;
            }
        }
        System.out.println("Toppings not found");
    }

    public ArrayList<Yogurt_Flavor> getFlavors() {
        return flavors;
    }

    public ArrayList<Yogurt_Topings> getTopings() {
        return topings;
    }
}
