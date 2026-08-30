// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier {

  def initialise(api: EnergyCapabilityQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // INIT_ENERGY_SAFE
    api.put_energyCapability(HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid)
  }

  def timeTriggered(api: EnergyCapabilityQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_energyContext: Option[HVAC_Energy_Interface_Supervisor.EnergyContext] = api.get_energyContext()

    // QUAL_03_ENERGY_CAPABILITY
    val ec: HVAC_Energy_Interface_Supervisor.EnergyContext = apiUsage_energyContext.get
    val es: HVAC_Energy_Interface_Supervisor.ElectricalState.Type = ec.electricalState
    val pe: HVAC_Energy_Interface_Supervisor.PowerEnvelope.Type = ec.powerEnvelope
    val eh: HVAC_Energy_Interface_Supervisor.EngineHeat.Type = ec.engineHeat

    val cap: HVAC_Energy_Interface_Supervisor.EnergyCapability.Type =
      if (es == HVAC_Energy_Interface_Supervisor.ElectricalState.Unknown |
          pe == HVAC_Energy_Interface_Supervisor.PowerEnvelope.Unknown |
          eh == HVAC_Energy_Interface_Supervisor.EngineHeat.Unknown) {
        HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid
      } else if (es == HVAC_Energy_Interface_Supervisor.ElectricalState.Unavailable |
                 pe == HVAC_Energy_Interface_Supervisor.PowerEnvelope.None) {
        HVAC_Energy_Interface_Supervisor.EnergyCapability.None
      } else if (es == HVAC_Energy_Interface_Supervisor.ElectricalState.Ready &
                 pe == HVAC_Energy_Interface_Supervisor.PowerEnvelope.Normal) {
        HVAC_Energy_Interface_Supervisor.EnergyCapability.Full
      } else if (eh == HVAC_Energy_Interface_Supervisor.EngineHeat.Available) {
        HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedHeat
      } else {
        HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedElectric
      }
    api.put_energyCapability(cap)
  }

  def finalise(api: EnergyCapabilityQualifier_Operational_Api): Unit = { }
}
