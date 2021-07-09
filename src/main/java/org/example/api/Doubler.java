package org.example.api;

/**
 * A class to double int
 */
public class Doubler {
    private final int a;

    /**
     * Create a doubler instance
     * @param a The number to double
     */
    public Doubler(int a) {
        this.a = a;
    }

    /**
     * Function to double the number provided in constructor
     * @return The doubled number
     */
    public int doubleIt() {
        return 2 * a;
    }
}
