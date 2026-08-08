public class Main {
    public static void main(String[] args) {
        System.out.println("--- Тестирование класса Product ---");


        Product p1 = new Product(101, "Ноутбук", 50000, "Электроника");
        Product p2 = new Product(102, "Мышь", 1500, "Аксессуары");
        Product p3 = new Product(101, "Старый ноутбук", 30000, "Электроника");
        Product p4 = new Product(101, "Ноутбук", 50000, null);
        Product p5 = new Product(101, null, 50000, "Электроника");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);


        System.out.println("\nСравнение товаров:");
        System.out.println("p1 и p2 (разные ID): " + p1.equals(p2));
        System.out.println("p1 и p3 (совпадают ID и категория): " + p1.equals(p3));
        System.out.println("p1 и p4 (null категория): " + p1.equals(p4));
        System.out.println("p1 и p5 (null имя): " + p1.equals(p5));

        System.out.println("\n--- Тестирование класса Order ---");


        Product[] basketA = {p1, p2};
        Product[] basketB = {p1, p2};
        Product[] basketC = {p2, p1};
        Product[] basketD = {p3, p2};
        Product[] basketE = {p1};
        Product[] basketF = {p1, null};
        Product[] basketG = {p1, null};

        Order o1 = new Order("Иван", basketA);
        Order o2 = new Order("Иван", basketB);
        Order o3 = new Order("Иван", basketC);
        Order o4 = new Order("Иван", basketD);
        Order o5 = new Order("Петр", basketE);
        Order o6 = new Order("Иван", basketF);
        Order o7 = new Order("Иван", basketG);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);

        System.out.println("\nСравнение заказов:");
        System.out.println("o1 и o2 (идентичные массивы): " + o1.equals(o2));
        System.out.println("o1 и o3 (разный порядок): " + o1.equals(o3));
        System.out.println("o1 и o4 (p3 вместо p1): " + o1.equals(o4));
        System.out.println("o1 и o5 (другой клиент и длина): " + o1.equals(o5));
        System.out.println("o6 и o7 (массивы с null): " + o6.equals(o7));
    }
}