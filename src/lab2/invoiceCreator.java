package lab2;
import java.math.BigDecimal;

public class invoiceCreator {
    private String itemName;
    private BigDecimal unitPrice;
    private int quantity;
    private double taxRate;

    /** you don't need this fluff for now

    Price * Quan = Subtotal
    public BigDecimal subtotal(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(quantity));
    }
    // TaxRate * Subtotal
    public BigDecimal taxAmount(double taxRate, ) {
        return taxRate.multiply(BigDecimal.valueOf(subtotal()));
    }
    public BigDecimal finalTotal(BigDecimal amount) {
        return subtotal()
    }
     */

    // You can make a menu later
    public static void main(String[] args) {
        invoiceCreator item1 = new invoiceCreator();
        System.out.print();
    }
}
