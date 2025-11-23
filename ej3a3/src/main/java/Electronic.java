public class Electronic extends Product {
    private int warrantyMonths;

    public Electronic(int id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        setWarrantyMonths(warrantyMonths);
    }

    public Electronic(int id, String name, double price) {
        super(id, name, price);
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {

        if (warrantyMonths < 0) {
            System.out.println("Warranty cannot be negative.");
            return;
        }

        this.warrantyMonths = warrantyMonths;
    }

    public String toString() {
        // *     <id> - <name>: <price>€ - Warranty: <warrantyMonths> months
        return getId() + " - " + getName() + ": " + getPrice() + "€ - Warranty: " + getWarrantyMonths() + " months";
    }

    public String displayWarranty() {
        return "This product has a warranty of " + getWarrantyMonths() +  " months.";
    }
}
