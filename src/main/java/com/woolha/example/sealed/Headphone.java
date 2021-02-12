package com.woolha.example.sealed;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.UUID;

public sealed class Headphone extends Gadget implements Warranty permits WiredHeadphone, WirelessHeadphone {

  private final int sensitivity;

  public Headphone(UUID id, BigDecimal price, int sensitivity) {
    super(id, price);
    this.sensitivity = sensitivity;
  }

  public int getSensitivity() {
    return this.sensitivity;
  }

  public Duration getWarranty() {
    return Duration.ofDays(365);
  }
}
