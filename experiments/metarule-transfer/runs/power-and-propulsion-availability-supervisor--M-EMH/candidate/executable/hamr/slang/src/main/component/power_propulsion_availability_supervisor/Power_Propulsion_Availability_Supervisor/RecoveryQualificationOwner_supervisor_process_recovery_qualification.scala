// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_supervisor_process_recovery_qualification {

  var recoveryMemory: Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type =
    Power_Propulsion_Availability_Supervisor.RecoveryPhase.AWAITING_ACK

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    recoveryMemory = Power_Propulsion_Availability_Supervisor.RecoveryPhase.AWAITING_ACK
    api.put_recovery_frame(Power_Propulsion_Availability_Supervisor.RecoveryFrame(
      Power_Propulsion_Availability_Supervisor.RecoveryPhase.AWAITING_ACK,
      Power_Propulsion_Availability_Supervisor.RecoveryGate.CLOSED))
    api.put_recovery_gate(Power_Propulsion_Availability_Supervisor.RecoveryGate.CLOSED)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    val summary: Power_Propulsion_Availability_Supervisor.FaultActionSummary = api.get_fault_action_summary() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.FaultActionSummary(
        Power_Propulsion_Availability_Supervisor.FaultStatus.ACTIVE,
        Power_Propulsion_Availability_Supervisor.FaultCause.CHARGER,
        Power_Propulsion_Availability_Supervisor.SummaryDirective.INHIBIT)
    }
    val pre: Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type = recoveryMemory
    if (summary.fault == Power_Propulsion_Availability_Supervisor.FaultStatus.ACTIVE) {
      recoveryMemory = Power_Propulsion_Availability_Supervisor.RecoveryPhase.QUARANTINED
    } else if (pre == Power_Propulsion_Availability_Supervisor.RecoveryPhase.QUARANTINED ||
               (pre == Power_Propulsion_Availability_Supervisor.RecoveryPhase.AWAITING_ACK &&
                summary.directive != Power_Propulsion_Availability_Supervisor.SummaryDirective.RECOVER)) {
      recoveryMemory = Power_Propulsion_Availability_Supervisor.RecoveryPhase.AWAITING_ACK
    } else {
      recoveryMemory = Power_Propulsion_Availability_Supervisor.RecoveryPhase.NORMAL
    }
    val gate: Power_Propulsion_Availability_Supervisor.RecoveryGate.Type =
      if (recoveryMemory == Power_Propulsion_Availability_Supervisor.RecoveryPhase.NORMAL)
        Power_Propulsion_Availability_Supervisor.RecoveryGate.OPEN
      else Power_Propulsion_Availability_Supervisor.RecoveryGate.CLOSED
    api.put_recovery_frame(Power_Propulsion_Availability_Supervisor.RecoveryFrame(recoveryMemory, gate))
    api.put_recovery_gate(gate)
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
