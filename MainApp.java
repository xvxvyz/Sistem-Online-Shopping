public class MainApp {
    public static void main(String[] args) {
        Electronics smartTV = new Electronics("Smart TV 4K", 799.99, 112233, 24);
        System.out.println("Informasi Produk Elektronik:");
        System.out.println(smartTV.getInfo());
        System.out.println();

        Clothing jeans = new Clothing("Skinny Jeans", 49.50, 445566, "32");
        System.out.println("Informasi Produk Pakaian:");
        System.out.println(jeans.getInfo());
    }
}
