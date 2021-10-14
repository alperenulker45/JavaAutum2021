package sef.module17.activity;

import junit.framework.TestCase;

public class AnimalsTest extends TestCase {

    private Animals animals;
    private String expectedText = "Animals species is: %s its color is: %s";

    protected void setUp() throws Exception{
        super.setUp();
        animals = new Animals();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testBlueDogAnimal() {
        animals.setColor("blue");
        assertEquals(String.format(expectedText, "Dog", "blue"), animals.getColorAndSpecies("blue", 0));
    }

    public void testAdd() {
        animals.setSpecies("elephant");

    }



}


