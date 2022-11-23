import java.util.Scanner;

public class Product {

    private Scanner in = new Scanner(System.in);
    private String name;
    private double unitPrice;

    public Product(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Collect the Product name and the Unit price using scanner
     * @return an instantiated product object
     */
    public Product getProduct()
    {
        Product productInput = new Product("", 0);
        productInput.setName(SafeInput.getNonZeroLenString(in, "What is the name of the product?"));
        productInput.setUnitPrice(SafeInput.getDouble(in, "What is the unit price?"));
        return productInput;
    }
}