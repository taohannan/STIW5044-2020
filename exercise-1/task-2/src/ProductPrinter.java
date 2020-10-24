import java.util.ArrayList;
import java.util.List;

public class ProductPrinter {

    public static void main(String[] args) {

        Product product1 = new Product("Toaster", 29.95);
        Product product2 = new Product("Vacuum", 300.95);

        List<Product> listProducts = new ArrayList<>();
        listProducts.add(product1);
        listProducts.add(product2);

        listProducts.forEach(s -> {
            System.out.println("Product Name: " + s.getName());
            System.out.println("Product Price: " + s.getPrice());
        });

        System.out.println("\t ");
        System.out.println("========================= ");
        System.out.println("Reduce the price for RM5 ");


        listProducts.stream().forEach(s->{
            System.out.println("Product Name: " + s.getName());
            Double newPrice = s.getPrice()-5;
            System.out.println("Product New Price: " + newPrice);
        });
        System.out.println("========================= ");

    }
}
