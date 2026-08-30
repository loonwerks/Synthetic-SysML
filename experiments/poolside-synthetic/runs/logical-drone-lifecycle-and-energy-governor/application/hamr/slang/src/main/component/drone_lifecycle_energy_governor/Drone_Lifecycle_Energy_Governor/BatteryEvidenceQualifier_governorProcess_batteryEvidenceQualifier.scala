// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    api.put_evidenceOut(
      Drone_Lifecycle_Energy_Governor.BatteryEvidence(
        band = Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL,
        validBand = F))
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    val reportIn: Drone_Lifecycle_Energy_Governor.BatteryReportValue = api.get_reportIn().get
    api.put_evidenceOut(
      Drone_Lifecycle_Energy_Governor.BatteryEvidence(
        band = reportIn.band,
        validBand = reportIn.validity == Drone_Lifecycle_Energy_Governor.EvidenceValidity.VALID))
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
