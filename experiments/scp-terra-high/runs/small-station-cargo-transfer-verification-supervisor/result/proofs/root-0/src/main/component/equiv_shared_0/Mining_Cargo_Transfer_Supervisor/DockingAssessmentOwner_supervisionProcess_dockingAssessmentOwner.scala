// #Sireum

package equiv_shared_0.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import equiv_shared_0._

object DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner {
  // BEGIN FUNCTIONS
  @strictpure def assessDocking(sample: Mining_Cargo_Transfer_Supervisor.DockingSample): Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type = if (sample.status == InputStatus.Invalid) DockingAssessment.InvalidDocking else if (sample.docking == DockingObservation.Docked) DockingAssessment.DockedAssessment else DockingAssessment.NotDockedAssessment
  // END FUNCTIONS
}
