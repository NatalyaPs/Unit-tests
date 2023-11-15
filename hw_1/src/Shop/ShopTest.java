package Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.assertj.core.api.Assertions;

public class ShopTest {
    public ShopTest() {
    }

    public static void main(String[] args) {
    //     Shop testShop = new Shop();
    //     testShop.setProducts(getShuffleListProducts(getTestListProducts()));
    //     Assertions.assertThat(testShop.getProducts()).hasSize(4);
    //     Assertions.assertThat(testShop.getMostExpensiveProduct().getTitle())
    //             .isEqualTo(((Product) getTestListProducts().get(3)).getTitle());
    //     Assertions.assertThat(((Product) testShop.getSortedListProducts().get(0)).getCost()).isEqualTo(100);
    //     Assertions.assertThat(((Product) testShop.getSortedListProducts().get(1)).getCost()).isEqualTo(150);
    //     Assertions.assertThat(((Product) testShop.getSortedListProducts().get(2)).getCost()).isEqualTo(299);
    //     Assertions.assertThat(((Product) testShop.getSortedListProducts().get(3)).getCost()).isEqualTo(500);
    }

    static List<Product> getTestListProducts() {
        Product productA = new Product();
        productA.setTitle("A");
        productA.setCost(100);
        Product productB = new Product();
        productB.setTitle("B");
        productB.setCost(150);
        Product productC = new Product();
        productC.setTitle("C");
        productC.setCost(299);
        Product productD = new Product();
        productD.setTitle("D");
        productD.setCost(500);
        List<Product> productList = new ArrayList<>();
        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);
        return productList;
    }

    static List<Product> getShuffleListProducts(List<Product> productList) {
        Collections.shuffle(productList);
        return productList;
    }
}
