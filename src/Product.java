
import java.util.Arrays;
import java.util.Objects;

// Класс товара
class Product {
    private int id;
    private String name;
    private int price;
    private String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Геттеры
    public int getId() { return id; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "Товар[артикул=" + id + ", название=" + name + ", цена=" + price + ", категория=" + category + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;


        return this.id == product.id && Objects.equals(this.category, product.category);
    }
}
