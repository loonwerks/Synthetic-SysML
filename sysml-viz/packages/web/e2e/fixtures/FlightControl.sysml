package FlightControlAcceptanceFixture {
  part def PilotInput :> Device;
  part def FlightComputer :> Thread;
  part def SurfaceActuator :> Device;
  part def FlightControlSystem :> System {
    part input : PilotInput;
    part computer : FlightComputer;
    part actuator : SurfaceActuator;
  }
}
