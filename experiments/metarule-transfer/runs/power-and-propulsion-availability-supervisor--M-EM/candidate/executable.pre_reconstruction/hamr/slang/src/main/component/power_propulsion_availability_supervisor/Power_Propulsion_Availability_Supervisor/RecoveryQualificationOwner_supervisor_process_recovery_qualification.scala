// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_supervisor_process_recovery_qualification {

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recovery_frame(Power_Propulsion_Availability_Supervisor.RecoveryFrame.example())
    api.put_recovery_gate(Power_Propulsion_Availability_Supervisor.RecoveryGate.OPEN)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_fault_action_summary: Option[Power_Propulsion_Availability_Supervisor.FaultActionSummary] = api.get_fault_action_summary()
    api.logInfo(s"Received on data port fault_action_summary: ${apiUsage_fault_action_summary}")
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
