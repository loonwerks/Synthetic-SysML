// #Sireum

package scp_candidate.HVAC_Energy_Interface_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier {

  def initialise(api: EnergyCapabilityQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_ENERGY_SAFE
        api.energyCapability == EnergyCapability.Invalid
        // END INITIALIZES ENSURES
      )
    )
    api.put_energyCapability(HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid)
  }

  def timeTriggered(api: EnergyCapabilityQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_energyContext() match {
      case Some(context) =>
        if (context.electricalState == ElectricalState.Unknown ||
            context.powerEnvelope == PowerEnvelope.Unknown ||
            context.engineHeat == EngineHeat.Unknown) {
          api.put_energyCapability(EnergyCapability.Invalid)
        } else if (context.electricalState == ElectricalState.Unavailable ||
                   context.powerEnvelope == PowerEnvelope.None) {
          api.put_energyCapability(EnergyCapability.None)
        } else if (context.electricalState == ElectricalState.Ready &&
                   context.powerEnvelope == PowerEnvelope.Normal) {
          api.put_energyCapability(EnergyCapability.Full)
        } else if (context.engineHeat == EngineHeat.Available) {
          api.put_energyCapability(EnergyCapability.ReducedHeat)
        } else {
          api.put_energyCapability(EnergyCapability.ReducedElectric)
        }
    }
  }

  def finalise(api: EnergyCapabilityQualifier_Operational_Api): Unit = { }
}
