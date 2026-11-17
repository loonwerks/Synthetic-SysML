// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_evidenceOut(BatteryEvidence(BatteryBand.CRITICAL, F))
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_reportIn() match {
      case Some(report) => api.put_evidenceOut(BatteryEvidence(report.band, report.validity == EvidenceValidity.VALID))
      case _ => api.put_evidenceOut(BatteryEvidence(BatteryBand.CRITICAL, F))
    }
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
