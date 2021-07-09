package org.example.api;

/**
 * A class to halve int
 */
public class Halfer {
    private final int a;

    /**
     * Create a Halver instance
     * @param a The number to halve
     */
    public Halfer(int a) {
        this.a = a;
    }

    /**
     * Function to halve the number provided in constructor
     * @return The doubled number
     */
    public int halfIt() {
        return a / 2;
    }
}
