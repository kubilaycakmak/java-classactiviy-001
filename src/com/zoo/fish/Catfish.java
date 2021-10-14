package com.zoo.fish;

public class Catfish extends Fish{

    protected String feature;

    public Catfish() {
        super();
        this.feature = "Catfish are a large and diverse group of fish found all over the world.";
    }

    public String ShowInformation() {
        return "Catfish [feature=" + feature + ", livesOnWater=" + livesOnWater + ", gills=" + gills + ", heightInFeet="
                + heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType="
                + bloodType + "]";
    }
}
