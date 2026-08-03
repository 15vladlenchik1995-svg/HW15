public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА PRODUCT ===");

        // Создание товаров для тестов
        Product p1 = new Product(101, "Смартфон X", 50000, "Электроника");
        Product p2 = new Product(102, "Наушники Pro", 15000, "Аудио");
        Product p3 = new Product(101, "Старый смартфон", 45000, "Электроника");
        Product p4 = new Product(101, "Другой товар", 50000, "Бытовая техника");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("\nРезультаты сравнения товаров:");
        System.out.println("p1 equals p3 (одинаковый ID и категория): " + p1.equals(p3));
        System.out.println("p1 equals p4 (одинаковый ID, разная категория): " + p1.equals(p4));
        System.out.println("p1 equals p2 (разные ID): " + p1.equals(p2));

        System.out.println("\n=== ТЕСТИРОВАНИЕ КЛАССА ORDER ===");

        // Массивы товаров
        Product[] basketA = {p1, p2};
        Product[] basketB = {p1, p2}; // Идентичный состав и порядок
        Product[] basketC = {p2, p1}; // Те же товары, но другой порядок
        Product[] basketD = {p1, p3}; // p1 и p3 равны по логике equals, но это разные объекты
        Product[] basketE = {p1};     // Другой состав

        Order o1 = new Order("Иван Иванов", basketA);
        Order o2 = new Order("Иван Иванов", basketB); // Должен быть равен o1
        Order o3 = new Order("Иван Иванов", basketC); // Не равен (порядок важен)
        Order o4 = new Order("Петр Петров", basketA);  // Не равен (другой клиент)
        Order o5 = new Order("Иван Иванов", basketD); // Равен, так как p1.equals(p1) и p2.equals(p3) (по ID и категории)
        Order o6 = new Order("Иван Иванов", basketE);  // Не равен

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("\nРезультаты сравнения заказов:");
        System.out.println("o1 equals o2 (идентичные данные): " + o1.equals(o2)); // true
        System.out.println("o1 equals o3 (те же товары, разный порядок): " + o1.equals(o3)); // false (порядок важен по ТЗ)
        System.out.println("o1 equals o4 (тот же состав, другой клиент): " + o1.equals(o4)); // false
        System.out.println("o1 equals o5 (товары p2 и p3 логически равны): " + o1.equals(o5)); // true (так как equals у Product считает их равными)
        System.out.println("o1 equals o6 (разный состав корзины): " + o1.equals(o6)); // false
    }
}