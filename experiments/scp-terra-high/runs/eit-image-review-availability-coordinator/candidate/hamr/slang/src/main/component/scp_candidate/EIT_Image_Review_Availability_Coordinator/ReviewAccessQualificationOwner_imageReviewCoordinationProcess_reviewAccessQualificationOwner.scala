// #Sireum

package scp_candidate.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner {

  def initialise(api: ReviewAccessQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_viewerAssessment(EIT_Image_Review_Availability_Coordinator.ViewerAssessment(
      EIT_Image_Review_Availability_Coordinator.ViewerCondition.REVIEW_ACCESS_UNAVAILABLE, F))
  }

  def timeTriggered(api: ReviewAccessQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val observation: EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type = api.get_viewerObservation().get
    val a: EIT_Image_Review_Availability_Coordinator.ViewerAssessment = observation match {
      case EIT_Image_Review_Availability_Coordinator.ViewerObservation.VIEWER_AVAILABLE =>
        EIT_Image_Review_Availability_Coordinator.ViewerAssessment(EIT_Image_Review_Availability_Coordinator.ViewerCondition.REVIEW_ACCESS_AVAILABLE, T)
      case _ =>
        EIT_Image_Review_Availability_Coordinator.ViewerAssessment(EIT_Image_Review_Availability_Coordinator.ViewerCondition.REVIEW_ACCESS_UNAVAILABLE, F)
    }
    api.put_viewerAssessment(a)
  }

  def finalise(api: ReviewAccessQualificationOwner_Operational_Api): Unit = { }
}
