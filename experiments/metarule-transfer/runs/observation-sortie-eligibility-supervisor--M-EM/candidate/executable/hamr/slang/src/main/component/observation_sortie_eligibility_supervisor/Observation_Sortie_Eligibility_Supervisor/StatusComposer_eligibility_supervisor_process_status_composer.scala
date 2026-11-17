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
    val decision: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision = api.get_eligibility_decision().get
    val summary: Observation_Sortie_Eligibility_Supervisor.FaultSummary = api.get_fault_summary().get
    val recovery: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type = api.get_recovery_phase().get
    val request: Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type = api.get_request_phase().get
    val statusRequest: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Type = request match {
      case Observation_Sortie_Eligibility_Supervisor.RequestPhase.Pending => Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Pending
      case Observation_Sortie_Eligibility_Supervisor.RequestPhase.Released => Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Released
      case _ => Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Idle
    }
    val statusFault: Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Type =
      if (summary.faultState == Observation_Sortie_Eligibility_Supervisor.FaultState.Active) Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Active
      else Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Clear
    val statusRecovery: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Type = recovery match {
      case Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal => Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Normal
      case Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.AwaitingAck => Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.AwaitingAck
      case _ => Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Quarantined
    }
    val statusDecision: Observation_Sortie_Eligibility_Supervisor.StatusDecision.Type =
      if (decision.directive == Observation_Sortie_Eligibility_Supervisor.SortieDirective.Permit) Observation_Sortie_Eligibility_Supervisor.StatusDecision.Permit
      else Observation_Sortie_Eligibility_Supervisor.StatusDecision.Withhold
    val cause: Observation_Sortie_Eligibility_Supervisor.LimitingCause.Type = decision.reason match {
      case Observation_Sortie_Eligibility_Supervisor.EligibilityReason.None => Observation_Sortie_Eligibility_Supervisor.LimitingCause.None
      case Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Recovery => Observation_Sortie_Eligibility_Supervisor.LimitingCause.Recovery
      case Observation_Sortie_Eligibility_Supervisor.EligibilityReason.NoRequest => Observation_Sortie_Eligibility_Supervisor.LimitingCause.NoRequest
      case _ =>
        summary.primaryCause match {
          case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Energy => Observation_Sortie_Eligibility_Supervisor.LimitingCause.Energy
          case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Propulsion => Observation_Sortie_Eligibility_Supervisor.LimitingCause.Propulsion
          case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Navigation => Observation_Sortie_Eligibility_Supervisor.LimitingCause.Navigation
          case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Obstacle => Observation_Sortie_Eligibility_Supervisor.LimitingCause.Obstacle
          case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Observation => Observation_Sortie_Eligibility_Supervisor.LimitingCause.Observation
          case _ => Observation_Sortie_Eligibility_Supervisor.LimitingCause.Communication
        }
    }
    api.put_eligibility_status(Observation_Sortie_Eligibility_Supervisor.EligibilityStatus(
      statusRequest, statusFault, statusRecovery, statusDecision, cause))
  }

  def finalise(api: StatusComposer_Operational_Api): Unit = { }
}
