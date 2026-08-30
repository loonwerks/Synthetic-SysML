// #Sireum

package scp_candidate.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification {

  def initialise(api: LifecycleIndicationQualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_assessment_to_compatibility(Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.NoLifecycle)
    api.put_assessment_to_arbiter(Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.NoLifecycle)
  }

  def timeTriggered(api: LifecycleIndicationQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_lifecycle_sample() match {
      case Some(sample) =>
        val assessment: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type =
          if (sample.status == Vehicle_Controller_Mode_Coordinator.InputStatus.Invalid) {
            Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.InvalidLifecycle
          } else if (sample.eventValue == Vehicle_Controller_Mode_Coordinator.LifecycleEvent.NoLifecycleEvent) {
            Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.NoLifecycle
          } else if (sample.eventValue == Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Start) {
            Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.StartRequested
          } else if (sample.eventValue == Vehicle_Controller_Mode_Coordinator.LifecycleEvent.On) {
            Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.OnRequested
          } else {
            Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.OffRequested
          }
        api.put_assessment_to_compatibility(assessment)
        api.put_assessment_to_arbiter(assessment)
    }
  }

  def finalise(api: LifecycleIndicationQualification_Operational_Api): Unit = { }
}
