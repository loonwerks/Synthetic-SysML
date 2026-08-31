// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object StatusComposer_eligibility_supervisor_process_status_composer {

  def initialise(api: StatusComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibility_status(
      EligibilityStatus(
        StatusRequestPhase.Idle,
        StatusFaultState.Clear,
        StatusRecoveryPhase.Quarantined,
        StatusDecision.Withhold,
        LimitingCause.Recovery))
  }

  def timeTriggered(api: StatusComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    val decision: EligibilityDecision = api.get_eligibility_decision() match {
      case Some(value) => value
      case _ => EligibilityDecision(SortieDirective.Withhold, EligibilityReason.Recovery)
    }
    val fault: FaultSummary = api.get_fault_summary() match {
      case Some(value) => value
      case _ => FaultSummary(FaultState.Active, EquipmentCause.Energy)
    }
    val recovery: RecoveryPhase.Type = api.get_recovery_phase() match {
      case Some(value) => value
      case _ => RecoveryPhase.Quarantined
    }
    val request: RequestPhase.Type = api.get_request_phase() match {
      case Some(value) => value
      case _ => RequestPhase.Idle
    }
    val requestStatus: StatusRequestPhase.Type = request match {
      case RequestPhase.Pending => StatusRequestPhase.Pending
      case RequestPhase.Released => StatusRequestPhase.Released
      case _ => StatusRequestPhase.Idle
    }
    val faultStatus: StatusFaultState.Type =
      if (fault.faultState == FaultState.Clear) StatusFaultState.Clear else StatusFaultState.Active
    val recoveryStatus: StatusRecoveryPhase.Type = recovery match {
      case RecoveryPhase.Normal => StatusRecoveryPhase.Normal
      case RecoveryPhase.AwaitingAck => StatusRecoveryPhase.AwaitingAck
      case _ => StatusRecoveryPhase.Quarantined
    }
    val decisionStatus: StatusDecision.Type =
      if (decision.directive == SortieDirective.Permit) StatusDecision.Permit else StatusDecision.Withhold
    val cause: LimitingCause.Type = decision.reason match {
      case EligibilityReason.None => LimitingCause.None
      case EligibilityReason.Recovery => LimitingCause.Recovery
      case EligibilityReason.NoRequest => LimitingCause.NoRequest
      case _ => fault.primaryCause match {
        case EquipmentCause.Energy => LimitingCause.Energy
        case EquipmentCause.Propulsion => LimitingCause.Propulsion
        case EquipmentCause.Navigation => LimitingCause.Navigation
        case EquipmentCause.Obstacle => LimitingCause.Obstacle
        case EquipmentCause.Observation => LimitingCause.Observation
        case EquipmentCause.Communication => LimitingCause.Communication
        case _ => LimitingCause.Recovery
      }
    }
    api.put_eligibility_status(EligibilityStatus(requestStatus, faultStatus, recoveryStatus, decisionStatus, cause))
  }

  def finalise(api: StatusComposer_Operational_Api): Unit = { }
}
