package sef.module17.activity;

import java.util.ArrayList;

public class Animals {

    private ArrayList<String> species = new ArrayList<>();
    private String color;
    private String weight;

    public Animals() {
        species.add("Dog");
        species.add("Cat");
        species.add("Mouse");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpecies(String species) {
        this.species.add(species);
    }

    public String getSpecies (int index) {
        return species.get(index);
    }

    public String getColorAndSpecies(String color, int index) {
        String txt = "Animals species is: " + this.species.get(index) + " its color is: " + color;
        return txt;
    }
}
