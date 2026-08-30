// #Sireum

package vehicle_mode_coordinator.Vehicle_Mode_Coordinator

import org.sireum._
import vehicle_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner {

  def initialise(api: IntentArbitrationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_arbitrationForQualification(Vehicle_Mode_Coordinator.ArbitrationResult.example())
    api.put_arbitrationForPublication(Vehicle_Mode_Coordinator.ArbitrationResult.example())
  }

  def timeTriggered(api: IntentArbitrationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_lifecycleFacts: Option[Vehicle_Mode_Coordinator.LifecycleFacts] = api.get_lifecycleFacts()
    api.logInfo(s"Received on data port lifecycleFacts: ${apiUsage_lifecycleFacts}")
    val apiUsage_serviceFacts: Option[Vehicle_Mode_Coordinator.ServiceFacts] = api.get_serviceFacts()
    api.logInfo(s"Received on data port serviceFacts: ${apiUsage_serviceFacts}")
    val apiUsage_conditionAssessment: Option[Vehicle_Mode_Coordinator.ConditionAssessment.Type] = api.get_conditionAssessment()
    api.logInfo(s"Received on data port conditionAssessment: ${apiUsage_conditionAssessment}")
  }

  def finalise(api: IntentArbitrationOwner_Operational_Api): Unit = { }
}
