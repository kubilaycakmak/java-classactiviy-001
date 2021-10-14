package com.zoo.bird;

import com.zoo.Zoo;

public class Bird extends Zoo {

    protected boolean feather;
    protected boolean canFly;

    public Bird() {
        super();
        this.feather = true;
        this.canFly = true;
    }

    public String ShowInformation() {
        return "Bird [feather=" + feather + ", canFly=" + canFly + ", heightInFeet=" + heightInFeet + ", weightInKilos="
                + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
    }
}
