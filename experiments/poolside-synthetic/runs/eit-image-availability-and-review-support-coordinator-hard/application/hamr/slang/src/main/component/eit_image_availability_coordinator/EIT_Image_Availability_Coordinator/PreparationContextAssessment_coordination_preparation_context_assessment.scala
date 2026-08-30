// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object PreparationContextAssessment_coordination_preparation_context_assessment {

  def initialise(api: PreparationContextAssessment_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_contextFacts(EIT_Image_Availability_Coordinator.ContextFacts.NO_CONTEXT)
  }

  def timeTriggered(api: PreparationContextAssessment_Operational_Api): Unit = {
    // example api usage

    val apiUsage_preparationContext: Option[EIT_Image_Availability_Coordinator.PreparationContext.Type] = api.get_preparationContext()
    api.logInfo(s"Received on data port preparationContext: ${apiUsage_preparationContext}")
  }

  def finalise(api: PreparationContextAssessment_Operational_Api): Unit = { }
}
