// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner {

  // BEGIN FUNCTIONS
  @strictpure def assessDocking(sample: Mining_Cargo_Transfer_Supervisor.DockingSample): Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type = if (sample.status == InputStatus.Invalid) DockingAssessment.InvalidDocking else if (sample.docking == DockingObservation.Docked) DockingAssessment.DockedAssessment else DockingAssessment.NotDockedAssessment
  // END FUNCTIONS

  def initialise(api: DockingAssessmentOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_DOCKING_ASSESSMENT
        api.dockingAssessment == DockingAssessment.InvalidDocking
        // END INITIALIZES ENSURES
      )
    )
    api.put_dockingAssessment(DockingAssessment.InvalidDocking)
  }

  def timeTriggered(api: DockingAssessmentOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val sample = api.get_dockingSample().get
    api.put_dockingAssessment(assessDocking(sample))
  }

  def finalise(api: DockingAssessmentOwner_Operational_Api): Unit = { }
}
