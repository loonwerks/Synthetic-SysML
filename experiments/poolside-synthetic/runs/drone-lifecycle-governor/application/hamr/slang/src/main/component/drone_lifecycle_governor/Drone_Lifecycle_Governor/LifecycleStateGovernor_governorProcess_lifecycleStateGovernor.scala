// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleStateGovernor_governorProcess_lifecycleStateGovernor {

  def initialise(api: LifecycleStateGovernor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_currentLifecycleState(Drone_Lifecycle_Governor.LifecycleState.OFF)
    api.put_decisionSnapshot(Drone_Lifecycle_Governor.DecisionSnapshot.example())
  }

  def timeTriggered(api: LifecycleStateGovernor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_arbitratedIntent: Option[Drone_Lifecycle_Governor.ArbitratedIntent] = api.get_arbitratedIntent()
    api.logInfo(s"Received on data port arbitratedIntent: ${apiUsage_arbitratedIntent}")
    val apiUsage_eligibilityEnvelope: Option[Drone_Lifecycle_Governor.EligibilityEnvelope] = api.get_eligibilityEnvelope()
    api.logInfo(s"Received on data port eligibilityEnvelope: ${apiUsage_eligibilityEnvelope}")
  }

  def finalise(api: LifecycleStateGovernor_Operational_Api): Unit = { }
}
