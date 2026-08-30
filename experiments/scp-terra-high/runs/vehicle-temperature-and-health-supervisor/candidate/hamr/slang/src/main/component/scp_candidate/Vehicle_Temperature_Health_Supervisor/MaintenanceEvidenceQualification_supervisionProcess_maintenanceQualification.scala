// #Sireum

package scp_candidate.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification {

  // BEGIN FUNCTIONS
  @strictpure def qualifyMaintenance(sample: Vehicle_Temperature_Health_Supervisor.MaintenanceSample): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type = if (sample.status == InputStatus.Invalid) MaintenanceAssessment.InvalidMaintenance else if (sample.timing == MaintenanceTiming.NotDue) MaintenanceAssessment.MaintenanceClear else MaintenanceAssessment.MaintenanceDue
  // END FUNCTIONS

  def initialise(api: MaintenanceEvidenceQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_MAINTENANCE_UNTRUSTED
        api.assessmentForRecovery == MaintenanceAssessment.InvalidMaintenance &&
          api.assessmentForArbitration == MaintenanceAssessment.InvalidMaintenance
        // END INITIALIZES ENSURES
      )
    )
    api.put_assessmentForRecovery(MaintenanceAssessment.InvalidMaintenance)
    api.put_assessmentForArbitration(MaintenanceAssessment.InvalidMaintenance)
  }

  def timeTriggered(api: MaintenanceEvidenceQualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.assessmentForRecovery == qualifyMaintenance(api.rawMaintenance) &&
          api.assessmentForArbitration == qualifyMaintenance(api.rawMaintenance)
      )
    )
    val assessment = qualifyMaintenance(api.get_rawMaintenance().get)
    api.put_assessmentForRecovery(assessment)
    api.put_assessmentForArbitration(assessment)
  }

  def finalise(api: MaintenanceEvidenceQualification_Operational_Api): Unit = { }
}
