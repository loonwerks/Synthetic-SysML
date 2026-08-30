// #Sireum

package scp_candidate.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner {

  def initialise(api: RecoveryEligibilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_decisionToEpisode(Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.NotApplicable)
    api.put_decisionToDemand(Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.NotApplicable)
    api.put_decisionToMode(Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.NotApplicable)
  }

  def timeTriggered(api: RecoveryEligibilityOwner_Operational_Api): Unit = { }
  def finalise(api: RecoveryEligibilityOwner_Operational_Api): Unit = { }
}
