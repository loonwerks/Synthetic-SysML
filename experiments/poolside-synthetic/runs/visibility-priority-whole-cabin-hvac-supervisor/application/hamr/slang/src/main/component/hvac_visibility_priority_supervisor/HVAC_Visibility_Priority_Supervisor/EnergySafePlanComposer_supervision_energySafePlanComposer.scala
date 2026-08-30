// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnergySafePlanComposer_supervision_energySafePlanComposer {

  def initialise(api: EnergySafePlanComposer_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_candidatePlan(HVAC_Visibility_Priority_Supervisor.CandidatePlan.example())
  }

  def timeTriggered(api: EnergySafePlanComposer_Operational_Api): Unit = {
    // example api usage

    val apiUsage_electricalEligibility: Option[HVAC_Visibility_Priority_Supervisor.ElectricalEligibility] = api.get_electricalEligibility()
    api.logInfo(s"Received on data port electricalEligibility: ${apiUsage_electricalEligibility}")
    val apiUsage_selectedIntent: Option[HVAC_Visibility_Priority_Supervisor.SelectedIntent] = api.get_selectedIntent()
    api.logInfo(s"Received on data port selectedIntent: ${apiUsage_selectedIntent}")
  }

  def finalise(api: EnergySafePlanComposer_Operational_Api): Unit = { }
}
