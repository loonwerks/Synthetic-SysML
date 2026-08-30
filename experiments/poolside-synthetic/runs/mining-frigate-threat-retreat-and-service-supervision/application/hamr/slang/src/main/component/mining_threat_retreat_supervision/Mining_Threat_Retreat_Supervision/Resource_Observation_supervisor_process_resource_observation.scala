// #Sireum

package mining_threat_retreat_supervision.Mining_Threat_Retreat_Supervision

import org.sireum._
import mining_threat_retreat_supervision._

// This file will not be overwritten if HAMR codegen is rerun
object Resource_Observation_supervisor_process_resource_observation {

  def initialise(api: Resource_Observation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_cargo_band(Mining_Threat_Retreat_Supervision.CargoBandValue.example())
    api.put_capacitor_band(Mining_Threat_Retreat_Supervision.CapacitorBandValue.example())
    api.put_location(Mining_Threat_Retreat_Supervision.LocationValue.example())
  }

  def timeTriggered(api: Resource_Observation_Operational_Api): Unit = {
    // example api usage


  }

  def finalise(api: Resource_Observation_Operational_Api): Unit = { }
}
