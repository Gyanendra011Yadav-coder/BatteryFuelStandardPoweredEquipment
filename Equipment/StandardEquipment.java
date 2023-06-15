package Equipment;

/**
 * A class representing standard equipment.
 */
public class StandardEquipment extends Equipment {

    // Maximum retention period of the equipment
    private static final int MAX_RETENTION = 10;

    // Durability of the equipment
    private double durability;

    /**
     * Constructs a new StandardEquipment object with the given make, model, purchase year, and durability.
     *
     * @param make         The make of the equipment.
     * @param model        The model of the equipment.
     * @param purchaseYear The year in which the equipment was purchased.
     * @param durability   The durability of the equipment.
     */
    public StandardEquipment(String make, String model, int purchaseYear, double durability) {
        super(make, model, purchaseYear);
        setDurability(durability);
    }

    /**
     * Returns the durability of the equipment.
     *
     * @return The durability of the equipment.
     */
    public double getDurability() {
        return durability;
    }

    /**
     * Sets the durability of the equipment.
     *
     * @param durability The new durability of the equipment.
     */
    public void setDurability(double durability) {
        try{
            if(durability <= 0){
                throw new IllegalArgumentException("Durability must be greater than 0");
            }
            this.durability = durability;
        } catch (IllegalArgumentException e){
            System.out.println("-**-Exception Occured: Durability must be greater than 0 and less than or equal to 1 -**-");
        }
    }

    /**
     * Calculates and returns the year in which the equipment needs to be replaced based on its durability.
     * The replacement year is calculated as the purchase year plus the maximum retention period divided by the durability of the equipment.
     *
     * @return The year in which the equipment needs to be replaced.
     */
    @Override
    public int replacementYear() {
        return (int) (getPurchaseYear() + (MAX_RETENTION / durability));
    }
}