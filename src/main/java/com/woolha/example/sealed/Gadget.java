package com.woolha.example.sealed;

import java.math.BigDecimal;
import java.util.UUID;

public sealed class Gadget permits BatteryPack, CellPhone, Headphone {

  private final UUID id;

  private final BigDecimal price;

  public Gadget(UUID id, BigDecimal price) {
    this.id = id;
    this.price = price;
  }

  public UUID getId() {
    return this.id;
  }

  public BigDecimal getPrice() {
    return this.price;
  }
}
