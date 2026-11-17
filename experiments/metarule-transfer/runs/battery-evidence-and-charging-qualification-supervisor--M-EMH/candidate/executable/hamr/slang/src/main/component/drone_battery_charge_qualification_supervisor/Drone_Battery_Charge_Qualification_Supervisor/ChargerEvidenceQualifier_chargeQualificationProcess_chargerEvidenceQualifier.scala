// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier {

  def initialise(api: ChargerEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val facts: ChargerFacts = ChargerFacts(F, F, T)
    api.put_factsToEligibility(facts)
    api.put_faultToAggregation(facts.chargerFault)
  }

  def timeTriggered(api: ChargerEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_reportIn() match {
      case Some(report) =>
        val facts: ChargerFacts = report match {
          case ChargerReport.Disconnected => ChargerFacts(F, F, F)
          case ChargerReport.Ready => ChargerFacts(T, T, F)
          case ChargerReport.Faulted => ChargerFacts(F, T, T)
          case _ => ChargerFacts(F, F, T)
        }
        api.put_factsToEligibility(facts)
        api.put_faultToAggregation(facts.chargerFault)
      case _ =>
    }
  }

  def finalise(api: ChargerEvidenceQualifier_Operational_Api): Unit = { }
}
