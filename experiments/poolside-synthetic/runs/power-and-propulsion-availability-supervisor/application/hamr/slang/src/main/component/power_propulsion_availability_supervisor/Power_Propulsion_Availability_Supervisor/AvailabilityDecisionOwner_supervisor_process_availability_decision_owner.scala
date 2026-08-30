// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityDecisionOwner_supervisor_process_availability_decision_owner {

  def initialise(api: AvailabilityDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_availability_decision(Power_Propulsion_Availability_Supervisor.AvailabilityDecision.example())
    api.put_availability_report(Power_Propulsion_Availability_Supervisor.AvailabilityReport.example())
  }

  def timeTriggered(api: AvailabilityDecisionOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee REPORT_PRESERVATION
        //   availability report mirrors decision, cause, demand view, and recovery frame phase
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
        //   If all assessments are READY_NONE with open recovery gate, active demand, fault-free ENABLE or HOLD directive
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
        //   If any assessment is not READY_NONE with inhibited/ACTIVE fault, or other failure modes
        (api.battery_assessment != BatteryAssessment.READY_NONE |
          api.power_assessment != PowerAssessment.READY_NONE |
          api.propulsion_assessment != PropulsionAssessment.READY_NONE |
          api.charging_assessment != ChargingAssessment.READY_NONE |
          api.demand_view == DemandPhase.IDLE |
          api.fault_action_summary.fault == FaultStatus.ACTIVE |
          api.recovery_frame.gate != RecoveryGate.OPEN |
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
    // example api usage

    val apiUsage_battery_assessment: Option[Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type] = api.get_battery_assessment()
    api.logInfo(s"Received on data port battery_assessment: ${apiUsage_battery_assessment}")
    val apiUsage_power_assessment: Option[Power_Propulsion_Availability_Supervisor.PowerAssessment.Type] = api.get_power_assessment()
    api.logInfo(s"Received on data port power_assessment: ${apiUsage_power_assessment}")
    val apiUsage_propulsion_assessment: Option[Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type] = api.get_propulsion_assessment()
    api.logInfo(s"Received on data port propulsion_assessment: ${apiUsage_propulsion_assessment}")
    val apiUsage_charging_assessment: Option[Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type] = api.get_charging_assessment()
    api.logInfo(s"Received on data port charging_assessment: ${apiUsage_charging_assessment}")
    val apiUsage_demand_view: Option[Power_Propulsion_Availability_Supervisor.DemandPhase.Type] = api.get_demand_view()
    api.logInfo(s"Received on data port demand_view: ${apiUsage_demand_view}")
    val apiUsage_fault_action_summary: Option[Power_Propulsion_Availability_Supervisor.FaultActionSummary] = api.get_fault_action_summary()
    api.logInfo(s"Received on data port fault_action_summary: ${apiUsage_fault_action_summary}")
    val apiUsage_recovery_frame: Option[Power_Propulsion_Availability_Supervisor.RecoveryFrame] = api.get_recovery_frame()
    api.logInfo(s"Received on data port recovery_frame: ${apiUsage_recovery_frame}")
  }

  def finalise(api: AvailabilityDecisionOwner_Operational_Api): Unit = { }
}
