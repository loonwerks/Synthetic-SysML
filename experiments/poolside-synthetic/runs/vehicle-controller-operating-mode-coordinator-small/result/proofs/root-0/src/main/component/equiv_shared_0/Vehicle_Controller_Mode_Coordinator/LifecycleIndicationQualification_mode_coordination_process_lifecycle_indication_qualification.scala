// #Sireum

package equiv_shared_0.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import equiv_shared_0._

object LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification {
  // BEGIN FUNCTIONS
  @strictpure def qualify_lifecycle(sample: Vehicle_Controller_Mode_Coordinator.LifecycleSample): Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type = if (sample.status == InputStatus.Invalid) LifecycleAssessment.InvalidLifecycle else if (sample.eventValue == LifecycleEvent.NoLifecycleEvent) LifecycleAssessment.NoLifecycle else if (sample.eventValue == LifecycleEvent.Start) LifecycleAssessment.StartRequested else if (sample.eventValue == LifecycleEvent.On) LifecycleAssessment.OnRequested else LifecycleAssessment.OffRequested
  // END FUNCTIONS
}
