package com.woolha.example.sealed;

import java.math.BigDecimal;
import java.util.UUID;

public final class Smartphone extends CellPhone {

  private final String processor;

  public Smartphone(UUID id, BigDecimal price, int sensitivity, String processor) {
    super(id, price, sensitivity);
    this.processor = processor;
  }

  public String getProcessor() {
    return this.processor;
  }
}
