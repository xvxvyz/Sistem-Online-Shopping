class Electronics extends Product {
    int warrantyMonths;

    public Electronics(String name, double price, int productId, int warrantyMonths) {
        super(name, price, productId);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Warranty: " + warrantyMonths + " months";
    }
}
