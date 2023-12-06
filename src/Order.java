import java.time.LocalDate;
import java.util.List;

public class Order {
    public long id;
    public String status;
    public LocalDate orderDate;
    public LocalDate deliveryDate;
    public List<Product> products;
    public Costumer costumer;

    public Order(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Costumer costumer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.costumer = costumer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products='" + products + '\'' +
                ", costumer='" + costumer + '\'' +
                '}';
    }
}
