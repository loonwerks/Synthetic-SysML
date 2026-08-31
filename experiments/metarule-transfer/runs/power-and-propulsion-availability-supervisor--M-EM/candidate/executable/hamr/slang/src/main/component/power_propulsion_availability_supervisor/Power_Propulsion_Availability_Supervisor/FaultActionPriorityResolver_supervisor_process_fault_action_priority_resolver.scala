// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver {

  def initialise(api: FaultActionPriorityResolver_Initialization_Api): Unit = {
    api.put_accepted_directive(Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT)
    api.put_fault_action_summary(Power_Propulsion_Availability_Supervisor.FaultActionSummary(
      fault = FaultStatus.ACTIVE, cause = FaultCause.CHARGER, directive = SummaryDirective.INHIBIT))
  }

  def timeTriggered(api: FaultActionPriorityResolver_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee DIRECTIVE_PRESERVATION
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
        (api.battery_assessment == BatteryAssessment.READY_NONE &
          api.power_assessment == PowerAssessment.READY_NONE &
          api.propulsion_assessment == PropulsionAssessment.READY_NONE &
          api.charging_assessment == ChargingAssessment.READY_NONE &
          api.request_context.candidateEvent == RequestContextEvent.REQUEST_DISABLE) ___>: (api.accepted_directive == PriorityDirective.DISABLE &
          api.fault_action_summary.fault == FaultStatus.CLEAR &
          api.fault_action_summary.cause == FaultCause.NONE &
          api.fault_action_summary.directive == SummaryDirective.DISABLE),
        // case CASE_22_RECOVERY_ACCEPTED
        (api.battery_assessment == BatteryAssessment.READY_NONE &
          api.power_assessment == PowerAssessment.READY_NONE &
          api.propulsion_assessment == PropulsionAssessment.READY_NONE &
          api.charging_assessment == ChargingAssessment.READY_NONE &
          api.request_context.candidateEvent == RequestContextEvent.ACKNOWLEDGE_RECOVERY) ___>: (api.accepted_directive == PriorityDirective.RECOVER &
          api.fault_action_summary.fault == FaultStatus.CLEAR &
          api.fault_action_summary.cause == FaultCause.NONE &
          api.fault_action_summary.directive == SummaryDirective.RECOVER),
        // case CASE_23_ENABLE_OR_REPEAT
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
    val battery: BatteryAssessment.Type = api.get_battery_assessment().get
    val power: PowerAssessment.Type = api.get_power_assessment().get
    val propulsion: PropulsionAssessment.Type = api.get_propulsion_assessment().get
    val charging: ChargingAssessment.Type = api.get_charging_assessment().get
    val request: Power_Propulsion_Availability_Supervisor.RequestContext = api.get_request_context().get
    val fault: B = battery != BatteryAssessment.READY_NONE |
      power != PowerAssessment.READY_NONE | propulsion != PropulsionAssessment.READY_NONE |
      charging != ChargingAssessment.READY_NONE
    val cause: FaultCause.Type =
      if (charging != ChargingAssessment.READY_NONE) FaultCause.CHARGER
      else if (power != PowerAssessment.READY_NONE) FaultCause.POWER_MANAGEMENT
      else if (battery != BatteryAssessment.READY_NONE) FaultCause.BATTERY
      else if (propulsion == PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP) FaultCause.ODD_ENGINE_GROUP
      else if (propulsion == PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP) FaultCause.EVEN_ENGINE_GROUP
      else if (propulsion == PropulsionAssessment.NOT_READY_CONFIGURATION) FaultCause.CONFIGURATION
      else FaultCause.NONE
    val directive: PriorityDirective.Type =
      if (fault) PriorityDirective.INHIBIT
      else if (request.candidateEvent == RequestContextEvent.REQUEST_DISABLE) PriorityDirective.DISABLE
      else if (request.candidateEvent == RequestContextEvent.ACKNOWLEDGE_RECOVERY) PriorityDirective.RECOVER
      else if (request.candidateEvent == RequestContextEvent.REQUEST_ENABLE &
               request.demand == DemandPhase.IDLE) PriorityDirective.ENABLE
      else PriorityDirective.HOLD
    api.put_accepted_directive(directive)
    api.put_fault_action_summary(Power_Propulsion_Availability_Supervisor.FaultActionSummary(
      fault = if (fault) FaultStatus.ACTIVE else FaultStatus.CLEAR,
      cause = cause,
      directive =
        if (directive == PriorityDirective.INHIBIT) SummaryDirective.INHIBIT
        else if (directive == PriorityDirective.DISABLE) SummaryDirective.DISABLE
        else if (directive == PriorityDirective.RECOVER) SummaryDirective.RECOVER
        else if (directive == PriorityDirective.ENABLE) SummaryDirective.ENABLE
        else SummaryDirective.HOLD))
  }

  def finalise(api: FaultActionPriorityResolver_Operational_Api): Unit = { }
}
