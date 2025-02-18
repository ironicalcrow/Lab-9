import java.util.ArrayList;

public class Manager {
    private ArrayList<Yogurt_Flavor> flavors;
    private ArrayList<Yogurt_Topings> topings;
    public Manager() {}
    public void addFlavor(Yogurt_Flavor flavor) {
        int checker=0;
        for(Yogurt_Flavor f: flavors) {
            if(f.getFlavor().equals(flavor.getFlavor())) {
                checker++;
            }
        }
        if(checker>0)
        {
            System.out.println("Flavor Exists. You can adjust flavor price");
        }
        else
        {
            flavors.add(flavor);
        }
    }
    public void addToppings(Yogurt_Topings toping) {
        int checker=0;
        for(Yogurt_Topings t: topings) {
            if(t.getToppings().equals(toping.getToppings())) {
                checker++;
            }
        }
        if(checker>0)
        {
            System.out.println("Toppings Exists. You can adjust Toppings price");
        }
        else
        {
            topings.add(toping);
        }
    }
    public void FlavorPriceAdjustment(Yogurt_Flavor flavor, double price) {
        int checker=0;
        for(Yogurt_Flavor f: flavors) {
            if(f.getFlavor().equals(flavor.getFlavor())) {
                f.setPrice(price);
                checker++;
            }
        }
        if(checker>0)
        {
            System.out.println("Price Adjusted");
        }
        else
        {
            System.out.println("Flavor not found");
        }
    }
    public void TopingPriceAdjustment(Yogurt_Topings toping, double price) {
        int checker=0;
        for(Yogurt_Topings t: topings) {
            if(t.getToppings().equals(toping.getToppings())) {
                t.setPrice(price);
                checker++;
            }
        }
        if (checker>0)
        {
            System.out.println("Price Adjusted");
        }
        else
        {
            System.out.println("Topings not found");
        }
    }

}
