import java.util.List;

public record Order(List<Product> productList) {
    public int totalValue() {
        int sum = 0;
        for(Product product: productList) {
            sum += product.price();
        }
        return  sum;
    }
}
