package com.zoo;

public class Zoo {

    protected float heightInFeet;
    protected float weightInKilos;
    protected String animalType;
    protected String bloodType;

    public Zoo(){}

    public Zoo(float heightInFeet, float weightInKilos, String animalType, String bloodType) {
        this.heightInFeet = heightInFeet;
        this.weightInKilos = weightInKilos;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public String ShowInformation(){
        return "Animal [heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType="
                + animalType + ", bloodType=" + bloodType + "]";
    }

    public float getHeightInFeet() {
        return heightInFeet;
    }

    public void setHeightInFeet(float heightInFeet) {
        this.heightInFeet = heightInFeet;
    }

    public float getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(float weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
