// #Sireum

package scp_candidate.Station_Cargo_Transfer_Verification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier {

  def initialise(api: ServiceReadinessQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee SERVICE_INITIAL
        api.serviceEligibility == ServiceEligibility.Ineligible &&
          api.gateEligibility == ServiceEligibility.Ineligible
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_serviceEligibility(Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Ineligible)
    api.put_gateEligibility(Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Ineligible)
  }

  def timeTriggered(api: ServiceReadinessQualifier_Operational_Api): Unit = { }
  def finalise(api: ServiceReadinessQualifier_Operational_Api): Unit = { }
}
