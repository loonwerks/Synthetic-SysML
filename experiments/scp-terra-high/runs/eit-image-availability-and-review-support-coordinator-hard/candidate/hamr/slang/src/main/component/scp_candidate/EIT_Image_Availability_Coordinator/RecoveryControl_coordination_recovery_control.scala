// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryControl_coordination_recovery_control {

  def initialise(api: RecoveryControl_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryFrame(EIT_Image_Availability_Coordinator.RecoveryFrame.example())
  }

  def finalise(api: RecoveryControl_Operational_Api): Unit = { }
  def timeTriggered(api: RecoveryControl_Operational_Api): Unit = { Contract(Modifies(api)) }
}
