//Mohammad El-Tawil 
//Intro to Comp Sci Using Java 
//Lab Assignment 8-FreezeBoil

/**
 The FreezeBoil class calculates freezing and boiling points for different substances based on the given temperature.
 */
public class FreezeBoil {

    /**
     The temperature variable to store the temperature value.
     */
    private double temperature;

    /**
     Constructor to set the given temperature.
     @param givenTemp the given temperature value to set
     */
    public FreezeBoil(double givenTemp) {
        temperature = givenTemp;
    }

    /**
     Checks if Ethyl will freeze at the current temperature.
     @return true if Ethyl will freeze, false otherwise
     */
    public boolean isEthylFreezing() {
        return temperature <= -173;
    }

    /**
     Checks if Ethyl will boil at the current temperature.
     @return true if Ethyl will boil, false otherwise
     */
    public boolean isEthylBoiling() {
        return temperature >= 172;
    }

    /**
     Checks if Oxygen will freeze at the current temperature.
     @return true if Oxygen will freeze, false otherwise
     */
    public boolean isOxygenFreezing() {
        return temperature <= -362;
    }

    /**
     Checks if Oxygen will boil at the current temperature.
     @return true if Oxygen will boil, false otherwise
     */
    public boolean isOxygenBoiling() {
        return temperature >= -306;
    }

    /**
     Checks if Water will freeze at the current temperature.
     @return true if Water will freeze, false otherwise
     */
    public boolean isWaterFreezing() {
        return temperature <= 32;
    }

    /**
     Checks if Water will boil at the current temperature.
     @return true if Water will boil, false otherwise
     */
    public boolean isWaterBoiling() {
        return temperature >= 212;
    }
}
