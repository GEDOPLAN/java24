package de.gedoplan.showcase.flexible_constructor_bodies;

import java.math.BigDecimal;

/**
 * Represents an abstract base class for a Vehicle.
 * This class defines the basic properties and behaviors common to all vehicles,
 * such as the name and price. It also includes input validation for these attributes
 * during object construction.
 * <p>
 * Validation Rules:
 * - Name must not be null or blank.
 * - Price must not be null and must be greater than or equal to zero.
 */
public abstract class Vehicle {
  private final String name;
  private final BigDecimal price;

  public Vehicle(String name, BigDecimal price) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("name must not be null or blank");
    }
    if (price == null) {
      throw new IllegalArgumentException("price must not be null");
    }
    if (price.compareTo(BigDecimal.ZERO) < 0) {
      throw new IllegalArgumentException("price must be >= 0");
    }
    this.name = name;
    this.price = price;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }
}
