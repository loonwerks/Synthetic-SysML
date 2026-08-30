// #Sireum

package scp_candidate.HVAC_Energy_Interface_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier {

  def initialise(api: ComfortDemandQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_COMFORT_SAFE
        api.comfortDemand == ComfortDemand.None
        // END INITIALIZES ENSURES
      )
    )
    api.put_comfortDemand(HVAC_Energy_Interface_Supervisor.ComfortDemand.None)
  }

  def timeTriggered(api: ComfortDemandQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_climateRequest(), api.get_thermalRelation()) match {
      case (Some(ClimateRequest.Off), _) =>
        api.put_comfortDemand(ComfortDemand.None)
      case (Some(ClimateRequest.Regulate), Some(ThermalRelation.Unknown)) =>
        api.put_comfortDemand(ComfortDemand.Invalid)
      case (Some(ClimateRequest.Regulate), Some(ThermalRelation.Below)) =>
        api.put_comfortDemand(ComfortDemand.Heat)
      case (Some(ClimateRequest.Regulate), Some(ThermalRelation.Within)) =>
        api.put_comfortDemand(ComfortDemand.Hold)
      case (Some(ClimateRequest.Regulate), Some(ThermalRelation.Above)) =>
        api.put_comfortDemand(ComfortDemand.Cool)
    }
  }

  def finalise(api: ComfortDemandQualifier_Operational_Api): Unit = { }
}
