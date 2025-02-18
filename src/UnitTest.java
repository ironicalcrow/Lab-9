import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.UUID;

public class UnitTest {

    @Test
    void test() {
        Manager manager = new Manager();
        Yogurt_Flavor chocolateFudge = new Yogurt_Flavor("Chocolate Fudge", 3.00);
        manager.addFlavor(chocolateFudge);
        assertEquals(1, manager.getFlavors().size());
    }

    @Test
    void test1() {
        Manager manager = new Manager();
        Yogurt_Flavor chocolateFudge = new Yogurt_Flavor("Chocolate Fudge", 3.00);
        manager.addFlavor(chocolateFudge);
        manager.addFlavor(chocolateFudge);
        assertEquals(1, manager.getFlavors().size());
    }

    @Test
    void test2() {
        Manager manager = new Manager();
        Yogurt_Topings sprinkles = new Yogurt_Topings("Sprinkles", 0.30);
        manager.addToppings(sprinkles);
        assertEquals(1, manager.getTopings().size());
    }

    @Test
    void test3() {
        Manager manager = new Manager();
        Yogurt_Topings sprinkles = new Yogurt_Topings("Sprinkles", 0.30);
        manager.addToppings(sprinkles);
        manager.addToppings(sprinkles);
        assertEquals(1, manager.getTopings().size());
    }

    @Test
    void test4() {
        Manager manager = new Manager();
        Yogurt_Flavor pistachioDelight = new Yogurt_Flavor("Pistachio Delight", 3.25);
        manager.addFlavor(pistachioDelight);
        manager.FlavorPriceAdjustment("Pistachio Delight", 3.50);
        assertEquals(3.50, manager.getFlavors().get(0).getPrice());
    }

    @Test
    void test5() {
        Manager manager = new Manager();
        Yogurt_Topings mixedNuts = new Yogurt_Topings("Mixed chopped nuts", 0.80);
        manager.addToppings(mixedNuts);
        manager.ToppingPriceAdjustment("Mixed chopped nuts", 1.00);
        assertEquals(1.00, manager.getTopings().get(0).getPrice());
    }

    @Test
    void test6() {
        Order order = new Order();
        Yogurt_Flavor chocolateFudge = new Yogurt_Flavor("Chocolate Fudge", 3.00);
        order.addFlavor(chocolateFudge, 2);
        assertEquals(1, order.getOrderedItems().size());
        assertEquals(6.00, order.getOrderedItems().get(0).getItemPrice());
    }

    @Test
    void test7() {
        Order order = new Order();
        Yogurt_Topings sprinkles = new Yogurt_Topings("Sprinkles", 0.30);
        order.addToping(sprinkles, 1);
        assertEquals(1, order.getOrderedItems().size());
        assertEquals(0.30, order.getOrderedItems().get(0).getItemPrice());
    }

    @Test
    void test8() {
        Order order = new Order();
        Yogurt_Flavor chocolateFudge = new Yogurt_Flavor("Chocolate Fudge", 3.00);
        Yogurt_Topings sprinkles = new Yogurt_Topings("Sprinkles", 0.30);
        order.addFlavor(chocolateFudge, 2);
        order.addToping(sprinkles, 1);
        assertEquals(6.30, order.SubTotal());
    }

    @Test
    void test9() {
        Order order = new Order();
        Yogurt_Flavor pistachioDelight = new Yogurt_Flavor("Pistachio Delight", 3.25);
        order.addFlavor(pistachioDelight, 2);
        order.setGlass_jar(true);
        double subtotal = order.SubTotal() + 5.00;
        double tax = order.tax(subtotal);
        assertEquals(0.92, tax);
        assertEquals(12.42, subtotal + tax);
    }
}
