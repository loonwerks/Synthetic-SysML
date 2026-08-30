// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Availability_Observation_supervisor_process_availability_observation {

  def initialise(api: Availability_Observation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_mining_available(Mining_Threat_Retreat_Supervision.MiningAvailabilityValue(F))
    api.put_defense_available(Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue(F))
    api.put_retreat_available(Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue(F))
    api.put_destination_available(Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue(F))
    api.put_service_available(Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue(F))
  }

  def timeTriggered(api: Availability_Observation_Operational_Api): Unit = { }

  def finalise(api: Availability_Observation_Operational_Api): Unit = { }
}
