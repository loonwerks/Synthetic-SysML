// #Sireum

package mining_threat_retreat_supervision.Mining_Threat_Retreat_Supervision

import org.sireum._
import mining_threat_retreat_supervision._

// This file will not be overwritten if HAMR codegen is rerun
object Availability_Observation_supervisor_process_availability_observation {

  def initialise(api: Availability_Observation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_mining_available(Mining_Threat_Retreat_Supervision.MiningAvailabilityValue.example())
    api.put_defense_available(Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue.example())
    api.put_retreat_available(Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue.example())
    api.put_destination_available(Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue.example())
    api.put_service_available(Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue.example())
  }

  def timeTriggered(api: Availability_Observation_Operational_Api): Unit = {
    // example api usage


  }

  def finalise(api: Availability_Observation_Operational_Api): Unit = { }
}
