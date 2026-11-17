// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier {

  def initialise(api: HomeEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_factsToLifecycle(HomeFacts(F, F, T))
    api.put_faultToAggregation(T)
  }

  def timeTriggered(api: HomeEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_reportIn() match {
      case Some(report) =>
        val valid = report.validity == EvidenceValidity.VALID
        val facts = HomeFacts(valid & report.homeValue == HomeValue.REACHED, valid, !valid)
        api.put_factsToLifecycle(facts)
        api.put_faultToAggregation(facts.homeFault)
      case _ =>
        api.put_factsToLifecycle(HomeFacts(F, F, T))
        api.put_faultToAggregation(T)
    }
  }

  def finalise(api: HomeEvidenceQualifier_Operational_Api): Unit = { }
}
