// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityDecisionOwner_supervisor_process_availability_decision_owner {

  def reportCause(cause: AvailabilityCause.Type): ReportAvailabilityCause.Type = {
    if (cause == AvailabilityCause.BATTERY) {
      return ReportAvailabilityCause.BATTERY
    } else if (cause == AvailabilityCause.POWER_MANAGEMENT) {
      return ReportAvailabilityCause.POWER_MANAGEMENT
    } else if (cause == AvailabilityCause.ODD_ENGINE_GROUP) {
      return ReportAvailabilityCause.ODD_ENGINE_GROUP
    } else if (cause == AvailabilityCause.EVEN_ENGINE_GROUP) {
      return ReportAvailabilityCause.EVEN_ENGINE_GROUP
    } else if (cause == AvailabilityCause.CONFIGURATION) {
      return ReportAvailabilityCause.CONFIGURATION
    } else if (cause == AvailabilityCause.CHARGER) {
      return ReportAvailabilityCause.CHARGER
    } else if (cause == AvailabilityCause.RECOVERY) {
      return ReportAvailabilityCause.RECOVERY
    } else if (cause == AvailabilityCause.NO_DEMAND) {
      return ReportAvailabilityCause.NO_DEMAND
    } else if (cause == AvailabilityCause.OPERATOR_DISABLE) {
      return ReportAvailabilityCause.OPERATOR_DISABLE
    }
    return ReportAvailabilityCause.NONE
  }

  def reportDemand(demand: DemandPhase.Type): ReportDemandPhase.Type = {
    if (demand == DemandPhase.REQUESTED) {
      return ReportDemandPhase.REQUESTED
    } else if (demand == DemandPhase.ACTIVE) {
      return ReportDemandPhase.ACTIVE
    }
    return ReportDemandPhase.IDLE
  }

  def reportRecovery(phase: RecoveryPhase.Type): ReportRecoveryPhase.Type = {
    if (phase == RecoveryPhase.QUARANTINED) {
      return ReportRecoveryPhase.QUARANTINED
    } else if (phase == RecoveryPhase.AWAITING_ACK) {
      return ReportRecoveryPhase.AWAITING_ACK
    }
    return ReportRecoveryPhase.NORMAL
  }

  def faultCause(cause: FaultCause.Type): AvailabilityCause.Type = {
    if (cause == FaultCause.BATTERY) {
      return AvailabilityCause.BATTERY
    } else if (cause == FaultCause.POWER_MANAGEMENT) {
      return AvailabilityCause.POWER_MANAGEMENT
    } else if (cause == FaultCause.ODD_ENGINE_GROUP) {
      return AvailabilityCause.ODD_ENGINE_GROUP
    } else if (cause == FaultCause.EVEN_ENGINE_GROUP) {
      return AvailabilityCause.EVEN_ENGINE_GROUP
    } else if (cause == FaultCause.CONFIGURATION) {
      return AvailabilityCause.CONFIGURATION
    } else if (cause == FaultCause.CHARGER) {
      return AvailabilityCause.CHARGER
    }
    return AvailabilityCause.RECOVERY
  }

  def initialise(api: AvailabilityDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_availability_decision(
      AvailabilityDecision(AvailabilityValue.UNAVAILABLE, AvailabilityCause.RECOVERY))
    api.put_availability_report(
      AvailabilityReport(
        ReportAvailabilityValue.UNAVAILABLE,
        ReportAvailabilityCause.RECOVERY,
        ReportDemandPhase.IDLE,
        ReportRecoveryPhase.AWAITING_ACK))
  }

  def timeTriggered(api: AvailabilityDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_battery_assessment(), api.get_power_assessment(), api.get_propulsion_assessment(),
      api.get_charging_assessment(), api.get_demand_view(), api.get_fault_action_summary(),
      api.get_recovery_frame()) match {
      case (Some(battery), Some(power), Some(propulsion), Some(charging), Some(demand),
          Some(summary), Some(recovery)) =>
        val available: B = battery == BatteryAssessment.READY_NONE &&
          power == PowerAssessment.READY_NONE &&
          propulsion == PropulsionAssessment.READY_NONE &&
          charging == ChargingAssessment.READY_NONE &&
          demand != DemandPhase.IDLE &&
          summary.fault == FaultStatus.CLEAR &&
          recovery.phase == RecoveryPhase.NORMAL &&
          recovery.gate == RecoveryGate.OPEN &&
          (summary.directive == SummaryDirective.ENABLE || summary.directive == SummaryDirective.HOLD)

        var cause: AvailabilityCause.Type = AvailabilityCause.RECOVERY
        if (available) {
          cause = AvailabilityCause.NONE
        } else if (charging != ChargingAssessment.READY_NONE) {
          cause = AvailabilityCause.CHARGER
        } else if (power != PowerAssessment.READY_NONE) {
          cause = AvailabilityCause.POWER_MANAGEMENT
        } else if (battery != BatteryAssessment.READY_NONE) {
          cause = AvailabilityCause.BATTERY
        } else if (propulsion == PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP) {
          cause = AvailabilityCause.ODD_ENGINE_GROUP
        } else if (propulsion == PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP) {
          cause = AvailabilityCause.EVEN_ENGINE_GROUP
        } else if (propulsion != PropulsionAssessment.READY_NONE) {
          cause = AvailabilityCause.CONFIGURATION
        } else if (summary.fault == FaultStatus.ACTIVE) {
          cause = faultCause(summary.cause)
        } else if (summary.directive == SummaryDirective.DISABLE) {
          cause = AvailabilityCause.OPERATOR_DISABLE
        } else if (recovery.gate == RecoveryGate.CLOSED || summary.directive == SummaryDirective.RECOVER) {
          cause = AvailabilityCause.RECOVERY
        } else if (demand == DemandPhase.IDLE) {
          cause = AvailabilityCause.NO_DEMAND
        }

        var decision: AvailabilityValue.Type = AvailabilityValue.UNAVAILABLE
        var reportDecision: ReportAvailabilityValue.Type = ReportAvailabilityValue.UNAVAILABLE
        if (available) {
          decision = AvailabilityValue.AVAILABLE_FOR_ENABLE
          reportDecision = ReportAvailabilityValue.AVAILABLE_FOR_ENABLE
        }
        api.put_availability_decision(AvailabilityDecision(decision, cause))
        api.put_availability_report(
          AvailabilityReport(reportDecision, reportCause(cause), reportDemand(demand),
            reportRecovery(recovery.phase)))
      case _ =>
        api.put_availability_decision(
          AvailabilityDecision(AvailabilityValue.UNAVAILABLE, AvailabilityCause.RECOVERY))
        api.put_availability_report(
          AvailabilityReport(
            ReportAvailabilityValue.UNAVAILABLE,
            ReportAvailabilityCause.RECOVERY,
            ReportDemandPhase.IDLE,
            ReportRecoveryPhase.AWAITING_ACK))
    }
  }

  def finalise(api: AvailabilityDecisionOwner_Operational_Api): Unit = { }
}
