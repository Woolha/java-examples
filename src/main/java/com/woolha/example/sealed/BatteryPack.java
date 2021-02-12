package com.woolha.example.sealed;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.UUID;

public final class BatteryPack extends Gadget implements Warranty {

  private final int capacity;

  public BatteryPack(UUID id, BigDecimal price, int sensitivity, int capacity) {
    super(id, price);
    this.capacity = capacity;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public Duration getWarranty() {
    return Duration.ofDays(365);
  }
}
