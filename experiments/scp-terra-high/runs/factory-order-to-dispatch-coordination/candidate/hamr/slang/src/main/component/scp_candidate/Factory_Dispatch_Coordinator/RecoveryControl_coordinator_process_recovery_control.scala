// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryControl_coordinator_process_recovery_control {

  // BEGIN STATE VARS
  var retained_recovery: Factory_Dispatch_Coordinator.RecoveryState.Type = Factory_Dispatch_Coordinator.RecoveryState.HEALTHY
  // END STATE VARS

  def initialise(api: RecoveryControl_Initialization_Api): Unit = {
    Contract(
      Modifies(api, retained_recovery),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_RECOVERY_HEALTHY
        retained_recovery == RecoveryState.HEALTHY &&
          api.recovery_state == RecoveryState.HEALTHY &&
          api.recovery_gate == RecoveryGate.OPEN &&
          api.emergency_state == EmergencyState.INACTIVE
        // END INITIALIZES ENSURES
      )
    )
    retained_recovery = RecoveryState.HEALTHY
    api.put_recovery_gate(RecoveryGate.OPEN)
    api.put_emergency_state(EmergencyState.INACTIVE)
    api.put_recovery_state(RecoveryState.HEALTHY)
  }

  def timeTriggered(api: RecoveryControl_Operational_Api): Unit = {
    Contract(Modifies(api, retained_recovery))
    val outcome: QualifiedOutcome.Type = api.get_qualified_outcome().get
    val event: RecoveryEvent.Type = api.get_recovery_event().get
    retained_recovery =
      if (outcome == QualifiedOutcome.FAULT) { RecoveryState.LATCHED }
      else if (retained_recovery == RecoveryState.LATCHED && event == RecoveryEvent.RESET)
        { RecoveryState.RECOVERING }
      else if (retained_recovery == RecoveryState.RECOVERING && event == RecoveryEvent.VERIFY_OK)
        { RecoveryState.HEALTHY }
      else { retained_recovery }
    api.put_recovery_state(retained_recovery)
    if (retained_recovery == RecoveryState.HEALTHY) {
      api.put_recovery_gate(RecoveryGate.OPEN)
      api.put_emergency_state(EmergencyState.INACTIVE)
    } else {
      api.put_recovery_gate(RecoveryGate.CLOSED)
      api.put_emergency_state(EmergencyState.ACTIVE)
    }
  }

  def finalise(api: RecoveryControl_Operational_Api): Unit = { }
}
