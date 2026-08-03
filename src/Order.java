import java.util.List;

public class Order {
    private String customer;
    private List<Product> basket;

    public Order(String customer, List<Product> basket) {
        this.customer = customer;
        this.basket = basket;
    }

    public String getCustomer() { return customer; }
    public List<Product> getBasket() { return basket; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order{customer='").append(customer).append("', basket=[");
        for (int i = 0; i < basket.size(); i++) {
            sb.append(basket.get(i));
            if (i < basket.size() - 1) sb.append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;

        if (!this.customer.equals(other.customer)) return false;

        if (this.basket.size() != other.basket.size()) return false;


        for (int i = 0; i < this.basket.size(); i++) {
            if (!this.basket.get(i).equals(other.basket.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = customer.hashCode();
        result = 31 * result + basket.hashCode(); // hashCode списка учитывает порядок и hashCode элементов
        return result;
    }
}
