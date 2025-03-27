/**
 * ShelfStable.java
 *
 * To show the description of the shelf stables
 *
 * @author Mahmmod Dhalai
 * Date: March 21, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe shelf stables
 */

class ShelfStable extends HouseholdItem {
    private String TableSize;

    /**
     * ShelfsTable Class COnstructor
     * @param name
     * @param color
     * @param price
     * @param size
     * @param material
     * @param quantity
     * @param brand
     * @param category
     * @param weight
     * @param dimensions
     * @param tablesize
     */
    public ShelfStable(String name, String color, double price, String size, String material, int quantity, String brand, int category, int weight, int dimensions, String tablesize) {
        super(name, color, price, size, material, quantity, brand, category, weight, dimensions);
        this.TableSize = tablesize;
    }

    /**
     * Table Size Getter
     * @return String
     */
    public String getTableSize() {
        return TableSize;
    }

    /**
     * Table Size Setter
     * @param tableSize
     */
    public void setTableSize(String tableSize) {
        TableSize = tableSize;
    }

    /**
     * Displays ShelfsTable Class Information
     */
    public void displaysShelfStableInfo() {
        super.displayDetails();
        System.out.println("Storage Condition: " + TableSize);
    }
}