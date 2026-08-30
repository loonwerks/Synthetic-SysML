// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier {

  def initialise(api: ComfortDemandQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // INIT_COMFORT_SAFE
    api.put_comfortDemand(HVAC_Energy_Interface_Supervisor.ComfortDemand.None)
  }

  def timeTriggered(api: ComfortDemandQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_climateRequest: Option[HVAC_Energy_Interface_Supervisor.ClimateRequest.Type] = api.get_climateRequest()
    val apiUsage_thermalRelation: Option[HVAC_Energy_Interface_Supervisor.ThermalRelation.Type] = api.get_thermalRelation()

    // QUAL_01_COMFORT_DEMAND
    // if climateRequest is Off, then comfortDemand is None,
    // if climateRequest is Regulate and thermalRelation is Unknown, then comfortDemand is Invalid,
    // if climateRequest is Regulate and thermalRelation is Below, then comfortDemand is Heat,
    // if climateRequest is Regulate and thermalRelation is Within, then comfortDemand is Hold,
    // if climateRequest is Regulate and thermalRelation is Above, then comfortDemand is Cool.
    val cd: HVAC_Energy_Interface_Supervisor.ComfortDemand.Type =
      apiUsage_climateRequest.get match {
        case HVAC_Energy_Interface_Supervisor.ClimateRequest.Off =>
          HVAC_Energy_Interface_Supervisor.ComfortDemand.None
        case HVAC_Energy_Interface_Supervisor.ClimateRequest.Regulate =>
          apiUsage_thermalRelation.get match {
            case HVAC_Energy_Interface_Supervisor.ThermalRelation.Unknown =>
              HVAC_Energy_Interface_Supervisor.ComfortDemand.Invalid
            case HVAC_Energy_Interface_Supervisor.ThermalRelation.Below =>
              HVAC_Energy_Interface_Supervisor.ComfortDemand.Heat
            case HVAC_Energy_Interface_Supervisor.ThermalRelation.Within =>
              HVAC_Energy_Interface_Supervisor.ComfortDemand.Hold
            case HVAC_Energy_Interface_Supervisor.ThermalRelation.Above =>
              HVAC_Energy_Interface_Supervisor.ComfortDemand.Cool
          }
      }
    api.put_comfortDemand(cd)
  }

  def finalise(api: ComfortDemandQualifier_Operational_Api): Unit = { }
}
