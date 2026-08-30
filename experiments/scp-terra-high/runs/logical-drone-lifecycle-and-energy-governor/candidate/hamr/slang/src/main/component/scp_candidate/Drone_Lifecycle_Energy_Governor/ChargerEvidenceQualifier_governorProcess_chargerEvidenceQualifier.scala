// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier {

  def initialise(api: ChargerEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_factsToCharge(Drone_Lifecycle_Energy_Governor.ChargerFacts(F, F, F))
    api.put_faultToAggregation(F)
  }

  def timeTriggered(api: ChargerEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_reportIn() match {
      case Some(report) =>
        val connected: B = report != Drone_Lifecycle_Energy_Governor.ChargerReport.DISCONNECTED
        val healthy: B = report == Drone_Lifecycle_Energy_Governor.ChargerReport.CONNECTED_HEALTHY
        val fault: B = report == Drone_Lifecycle_Energy_Governor.ChargerReport.CONNECTED_FAULTED
        api.put_factsToCharge(Drone_Lifecycle_Energy_Governor.ChargerFacts(connected, healthy, fault))
        api.put_faultToAggregation(fault)
    }
  }

  def finalise(api: ChargerEvidenceQualifier_Operational_Api): Unit = { }
}
