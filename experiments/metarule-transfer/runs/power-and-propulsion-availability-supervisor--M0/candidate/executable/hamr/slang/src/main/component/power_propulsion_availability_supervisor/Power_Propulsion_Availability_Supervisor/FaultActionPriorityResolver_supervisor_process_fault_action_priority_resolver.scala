// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver {

  def initialise(api: FaultActionPriorityResolver_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_accepted_directive(PriorityDirective.INHIBIT)
    api.put_fault_action_summary(
      FaultActionSummary(FaultStatus.ACTIVE, FaultCause.CHARGER, SummaryDirective.INHIBIT))
  }

  def timeTriggered(api: FaultActionPriorityResolver_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_accepted_directive(PriorityDirective.INHIBIT)
    api.put_fault_action_summary(
      FaultActionSummary(FaultStatus.ACTIVE, FaultCause.CHARGER, SummaryDirective.INHIBIT))
  }

  def finalise(api: FaultActionPriorityResolver_Operational_Api): Unit = { }
}
