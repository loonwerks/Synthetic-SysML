// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
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
    val input = api.get_reportIn().get
    api.put_evidenceOut(BatteryEvidence(input.band,
      input.validity == EvidenceValidity.VALID))
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
