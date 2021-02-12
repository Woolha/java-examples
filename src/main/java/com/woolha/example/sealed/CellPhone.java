package com.woolha.example.sealed;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.UUID;

public non-sealed class CellPhone extends Gadget implements Warranty {

  private final double displaySize;

  public CellPhone(UUID id, BigDecimal price, double displaySize) {
    super(id, price);
    this.displaySize = displaySize;
  }

  public double getDisplaySize() {
    return this.displaySize;
  }

  public Duration getWarranty() {
    return Duration.ofDays(365);
  }
}
