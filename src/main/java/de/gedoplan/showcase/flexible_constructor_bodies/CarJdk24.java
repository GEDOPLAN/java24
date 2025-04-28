package de.gedoplan.showcase.flexible_constructor_bodies;

import java.math.BigDecimal;

/**
 * Represents a car as a specific type of vehicle with additional properties
 * for the number of seats and the number of doors.
 * <p>
 * This class extends the {@code Vehicle} class and adds unique attributes
 * relevant to cars.
 */
public class CarJdk24 extends Vehicle {
  private final int numberOfSeats;
  private final int numberOfDoors;

  /**
   * Constructs a new {@code CarJdk21}, a specific type of vehicle with
   * additional attributes for the number of seats and the number of doors.
   * <p>
   * Validation of numberOfSeats and numberOfDoors occurs
   * before calling the superclass constructor, thus avoiding the call
   * if either value is invalid.
   *
   * @param name the name of the car; must not be null or blank
   * @param price the price of the car; must not be null and must be greater than or equal to zero
   * @param numberOfSeats the number of seats in the car; must be greater than or equal to 1
   * @param numberOfDoors the number of doors in the car; must be greater than or equal to 1
   * @throws IllegalArgumentException if {@code numberOfSeats} is less than 1
   * @throws IllegalArgumentException if {@code numberOfDoors} is less than 1
   * @throws IllegalArgumentException if {@code name} is null, blank, or invalid (from superclass)
   * @throws IllegalArgumentException if {@code price} is null or invalid (from superclass)
   */

  public CarJdk24(String name, BigDecimal price, int numberOfSeats, int numberOfDoors) {
    if (numberOfSeats < 1) {
      throw new IllegalArgumentException("numberOfSeats must be >= 1");
    }
    if (numberOfDoors < 1) {
      throw new IllegalArgumentException("numberOfDoors must be >= 1");
    }
    super(name, price);
    this.numberOfSeats = numberOfSeats;
    this.numberOfDoors = numberOfDoors;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }
}
