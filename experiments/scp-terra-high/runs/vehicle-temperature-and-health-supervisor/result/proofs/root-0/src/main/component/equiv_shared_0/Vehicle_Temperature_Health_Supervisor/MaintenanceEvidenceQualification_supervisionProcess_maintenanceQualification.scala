// #Sireum

package equiv_shared_0.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import equiv_shared_0._

object MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification {
  // BEGIN FUNCTIONS
  @strictpure def qualifyMaintenance(sample: Vehicle_Temperature_Health_Supervisor.MaintenanceSample): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type = if (sample.status == InputStatus.Invalid) MaintenanceAssessment.InvalidMaintenance else if (sample.timing == MaintenanceTiming.NotDue) MaintenanceAssessment.MaintenanceClear else MaintenanceAssessment.MaintenanceDue
  // END FUNCTIONS
}
