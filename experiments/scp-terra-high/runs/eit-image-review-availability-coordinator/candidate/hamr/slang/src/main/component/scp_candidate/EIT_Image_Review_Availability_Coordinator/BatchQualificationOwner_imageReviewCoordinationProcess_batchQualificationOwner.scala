// #Sireum

package scp_candidate.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner {

  def initialise(api: BatchQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee init
        api.batchAssessment.batchCategory == BatchCategory.NO_BATCH &
          !(api.batchAssessment.usable)
        // END INITIALIZES ENSURES
      )
    )
    api.put_batchAssessment(EIT_Image_Review_Availability_Coordinator.BatchAssessment(
      EIT_Image_Review_Availability_Coordinator.BatchCategory.NO_BATCH, F))
  }

  def timeTriggered(api: BatchQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val event: EIT_Image_Review_Availability_Coordinator.BatchEvent.Type = api.get_batchEvent().get
    val a: EIT_Image_Review_Availability_Coordinator.BatchAssessment = event match {
      case EIT_Image_Review_Availability_Coordinator.BatchEvent.BATCH_A_AVAILABLE =>
        EIT_Image_Review_Availability_Coordinator.BatchAssessment(EIT_Image_Review_Availability_Coordinator.BatchCategory.USABLE_BATCH_A, T)
      case EIT_Image_Review_Availability_Coordinator.BatchEvent.BATCH_B_AVAILABLE =>
        EIT_Image_Review_Availability_Coordinator.BatchAssessment(EIT_Image_Review_Availability_Coordinator.BatchCategory.USABLE_BATCH_B, T)
      case EIT_Image_Review_Availability_Coordinator.BatchEvent.INVALID_BATCH_EVENT =>
        EIT_Image_Review_Availability_Coordinator.BatchAssessment(EIT_Image_Review_Availability_Coordinator.BatchCategory.INVALID_BATCH, F)
      case _ =>
        EIT_Image_Review_Availability_Coordinator.BatchAssessment(EIT_Image_Review_Availability_Coordinator.BatchCategory.NO_BATCH, F)
    }
    api.put_batchAssessment(a)
  }

  def finalise(api: BatchQualificationOwner_Operational_Api): Unit = { }
}
