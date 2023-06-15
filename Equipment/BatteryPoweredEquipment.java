package Equipment;

public class BatteryPoweredEquipment extends Equipment {

    // This class represents a piece of battery-powered equipment.

    // The warranty period in years.
    private int warranty;

    // This constructor creates a new BatteryPoweredEquipment object.
    public BatteryPoweredEquipment(String make, String model, int purchaseYear, int warranty) {
        // Call the superclass constructor to initialize the make, model, and purchaseYear.
        super(make, model, purchaseYear);

        // Set the warranty.
        setWarranty(warranty);
    }

    // This method gets the warranty period.
    public int getWarranty() {
        return warranty;
    }

    // This method sets the warranty period.
    public void setWarranty(int warranty) {
        // Validate the warranty period.
        try{
            if(warranty <= 0){
                throw new IllegalArgumentException("Warranty must be greater than 0");
            }
            this.warranty = warranty;
        } catch (IllegalArgumentException e){
            System.out.println("-**-Exception Occured: Warranty must be greater than 0 -**-");
        }
    }

    // This method overrides the `replacementYear()` method in the superclass.
    // It returns the year when the battery-powered equipment should be replaced.
    @Override
    public int replacementYear() {
        return getPurchaseYear() + warranty;
    }

}
