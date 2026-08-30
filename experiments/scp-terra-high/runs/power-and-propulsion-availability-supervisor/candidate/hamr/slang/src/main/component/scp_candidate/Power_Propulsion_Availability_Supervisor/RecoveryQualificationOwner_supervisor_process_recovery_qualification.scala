// #Sireum

package scp_candidate.Power_Propulsion_Availability_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_supervisor_process_recovery_qualification {

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_RECOVERY_CLOSED
        api.recovery_frame.phase == RecoveryPhase.AWAITING_ACK &&
          api.recovery_frame.gate == RecoveryGate.CLOSED &&
          api.recovery_gate == RecoveryGate.CLOSED
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recovery_frame(Power_Propulsion_Availability_Supervisor.RecoveryFrame(
      RecoveryPhase.AWAITING_ACK, RecoveryGate.CLOSED))
    api.put_recovery_gate(Power_Propulsion_Availability_Supervisor.RecoveryGate.CLOSED)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
