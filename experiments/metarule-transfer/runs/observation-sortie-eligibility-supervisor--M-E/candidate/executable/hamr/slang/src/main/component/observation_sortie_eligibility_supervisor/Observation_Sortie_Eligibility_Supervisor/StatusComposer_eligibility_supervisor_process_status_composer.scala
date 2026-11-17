// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object StatusComposer_eligibility_supervisor_process_status_composer {

  def initialise(api: StatusComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibility_status(Observation_Sortie_Eligibility_Supervisor.EligibilityStatus(
      Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Idle,
      Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Clear,
      Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Quarantined,
      Observation_Sortie_Eligibility_Supervisor.StatusDecision.Withhold,
      Observation_Sortie_Eligibility_Supervisor.LimitingCause.Recovery))
  }

  def timeTriggered(api: StatusComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    val decision: Option[Observation_Sortie_Eligibility_Supervisor.EligibilityDecision] = api.get_eligibility_decision()
    val fault: Option[Observation_Sortie_Eligibility_Supervisor.FaultSummary] = api.get_fault_summary()
    val recovery: Option[Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type] = api.get_recovery_phase()
    val request: Option[Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type] = api.get_request_phase()
    var statusRequest: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Type =
      Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Idle
    var statusFault: Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Type =
      Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Clear
    var statusRecovery: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Type =
      Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Quarantined
    var statusDecision: Observation_Sortie_Eligibility_Supervisor.StatusDecision.Type =
      Observation_Sortie_Eligibility_Supervisor.StatusDecision.Withhold
    var cause: Observation_Sortie_Eligibility_Supervisor.LimitingCause.Type =
      Observation_Sortie_Eligibility_Supervisor.LimitingCause.Recovery
    request match {
      case Some(Observation_Sortie_Eligibility_Supervisor.RequestPhase.Pending) =>
        statusRequest = Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Pending
      case Some(Observation_Sortie_Eligibility_Supervisor.RequestPhase.Released) =>
        statusRequest = Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Released
      case _ =>
    }
    fault match {
      case Some(f) if f.faultState == Observation_Sortie_Eligibility_Supervisor.FaultState.Active =>
        statusFault = Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Active
      case _ =>
    }
    recovery match {
      case Some(Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal) =>
        statusRecovery = Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Normal
      case Some(Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.AwaitingAck) =>
        statusRecovery = Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.AwaitingAck
      case _ =>
    }
    decision match {
      case Some(d) =>
        if (d.directive == Observation_Sortie_Eligibility_Supervisor.SortieDirective.Permit) {
          statusDecision = Observation_Sortie_Eligibility_Supervisor.StatusDecision.Permit
        }
        if (d.reason == Observation_Sortie_Eligibility_Supervisor.EligibilityReason.None) {
          cause = Observation_Sortie_Eligibility_Supervisor.LimitingCause.None
        } else if (d.reason == Observation_Sortie_Eligibility_Supervisor.EligibilityReason.NoRequest) {
          cause = Observation_Sortie_Eligibility_Supervisor.LimitingCause.NoRequest
        } else if (d.reason == Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Equipment) {
          fault match {
            case Some(f) if f.primaryCause == Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Energy =>
              cause = Observation_Sortie_Eligibility_Supervisor.LimitingCause.Energy
            case Some(f) if f.primaryCause == Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Propulsion =>
              cause = Observation_Sortie_Eligibility_Supervisor.LimitingCause.Propulsion
            case Some(f) if f.primaryCause == Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Navigation =>
              cause = Observation_Sortie_Eligibility_Supervisor.LimitingCause.Navigation
            case Some(f) if f.primaryCause == Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Obstacle =>
              cause = Observation_Sortie_Eligibility_Supervisor.LimitingCause.Obstacle
            case Some(f) if f.primaryCause == Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Observation =>
              cause = Observation_Sortie_Eligibility_Supervisor.LimitingCause.Observation
            case _ => cause = Observation_Sortie_Eligibility_Supervisor.LimitingCause.Communication
          }
        }
      case _ =>
    }
    api.put_eligibility_status(Observation_Sortie_Eligibility_Supervisor.EligibilityStatus(
      statusRequest, statusFault, statusRecovery, statusDecision, cause))
  }

  def finalise(api: StatusComposer_Operational_Api): Unit = { }
}
