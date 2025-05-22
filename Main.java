class Clothing extends Product {
    String size;

    public Clothing(String name, double price, int productId, String size) {
        super(name, price, productId);
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Size: " + size;
    }
}

public class Main {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 1200.50, 54321, 12);
        System.out.println(laptop.getInfo());

        Clothing tShirt = new Clothing("T-Shirt", 19.99, 98765, "M");
        System.out.println(tShirt.getInfo());
    }
}
