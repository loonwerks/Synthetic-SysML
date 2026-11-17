// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver {

  def initialise(api: FaultActionPriorityResolver_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_accepted_directive(Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT)
    api.put_fault_action_summary(Power_Propulsion_Availability_Supervisor.FaultActionSummary(
      Power_Propulsion_Availability_Supervisor.FaultStatus.ACTIVE,
      Power_Propulsion_Availability_Supervisor.FaultCause.CHARGER,
      Power_Propulsion_Availability_Supervisor.SummaryDirective.INHIBIT))
  }

  def timeTriggered(api: FaultActionPriorityResolver_Operational_Api): Unit = {
    Contract(Modifies(api))
    val request: Power_Propulsion_Availability_Supervisor.RequestContext = api.get_request_context() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.RequestContext(
        Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE,
        Power_Propulsion_Availability_Supervisor.RequestContextEvent.NONE)
    }
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

    var directive: Power_Propulsion_Availability_Supervisor.PriorityDirective.Type =
      Power_Propulsion_Availability_Supervisor.PriorityDirective.HOLD
    var fault: Power_Propulsion_Availability_Supervisor.FaultStatus.Type =
      Power_Propulsion_Availability_Supervisor.FaultStatus.CLEAR
    var cause: Power_Propulsion_Availability_Supervisor.FaultCause.Type =
      Power_Propulsion_Availability_Supervisor.FaultCause.NONE
    if (charging != Power_Propulsion_Availability_Supervisor.ChargingAssessment.READY_NONE) {
      directive = Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT
      fault = Power_Propulsion_Availability_Supervisor.FaultStatus.ACTIVE
      cause = Power_Propulsion_Availability_Supervisor.FaultCause.CHARGER
    } else if (power != Power_Propulsion_Availability_Supervisor.PowerAssessment.READY_NONE) {
      directive = Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT
      fault = Power_Propulsion_Availability_Supervisor.FaultStatus.ACTIVE
      cause = Power_Propulsion_Availability_Supervisor.FaultCause.POWER_MANAGEMENT
    } else if (battery != Power_Propulsion_Availability_Supervisor.BatteryAssessment.READY_NONE) {
      directive = Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT
      fault = Power_Propulsion_Availability_Supervisor.FaultStatus.ACTIVE
      cause = Power_Propulsion_Availability_Supervisor.FaultCause.BATTERY
    } else if (propulsion != Power_Propulsion_Availability_Supervisor.PropulsionAssessment.READY_NONE) {
      directive = Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT
      fault = Power_Propulsion_Availability_Supervisor.FaultStatus.ACTIVE
      if (propulsion == Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP) {
        cause = Power_Propulsion_Availability_Supervisor.FaultCause.ODD_ENGINE_GROUP
      } else if (propulsion == Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP) {
        cause = Power_Propulsion_Availability_Supervisor.FaultCause.EVEN_ENGINE_GROUP
      } else {
        cause = Power_Propulsion_Availability_Supervisor.FaultCause.CONFIGURATION
      }
    } else if (request.candidateEvent == Power_Propulsion_Availability_Supervisor.RequestContextEvent.REQUEST_DISABLE) {
      directive = Power_Propulsion_Availability_Supervisor.PriorityDirective.DISABLE
    } else if (request.candidateEvent == Power_Propulsion_Availability_Supervisor.RequestContextEvent.ACKNOWLEDGE_RECOVERY) {
      directive = Power_Propulsion_Availability_Supervisor.PriorityDirective.RECOVER
    } else if (request.candidateEvent == Power_Propulsion_Availability_Supervisor.RequestContextEvent.REQUEST_ENABLE) {
      if (request.demand == Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE) {
        directive = Power_Propulsion_Availability_Supervisor.PriorityDirective.ENABLE
      }
    }

    val summaryDirective: Power_Propulsion_Availability_Supervisor.SummaryDirective.Type = directive match {
      case Power_Propulsion_Availability_Supervisor.PriorityDirective.DISABLE =>
        Power_Propulsion_Availability_Supervisor.SummaryDirective.DISABLE
      case Power_Propulsion_Availability_Supervisor.PriorityDirective.RECOVER =>
        Power_Propulsion_Availability_Supervisor.SummaryDirective.RECOVER
      case Power_Propulsion_Availability_Supervisor.PriorityDirective.ENABLE =>
        Power_Propulsion_Availability_Supervisor.SummaryDirective.ENABLE
      case Power_Propulsion_Availability_Supervisor.PriorityDirective.HOLD =>
        Power_Propulsion_Availability_Supervisor.SummaryDirective.HOLD
      case _ => Power_Propulsion_Availability_Supervisor.SummaryDirective.INHIBIT
    }
    api.put_accepted_directive(directive)
    api.put_fault_action_summary(
      Power_Propulsion_Availability_Supervisor.FaultActionSummary(fault, cause, summaryDirective))
  }

  def finalise(api: FaultActionPriorityResolver_Operational_Api): Unit = { }
}
