// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner {

  def initialise(api: TreatmentReadinessQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_treatmentReadiness(Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Unknown)
    api.put_readinessContext(Cabin_Air_Treatment_Supervisor.ReadinessContext.CriticalUnknown)
  }

  def timeTriggered(api: TreatmentReadinessQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_treatmentEquipmentStatus: Option[Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus] = api.get_treatmentEquipmentStatus()
    api.logInfo(s"Received on data port treatmentEquipmentStatus: ${apiUsage_treatmentEquipmentStatus}")
  }

  def finalise(api: TreatmentReadinessQualificationOwner_Operational_Api): Unit = { }
}
