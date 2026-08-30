// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner {

  def initialise(api: LifecyclePriorityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_resolutionOut(Drone_Lifecycle_Energy_Governor.LifecycleResolution.example())
  }

  def timeTriggered(api: LifecyclePriorityOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_semanticsIn: Option[Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest] = api.get_semanticsIn()
    api.logInfo(s"Received on data port semanticsIn: ${apiUsage_semanticsIn}")
    val apiUsage_chargeEligibilityIn: Option[Drone_Lifecycle_Energy_Governor.ChargeEligibility] = api.get_chargeEligibilityIn()
    api.logInfo(s"Received on data port chargeEligibilityIn: ${apiUsage_chargeEligibilityIn}")
    val apiUsage_readinessIn: Option[Base_Types.Boolean] = api.get_readinessIn()
    api.logInfo(s"Received on data port readinessIn: ${apiUsage_readinessIn}")
    val apiUsage_homeFactsIn: Option[Drone_Lifecycle_Energy_Governor.HomeFacts] = api.get_homeFactsIn()
    api.logInfo(s"Received on data port homeFactsIn: ${apiUsage_homeFactsIn}")
    val apiUsage_touchdownFactsIn: Option[Drone_Lifecycle_Energy_Governor.TouchdownFacts] = api.get_touchdownFactsIn()
    api.logInfo(s"Received on data port touchdownFactsIn: ${apiUsage_touchdownFactsIn}")
    val apiUsage_hazardProposalIn: Option[Drone_Lifecycle_Energy_Governor.HazardProposal] = api.get_hazardProposalIn()
    api.logInfo(s"Received on data port hazardProposalIn: ${apiUsage_hazardProposalIn}")
    val apiUsage_airborneRequestIn: Option[Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type] = api.get_airborneRequestIn()
    api.logInfo(s"Received on data port airborneRequestIn: ${apiUsage_airborneRequestIn}")
  }

  def finalise(api: LifecyclePriorityOwner_Operational_Api): Unit = { }
}
