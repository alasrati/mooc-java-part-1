public class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(String.format("%s, price %s, amount %s", name, price, amount));
    }
}
