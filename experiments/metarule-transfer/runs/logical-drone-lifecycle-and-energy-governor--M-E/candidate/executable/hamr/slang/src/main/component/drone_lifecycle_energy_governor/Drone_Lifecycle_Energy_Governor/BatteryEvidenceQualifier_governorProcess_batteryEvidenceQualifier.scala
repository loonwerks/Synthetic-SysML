// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_evidenceOut(Drone_Lifecycle_Energy_Governor.BatteryEvidence.example())
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee VALID_BAND_SUPPRESSION
        api.evidenceOut.band == api.reportIn.band &
          api.evidenceOut.validBand == (api.reportIn.validity == EvidenceValidity.VALID)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_reportIn() match {
      case Some(report) =>
        api.put_evidenceOut(BatteryEvidence(report.band,
          report.validity == EvidenceValidity.VALID))
      case _ => api.put_evidenceOut(BatteryEvidence(BatteryBand.CRITICAL, F))
    }
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
