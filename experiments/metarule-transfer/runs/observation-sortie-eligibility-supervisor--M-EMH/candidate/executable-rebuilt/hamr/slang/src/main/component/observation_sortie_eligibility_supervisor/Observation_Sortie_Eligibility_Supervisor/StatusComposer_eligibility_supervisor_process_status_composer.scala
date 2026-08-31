// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object StatusComposer_eligibility_supervisor_process_status_composer {

  def initialise(api: StatusComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibility_status(EligibilityStatus(
      StatusRequestPhase.Idle, StatusFaultState.Clear, StatusRecoveryPhase.Quarantined,
      StatusDecision.Withhold, LimitingCause.Recovery))
  }

  def timeTriggered(api: StatusComposer_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case STATUS_OWNER_FACTS
        (T) ___>: ((api.request_phase == RequestPhase.Idle &
          api.eligibility_status.requestPhase == StatusRequestPhase.Idle |
          api.request_phase == RequestPhase.Pending &
            api.eligibility_status.requestPhase == StatusRequestPhase.Pending |
          api.request_phase == RequestPhase.Released &
            api.eligibility_status.requestPhase == StatusRequestPhase.Released) &
          (api.fault_summary.faultState == FaultState.Clear &
            api.eligibility_status.faultState == StatusFaultState.Clear |
            api.fault_summary.faultState == FaultState.Active &
              api.eligibility_status.faultState == StatusFaultState.Active) &
          (api.recovery_phase == RecoveryPhase.Normal &
            api.eligibility_status.recoveryPhase == StatusRecoveryPhase.Normal |
            api.recovery_phase == RecoveryPhase.Quarantined &
              api.eligibility_status.recoveryPhase == StatusRecoveryPhase.Quarantined |
            api.recovery_phase == RecoveryPhase.AwaitingAck &
              api.eligibility_status.recoveryPhase == StatusRecoveryPhase.AwaitingAck) &
          (api.eligibility_decision.directive == SortieDirective.Withhold &
            api.eligibility_status.decisionDirective == StatusDecision.Withhold |
            api.eligibility_decision.directive == SortieDirective.Permit &
              api.eligibility_status.decisionDirective == StatusDecision.Permit)),
        // case STATUS_NO_LIMIT
        (api.eligibility_decision.reason == EligibilityReason.None) ___>: (api.eligibility_status.limitingCause == LimitingCause.None),
        // case STATUS_RECOVERY_LIMIT
        (api.eligibility_decision.reason == EligibilityReason.Recovery) ___>: (api.eligibility_status.limitingCause == LimitingCause.Recovery),
        // case STATUS_NO_REQUEST_LIMIT
        (api.eligibility_decision.reason == EligibilityReason.NoRequest) ___>: (api.eligibility_status.limitingCause == LimitingCause.NoRequest),
        // case STATUS_ENERGY_LIMIT
        (api.eligibility_decision.reason == EligibilityReason.Equipment &
          api.fault_summary.primaryCause == EquipmentCause.Energy) ___>: (api.eligibility_status.limitingCause == LimitingCause.Energy),
        // case STATUS_PROPULSION_LIMIT
        (api.eligibility_decision.reason == EligibilityReason.Equipment &
          api.fault_summary.primaryCause == EquipmentCause.Propulsion) ___>: (api.eligibility_status.limitingCause == LimitingCause.Propulsion),
        // case STATUS_NAVIGATION_LIMIT
        (api.eligibility_decision.reason == EligibilityReason.Equipment &
          api.fault_summary.primaryCause == EquipmentCause.Navigation) ___>: (api.eligibility_status.limitingCause == LimitingCause.Navigation),
        // case STATUS_OBSTACLE_LIMIT
        (api.eligibility_decision.reason == EligibilityReason.Equipment &
          api.fault_summary.primaryCause == EquipmentCause.Obstacle) ___>: (api.eligibility_status.limitingCause == LimitingCause.Obstacle),
        // case STATUS_OBSERVATION_LIMIT
        (api.eligibility_decision.reason == EligibilityReason.Equipment &
          api.fault_summary.primaryCause == EquipmentCause.Observation) ___>: (api.eligibility_status.limitingCause == LimitingCause.Observation),
        // case STATUS_COMMUNICATION_LIMIT
        (api.eligibility_decision.reason == EligibilityReason.Equipment &
          api.fault_summary.primaryCause == EquipmentCause.Communication) ___>: (api.eligibility_status.limitingCause == LimitingCause.Communication)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val decision = api.get_eligibility_decision().get
    val fault = api.get_fault_summary().get
    val recovery = api.get_recovery_phase().get
    val request = api.get_request_phase().get
    val requestStatus: StatusRequestPhase.Type =
      if (request == RequestPhase.Idle) StatusRequestPhase.Idle
      else if (request == RequestPhase.Pending) StatusRequestPhase.Pending
      else StatusRequestPhase.Released
    val faultStatus: StatusFaultState.Type =
      if (fault.faultState == FaultState.Clear) StatusFaultState.Clear else StatusFaultState.Active
    val recoveryStatus: StatusRecoveryPhase.Type =
      if (recovery == RecoveryPhase.Normal) StatusRecoveryPhase.Normal
      else if (recovery == RecoveryPhase.Quarantined) StatusRecoveryPhase.Quarantined
      else StatusRecoveryPhase.AwaitingAck
    val decisionStatus: StatusDecision.Type =
      if (decision.directive == SortieDirective.Permit) StatusDecision.Permit else StatusDecision.Withhold
    val cause: LimitingCause.Type =
      if (decision.reason == EligibilityReason.None) LimitingCause.None
      else if (decision.reason == EligibilityReason.Recovery) LimitingCause.Recovery
      else if (decision.reason == EligibilityReason.NoRequest) LimitingCause.NoRequest
      else if (fault.primaryCause == EquipmentCause.Energy) LimitingCause.Energy
      else if (fault.primaryCause == EquipmentCause.Propulsion) LimitingCause.Propulsion
      else if (fault.primaryCause == EquipmentCause.Navigation) LimitingCause.Navigation
      else if (fault.primaryCause == EquipmentCause.Obstacle) LimitingCause.Obstacle
      else if (fault.primaryCause == EquipmentCause.Observation) LimitingCause.Observation
      else LimitingCause.Communication
    api.put_eligibility_status(EligibilityStatus(requestStatus, faultStatus, recoveryStatus, decisionStatus, cause))
  }

  def finalise(api: StatusComposer_Operational_Api): Unit = { }
}
