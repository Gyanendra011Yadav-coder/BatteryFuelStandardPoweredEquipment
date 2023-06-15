package Equipment;


/**
 * A class representing fuel-powered equipment.
 */
public class FuelPoweredEquipment extends Equipment{

    // Maximum number of days in a year
    private static final int MAX_DAYS = 365;

    // Amount of usage of the equipment
    int usage;

    /**
     * Constructs a new FuelPoweredEquipment object with the given make, model, purchase year, and usage.
     *
     * @param make The make of the equipment.
     * @param model The model of the equipment.
     * @param purchaseYear The year in which the equipment was purchased.
     * @param usage The usage of the equipment.
     */
    public FuelPoweredEquipment(String make, String model, int purchaseYear, int usage) {
        super(make, model, purchaseYear);
        this.usage = usage;
    }

    /**
     * Returns the usage of the equipment.
     *
     * @return The usage of the equipment.
     */
    public int getUsage() {
        return usage;
    }

    /**
     * Sets the usage of the equipment.
     *
     * @param usage The new usage of the equipment.
     */
    public void setUsage(int usage) {
        this.usage = usage;
    }

    /**
     * Calculates and returns the year in which the equipment needs to be replaced based on its usage.
     * The replacement year is calculated as the purchase year plus the maximum number of days in a year     * divided by the usage of the equipment.
     *
     * @return The year in which the equipment needs to be replaced.
     */
    @Override
    public int replacementYear() {
        return getPurchaseYear() + (MAX_DAYS / usage);
    }
}
