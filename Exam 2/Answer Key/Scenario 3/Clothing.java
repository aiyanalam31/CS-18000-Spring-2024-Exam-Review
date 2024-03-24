public class Clothing extends Item implements Discountable {
    private String size;
    private String color;

    public Clothing(String name, double price, String size, String color) throws InvalidPriceException {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public String toString() {
        return color + " " + size + " " + super.getName() + " - $" + super.getPrice();
    }


    public double applyDiscount() {
        // Apply 10% discount on clothing items
        return super.getPrice() * 0.9;
    }
}
