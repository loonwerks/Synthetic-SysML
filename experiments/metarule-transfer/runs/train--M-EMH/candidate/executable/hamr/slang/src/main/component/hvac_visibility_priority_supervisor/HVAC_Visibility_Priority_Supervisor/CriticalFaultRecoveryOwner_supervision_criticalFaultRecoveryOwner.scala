// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner {

  var recovery: HVAC_Visibility_Priority_Supervisor.RecoveryState.Type =
    HVAC_Visibility_Priority_Supervisor.RecoveryState.Clear

  def initialise(api: CriticalFaultRecoveryOwner_Initialization_Api): Unit = {
    recovery = HVAC_Visibility_Priority_Supervisor.RecoveryState.Clear
    api.put_recoveryReport(HVAC_Visibility_Priority_Supervisor.RecoveryReport(
      HVAC_Visibility_Priority_Supervisor.RecoveryState.Clear,
      HVAC_Visibility_Priority_Supervisor.RecoveryEvent.NoRecoveryEvent,
      HVAC_Visibility_Priority_Supervisor.RecoveryCause.None))
  }

  def timeTriggered(api: CriticalFaultRecoveryOwner_Operational_Api): Unit = {
    val acknowledgement = api.get_recoveryAcknowledgment() match {
      case Some(value) => value
      case _ => HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Absent
    }
    val visibilityFault = api.get_visibilityFault() match {
      case Some(value) => value
      case _ => HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present
    }
    val equipmentFault = api.get_criticalEquipment() match {
      case Some(value) => value
      case _ => HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Present
    }
    val electricalFault = api.get_criticalElectrical() match {
      case Some(value) => value
      case _ => HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Present
    }
    val faultPresent = visibilityFault == HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present ||
      equipmentFault == HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Present ||
      electricalFault == HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Present
    val cause =
      if (visibilityFault == HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present)
        HVAC_Visibility_Priority_Supervisor.RecoveryCause.InvalidVisibility
      else if (equipmentFault == HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Present)
        HVAC_Visibility_Priority_Supervisor.RecoveryCause.EquipmentFault
      else if (electricalFault == HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Present)
        HVAC_Visibility_Priority_Supervisor.RecoveryCause.ElectricalUnavailable
      else HVAC_Visibility_Priority_Supervisor.RecoveryCause.AwaitingRecovery
    val report = recovery match {
      case HVAC_Visibility_Priority_Supervisor.RecoveryState.Clear if faultPresent =>
        recovery = HVAC_Visibility_Priority_Supervisor.RecoveryState.Latched
        HVAC_Visibility_Priority_Supervisor.RecoveryReport(recovery,
          HVAC_Visibility_Priority_Supervisor.RecoveryEvent.FaultEntered, cause)
      case HVAC_Visibility_Priority_Supervisor.RecoveryState.Clear =>
        HVAC_Visibility_Priority_Supervisor.RecoveryReport(recovery,
          HVAC_Visibility_Priority_Supervisor.RecoveryEvent.NoRecoveryEvent,
          HVAC_Visibility_Priority_Supervisor.RecoveryCause.None)
      case HVAC_Visibility_Priority_Supervisor.RecoveryState.Latched if faultPresent ||
        acknowledgement != HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Fresh =>
        HVAC_Visibility_Priority_Supervisor.RecoveryReport(recovery,
          HVAC_Visibility_Priority_Supervisor.RecoveryEvent.AwaitingRecovery, cause)
      case HVAC_Visibility_Priority_Supervisor.RecoveryState.Latched =>
        recovery = HVAC_Visibility_Priority_Supervisor.RecoveryState.Pending
        HVAC_Visibility_Priority_Supervisor.RecoveryReport(recovery,
          HVAC_Visibility_Priority_Supervisor.RecoveryEvent.RecoveryStarted,
          HVAC_Visibility_Priority_Supervisor.RecoveryCause.AwaitingRecovery)
      case HVAC_Visibility_Priority_Supervisor.RecoveryState.Pending if faultPresent =>
        recovery = HVAC_Visibility_Priority_Supervisor.RecoveryState.Latched
        HVAC_Visibility_Priority_Supervisor.RecoveryReport(recovery,
          HVAC_Visibility_Priority_Supervisor.RecoveryEvent.FaultRecurred, cause)
      case _ =>
        recovery = HVAC_Visibility_Priority_Supervisor.RecoveryState.Clear
        HVAC_Visibility_Priority_Supervisor.RecoveryReport(recovery,
          HVAC_Visibility_Priority_Supervisor.RecoveryEvent.JustCleared,
          HVAC_Visibility_Priority_Supervisor.RecoveryCause.None)
    }
    api.put_recoveryReport(report)
  }

  def finalise(api: CriticalFaultRecoveryOwner_Operational_Api): Unit = { }
}
