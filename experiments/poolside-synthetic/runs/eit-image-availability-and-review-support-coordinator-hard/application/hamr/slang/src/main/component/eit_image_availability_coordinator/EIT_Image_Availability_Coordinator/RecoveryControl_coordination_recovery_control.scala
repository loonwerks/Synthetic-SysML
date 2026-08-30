// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryControl_coordination_recovery_control {

  def initialise(api: RecoveryControl_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryFrame(EIT_Image_Availability_Coordinator.RecoveryFrame.example())
  }

  def timeTriggered(api: RecoveryControl_Operational_Api): Unit = {
    // example api usage

    val apiUsage_recoveryEvent: Option[EIT_Image_Availability_Coordinator.RecoveryEvent.Type] = api.get_recoveryEvent()
    api.logInfo(s"Received on data port recoveryEvent: ${apiUsage_recoveryEvent}")
    val apiUsage_faultSummary: Option[EIT_Image_Availability_Coordinator.FaultSummary] = api.get_faultSummary()
    api.logInfo(s"Received on data port faultSummary: ${apiUsage_faultSummary}")
  }

  def finalise(api: RecoveryControl_Operational_Api): Unit = { }
}
