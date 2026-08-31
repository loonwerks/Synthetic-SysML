// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier {

  def initialise(api: EnergyCapabilityQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_energyCapability(HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid)
  }

  def timeTriggered(api: EnergyCapabilityQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val capability = api.get_energyContext() match {
      case Some(context) if
        context.electricalState == HVAC_Energy_Interface_Supervisor.ElectricalState.Unknown ||
        context.powerEnvelope == HVAC_Energy_Interface_Supervisor.PowerEnvelope.Unknown ||
        context.engineHeat == HVAC_Energy_Interface_Supervisor.EngineHeat.Unknown =>
        HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid
      case Some(context) if
        context.electricalState == HVAC_Energy_Interface_Supervisor.ElectricalState.Unavailable ||
        context.powerEnvelope == HVAC_Energy_Interface_Supervisor.PowerEnvelope.None =>
        HVAC_Energy_Interface_Supervisor.EnergyCapability.None
      case Some(context) if
        context.electricalState == HVAC_Energy_Interface_Supervisor.ElectricalState.Ready &&
        context.powerEnvelope == HVAC_Energy_Interface_Supervisor.PowerEnvelope.Normal =>
        HVAC_Energy_Interface_Supervisor.EnergyCapability.Full
      case Some(context) if
        context.engineHeat == HVAC_Energy_Interface_Supervisor.EngineHeat.Available =>
        HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedHeat
      case Some(_) => HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedElectric
      case _ => HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid
    }
    api.put_energyCapability(capability)
  }

  def finalise(api: EnergyCapabilityQualifier_Operational_Api): Unit = { }
}
