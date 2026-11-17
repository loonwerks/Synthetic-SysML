// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver {

  def initialise(api: FaultActionPriorityResolver_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_accepted_directive(PriorityDirective.INHIBIT)
    api.put_fault_action_summary(FaultActionSummary(
      FaultStatus.ACTIVE, FaultCause.CHARGER, SummaryDirective.INHIBIT))
  }

  def timeTriggered(api: FaultActionPriorityResolver_Operational_Api): Unit = {
    Contract(Modifies(api))
    val request: Option[RequestContext] = api.get_request_context()
    val battery: Option[BatteryAssessment.Type] = api.get_battery_assessment()
    val power: Option[PowerAssessment.Type] = api.get_power_assessment()
    val propulsion: Option[PropulsionAssessment.Type] = api.get_propulsion_assessment()
    val charging: Option[ChargingAssessment.Type] = api.get_charging_assessment()
    val allReady: B = battery == Some(BatteryAssessment.READY_NONE) &&
      power == Some(PowerAssessment.READY_NONE) &&
      propulsion == Some(PropulsionAssessment.READY_NONE) &&
      charging == Some(ChargingAssessment.READY_NONE)
    if (!allReady) {
      val cause: FaultCause.Type =
        if (charging != Some(ChargingAssessment.READY_NONE)) FaultCause.CHARGER
        else if (power != Some(PowerAssessment.READY_NONE)) FaultCause.POWER_MANAGEMENT
        else if (battery != Some(BatteryAssessment.READY_NONE)) FaultCause.BATTERY
        else if (propulsion == Some(PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP)) FaultCause.EVEN_ENGINE_GROUP
        else if (propulsion == Some(PropulsionAssessment.NOT_READY_CONFIGURATION)) FaultCause.CONFIGURATION
        else FaultCause.ODD_ENGINE_GROUP
      api.put_accepted_directive(PriorityDirective.INHIBIT)
      api.put_fault_action_summary(FaultActionSummary(FaultStatus.ACTIVE, cause, SummaryDirective.INHIBIT))
    } else {
      request match {
        case Some(context) if context.candidateEvent == RequestContextEvent.REQUEST_DISABLE =>
          api.put_accepted_directive(PriorityDirective.DISABLE)
          api.put_fault_action_summary(FaultActionSummary(FaultStatus.CLEAR, FaultCause.NONE, SummaryDirective.DISABLE))
        case Some(context) if context.candidateEvent == RequestContextEvent.ACKNOWLEDGE_RECOVERY =>
          api.put_accepted_directive(PriorityDirective.RECOVER)
          api.put_fault_action_summary(FaultActionSummary(FaultStatus.CLEAR, FaultCause.NONE, SummaryDirective.RECOVER))
        case Some(context) if context.candidateEvent == RequestContextEvent.REQUEST_ENABLE &&
          context.demand == DemandPhase.IDLE =>
          api.put_accepted_directive(PriorityDirective.ENABLE)
          api.put_fault_action_summary(FaultActionSummary(FaultStatus.CLEAR, FaultCause.NONE, SummaryDirective.ENABLE))
        case _ =>
          api.put_accepted_directive(PriorityDirective.HOLD)
          api.put_fault_action_summary(FaultActionSummary(FaultStatus.CLEAR, FaultCause.NONE, SummaryDirective.HOLD))
      }
    }
  }

  def finalise(api: FaultActionPriorityResolver_Operational_Api): Unit = { }
}
