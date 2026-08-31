// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object CheckLifecycle_battery_assessment_process_check_lifecycle {

  def initialise(api: CheckLifecycle_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_acquisition_directive(Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition)
    api.put_assessment_context(Battery_Status_Assessment_Service.AssessmentContext.NoContext)
    api.put_publication_directive(Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective)
    api.put_check_status(Battery_Status_Assessment_Service.CheckStatus.Idle)
  }

  def timeTriggered(api: CheckLifecycle_Operational_Api): Unit = {
    // example api usage

    val apiUsage_check_request: Option[Battery_Status_Assessment_Service.CheckRequest] = api.get_check_request()
    api.logInfo(s"Received on data port check_request: ${apiUsage_check_request}")
    val apiUsage_acquisition_outcome: Option[Battery_Status_Assessment_Service.AcquisitionOutcome.Type] = api.get_acquisition_outcome()
    api.logInfo(s"Received on data port acquisition_outcome: ${apiUsage_acquisition_outcome}")
    val apiUsage_publication_outcome: Option[Battery_Status_Assessment_Service.PublicationOutcome.Type] = api.get_publication_outcome()
    api.logInfo(s"Received on data port publication_outcome: ${apiUsage_publication_outcome}")
  }

  def finalise(api: CheckLifecycle_Operational_Api): Unit = { }
}
