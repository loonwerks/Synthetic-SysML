// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier {

  def initialise(api: ChargerEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_factsToCharge(ChargerFacts(F, F, F))
    api.put_faultToAggregation(F)
  }

  def timeTriggered(api: ChargerEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_reportIn() match {
      case Some(report) =>
        val facts = ChargerFacts(
          report != ChargerReport.DISCONNECTED,
          report == ChargerReport.CONNECTED_HEALTHY,
          report == ChargerReport.CONNECTED_FAULTED)
        api.put_factsToCharge(facts)
        api.put_faultToAggregation(facts.chargerFault)
      case _ =>
        api.put_factsToCharge(ChargerFacts(F, F, F))
        api.put_faultToAggregation(F)
    }
  }

  def finalise(api: ChargerEvidenceQualifier_Operational_Api): Unit = { }
}
