// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier {

  def initialise(api: TouchdownEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_factsToLifecycle(Drone_Lifecycle_Energy_Governor.TouchdownFacts(F, F, T))
    api.put_faultToAggregation(T)
  }

  def timeTriggered(api: TouchdownEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_reportIn() match {
      case Some(report) =>
        val valid: B = report.validity == Drone_Lifecycle_Energy_Governor.EvidenceValidity.VALID
        val established: B = valid &&
          report.touchdownValue == Drone_Lifecycle_Energy_Governor.TouchdownValue.CONFIRMED
        val fault: B = !valid
        api.put_factsToLifecycle(Drone_Lifecycle_Energy_Governor.TouchdownFacts(established, valid, fault))
        api.put_faultToAggregation(fault)
    }
  }

  def finalise(api: TouchdownEvidenceQualifier_Operational_Api): Unit = { }
}
