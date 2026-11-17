// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AtomicResultPublisher_supervision_atomicResultPublisher {

  def initialise(api: AtomicResultPublisher_Initialization_Api): Unit = {
    api.put_actuationPlan(safePlan())
    api.put_supervisorStatus(HVAC_Visibility_Priority_Supervisor.SupervisorStatus(
      HVAC_Visibility_Priority_Supervisor.SupervisorMode.Idle,
      HVAC_Visibility_Priority_Supervisor.StatusCause.None))
  }

  def timeTriggered(api: AtomicResultPublisher_Operational_Api): Unit = {
    (api.get_candidatePlan(), api.get_arbitrationStatus(), api.get_recoveryReport()) match {
      case (Some(candidate), Some(arbitration), Some(recovery)) =>
        if (recovery.recoveryState != HVAC_Visibility_Priority_Supervisor.RecoveryState.Clear ||
          arbitration.controlMode == HVAC_Visibility_Priority_Supervisor.ArbitrationMode.FaultHold) {
          api.put_actuationPlan(safePlan())
          api.put_supervisorStatus(HVAC_Visibility_Priority_Supervisor.SupervisorStatus(
            HVAC_Visibility_Priority_Supervisor.SupervisorMode.FaultHold, statusCause(recovery, arbitration, candidate)))
        } else if (arbitration.controlMode == HVAC_Visibility_Priority_Supervisor.ArbitrationMode.AwaitFresh) {
          api.put_actuationPlan(safePlan())
          api.put_supervisorStatus(HVAC_Visibility_Priority_Supervisor.SupervisorStatus(
            HVAC_Visibility_Priority_Supervisor.SupervisorMode.AwaitFresh,
            HVAC_Visibility_Priority_Supervisor.StatusCause.AwaitingFreshRequest))
        } else {
          val mode =
            if (candidate.candidateCause == HVAC_Visibility_Priority_Supervisor.CandidateCause.ElectricalDenied ||
              arbitration.noncriticalCause != HVAC_Visibility_Priority_Supervisor.NoncriticalCause.None)
              HVAC_Visibility_Priority_Supervisor.SupervisorMode.Degraded
            else arbitration.controlMode match {
              case HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Active =>
                HVAC_Visibility_Priority_Supervisor.SupervisorMode.Active
              case HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Degraded =>
                HVAC_Visibility_Priority_Supervisor.SupervisorMode.Degraded
              case _ => HVAC_Visibility_Priority_Supervisor.SupervisorMode.Idle
            }
          api.put_actuationPlan(candidate.plan)
          api.put_supervisorStatus(HVAC_Visibility_Priority_Supervisor.SupervisorStatus(
            mode, statusCause(recovery, arbitration, candidate)))
        }
      case _ =>
        api.put_actuationPlan(safePlan())
        api.put_supervisorStatus(HVAC_Visibility_Priority_Supervisor.SupervisorStatus(
          HVAC_Visibility_Priority_Supervisor.SupervisorMode.FaultHold,
          HVAC_Visibility_Priority_Supervisor.StatusCause.ElectricalUnavailable))
    }
  }

  def finalise(api: AtomicResultPublisher_Operational_Api): Unit = { }

  def safePlan(): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan = {
    return HVAC_Visibility_Priority_Supervisor.CabinActuationPlan(
      HVAC_Visibility_Priority_Supervisor.Service.None,
      HVAC_Visibility_Priority_Supervisor.Intensity.Off,
      HVAC_Visibility_Priority_Supervisor.HeatSource.None,
      HVAC_Visibility_Priority_Supervisor.EnergyTier.None)
  }

  def statusCause(recovery: HVAC_Visibility_Priority_Supervisor.RecoveryReport,
                  arbitration: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus,
                  candidate: HVAC_Visibility_Priority_Supervisor.CandidatePlan):
    HVAC_Visibility_Priority_Supervisor.StatusCause.Type = {
    if (recovery.recoveryState != HVAC_Visibility_Priority_Supervisor.RecoveryState.Clear) return recovery.faultAttribution match {
      case HVAC_Visibility_Priority_Supervisor.RecoveryCause.InvalidVisibility => HVAC_Visibility_Priority_Supervisor.StatusCause.InvalidVisibility
      case HVAC_Visibility_Priority_Supervisor.RecoveryCause.EquipmentFault => HVAC_Visibility_Priority_Supervisor.StatusCause.EquipmentFault
      case HVAC_Visibility_Priority_Supervisor.RecoveryCause.ElectricalUnavailable => HVAC_Visibility_Priority_Supervisor.StatusCause.ElectricalUnavailable
      case _ => HVAC_Visibility_Priority_Supervisor.StatusCause.AwaitingRecovery
    }
    if (arbitration.controlMode == HVAC_Visibility_Priority_Supervisor.ArbitrationMode.AwaitFresh) return HVAC_Visibility_Priority_Supervisor.StatusCause.AwaitingFreshRequest
    if (candidate.candidateCause == HVAC_Visibility_Priority_Supervisor.CandidateCause.ElectricalDenied) return HVAC_Visibility_Priority_Supervisor.StatusCause.ElectricalDenied
    if (arbitration.arbitrationCause == HVAC_Visibility_Priority_Supervisor.ArbitrationCause.VisibilityPriority) return HVAC_Visibility_Priority_Supervisor.StatusCause.VisibilityPriority
    return arbitration.noncriticalCause match {
      case HVAC_Visibility_Priority_Supervisor.NoncriticalCause.InvalidAirQuality => HVAC_Visibility_Priority_Supervisor.StatusCause.InvalidAirQuality
      case HVAC_Visibility_Priority_Supervisor.NoncriticalCause.InvalidHumidity => HVAC_Visibility_Priority_Supervisor.StatusCause.InvalidHumidity
      case HVAC_Visibility_Priority_Supervisor.NoncriticalCause.InvalidThermal => HVAC_Visibility_Priority_Supervisor.StatusCause.InvalidThermal
      case _ => HVAC_Visibility_Priority_Supervisor.StatusCause.None
    }
  }
}
