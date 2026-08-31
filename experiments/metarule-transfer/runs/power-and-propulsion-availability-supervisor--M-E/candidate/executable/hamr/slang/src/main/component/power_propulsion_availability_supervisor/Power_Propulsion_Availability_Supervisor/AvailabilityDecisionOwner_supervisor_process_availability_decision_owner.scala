// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityDecisionOwner_supervisor_process_availability_decision_owner {

  def initialise(api: AvailabilityDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_availability_decision(AvailabilityDecision(
      AvailabilityValue.UNAVAILABLE, AvailabilityCause.RECOVERY))
    api.put_availability_report(AvailabilityReport(
      ReportAvailabilityValue.UNAVAILABLE, ReportAvailabilityCause.RECOVERY,
      ReportDemandPhase.IDLE, ReportRecoveryPhase.AWAITING_ACK))
  }

  def timeTriggered(api: AvailabilityDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val battery: Option[BatteryAssessment.Type] = api.get_battery_assessment()
    val power: Option[PowerAssessment.Type] = api.get_power_assessment()
    val propulsion: Option[PropulsionAssessment.Type] = api.get_propulsion_assessment()
    val charging: Option[ChargingAssessment.Type] = api.get_charging_assessment()
    val demand: Option[DemandPhase.Type] = api.get_demand_view()
    val summary: Option[FaultActionSummary] = api.get_fault_action_summary()
    val recovery: Option[RecoveryFrame] = api.get_recovery_frame()
    val allReady: B = battery == Some(BatteryAssessment.READY_NONE) &&
      power == Some(PowerAssessment.READY_NONE) &&
      propulsion == Some(PropulsionAssessment.READY_NONE) &&
      charging == Some(ChargingAssessment.READY_NONE)
    var summaryPermitsEnable: B = F
    var activeFault: B = T
    var operatorDisable: B = F
    var recoveryDirective: B = F
    var faultCause: FaultCause.Type = FaultCause.ODD_ENGINE_GROUP
    summary match {
      case Some(s) =>
        summaryPermitsEnable = s.fault == FaultStatus.CLEAR &&
          (s.directive == SummaryDirective.ENABLE || s.directive == SummaryDirective.HOLD)
        activeFault = s.fault == FaultStatus.ACTIVE
        operatorDisable = s.directive == SummaryDirective.DISABLE
        recoveryDirective = s.directive == SummaryDirective.RECOVER
        faultCause = s.cause
      case _ =>
    }
    var recoveryOpen: B = F
    var reportRecovery: ReportRecoveryPhase.Type = ReportRecoveryPhase.AWAITING_ACK
    recovery match {
      case Some(frame) =>
        recoveryOpen = frame.phase == RecoveryPhase.NORMAL && frame.gate == RecoveryGate.OPEN
        if (frame.phase == RecoveryPhase.NORMAL) {
          reportRecovery = ReportRecoveryPhase.NORMAL
        } else if (frame.phase == RecoveryPhase.QUARANTINED) {
          reportRecovery = ReportRecoveryPhase.QUARANTINED
        }
      case _ =>
    }
    val available: B = allReady && demand != Some(DemandPhase.IDLE) &&
      summaryPermitsEnable && recoveryOpen
    var cause: AvailabilityCause.Type = AvailabilityCause.NO_DEMAND
    if (available) {
      cause = AvailabilityCause.NONE
    } else if (charging != Some(ChargingAssessment.READY_NONE)) {
      cause = AvailabilityCause.CHARGER
    } else if (power != Some(PowerAssessment.READY_NONE)) {
      cause = AvailabilityCause.POWER_MANAGEMENT
    } else if (battery != Some(BatteryAssessment.READY_NONE)) {
      cause = AvailabilityCause.BATTERY
    } else if (propulsion == Some(PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP)) {
      cause = AvailabilityCause.ODD_ENGINE_GROUP
    } else if (propulsion == Some(PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP)) {
      cause = AvailabilityCause.EVEN_ENGINE_GROUP
    } else if (propulsion != Some(PropulsionAssessment.READY_NONE)) {
      cause = AvailabilityCause.CONFIGURATION
    } else if (activeFault) {
      if (faultCause == FaultCause.CHARGER) {
        cause = AvailabilityCause.CHARGER
      } else if (faultCause == FaultCause.POWER_MANAGEMENT) {
        cause = AvailabilityCause.POWER_MANAGEMENT
      } else if (faultCause == FaultCause.BATTERY) {
        cause = AvailabilityCause.BATTERY
      } else if (faultCause == FaultCause.EVEN_ENGINE_GROUP) {
        cause = AvailabilityCause.EVEN_ENGINE_GROUP
      } else if (faultCause == FaultCause.CONFIGURATION) {
        cause = AvailabilityCause.CONFIGURATION
      } else {
        cause = AvailabilityCause.ODD_ENGINE_GROUP
      }
    } else if (operatorDisable) {
      cause = AvailabilityCause.OPERATOR_DISABLE
    } else if (!recoveryOpen || recoveryDirective) {
      cause = AvailabilityCause.RECOVERY
    }
    var reportCause: ReportAvailabilityCause.Type = ReportAvailabilityCause.NO_DEMAND
    cause match {
      case AvailabilityCause.NONE => reportCause = ReportAvailabilityCause.NONE
      case AvailabilityCause.BATTERY => reportCause = ReportAvailabilityCause.BATTERY
      case AvailabilityCause.POWER_MANAGEMENT => reportCause = ReportAvailabilityCause.POWER_MANAGEMENT
      case AvailabilityCause.ODD_ENGINE_GROUP => reportCause = ReportAvailabilityCause.ODD_ENGINE_GROUP
      case AvailabilityCause.EVEN_ENGINE_GROUP => reportCause = ReportAvailabilityCause.EVEN_ENGINE_GROUP
      case AvailabilityCause.CONFIGURATION => reportCause = ReportAvailabilityCause.CONFIGURATION
      case AvailabilityCause.CHARGER => reportCause = ReportAvailabilityCause.CHARGER
      case AvailabilityCause.RECOVERY => reportCause = ReportAvailabilityCause.RECOVERY
      case AvailabilityCause.OPERATOR_DISABLE => reportCause = ReportAvailabilityCause.OPERATOR_DISABLE
      case _ =>
    }
    var reportDemand: ReportDemandPhase.Type = ReportDemandPhase.IDLE
    demand match {
      case Some(DemandPhase.REQUESTED) => reportDemand = ReportDemandPhase.REQUESTED
      case Some(DemandPhase.ACTIVE) => reportDemand = ReportDemandPhase.ACTIVE
      case _ =>
    }
    val decision: AvailabilityValue.Type =
      if (available) AvailabilityValue.AVAILABLE_FOR_ENABLE else AvailabilityValue.UNAVAILABLE
    val reportDecision: ReportAvailabilityValue.Type =
      if (available) ReportAvailabilityValue.AVAILABLE_FOR_ENABLE else ReportAvailabilityValue.UNAVAILABLE
    api.put_availability_decision(AvailabilityDecision(decision, cause))
    api.put_availability_report(AvailabilityReport(reportDecision, reportCause, reportDemand, reportRecovery))
  }

  def finalise(api: AvailabilityDecisionOwner_Operational_Api): Unit = { }
}
