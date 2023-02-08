import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> listProduct = new ArrayList<>();

    public void addProduct(Product product) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (product.getId() == listProduct.get(i).getId()) {
                System.out.println("Продукт уже существует.");
                return;
            }
        }
        listProduct.add(product);
        System.out.println("Товар добавлен.");
    }

    public ArrayList<Product> allProduct() {
        return listProduct;
    }

    public void deleteProduct(Product product) {
        listProduct.remove(product);
    }
    public void putProduct(Product product){
        for (int i=0; i<listProduct.size();i++){
            if (product.getId()==listProduct.get(i).getId()){
                listProduct.set(i,product);
                System.out.println("Товар отредактирован.");
                return;
            }
        }

    }

}
