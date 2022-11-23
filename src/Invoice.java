import java.util.ArrayList;
import java.util.Scanner;
public class Invoice {
    private Address customerAddress = new Address("","","","","");
    private ArrayList<LineItem> lineItems;

    public Invoice()
    {
        lineItems = new ArrayList<LineItem>();
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * generates a display of the console
     */
    public void displayInvoice()
    {
        System.out.println("Invoice");
        System.out.println("=====================================================");
        System.out.println("Address:" + "\n" + customerAddress.toString());
        System.out.println("=====================================================");
        System.out.printf("%-15s%-30s%-30s", "Item", "Qty", "Cost");
        System.out.println("\n");
        for(LineItem lineItem : getLineItems())
        {
            System.out.printf("%-15s%-30s%-30s", lineItem.getProduct().getName(), lineItem.getQuantity(), lineItem.getLineTotal());
            System.out.println("\n");
        }
        System.out.println("=====================================================");
        System.out.println("Amount due: " + getTotalAmtDue());

    }

    /**
     * uses SafeInput to collect data for the lineItems in the Invoice
     */
    public void getInvoiceData()
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        ArrayList<LineItem> lineItemsInput = new ArrayList<LineItem>();
        do {
            Product productInput = new Product("",0);
            lineItemsInput.add(new LineItem(productInput.getProduct(), SafeInput.getInt(in,"What is the quantity?")));
            done = SafeInput.getYNConfirm(in, "are you done?");
        }while(!done);
        setLineItems(lineItemsInput);
    }

    /**
     * Uses SafeInput to collect data for the address fields.
     */
    public void getAddressData()
    {
        customerAddress = customerAddress.getAddress();
    }

    /**
     *
     * @return the total of all the costs of invoice items
     */
    private double getTotalAmtDue()
    {
        double total = 0;
        //go through the line items and sum the line totals to get the total amount due
        for(LineItem lineItem : lineItems)
        {
            total += lineItem.getLineTotal();
        }
        return total;
    }

}