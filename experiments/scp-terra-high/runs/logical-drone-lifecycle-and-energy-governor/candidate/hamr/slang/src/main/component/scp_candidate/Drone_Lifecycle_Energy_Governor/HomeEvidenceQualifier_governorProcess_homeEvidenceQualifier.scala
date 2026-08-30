// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier {

  def initialise(api: HomeEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_factsToLifecycle(Drone_Lifecycle_Energy_Governor.HomeFacts(F, F, T))
    api.put_faultToAggregation(T)
  }

  def timeTriggered(api: HomeEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_reportIn() match {
      case Some(report) =>
        val valid: B = report.validity == Drone_Lifecycle_Energy_Governor.EvidenceValidity.VALID
        val arrived: B = valid && report.homeValue == Drone_Lifecycle_Energy_Governor.HomeValue.REACHED
        val fault: B = !valid
        api.put_factsToLifecycle(Drone_Lifecycle_Energy_Governor.HomeFacts(arrived, valid, fault))
        api.put_faultToAggregation(fault)
    }
  }

  def finalise(api: HomeEvidenceQualifier_Operational_Api): Unit = { }
}
