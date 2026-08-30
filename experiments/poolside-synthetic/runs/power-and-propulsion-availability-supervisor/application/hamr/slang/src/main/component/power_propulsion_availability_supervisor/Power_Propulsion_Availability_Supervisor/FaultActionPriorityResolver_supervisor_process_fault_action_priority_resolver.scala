// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver {

  def initialise(api: FaultActionPriorityResolver_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_accepted_directive(Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT)
    api.put_fault_action_summary(Power_Propulsion_Availability_Supervisor.FaultActionSummary.example())
  }

  def timeTriggered(api: FaultActionPriorityResolver_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee DIRECTIVE_PRESERVATION
        //   accepted directive matches fault action summary directive
        api.accepted_directive == PriorityDirective.INHIBIT &
          api.fault_action_summary.directive == SummaryDirective.INHIBIT |
          api.accepted_directive == PriorityDirective.DISABLE &
            api.fault_action_summary.directive == SummaryDirective.DISABLE |
          api.accepted_directive == PriorityDirective.RECOVER &
            api.fault_action_summary.directive == SummaryDirective.RECOVER |
          api.accepted_directive == PriorityDirective.ENABLE &
            api.fault_action_summary.directive == SummaryDirective.ENABLE |
          api.accepted_directive == PriorityDirective.HOLD &
            api.fault_action_summary.directive == SummaryDirective.HOLD,
        // case CASE_20_ACTIVE_FAULT_PRIORITY
        //   If any assessment is not READY_NONE
        (api.battery_assessment != BatteryAssessment.READY_NONE |
          api.power_assessment != PowerAssessment.READY_NONE |
          api.propulsion_assessment != PropulsionAssessment.READY_NONE |
          api.charging_assessment != ChargingAssessment.READY_NONE) ___>: (api.accepted_directive == PriorityDirective.INHIBIT &
          api.fault_action_summary.fault == FaultStatus.ACTIVE &
          api.fault_action_summary.directive == SummaryDirective.INHIBIT &
          (api.charging_assessment != ChargingAssessment.READY_NONE &
            api.fault_action_summary.cause == FaultCause.CHARGER |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment != PowerAssessment.READY_NONE &
              api.fault_action_summary.cause == FaultCause.POWER_MANAGEMENT |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment != BatteryAssessment.READY_NONE &
              api.fault_action_summary.cause == FaultCause.BATTERY |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment == BatteryAssessment.READY_NONE &
              api.propulsion_assessment == PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP &
              api.fault_action_summary.cause == FaultCause.ODD_ENGINE_GROUP |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment == BatteryAssessment.READY_NONE &
              api.propulsion_assessment == PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP &
              api.fault_action_summary.cause == FaultCause.EVEN_ENGINE_GROUP |
            api.charging_assessment == ChargingAssessment.READY_NONE &
              api.power_assessment == PowerAssessment.READY_NONE &
              api.battery_assessment == BatteryAssessment.READY_NONE &
              api.propulsion_assessment == PropulsionAssessment.NOT_READY_CONFIGURATION &
              api.fault_action_summary.cause == FaultCause.CONFIGURATION)),
        // case CASE_21_DISABLE_ACCEPTED
        //   If all assessments are READY_NONE and candidateEvent is REQUEST_DISABLE
        (api.battery_assessment == BatteryAssessment.READY_NONE &
          api.power_assessment == PowerAssessment.READY_NONE &
          api.propulsion_assessment == PropulsionAssessment.READY_NONE &
          api.charging_assessment == ChargingAssessment.READY_NONE &
          api.request_context.candidateEvent == RequestContextEvent.REQUEST_DISABLE) ___>: (api.accepted_directive == PriorityDirective.DISABLE &
          api.fault_action_summary.fault == FaultStatus.CLEAR &
          api.fault_action_summary.cause == FaultCause.NONE &
          api.fault_action_summary.directive == SummaryDirective.DISABLE),
        // case CASE_22_RECOVERY_ACCEPTED
        //   If all assessments are READY_NONE and candidateEvent is ACKNOWLEDGE_RECOVERY
        (api.battery_assessment == BatteryAssessment.READY_NONE &
          api.power_assessment == PowerAssessment.READY_NONE &
          api.propulsion_assessment == PropulsionAssessment.READY_NONE &
          api.charging_assessment == ChargingAssessment.READY_NONE &
          api.request_context.candidateEvent == RequestContextEvent.ACKNOWLEDGE_RECOVERY) ___>: (api.accepted_directive == PriorityDirective.RECOVER &
          api.fault_action_summary.fault == FaultStatus.CLEAR &
          api.fault_action_summary.cause == FaultCause.NONE &
          api.fault_action_summary.directive == SummaryDirective.RECOVER),
        // case CASE_23_ENABLE_OR_REPEAT
        //   If all assessments are READY_NONE and candidateEvent is REQUEST_ENABLE
        (api.battery_assessment == BatteryAssessment.READY_NONE &
          api.power_assessment == PowerAssessment.READY_NONE &
          api.propulsion_assessment == PropulsionAssessment.READY_NONE &
          api.charging_assessment == ChargingAssessment.READY_NONE &
          api.request_context.candidateEvent == RequestContextEvent.REQUEST_ENABLE) ___>: (api.fault_action_summary.fault == FaultStatus.CLEAR &
          api.fault_action_summary.cause == FaultCause.NONE &
          (api.request_context.demand == DemandPhase.IDLE &
            api.accepted_directive == PriorityDirective.ENABLE &
            api.fault_action_summary.directive == SummaryDirective.ENABLE |
            api.request_context.demand != DemandPhase.IDLE &
              api.accepted_directive == PriorityDirective.HOLD &
              api.fault_action_summary.directive == SummaryDirective.HOLD)),
        // case CASE_24_HOLD
        //   If all assessments are READY_NONE and candidateEvent is NONE
        (api.battery_assessment == BatteryAssessment.READY_NONE &
          api.power_assessment == PowerAssessment.READY_NONE &
          api.propulsion_assessment == PropulsionAssessment.READY_NONE &
          api.charging_assessment == ChargingAssessment.READY_NONE &
          api.request_context.candidateEvent == RequestContextEvent.NONE) ___>: (api.accepted_directive == PriorityDirective.HOLD &
          api.fault_action_summary.fault == FaultStatus.CLEAR &
          api.fault_action_summary.cause == FaultCause.NONE &
          api.fault_action_summary.directive == SummaryDirective.HOLD)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_request_context: Option[Power_Propulsion_Availability_Supervisor.RequestContext] = api.get_request_context()
    api.logInfo(s"Received on data port request_context: ${apiUsage_request_context}")
    val apiUsage_battery_assessment: Option[Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type] = api.get_battery_assessment()
    api.logInfo(s"Received on data port battery_assessment: ${apiUsage_battery_assessment}")
    val apiUsage_power_assessment: Option[Power_Propulsion_Availability_Supervisor.PowerAssessment.Type] = api.get_power_assessment()
    api.logInfo(s"Received on data port power_assessment: ${apiUsage_power_assessment}")
    val apiUsage_propulsion_assessment: Option[Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type] = api.get_propulsion_assessment()
    api.logInfo(s"Received on data port propulsion_assessment: ${apiUsage_propulsion_assessment}")
    val apiUsage_charging_assessment: Option[Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type] = api.get_charging_assessment()
    api.logInfo(s"Received on data port charging_assessment: ${apiUsage_charging_assessment}")
  }

  def finalise(api: FaultActionPriorityResolver_Operational_Api): Unit = { }
}
