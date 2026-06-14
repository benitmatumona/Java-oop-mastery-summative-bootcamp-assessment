package oopmastery;

public class Question12_InventoryItem {

    private String name;
    private int quantity;

    public Question12_InventoryItem(
            String name,
            int quantity
    ) {
        // TODO:
        // Store the item name
        //
        // If quantity is negative,
        // store 0 instead
    }

    public void addStock(
            int amount
    ) {
        // TODO:
        // Only add stock if
        // amount is greater than 0
    }

    public boolean removeStock(
            int amount
    ) {
        // TODO:
        // Only remove stock if:
        // 1. amount > 0
        // 2. enough stock exists
        //
        // Return true if successful
        // Return false otherwise

        return false;
    }

    public String getName() {
        // TODO:
        return "";
    }

    public int getQuantity() {
        // TODO:
        return 0;
    }
}