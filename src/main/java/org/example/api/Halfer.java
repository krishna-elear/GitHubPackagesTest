package org.example.api;

/**
 * A class to halve int.
 */
public class Halfer {
  private final int number;

  /**
   * Create a Halver instance.
   *
   * @param number The number to halve.
   */
  public Halfer(int number) {
    this.number = number;
  }

  /**
   * Function to halve the number provided in constructor.
   *
   * @return The doubled number.
   */
  public int halfIt() {
    return number / 2;
  }
}
