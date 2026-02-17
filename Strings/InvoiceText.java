public class InvoiceText {
    public static void main(String[] args) {

        String customerName = "Ravi";
        String product = "Notebook";
        int quantity = 2;
        int price = 50;

        int total = quantity * price;

        StringBuilder invoice = new StringBuilder();

        invoice.append("INVOICE\n");
        invoice.append("Customer: ").append(customerName).append("\n");
        invoice.append("Product : ").append(product).append("\n");
        invoice.append("Quantity: ").append(quantity).append("\n");
        invoice.append("Price   : ").append(price).append("\n");
        invoice.append("----------------------\n");
        invoice.append("Total   : ").append(total);

        System.out.println(invoice.toString());
    }
}

