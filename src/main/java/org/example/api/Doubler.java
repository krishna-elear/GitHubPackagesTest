package org.example.api;

/**
 * A class to double int.
 */
public class Doubler {
  private final int number;

  /**
   * Create a doubler instance.
   *
   * @param number The number to double.
   */
  public Doubler(int number) {
    this.number = number;
  }

  /**
   * Function to double the number provided in constructor.
   *
   * @return The doubled number.
   */
  public int doubleIt() {
    return 2 * number;
  }
}
