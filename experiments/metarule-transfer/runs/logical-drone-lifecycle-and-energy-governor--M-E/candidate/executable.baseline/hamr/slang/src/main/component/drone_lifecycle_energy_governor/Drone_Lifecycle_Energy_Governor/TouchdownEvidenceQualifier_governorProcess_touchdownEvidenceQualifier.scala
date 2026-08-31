// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier {

  def initialise(api: TouchdownEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_factsToLifecycle(Drone_Lifecycle_Energy_Governor.TouchdownFacts.example())
    api.put_faultToAggregation(Base_Types.Boolean_example())
  }

  def timeTriggered(api: TouchdownEvidenceQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_reportIn: Option[Drone_Lifecycle_Energy_Governor.TouchdownReportValue] = api.get_reportIn()
    api.logInfo(s"Received on data port reportIn: ${apiUsage_reportIn}")
  }

  def finalise(api: TouchdownEvidenceQualifier_Operational_Api): Unit = { }
}
