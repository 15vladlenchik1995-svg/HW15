import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // --- Тестирование Product.equals ---
        Product p1 = new Product(1, "Laptop", 999.99, "Electronics");
        Product p2 = new Product(1, "Gaming Laptop", 1299.00, "Electronics"); // тот же id и категория
        Product p3 = new Product(2, "Headphones", 149.99, "Electronics");       // другой id
        Product p4 = new Product(1, "Old Laptop", 499.50, "Computers");         // тот же id, другая категория

        System.out.println("p1 equals p2? " + p1.equals(p2)); // true (id и category совпадают)
        System.out.println("p1 equals p3? " + p1.equals(p3)); // false (id разный)
        System.out.println("p1 equals p4? " + p1.equals(p4)); // false (категория разная)

        // --- Тестирование Order ---
        List<Product> basket1 = Arrays.asList(p1, p2);
        List<Product> basket2 = Arrays.asList(p1, p2);
        List<Product> basket3 = Arrays.asList(p1);

        Order o1 = new Order("Alice", basket1);
        Order o2 = new Order("Alice", basket2);
        Order o3 = new Order("Bob", basket1);
        Order o4 = new Order("Alice", basket3);

        System.out.println("\no1 equals o2? " + o1.equals(o2)); // true
        System.out.println("o1 equals o3? " + o1.equals(o3)); // false (другой customer)
        System.out.println("o1 equals o4? " + o1.equals(o4)); // false (разный basket)

        System.out.println("\n" + o1);
        System.out.println(o2);
    }
}