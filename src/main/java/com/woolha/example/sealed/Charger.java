package com.woolha.example.sealed;

import java.time.Duration;

public record Charger() implements Warranty {

  @Override
  public Duration getWarranty() {
    return Duration.ofDays(30);
  }
}
