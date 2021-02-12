package com.woolha.example.sealed;

import java.math.BigDecimal;
import java.util.UUID;

public final class WiredHeadphone extends Headphone {

  private final int cableLength;

  public WiredHeadphone(UUID id, BigDecimal price, int sensitivity, int cableLength) {
    super(id, price, sensitivity);
    this.cableLength = cableLength;
  }

  public int getCableLength() {
    return this.cableLength;
  }
}
