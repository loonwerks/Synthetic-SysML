// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_supervisor_process_recovery_qualification {

  var recoveryMemory: RecoveryPhase.Type = RecoveryPhase.AWAITING_ACK

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    recoveryMemory = RecoveryPhase.AWAITING_ACK
    api.put_recovery_frame(RecoveryFrame(RecoveryPhase.AWAITING_ACK, RecoveryGate.CLOSED))
    api.put_recovery_gate(RecoveryGate.CLOSED)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    recoveryMemory = RecoveryPhase.AWAITING_ACK
    api.put_recovery_frame(RecoveryFrame(RecoveryPhase.AWAITING_ACK, RecoveryGate.CLOSED))
    api.put_recovery_gate(RecoveryGate.CLOSED)
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
