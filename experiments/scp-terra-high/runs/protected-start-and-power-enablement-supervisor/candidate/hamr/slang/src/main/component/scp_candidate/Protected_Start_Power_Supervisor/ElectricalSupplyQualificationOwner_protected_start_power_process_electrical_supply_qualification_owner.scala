// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner {

  def initialise(api: ElectricalSupplyQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_supply_facts(Protected_Start_Power_Supervisor.QualifiedSupplyFacts(F))
    api.put_supply_fault(F)
  }

  def timeTriggered(api: ElectricalSupplyQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_electrical_power_report() match {
      case Some(report) =>
        val valid = report.status == Protected_Start_Power_Supervisor.Validity.Valid
        api.put_qualified_supply_facts(Protected_Start_Power_Supervisor.QualifiedSupplyFacts(
          valid && report.availability == Protected_Start_Power_Supervisor.SupplyAvailability.Available))
        api.put_supply_fault(!valid)
    }
  }

  def finalise(api: ElectricalSupplyQualificationOwner_Operational_Api): Unit = { }
}
