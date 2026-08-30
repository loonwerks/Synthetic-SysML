// #Sireum

package scp_candidate.Drone_Battery_Charge_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation {

  def initialise(api: Readiness_Evidence_Derivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_readiness_evidence(Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable)
  }

  def timeTriggered(api: Readiness_Evidence_Derivation_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: Readiness_Evidence_Derivation_Operational_Api): Unit = { }
}
