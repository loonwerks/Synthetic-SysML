// #Sireum

package mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor

import org.sireum._
import mining_threat_retreat_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Resource_Qualification_supervisor_process_resource_qualification {

  def initialise(api: Resource_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_cargo(Mining_Threat_Retreat_Supervisor.Cargo_Observation.example())
    api.put_qualified_capacitor(Mining_Threat_Retreat_Supervisor.Capacitor_Observation.example())
  }

  def timeTriggered(api: Resource_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRESERVE_RESOURCES
        //   Resource Qualification shall set qualified cargo to raw cargo and qualified capacitor to raw capacitor
        api.qualified_cargo == api.raw_cargo &
          api.qualified_capacitor == api.raw_capacitor
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_raw_cargo: Option[Mining_Threat_Retreat_Supervisor.Cargo_Observation] = api.get_raw_cargo()
    api.put_qualified_cargo(apiUsage_raw_cargo.get)
    val apiUsage_raw_capacitor: Option[Mining_Threat_Retreat_Supervisor.Capacitor_Observation] = api.get_raw_capacitor()
    api.put_qualified_capacitor(apiUsage_raw_capacitor.get)
    api.logInfo(s"Received on data port raw_cargo: ${apiUsage_raw_cargo}")
    api.logInfo(s"Received on data port raw_capacitor: ${apiUsage_raw_capacitor}")
  }

  def finalise(api: Resource_Qualification_Operational_Api): Unit = { }
}
