import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Product> listProduct = new ArrayList<>();
        Product product1 = new Product(1000, "book", "fantasy", 19.90);
        Product product2 = new Product(1001, "book", "baby", 25.6);
        Product product3 = new Product(1002, "book", "fantasy", 101.20);
        Product product4 = new Product(1003, "book", "boys", 35.40);
        Product product5 = new Product(1004, "home", "piatti", 159.30);
        Product product6 = new Product(1005, "book", "baby", 59.70);
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
        listProduct.add(product6);

        System.out.println("La lista ha " + listProduct.size() + " elementi");

        Stream<Product> bookCategory = listProduct.stream().filter(element -> Objects.equals(element.name, "book") && element.price > 100);
        bookCategory.forEach(System.out::println);

//        ********************************* ESERCIZIO 2

        Costumer costumer1 = new Costumer(3000, "pippo", 1);
        Costumer costumer2 = new Costumer(3001, "carlo", 2);
        Costumer costumer3 = new Costumer(3002, "topolino", 3);
        Costumer costumer4 = new Costumer(3003, "mimmo", 2);

        List<Order> listOrder = new ArrayList<>();
        Order order1 = new Order(2000, "evaso", LocalDate.of(2023, Month.MAY, 3), LocalDate.of(2023, Month.MAY, 6), List.of(product1), costumer1);
        Order order2 = new Order(2001, "evaso", LocalDate.of(2021, Month.FEBRUARY, 15), LocalDate.of(2021, Month.FEBRUARY, 25), List.of(product2), costumer1);
        Order order3 = new Order(2002, "in consegna", LocalDate.now(), LocalDate.now(), List.of(product5), costumer1);

//        Stream<Order> babyOrder = listOrder.stream().filter(order -> List.of(product1))

//        ********************************* ESERCIZIO 3

        Stream<Product> boysCategory = listProduct.stream().filter(element -> Objects.equals(element.category, "boys"));
        boysCategory.forEach(product -> System.out.println("Prezzo intero: " + product.price + "€ - Nuovo prezzo scontato del 10%: " + (product.price - (product.price*0.1)) + "€"));
    }
}