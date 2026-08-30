// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AccessCoherence_supervisor_process_access_coherence {

  def initialise(api: AccessCoherence_Initialization_Api): Unit = {
    Contract(Modifies(api))
    publishSafe(api)
  }

  def timeTriggered(api: AccessCoherence_Operational_Api): Unit = {
    Contract(Modifies(api))
    publishSafe(api)
  }

  def publishSafe(api: AccessCoherence_Api): Unit = {
    Contract(Modifies(api))
    val c = Docking_Access_Supervisor.Correlation.NONE
    val clear = Docking_Access_Supervisor.DecisionContext.CLEAR
    api.put_recovery_transition(Docking_Access_Supervisor.RecoveryTransition(
      Docking_Access_Supervisor.RecoveryIntent.RETAIN, F, F))
    api.put_admission_guard(Docking_Access_Supervisor.AdmissionGuard(
      F, Docking_Access_Supervisor.LifecycleState.CLEAR_IDLE, c, T, T, T))
    api.put_lifecycle_frame(Docking_Access_Supervisor.CoordinationFrame(
      Docking_Access_Supervisor.LifecycleDirective.RETAIN, c, F, clear))
    api.put_berth_transition_evidence(Docking_Access_Supervisor.BerthTransitionEvidence(
      Docking_Access_Supervisor.BerthEvidenceKind.NO_EVENT, c, F))
    api.put_gate_safety_frame(Docking_Access_Supervisor.GateSafetyFrame(
      Docking_Access_Supervisor.GateDirective.RETAIN, F, clear))
    api.put_docking_frame(Docking_Access_Supervisor.CoordinationFrame(
      Docking_Access_Supervisor.LifecycleDirective.RETAIN, c, F, clear))
    api.put_access_frame(Docking_Access_Supervisor.CoordinationFrame(
      Docking_Access_Supervisor.LifecycleDirective.RETAIN, c, F, clear))
    api.put_undocking_frame(Docking_Access_Supervisor.CoordinationFrame(
      Docking_Access_Supervisor.LifecycleDirective.RETAIN, c, F, clear))
    api.put_priority_directive(Docking_Access_Supervisor.PriorityDirective(
      Docking_Access_Supervisor.PriorityKind.ORDINARY, c, clear))
  }

  def finalise(api: AccessCoherence_Operational_Api): Unit = { }
}
