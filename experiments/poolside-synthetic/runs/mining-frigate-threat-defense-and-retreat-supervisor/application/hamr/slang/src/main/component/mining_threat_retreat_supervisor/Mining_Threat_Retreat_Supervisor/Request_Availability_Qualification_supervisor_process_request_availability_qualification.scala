// #Sireum

package mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor

import org.sireum._
import mining_threat_retreat_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Availability_Qualification_supervisor_process_request_availability_qualification {

  def initialise(api: Request_Availability_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_request(Mining_Threat_Retreat_Supervisor.Request_Observation.example())
    api.put_qualified_mining_availability(Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation.example())
    api.put_qualified_defense_availability(Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation.example())
    api.put_qualified_retreat_availability(Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation.example())
  }

  def timeTriggered(api: Request_Availability_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRESERVE_REQUEST_AND_AVAILABILITY
        //   Request Availability Qualification shall set qualified request to raw request, qualified mining availability to raw mining availability, qualified defense availability to raw defense availability, and qualified retreat availability to raw retreat availability
        api.qualified_request == api.raw_request &
          api.qualified_mining_availability == api.raw_mining_availability &
          api.qualified_defense_availability == api.raw_defense_availability &
          api.qualified_retreat_availability == api.raw_retreat_availability
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_raw_request: Option[Mining_Threat_Retreat_Supervisor.Request_Observation] = api.get_raw_request()
    api.put_qualified_request(apiUsage_raw_request.get)
    val apiUsage_raw_mining_availability: Option[Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation] = api.get_raw_mining_availability()
    api.put_qualified_mining_availability(apiUsage_raw_mining_availability.get)
    val apiUsage_raw_defense_availability: Option[Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation] = api.get_raw_defense_availability()
    api.put_qualified_defense_availability(apiUsage_raw_defense_availability.get)
    val apiUsage_raw_retreat_availability: Option[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation] = api.get_raw_retreat_availability()
    api.put_qualified_retreat_availability(apiUsage_raw_retreat_availability.get)
    api.logInfo(s"Received on data port raw_request: ${apiUsage_raw_request}")
    api.logInfo(s"Received on data port raw_mining_availability: ${apiUsage_raw_mining_availability}")
    api.logInfo(s"Received on data port raw_defense_availability: ${apiUsage_raw_defense_availability}")
    api.logInfo(s"Received on data port raw_retreat_availability: ${apiUsage_raw_retreat_availability}")
  }

  def finalise(api: Request_Availability_Qualification_Operational_Api): Unit = { }
}
