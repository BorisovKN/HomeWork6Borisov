import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product a = new Product(1, "Apple", 5446.84);
        Product b = new Product(3, "Xiaomi", 2468.84);
        Product c = new Product(2, "Google", 3484.84);
        shop.addProduct(a);
        shop.addProduct(b);
        shop.addProduct(b);
        shop.addProduct(c);
        ArrayList<Product> newListProduct = new ArrayList<>(shop.allProduct());
        Collections.sort(newListProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                }
                return 0;
            }
        });
        for (Product p : newListProduct) {
            System.out.println("ID: " + p.getId() + " Товар: " + p.getName() + " Цена: " + p.getPrice());
        }
        shop.deleteProduct(b);
        ArrayList<Product> newNewListProduct = new ArrayList<>(shop.allProduct());
        for (int i = newNewListProduct.size() - 1; i >= 0; i--) {
            System.out.println("ID: " + newNewListProduct.get(i).getId() + " Товар: "
                    + newNewListProduct.get(i).getName()
                    + " Цена: " + newNewListProduct.get(i).getPrice());
        }
        a.setName("Orange");
        shop.putProduct(a);
        for (int i = newNewListProduct.size() - 1; i >= 0; i--) {
            System.out.println("ID: " + newNewListProduct.get(i).getId() + " Товар: "
                    + newNewListProduct.get(i).getName()
                    + " Цена: " + newNewListProduct.get(i).getPrice());
        }
    }
}
