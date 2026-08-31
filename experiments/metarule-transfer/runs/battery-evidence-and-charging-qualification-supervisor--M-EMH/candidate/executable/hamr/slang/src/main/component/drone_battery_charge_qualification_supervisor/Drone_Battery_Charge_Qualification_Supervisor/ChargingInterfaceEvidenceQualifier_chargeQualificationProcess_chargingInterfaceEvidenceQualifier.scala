// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier {

  def initialise(api: ChargingInterfaceEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val facts: InterfaceFacts = InterfaceFacts(F, F, T)
    api.put_factsToEligibility(facts)
    api.put_factsToSession(facts)
    api.put_faultToAggregation(facts.interfaceFault)
  }

  def timeTriggered(api: ChargingInterfaceEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_reportIn() match {
      case Some(report) =>
        val facts: InterfaceFacts = report match {
          case ChargeInterfaceReport.Idle => InterfaceFacts(T, F, F)
          case ChargeInterfaceReport.Active => InterfaceFacts(T, T, F)
          case _ => InterfaceFacts(F, F, T)
        }
        api.put_factsToEligibility(facts)
        api.put_factsToSession(facts)
        api.put_faultToAggregation(facts.interfaceFault)
      case _ =>
    }
  }

  def finalise(api: ChargingInterfaceEvidenceQualifier_Operational_Api): Unit = { }
}
