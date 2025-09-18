package lab2;
import java.math.BigDecimal;
/**
 * Class that creates an invoice for purchased items.
 * @author Jorge Luis Pabon
 * @version 1.0
 */
public class invoiceCreator {
    private String itemName;
    private BigDecimal unitPrice;
    private int quantity;
    private double taxRate;

    public invoiceCreator(String itemName, BigDecimal unitPrice, int quantity, double taxRate) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.taxRate = taxRate;
    }

    /**
     * Calculates the total price.
     * @return total price including tax
     */
    public BigDecimal getTotalPrice() {
        BigDecimal subtotal = unitPrice.multiply(BigDecimal.valueOf(quantity));
        BigDecimal tax = subtotal.multiply(BigDecimal.valueOf(taxRate));
        return subtotal.add(tax);
    }

    // Example Of Usage
    public static void main(String[] args) {
        invoiceCreator item1 = new invoiceCreator("Yarn", BigDecimal.valueOf(4.99), 2, 1.325);
        invoiceCreator item2 = new invoiceCreator("Needles", BigDecimal.valueOf(1.99), 10, 1.325);
        System.out.println("Hollow Threads Inc.\nSales Invoice\n---------------------------------------------------------------");
        System.out.printf("%-15s | %-13s | %-8s | %-22s%n", "Item", "Unit Price", "Quantity", "Total Price (+Tax)");
        System.out.print("---------------------------------------------------------------\n");
        System.out.printf("%-15s | $%12.2f | %8d | $%10.2f%n",
            item1.itemName, item1.unitPrice, item1.quantity, item1.getTotalPrice());
        System.out.printf("%-15s | $%12.2f | %8d | $%10.2f%n",
            item2.itemName, item2.unitPrice, item2.quantity, item2.getTotalPrice());

    }
}
