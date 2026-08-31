// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier {

  def initialise(api: HomeEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_factsToLifecycle(Drone_Lifecycle_Energy_Governor.HomeFacts.example())
    api.put_faultToAggregation(Base_Types.Boolean_example())
  }

  def timeTriggered(api: HomeEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee QUALIFIED_HOME_COMPLETION
        api.factsToLifecycle.arrivalEstablished == (api.reportIn.validity == EvidenceValidity.VALID &
          api.reportIn.homeValue == HomeValue.REACHED) &
          api.factsToLifecycle.evidenceValid == (api.reportIn.validity == EvidenceValidity.VALID) &
          api.factsToLifecycle.homeFault == (api.reportIn.validity == EvidenceValidity.INVALID) &
          api.faultToAggregation == api.factsToLifecycle.homeFault
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_reportIn() match {
      case Some(report) =>
        val valid = report.validity == EvidenceValidity.VALID
        val fault = report.validity == EvidenceValidity.INVALID
        api.put_factsToLifecycle(HomeFacts(valid & report.homeValue == HomeValue.REACHED,
          valid, fault))
        api.put_faultToAggregation(fault)
      case _ =>
        api.put_factsToLifecycle(HomeFacts(F, F, T))
        api.put_faultToAggregation(T)
    }
  }

  def finalise(api: HomeEvidenceQualifier_Operational_Api): Unit = { }
}
