package com.woolha.example.sealed;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.UUID;

public class Main {

  public static void main(String[] args) {
    Gadget gadget = new Gadget(UUID.randomUUID(), BigDecimal.valueOf(100));
    WiredHeadphone wiredHeadphone = new WiredHeadphone(UUID.randomUUID(), BigDecimal.valueOf(50), 80, 50);

    System.out.println(gadget.getClass().isSealed());
    System.out.println(wiredHeadphone.getClass().isSealed());
    System.out.println(Arrays.toString(gadget.getClass().permittedSubclasses()));
    System.out.println(Warranty.class.isSealed());
    System.out.println(Arrays.toString(Warranty.class.permittedSubclasses()));
  }
}
