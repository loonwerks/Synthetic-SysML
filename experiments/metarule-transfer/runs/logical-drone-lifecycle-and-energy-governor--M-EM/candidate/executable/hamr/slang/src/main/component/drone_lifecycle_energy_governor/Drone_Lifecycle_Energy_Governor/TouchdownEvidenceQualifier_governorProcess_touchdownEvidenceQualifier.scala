// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

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
        val valid = report.validity == Drone_Lifecycle_Energy_Governor.EvidenceValidity.VALID
        val fault = !valid
        api.put_factsToLifecycle(Drone_Lifecycle_Energy_Governor.TouchdownFacts(
          valid && report.touchdownValue == Drone_Lifecycle_Energy_Governor.TouchdownValue.CONFIRMED,
          valid,
          fault))
        api.put_faultToAggregation(fault)
      case _ =>
        api.put_factsToLifecycle(Drone_Lifecycle_Energy_Governor.TouchdownFacts(F, F, T))
        api.put_faultToAggregation(T)
    }
  }

  def finalise(api: TouchdownEvidenceQualifier_Operational_Api): Unit = { }
}
