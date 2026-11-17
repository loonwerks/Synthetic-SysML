// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CabinAirServiceProposer_supervision_cabinAirServiceProposer {

  def initialise(api: CabinAirServiceProposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_cabinAirProposal(HVAC_Visibility_Priority_Supervisor.CabinAirProposal(
      HVAC_Visibility_Priority_Supervisor.Service.None,
      HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Unavailable,
      HVAC_Visibility_Priority_Supervisor.HumidityDegradation.InvalidHumidity,
      HVAC_Visibility_Priority_Supervisor.AirDegradation.InvalidAirQuality))
  }

  def timeTriggered(api: CabinAirServiceProposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_humidityNeed(), api.get_airNeed(), api.get_airPath()) match {
      case (Some(humidity), Some(air), Some(path)) =>
        val service: HVAC_Visibility_Priority_Supervisor.Service.Type =
          if (path.airReady != HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Available)
            HVAC_Visibility_Priority_Supervisor.Service.None
          else if (air == HVAC_Visibility_Priority_Supervisor.AirNeed.Filter)
            HVAC_Visibility_Priority_Supervisor.Service.Filter
          else if (humidity == HVAC_Visibility_Priority_Supervisor.HumidityNeed.Dry)
            HVAC_Visibility_Priority_Supervisor.Service.Dry
          else HVAC_Visibility_Priority_Supervisor.Service.None
        api.put_cabinAirProposal(HVAC_Visibility_Priority_Supervisor.CabinAirProposal(
          service,
          if (service == HVAC_Visibility_Priority_Supervisor.Service.None)
            HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Unavailable
          else HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Available,
          if (humidity == HVAC_Visibility_Priority_Supervisor.HumidityNeed.Unavailable)
            HVAC_Visibility_Priority_Supervisor.HumidityDegradation.InvalidHumidity
          else HVAC_Visibility_Priority_Supervisor.HumidityDegradation.None,
          if (air == HVAC_Visibility_Priority_Supervisor.AirNeed.Unavailable)
            HVAC_Visibility_Priority_Supervisor.AirDegradation.InvalidAirQuality
          else HVAC_Visibility_Priority_Supervisor.AirDegradation.None))
      case _ =>
        api.put_cabinAirProposal(HVAC_Visibility_Priority_Supervisor.CabinAirProposal(
          HVAC_Visibility_Priority_Supervisor.Service.None,
          HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Unavailable,
          HVAC_Visibility_Priority_Supervisor.HumidityDegradation.InvalidHumidity,
          HVAC_Visibility_Priority_Supervisor.AirDegradation.InvalidAirQuality))
    }
  }

  def finalise(api: CabinAirServiceProposer_Operational_Api): Unit = { }
}
