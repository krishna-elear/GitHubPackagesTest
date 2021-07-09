package org.example.api;

public class Doubler {
    private final int a;

    public Doubler(int a) {
        this.a = a;
    }

    public int doubleIt() {
        return 2 * a;
    }
}
