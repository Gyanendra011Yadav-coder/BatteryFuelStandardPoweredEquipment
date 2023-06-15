package Equipment;

// This class represents an piece of equipment.
public abstract class Equipment {
    private String make; // The make of the equipment.
    private String model; // The model of the equipment.
    private int purchaseYear; // The year the equipment was purchased.

    // This constructor creates a new Equipment object.
    public Equipment(String make, String model, int purchaseYear) {
        this.make = make;
        this.model = model;
        this.purchaseYear = purchaseYear;
    }

    // This method gets the make of the equipment.
    public String getMake() {
        return make;
    }

    // This method sets the make of the equipment.
    public void setMake(String make) {
        this.make = make;
    }

    // This method gets the model of the equipment.
    public String getModel() {
        return model;
    }

    // This method sets the model of the equipment.
    public void setModel(String model) {
        this.model = model;
    }

    // This method gets the purchase year of the equipment.
    public int getPurchaseYear() {
        return purchaseYear;
    }

    // This method sets the purchase year of the equipment.
    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    // This abstract method returns the year when the equipment should be replaced.
    public abstract int replacementYear();

    // This method returns a string representation of the equipment.
    public String showDetails() {
        return model + "\n" +
                "Year of Purchase: " + purchaseYear + "\n" +
                "Replacement Year:  " + replacementYear() + "\n";
    }

}
