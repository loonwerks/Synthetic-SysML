package IsoletteAcceptanceFixture {
  part def TemperatureSensor :> Device;
  part def HeatSource :> Device;
  part def TemperatureController :> Thread;
  part def IsoletteSystem :> System {
    part sensor : TemperatureSensor;
    part controller : TemperatureController;
    part heater : HeatSource;
  }
}
