package com.woolha.example.sealed;

import java.time.Duration;

public sealed interface Warranty permits GlobalWarranty, BatteryPack, CellPhone, Headphone, Charger {

  Duration getWarranty();
}
