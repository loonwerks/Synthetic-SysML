// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityDecisionOwner_supervisor_process_availability_decision_owner {

  def initialise(api: AvailabilityDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_availability_decision(Power_Propulsion_Availability_Supervisor.AvailabilityDecision(
      Power_Propulsion_Availability_Supervisor.AvailabilityValue.UNAVAILABLE,
      Power_Propulsion_Availability_Supervisor.AvailabilityCause.RECOVERY))
    api.put_availability_report(Power_Propulsion_Availability_Supervisor.AvailabilityReport(
      Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.UNAVAILABLE,
      Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.RECOVERY,
      Power_Propulsion_Availability_Supervisor.ReportDemandPhase.IDLE,
      Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.AWAITING_ACK))
  }

  def timeTriggered(api: AvailabilityDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val battery: Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type = api.get_battery_assessment() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_INVALID
    }
    val power: Power_Propulsion_Availability_Supervisor.PowerAssessment.Type = api.get_power_assessment() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_INVALID
    }
    val propulsion: Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type = api.get_propulsion_assessment() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP
    }
    val charging: Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type = api.get_charging_assessment() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_INVALID
    }
    val demand: Power_Propulsion_Availability_Supervisor.DemandPhase.Type = api.get_demand_view() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE
    }
    val summary: Power_Propulsion_Availability_Supervisor.FaultActionSummary = api.get_fault_action_summary() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.FaultActionSummary(
        Power_Propulsion_Availability_Supervisor.FaultStatus.ACTIVE,
        Power_Propulsion_Availability_Supervisor.FaultCause.CHARGER,
        Power_Propulsion_Availability_Supervisor.SummaryDirective.INHIBIT)
    }
    val recovery: Power_Propulsion_Availability_Supervisor.RecoveryFrame = api.get_recovery_frame() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.RecoveryFrame(
        Power_Propulsion_Availability_Supervisor.RecoveryPhase.AWAITING_ACK,
        Power_Propulsion_Availability_Supervisor.RecoveryGate.CLOSED)
    }

    val available: B =
      battery == Power_Propulsion_Availability_Supervisor.BatteryAssessment.READY_NONE &&
      power == Power_Propulsion_Availability_Supervisor.PowerAssessment.READY_NONE &&
      propulsion == Power_Propulsion_Availability_Supervisor.PropulsionAssessment.READY_NONE &&
      charging == Power_Propulsion_Availability_Supervisor.ChargingAssessment.READY_NONE &&
      demand != Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE &&
      summary.fault == Power_Propulsion_Availability_Supervisor.FaultStatus.CLEAR &&
      recovery.phase == Power_Propulsion_Availability_Supervisor.RecoveryPhase.NORMAL &&
      recovery.gate == Power_Propulsion_Availability_Supervisor.RecoveryGate.OPEN &&
      (summary.directive == Power_Propulsion_Availability_Supervisor.SummaryDirective.ENABLE ||
       summary.directive == Power_Propulsion_Availability_Supervisor.SummaryDirective.HOLD)

    var cause: Power_Propulsion_Availability_Supervisor.AvailabilityCause.Type =
      Power_Propulsion_Availability_Supervisor.AvailabilityCause.RECOVERY
    if (available) {
      cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.NONE
    } else if (charging != Power_Propulsion_Availability_Supervisor.ChargingAssessment.READY_NONE) {
      cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.CHARGER
    } else if (power != Power_Propulsion_Availability_Supervisor.PowerAssessment.READY_NONE) {
      cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.POWER_MANAGEMENT
    } else if (battery != Power_Propulsion_Availability_Supervisor.BatteryAssessment.READY_NONE) {
      cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.BATTERY
    } else if (propulsion == Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP) {
      cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.ODD_ENGINE_GROUP
    } else if (propulsion == Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP) {
      cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.EVEN_ENGINE_GROUP
    } else if (propulsion == Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_CONFIGURATION) {
      cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.CONFIGURATION
    } else if (summary.fault == Power_Propulsion_Availability_Supervisor.FaultStatus.ACTIVE) {
      summary.cause match {
        case Power_Propulsion_Availability_Supervisor.FaultCause.BATTERY =>
          cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.BATTERY
        case Power_Propulsion_Availability_Supervisor.FaultCause.POWER_MANAGEMENT =>
          cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.POWER_MANAGEMENT
        case Power_Propulsion_Availability_Supervisor.FaultCause.ODD_ENGINE_GROUP =>
          cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.ODD_ENGINE_GROUP
        case Power_Propulsion_Availability_Supervisor.FaultCause.EVEN_ENGINE_GROUP =>
          cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.EVEN_ENGINE_GROUP
        case Power_Propulsion_Availability_Supervisor.FaultCause.CONFIGURATION =>
          cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.CONFIGURATION
        case _ => cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.CHARGER
      }
    } else if (summary.directive == Power_Propulsion_Availability_Supervisor.SummaryDirective.DISABLE) {
      cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.OPERATOR_DISABLE
    } else if (recovery.gate == Power_Propulsion_Availability_Supervisor.RecoveryGate.CLOSED ||
               summary.directive == Power_Propulsion_Availability_Supervisor.SummaryDirective.RECOVER) {
      cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.RECOVERY
    } else if (demand == Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE) {
      cause = Power_Propulsion_Availability_Supervisor.AvailabilityCause.NO_DEMAND
    }

    val reportCause: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.Type = cause match {
      case Power_Propulsion_Availability_Supervisor.AvailabilityCause.BATTERY =>
        Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.BATTERY
      case Power_Propulsion_Availability_Supervisor.AvailabilityCause.POWER_MANAGEMENT =>
        Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.POWER_MANAGEMENT
      case Power_Propulsion_Availability_Supervisor.AvailabilityCause.ODD_ENGINE_GROUP =>
        Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.ODD_ENGINE_GROUP
      case Power_Propulsion_Availability_Supervisor.AvailabilityCause.EVEN_ENGINE_GROUP =>
        Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.EVEN_ENGINE_GROUP
      case Power_Propulsion_Availability_Supervisor.AvailabilityCause.CONFIGURATION =>
        Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.CONFIGURATION
      case Power_Propulsion_Availability_Supervisor.AvailabilityCause.CHARGER =>
        Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.CHARGER
      case Power_Propulsion_Availability_Supervisor.AvailabilityCause.RECOVERY =>
        Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.RECOVERY
      case Power_Propulsion_Availability_Supervisor.AvailabilityCause.NO_DEMAND =>
        Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.NO_DEMAND
      case Power_Propulsion_Availability_Supervisor.AvailabilityCause.OPERATOR_DISABLE =>
        Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.OPERATOR_DISABLE
      case _ => Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.NONE
    }
    val reportDemand: Power_Propulsion_Availability_Supervisor.ReportDemandPhase.Type = demand match {
      case Power_Propulsion_Availability_Supervisor.DemandPhase.REQUESTED =>
        Power_Propulsion_Availability_Supervisor.ReportDemandPhase.REQUESTED
      case Power_Propulsion_Availability_Supervisor.DemandPhase.ACTIVE =>
        Power_Propulsion_Availability_Supervisor.ReportDemandPhase.ACTIVE
      case _ => Power_Propulsion_Availability_Supervisor.ReportDemandPhase.IDLE
    }
    val reportRecovery: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.Type = recovery.phase match {
      case Power_Propulsion_Availability_Supervisor.RecoveryPhase.QUARANTINED =>
        Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.QUARANTINED
      case Power_Propulsion_Availability_Supervisor.RecoveryPhase.AWAITING_ACK =>
        Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.AWAITING_ACK
      case _ => Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.NORMAL
    }
    val decision: Power_Propulsion_Availability_Supervisor.AvailabilityValue.Type =
      if (available) Power_Propulsion_Availability_Supervisor.AvailabilityValue.AVAILABLE_FOR_ENABLE
      else Power_Propulsion_Availability_Supervisor.AvailabilityValue.UNAVAILABLE
    val reportDecision: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.Type =
      if (available) Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.AVAILABLE_FOR_ENABLE
      else Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.UNAVAILABLE
    api.put_availability_decision(
      Power_Propulsion_Availability_Supervisor.AvailabilityDecision(decision, cause))
    api.put_availability_report(
      Power_Propulsion_Availability_Supervisor.AvailabilityReport(
        reportDecision, reportCause, reportDemand, reportRecovery))
  }

  def finalise(api: AvailabilityDecisionOwner_Operational_Api): Unit = { }
}
