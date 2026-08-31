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
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee QUAL_03_ENERGY_CAPABILITY
        //   The three EnergyContext attributes form the ordered capability relation
        (api.energyContext.electricalState == ElectricalState.Unknown |
          api.energyContext.powerEnvelope == PowerEnvelope.Unknown |
          api.energyContext.engineHeat == EngineHeat.Unknown ___>:
          api.energyCapability == EnergyCapability.Invalid) &
          (api.energyContext.electricalState != ElectricalState.Unknown &
            api.energyContext.powerEnvelope != PowerEnvelope.Unknown &
            api.energyContext.engineHeat != EngineHeat.Unknown &
            (api.energyContext.electricalState == ElectricalState.Unavailable |
              api.energyContext.powerEnvelope == PowerEnvelope.None) ___>:
            api.energyCapability == EnergyCapability.None) &
          (api.energyContext.electricalState != ElectricalState.Unknown &
            api.energyContext.powerEnvelope != PowerEnvelope.Unknown &
            api.energyContext.engineHeat != EngineHeat.Unknown &
            api.energyContext.electricalState != ElectricalState.Unavailable &
            api.energyContext.powerEnvelope != PowerEnvelope.None &
            api.energyContext.electricalState == ElectricalState.Ready &
            api.energyContext.powerEnvelope == PowerEnvelope.Normal ___>:
            api.energyCapability == EnergyCapability.Full) &
          (api.energyContext.electricalState != ElectricalState.Unknown &
            api.energyContext.powerEnvelope != PowerEnvelope.Unknown &
            api.energyContext.engineHeat != EngineHeat.Unknown &
            api.energyContext.electricalState != ElectricalState.Unavailable &
            api.energyContext.powerEnvelope != PowerEnvelope.None &
            (api.energyContext.electricalState != ElectricalState.Ready |
              api.energyContext.powerEnvelope != PowerEnvelope.Normal) &
            api.energyContext.engineHeat == EngineHeat.Available ___>:
            api.energyCapability == EnergyCapability.ReducedHeat) &
          (api.energyContext.electricalState != ElectricalState.Unknown &
            api.energyContext.powerEnvelope != PowerEnvelope.Unknown &
            api.energyContext.engineHeat != EngineHeat.Unknown &
            api.energyContext.electricalState != ElectricalState.Unavailable &
            api.energyContext.powerEnvelope != PowerEnvelope.None &
            (api.energyContext.electricalState != ElectricalState.Ready |
              api.energyContext.powerEnvelope != PowerEnvelope.Normal) &
            api.energyContext.engineHeat == EngineHeat.Unavailable ___>:
            api.energyCapability == EnergyCapability.ReducedElectric)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val context: HVAC_Energy_Interface_Supervisor.EnergyContext =
      api.get_energyContext().get
    val capability: HVAC_Energy_Interface_Supervisor.EnergyCapability.Type =
      if (context.electricalState == ElectricalState.Unknown ||
        context.powerEnvelope == PowerEnvelope.Unknown ||
        context.engineHeat == EngineHeat.Unknown) EnergyCapability.Invalid
      else if (context.electricalState == ElectricalState.Unavailable ||
        context.powerEnvelope == PowerEnvelope.None) EnergyCapability.None
      else if (context.electricalState == ElectricalState.Ready &&
        context.powerEnvelope == PowerEnvelope.Normal) EnergyCapability.Full
      else if (context.engineHeat == EngineHeat.Available) EnergyCapability.ReducedHeat
      else EnergyCapability.ReducedElectric
    api.put_energyCapability(capability)
  }

  def finalise(api: EnergyCapabilityQualifier_Operational_Api): Unit = { }
}
