// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner {

  def initialise(api: StartRestraintDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_start_restraint_fact(Protected_Start_Power_Supervisor.StartRestraintFact(F))
  }

  def timeTriggered(api: StartRestraintDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_qualified_pedal_facts(), api.get_qualified_parking_brake_facts()) match {
      case (Some(pedal), Some(brake)) =>
        api.put_start_restraint_fact(Protected_Start_Power_Supervisor.StartRestraintFact(
          pedal.pedalStartCondition && brake.brakeAppliedEvidence))
    }
  }

  def finalise(api: StartRestraintDecisionOwner_Operational_Api): Unit = { }
}
