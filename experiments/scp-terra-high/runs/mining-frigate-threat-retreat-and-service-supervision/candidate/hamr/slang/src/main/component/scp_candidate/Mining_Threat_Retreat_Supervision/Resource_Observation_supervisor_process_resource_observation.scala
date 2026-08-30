// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Resource_Observation_supervisor_process_resource_observation {

  def initialise(api: Resource_Observation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_cargo_band(Mining_Threat_Retreat_Supervision.CargoBandValue(s32"0"))
    api.put_capacitor_band(Mining_Threat_Retreat_Supervision.CapacitorBandValue(s32"0"))
    api.put_location(Mining_Threat_Retreat_Supervision.LocationValue(s32"0"))
  }

  def timeTriggered(api: Resource_Observation_Operational_Api): Unit = { }

  def finalise(api: Resource_Observation_Operational_Api): Unit = { }
}
