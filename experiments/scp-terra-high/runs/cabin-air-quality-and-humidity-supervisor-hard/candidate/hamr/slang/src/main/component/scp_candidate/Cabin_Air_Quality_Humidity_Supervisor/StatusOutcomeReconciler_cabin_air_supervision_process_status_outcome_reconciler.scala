// #Sireum

package scp_candidate.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler {

  def initialise(api: StatusOutcomeReconciler_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_supervisor_status(Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus.example())
  }

  def timeTriggered(api: StatusOutcomeReconciler_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: StatusOutcomeReconciler_Operational_Api): Unit = { }
}
