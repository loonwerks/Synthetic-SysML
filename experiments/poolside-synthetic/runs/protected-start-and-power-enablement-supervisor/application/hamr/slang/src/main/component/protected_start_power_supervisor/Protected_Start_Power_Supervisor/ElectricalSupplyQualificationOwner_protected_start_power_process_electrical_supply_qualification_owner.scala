// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner {

  def initialise(api: ElectricalSupplyQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_supply_facts(Protected_Start_Power_Supervisor.QualifiedSupplyFacts.example())
    api.put_supply_fault(Base_Types.Boolean_example())
  }

  def timeTriggered(api: ElectricalSupplyQualificationOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee SUPPLY_QUALIFICATION_TOTAL
        //   qualified supply facts per electrical power report status and availability
        api.qualified_supply_facts.supplyUsable == (api.electrical_power_report.status == Validity.Valid &
          api.electrical_power_report.availability == SupplyAvailability.Available) &
          api.supply_fault == (api.electrical_power_report.status == Validity.Invalid)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_electrical_power_report: Option[Protected_Start_Power_Supervisor.ElectricalPowerReport] = api.get_electrical_power_report()
    api.logInfo(s"Received on data port electrical_power_report: ${apiUsage_electrical_power_report}")
  }

  def finalise(api: ElectricalSupplyQualificationOwner_Operational_Api): Unit = { }
}
