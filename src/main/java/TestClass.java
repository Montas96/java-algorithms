import java.util.*;

public class TestClass {

    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("A", 21);
        products.put("B", 10);
        products.put("C", 30);
        products.put("D", 5);
        products.put("E", 8);
        products.put("F", 75);
        List<Integer> prices = new ArrayList<>(products.values());
        Collections.sort(prices);
        System.out.println(prices.get(0));
        System.out.println(products);
    }
}