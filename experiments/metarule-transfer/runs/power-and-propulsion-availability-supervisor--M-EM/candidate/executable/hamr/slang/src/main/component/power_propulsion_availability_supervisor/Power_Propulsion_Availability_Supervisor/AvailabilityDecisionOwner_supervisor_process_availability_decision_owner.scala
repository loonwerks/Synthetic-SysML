// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityDecisionOwner_supervisor_process_availability_decision_owner {

  def initialise(api: AvailabilityDecisionOwner_Initialization_Api): Unit = {
    api.put_availability_decision(Power_Propulsion_Availability_Supervisor.AvailabilityDecision(
      decision = AvailabilityValue.UNAVAILABLE, cause = AvailabilityCause.RECOVERY))
    api.put_availability_report(Power_Propulsion_Availability_Supervisor.AvailabilityReport(
      decision = ReportAvailabilityValue.UNAVAILABLE, cause = ReportAvailabilityCause.RECOVERY,
      demand = ReportDemandPhase.IDLE, recovery = ReportRecoveryPhase.AWAITING_ACK))
  }

  def timeTriggered(api: AvailabilityDecisionOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee REPORT_PRESERVATION
        (api.availability_decision.decision == AvailabilityValue.UNAVAILABLE &
          api.availability_report.decision == ReportAvailabilityValue.UNAVAILABLE |
          api.availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
            api.availability_report.decision == ReportAvailabilityValue.AVAILABLE_FOR_ENABLE) &
          (api.availability_decision.cause == AvailabilityCause.NONE &
            api.availability_report.cause == ReportAvailabilityCause.NONE |
            api.availability_decision.cause == AvailabilityCause.BATTERY &
              api.availability_report.cause == ReportAvailabilityCause.BATTERY |
            api.availability_decision.cause == AvailabilityCause.POWER_MANAGEMENT &
              api.availability_report.cause == ReportAvailabilityCause.POWER_MANAGEMENT |
            api.availability_decision.cause == AvailabilityCause.ODD_ENGINE_GROUP &
              api.availability_report.cause == ReportAvailabilityCause.ODD_ENGINE_GROUP |
            api.availability_decision.cause == AvailabilityCause.EVEN_ENGINE_GROUP &
              api.availability_report.cause == ReportAvailabilityCause.EVEN_ENGINE_GROUP |
            api.availability_decision.cause == AvailabilityCause.CONFIGURATION &
              api.availability_report.cause == ReportAvailabilityCause.CONFIGURATION |
            api.availability_decision.cause == AvailabilityCause.CHARGER &
              api.availability_report.cause == ReportAvailabilityCause.CHARGER |
            api.availability_decision.cause == AvailabilityCause.RECOVERY &
              api.availability_report.cause == ReportAvailabilityCause.RECOVERY |
            api.availability_decision.cause == AvailabilityCause.NO_DEMAND &
              api.availability_report.cause == ReportAvailabilityCause.NO_DEMAND |
            api.availability_decision.cause == AvailabilityCause.OPERATOR_DISABLE &
              api.availability_report.cause == ReportAvailabilityCause.OPERATOR_DISABLE) &
          (api.demand_view == DemandPhase.IDLE &
            api.availability_report.demand == ReportDemandPhase.IDLE |
            api.demand_view == DemandPhase.REQUESTED &
              api.availability_report.demand == ReportDemandPhase.REQUESTED |
            api.demand_view == DemandPhase.ACTIVE &
              api.availability_report.demand == ReportDemandPhase.ACTIVE) &
          (api.recovery_frame.phase == RecoveryPhase.NORMAL &
            api.availability_report.recovery == ReportRecoveryPhase.NORMAL |
            api.recovery_frame.phase == RecoveryPhase.QUARANTINED &
              api.availability_report.recovery == ReportRecoveryPhase.QUARANTINED |
            api.recovery_frame.phase == RecoveryPhase.AWAITING_ACK &
              api.availability_report.recovery == ReportRecoveryPhase.AWAITING_ACK),
        // case CASE_28_AVAILABLE
        (api.battery_assessment == BatteryAssessment.READY_NONE &
          api.power_assessment == PowerAssessment.READY_NONE &
          api.propulsion_assessment == PropulsionAssessment.READY_NONE &
          api.charging_assessment == ChargingAssessment.READY_NONE &
          api.demand_view != DemandPhase.IDLE &
          api.fault_action_summary.fault == FaultStatus.CLEAR &
          api.recovery_frame.phase == RecoveryPhase.NORMAL &
          api.recovery_frame.gate == RecoveryGate.OPEN &
          (api.fault_action_summary.directive == SummaryDirective.ENABLE |
            api.fault_action_summary.directive == SummaryDirective.HOLD)) ___>: (api.availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
          api.availability_decision.cause == AvailabilityCause.NONE),
        // case CASE_29_UNAVAILABLE_PRIORITY
        (api.battery_assessment != BatteryAssessment.READY_NONE |
          api.power_assessment != PowerAssessment.READY_NONE |
          api.propulsion_assessment != PropulsionAssessment.READY_NONE |
          api.charging_assessment != ChargingAssessment.READY_NONE |
          api.demand_view == DemandPhase.IDLE |
          api.fault_action_summary.fault == FaultStatus.ACTIVE |
          api.recovery_frame.phase != RecoveryPhase.NORMAL |
          api.recovery_frame.gate == RecoveryGate.CLOSED |
          api.fault_action_summary.directive == SummaryDirective.INHIBIT |
          api.fault_action_summary.directive == SummaryDirective.DISABLE |
          api.fault_action_summary.directive == SummaryDirective.RECOVER) ___>: (api.availability_decision.decision == AvailabilityValue.UNAVAILABLE &
          (api.charging_assessment != ChargingAssessment.READY_NONE &
            api.availability_decision.cause == AvailabilityCause.CHARGER |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment != PowerAssessment.READY_NONE &
              api.availability_decision.cause == AvailabilityCause.POWER_MANAGEMENT |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment != BatteryAssessment.READY_NONE &
              api.availability_decision.cause == AvailabilityCause.BATTERY |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment == BatteryAssessment.READY_NONE &
              api.propulsion_assessment == PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP &
              api.availability_decision.cause == AvailabilityCause.ODD_ENGINE_GROUP |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment == BatteryAssessment.READY_NONE &
              api.propulsion_assessment == PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP &
              api.availability_decision.cause == AvailabilityCause.EVEN_ENGINE_GROUP |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment == BatteryAssessment.READY_NONE &
              api.propulsion_assessment == PropulsionAssessment.NOT_READY_CONFIGURATION &
              api.availability_decision.cause == AvailabilityCause.CONFIGURATION |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment == BatteryAssessment.READY_NONE &
              api.propulsion_assessment == PropulsionAssessment.READY_NONE &
              api.fault_action_summary.fault == FaultStatus.ACTIVE &
              (api.fault_action_summary.cause == FaultCause.CHARGER &
                api.availability_decision.cause == AvailabilityCause.CHARGER |
                api.fault_action_summary.cause == FaultCause.POWER_MANAGEMENT &
                  api.availability_decision.cause == AvailabilityCause.POWER_MANAGEMENT |
                api.fault_action_summary.cause == FaultCause.BATTERY &
                  api.availability_decision.cause == AvailabilityCause.BATTERY |
                api.fault_action_summary.cause == FaultCause.ODD_ENGINE_GROUP &
                  api.availability_decision.cause == AvailabilityCause.ODD_ENGINE_GROUP |
                api.fault_action_summary.cause == FaultCause.EVEN_ENGINE_GROUP &
                  api.availability_decision.cause == AvailabilityCause.EVEN_ENGINE_GROUP |
                api.fault_action_summary.cause == FaultCause.CONFIGURATION &
                  api.availability_decision.cause == AvailabilityCause.CONFIGURATION) |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment == BatteryAssessment.READY_NONE &
              api.propulsion_assessment == PropulsionAssessment.READY_NONE &
              api.fault_action_summary.fault == FaultStatus.CLEAR &
              api.fault_action_summary.directive == SummaryDirective.DISABLE &
              api.availability_decision.cause == AvailabilityCause.OPERATOR_DISABLE |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment == BatteryAssessment.READY_NONE &
              api.propulsion_assessment == PropulsionAssessment.READY_NONE &
              api.fault_action_summary.fault == FaultStatus.CLEAR &
              api.fault_action_summary.directive != SummaryDirective.DISABLE &
              (api.recovery_frame.gate == RecoveryGate.CLOSED |
                api.fault_action_summary.directive == SummaryDirective.RECOVER) &
              api.availability_decision.cause == AvailabilityCause.RECOVERY |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment == BatteryAssessment.READY_NONE &
              api.propulsion_assessment == PropulsionAssessment.READY_NONE &
              api.fault_action_summary.fault == FaultStatus.CLEAR &
              api.fault_action_summary.directive != SummaryDirective.DISABLE &
              api.recovery_frame.gate == RecoveryGate.OPEN &
              api.fault_action_summary.directive != SummaryDirective.RECOVER &
              api.demand_view == DemandPhase.IDLE &
              api.availability_decision.cause == AvailabilityCause.NO_DEMAND))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val ready: B = api.battery_assessment == BatteryAssessment.READY_NONE &
      api.power_assessment == PowerAssessment.READY_NONE &
      api.propulsion_assessment == PropulsionAssessment.READY_NONE &
      api.charging_assessment == ChargingAssessment.READY_NONE
    val available: B = ready & api.demand_view != DemandPhase.IDLE &
      api.fault_action_summary.fault == FaultStatus.CLEAR &
      api.recovery_frame.phase == RecoveryPhase.NORMAL &
      api.recovery_frame.gate == RecoveryGate.OPEN &
      (api.fault_action_summary.directive == SummaryDirective.ENABLE |
       api.fault_action_summary.directive == SummaryDirective.HOLD)
    val cause: AvailabilityCause.Type =
      if (api.charging_assessment != ChargingAssessment.READY_NONE) AvailabilityCause.CHARGER
      else if (api.power_assessment != PowerAssessment.READY_NONE) AvailabilityCause.POWER_MANAGEMENT
      else if (api.battery_assessment != BatteryAssessment.READY_NONE) AvailabilityCause.BATTERY
      else if (api.propulsion_assessment == PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP) AvailabilityCause.ODD_ENGINE_GROUP
      else if (api.propulsion_assessment == PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP) AvailabilityCause.EVEN_ENGINE_GROUP
      else if (api.propulsion_assessment == PropulsionAssessment.NOT_READY_CONFIGURATION) AvailabilityCause.CONFIGURATION
      else if (api.fault_action_summary.fault == FaultStatus.ACTIVE) AvailabilityCause.RECOVERY
      else if (api.fault_action_summary.directive == SummaryDirective.DISABLE) AvailabilityCause.OPERATOR_DISABLE
      else if (api.recovery_frame.gate == RecoveryGate.CLOSED |
               api.fault_action_summary.directive == SummaryDirective.RECOVER) AvailabilityCause.RECOVERY
      else if (api.demand_view == DemandPhase.IDLE) AvailabilityCause.NO_DEMAND
      else AvailabilityCause.NONE
    api.put_availability_decision(Power_Propulsion_Availability_Supervisor.AvailabilityDecision(
      decision = if (available) AvailabilityValue.AVAILABLE_FOR_ENABLE else AvailabilityValue.UNAVAILABLE,
      cause = if (available) AvailabilityCause.NONE else cause))
    api.put_availability_report(Power_Propulsion_Availability_Supervisor.AvailabilityReport(
      decision = if (available) ReportAvailabilityValue.AVAILABLE_FOR_ENABLE else ReportAvailabilityValue.UNAVAILABLE,
      cause =
        if (available) ReportAvailabilityCause.NONE
        else if (cause == AvailabilityCause.BATTERY) ReportAvailabilityCause.BATTERY
        else if (cause == AvailabilityCause.POWER_MANAGEMENT) ReportAvailabilityCause.POWER_MANAGEMENT
        else if (cause == AvailabilityCause.ODD_ENGINE_GROUP) ReportAvailabilityCause.ODD_ENGINE_GROUP
        else if (cause == AvailabilityCause.EVEN_ENGINE_GROUP) ReportAvailabilityCause.EVEN_ENGINE_GROUP
        else if (cause == AvailabilityCause.CONFIGURATION) ReportAvailabilityCause.CONFIGURATION
        else if (cause == AvailabilityCause.CHARGER) ReportAvailabilityCause.CHARGER
        else if (cause == AvailabilityCause.NO_DEMAND) ReportAvailabilityCause.NO_DEMAND
        else if (cause == AvailabilityCause.OPERATOR_DISABLE) ReportAvailabilityCause.OPERATOR_DISABLE
        else ReportAvailabilityCause.RECOVERY,
      demand = if (api.demand_view == DemandPhase.IDLE) ReportDemandPhase.IDLE
        else if (api.demand_view == DemandPhase.REQUESTED) ReportDemandPhase.REQUESTED else ReportDemandPhase.ACTIVE,
      recovery = if (api.recovery_frame.phase == RecoveryPhase.NORMAL) ReportRecoveryPhase.NORMAL
        else if (api.recovery_frame.phase == RecoveryPhase.QUARANTINED) ReportRecoveryPhase.QUARANTINED
        else ReportRecoveryPhase.AWAITING_ACK))
  }

  def finalise(api: AvailabilityDecisionOwner_Operational_Api): Unit = { }
}
