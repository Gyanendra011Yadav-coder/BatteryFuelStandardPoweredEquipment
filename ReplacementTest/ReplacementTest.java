/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReplacementTest;


import Equipment.BatteryPoweredEquipment;
import Equipment.FuelPoweredEquipment;
import Equipment.StandardEquipment;

/**
 *
 * @author Your name here
 */
public class ReplacementTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StandardEquipment standardEquipment1 = new StandardEquipment("Stanley", "Hammer", 2022, 1.5);
        System.out.println(standardEquipment1.showDetails());
        StandardEquipment standardEquipment2 = new StandardEquipment("Milwaukee", "Screwdriver", 2021, -1);
        System.out.println(standardEquipment2.showDetails());

        FuelPoweredEquipment fuelPoweredEquipment1 = new FuelPoweredEquipment("Honda", "Lawn Mower", 2022, 100);
        System.out.println(fuelPoweredEquipment1.showDetails());
        FuelPoweredEquipment fuelPoweredEquipment2 = new FuelPoweredEquipment("Toro", "Edger", 2021, 75);
        System.out.println(fuelPoweredEquipment2.showDetails());

        BatteryPoweredEquipment batteryPoweredEquipment1 = new BatteryPoweredEquipment("John Deere", "Lawn Tractor", 2022, 5);
        System.out.println(batteryPoweredEquipment1.showDetails());
        BatteryPoweredEquipment batteryPoweredEquipment2 = new BatteryPoweredEquipment("Craftsman", "Leaf Blower", 2021, -1);
        System.out.println(batteryPoweredEquipment2.showDetails());

    }
    
}
