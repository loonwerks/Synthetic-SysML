// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner {

  def initialise(api: BrakePedalQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_pedal_facts(Protected_Start_Power_Supervisor.QualifiedPedalFacts(F))
    api.put_pedal_fault(F)
  }

  def timeTriggered(api: BrakePedalQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_brake_pedal_report() match {
      case Some(report) =>
        val valid = report.status == Protected_Start_Power_Supervisor.Validity.Valid
        api.put_qualified_pedal_facts(Protected_Start_Power_Supervisor.QualifiedPedalFacts(
          valid && report.condition == Protected_Start_Power_Supervisor.PedalCondition.Pressed))
        api.put_pedal_fault(!valid)
    }
  }

  def finalise(api: BrakePedalQualificationOwner_Operational_Api): Unit = { }
}
