public class Item {
    protected String name;
    protected double price;

    public Item(String name, double price) throws InvalidPriceException {
        if (price <= 0) 
        {
            throw new InvalidPriceException("Price cannot be negative or zero.");
            
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}