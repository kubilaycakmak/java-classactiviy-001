package com.zoo.fish;

import com.zoo.Zoo;

public class Fish extends Zoo {

    protected boolean livesOnWater;
    protected boolean gills;

    public Fish() {
        animalType = "Fish";
        this.livesOnWater = true;
        this.gills = true;
    }

    public String ShowInfo() {
        return "Fish [livesOnWater=" + livesOnWater + ", gills=" + gills + ", heightInFeet=" + heightInFeet
                + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
    }
}
