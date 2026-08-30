package GreenhouseAcceptanceFixture {
  part def ClimateSensor :> Device;
  part def HvacController :> Thread;
  part def AirHandler :> Device;
  part def GreenhouseHvacSystem :> System {
    part sensor : ClimateSensor;
    part controller : HvacController;
    part airHandler : AirHandler;
  }
}
