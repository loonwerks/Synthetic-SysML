// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner {

  def initialise(api: AirCareRequestLifecycleOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.None)
  }

  def timeTriggered(api: AirCareRequestLifecycleOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_airCareSelection: Option[Cabin_Air_Treatment_Supervisor.AirCareSelection.Type] = api.get_airCareSelection()
    api.logInfo(s"Received on data port airCareSelection: ${apiUsage_airCareSelection}")
    val apiUsage_requestValidity: Option[Cabin_Air_Treatment_Supervisor.RequestValidity.Type] = api.get_requestValidity()
    api.logInfo(s"Received on data port requestValidity: ${apiUsage_requestValidity}")
  }

  def finalise(api: AirCareRequestLifecycleOwner_Operational_Api): Unit = { }
}
