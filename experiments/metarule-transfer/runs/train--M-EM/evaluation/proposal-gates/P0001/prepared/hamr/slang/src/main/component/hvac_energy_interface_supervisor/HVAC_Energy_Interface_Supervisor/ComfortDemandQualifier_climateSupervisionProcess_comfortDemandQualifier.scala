// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier {

  def initialise(api: ComfortDemandQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_comfortDemand(HVAC_Energy_Interface_Supervisor.ComfortDemand.None)
  }

  def timeTriggered(api: ComfortDemandQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee QUAL_01_COMFORT_DEMAND
        //   Climate request and thermal relation form a total comfort classification
        (api.climateRequest == ClimateRequest.Off ___>:
          api.comfortDemand == ComfortDemand.None) &
          (api.climateRequest == ClimateRequest.Regulate &
            api.thermalRelation == ThermalRelation.Unknown ___>:
            api.comfortDemand == ComfortDemand.Invalid) &
          (api.climateRequest == ClimateRequest.Regulate &
            api.thermalRelation == ThermalRelation.Below ___>:
            api.comfortDemand == ComfortDemand.Heat) &
          (api.climateRequest == ClimateRequest.Regulate &
            api.thermalRelation == ThermalRelation.Within ___>:
            api.comfortDemand == ComfortDemand.Hold) &
          (api.climateRequest == ClimateRequest.Regulate &
            api.thermalRelation == ThermalRelation.Above ___>:
            api.comfortDemand == ComfortDemand.Cool)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request: HVAC_Energy_Interface_Supervisor.ClimateRequest.Type =
      api.get_climateRequest().get
    val relation: HVAC_Energy_Interface_Supervisor.ThermalRelation.Type =
      api.get_thermalRelation().get
    val demand: HVAC_Energy_Interface_Supervisor.ComfortDemand.Type =
      if (request == ClimateRequest.Off) ComfortDemand.None
      else if (relation == ThermalRelation.Unknown) ComfortDemand.Invalid
      else if (relation == ThermalRelation.Below) ComfortDemand.Heat
      else if (relation == ThermalRelation.Within) ComfortDemand.Hold
      else ComfortDemand.Cool
    api.put_comfortDemand(demand)
  }

  def finalise(api: ComfortDemandQualifier_Operational_Api): Unit = { }
}
