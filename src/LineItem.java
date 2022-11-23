public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * gets the total cost for a product by multiplying unit price by quantity
     * @return total cost
     */
    public double getLineTotal()
    {
        //Multiply the quanitity by the unit price to get the line total
        return product.getUnitPrice() * quantity;
    }
}