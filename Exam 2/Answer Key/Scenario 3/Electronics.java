public class Electronics extends Item {
    private String manufacturer;

    public Electronics(String name, double price, String manufacturer) throws InvalidPriceException {
        super(name, price);
        this.manufacturer = manufacturer;
    }


    public String toString() {
        return super.getName() + " by " + manufacturer + " - $" + super.getPrice();
    }
}