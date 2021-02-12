package com.woolha.example.sealed;

import java.math.BigDecimal;
import java.util.UUID;

public final class WirelessHeadphone extends Headphone {

  private final double range;

  public WirelessHeadphone(UUID id, BigDecimal price, int sensitivity, double range) {
    super(id, price, sensitivity);
    this.range = range;
  }

  public double getRange() {
    return this.range;
  }
}
