package Shop;

public class Product {
    private Integer cost;
    private String title;

    public Product() {
    }

    public Integer getCost() {
        return this.cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int compareTo(Product product) {
        return this.getCost().compareTo(product.getCost());
    }
}
