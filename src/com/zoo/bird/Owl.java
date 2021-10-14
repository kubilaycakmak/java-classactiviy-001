package com.zoo.bird;

public class Owl extends Bird{
    public String ShowInformation() {
        return "Owl [feather=" + feather + ", canFly=" + canFly + ", heightInFeet=" + heightInFeet
                + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
    }
}
