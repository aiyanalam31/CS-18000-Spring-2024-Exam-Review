public class Product
{
    private int productID;
    private double productPrice;
    private String productName;
    private int stockQuantity;

    public Product(int productID, String productName, double productPrice, int stockQuantity)
    {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stockQuantity = stockQuantity;
    }

    // Get Methods
    public int getProductID()
    {
        return productID;
    }

    public String getProductName()
    {
        return productName;
    }

    public double getProductPrice()
    {
        return productPrice;
    }

    public int getStockQuantity()
    {
        return stockQuantity;
    }

    // Set Methods

    public void setProductID(int productID)
    {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void updateStockQuantity(int quantity) {
        stockQuantity += quantity;
    }

    public void displayProductInfo()
    {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.printf("Product Price: $%.2f\n", productPrice);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println();
    }


}
