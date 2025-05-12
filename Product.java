public class Product {
    private String name;
    private double price;
    private int productId;

    public Product(String name, double price, int productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getInfo() {
        return name + " - " + String.format("%.2f", price) + " Euro";
    }

    public static void main(String[] args) {
        Product shirt = new Product("Shirt", 25.80, 12345);
        System.out.println(shirt.getInfo());

        shirt.setPrice(29.99);
        System.out.println(shirt.getInfo());
    }
}
