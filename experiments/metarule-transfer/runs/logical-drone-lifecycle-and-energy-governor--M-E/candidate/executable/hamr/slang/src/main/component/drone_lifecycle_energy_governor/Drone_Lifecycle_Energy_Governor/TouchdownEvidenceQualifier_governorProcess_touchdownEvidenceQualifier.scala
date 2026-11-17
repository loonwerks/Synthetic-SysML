// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier {

  def initialise(api: TouchdownEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_factsToLifecycle(Drone_Lifecycle_Energy_Governor.TouchdownFacts.example())
    api.put_faultToAggregation(Base_Types.Boolean_example())
  }

  def timeTriggered(api: TouchdownEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee QUALIFIED_TOUCHDOWN_COMPLETION
        api.factsToLifecycle.touchdownEstablished == (api.reportIn.validity == EvidenceValidity.VALID &
          api.reportIn.touchdownValue == TouchdownValue.CONFIRMED) &
          api.factsToLifecycle.evidenceValid == (api.reportIn.validity == EvidenceValidity.VALID) &
          api.factsToLifecycle.touchdownFault == (api.reportIn.validity == EvidenceValidity.INVALID) &
          api.faultToAggregation == api.factsToLifecycle.touchdownFault
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_reportIn() match {
      case Some(report) =>
        val valid = report.validity == EvidenceValidity.VALID
        val fault = report.validity == EvidenceValidity.INVALID
        api.put_factsToLifecycle(TouchdownFacts(valid &
          report.touchdownValue == TouchdownValue.CONFIRMED, valid, fault))
        api.put_faultToAggregation(fault)
      case _ =>
        api.put_factsToLifecycle(TouchdownFacts(F, F, T))
        api.put_faultToAggregation(T)
    }
  }

  def finalise(api: TouchdownEvidenceQualifier_Operational_Api): Unit = { }
}
