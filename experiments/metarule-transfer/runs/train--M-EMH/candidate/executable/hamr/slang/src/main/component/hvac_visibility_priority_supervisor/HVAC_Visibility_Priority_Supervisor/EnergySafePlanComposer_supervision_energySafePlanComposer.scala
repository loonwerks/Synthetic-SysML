// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnergySafePlanComposer_supervision_energySafePlanComposer {

  def initialise(api: EnergySafePlanComposer_Initialization_Api): Unit = {
    api.put_candidatePlan(safePlan(HVAC_Visibility_Priority_Supervisor.CandidateCause.None))
  }

  def timeTriggered(api: EnergySafePlanComposer_Operational_Api): Unit = {
    (api.get_electricalEligibility(), api.get_selectedIntent()) match {
      case (Some(electrical), Some(intent)) if electrical.tier ==
        HVAC_Visibility_Priority_Supervisor.ElectricalTier.Ineligible =>
        api.put_candidatePlan(safePlan(HVAC_Visibility_Priority_Supervisor.CandidateCause.ElectricalUnavailable))
      case (Some(electrical), Some(intent)) if electrical.tier ==
        HVAC_Visibility_Priority_Supervisor.ElectricalTier.Denied =>
        api.put_candidatePlan(safePlan(HVAC_Visibility_Priority_Supervisor.CandidateCause.ElectricalDenied))
      case (Some(electrical), Some(intent)) if intent.service ==
        HVAC_Visibility_Priority_Supervisor.Service.None =>
        api.put_candidatePlan(safePlan(candidateCause(intent.selectedCause)))
      case (Some(electrical), Some(intent)) =>
        val limited = electrical.tier == HVAC_Visibility_Priority_Supervisor.ElectricalTier.Limited
        val plan = HVAC_Visibility_Priority_Supervisor.CabinActuationPlan(
          intent.service,
          if (limited) HVAC_Visibility_Priority_Supervisor.Intensity.Reduced
          else HVAC_Visibility_Priority_Supervisor.Intensity.Normal,
          if (intent.service == HVAC_Visibility_Priority_Supervisor.Service.Heat) intent.heatSource
          else HVAC_Visibility_Priority_Supervisor.HeatSource.None,
          if (limited) HVAC_Visibility_Priority_Supervisor.EnergyTier.Limited
          else HVAC_Visibility_Priority_Supervisor.EnergyTier.Full)
        api.put_candidatePlan(HVAC_Visibility_Priority_Supervisor.CandidatePlan(plan, candidateCause(intent.selectedCause)))
      case _ => api.put_candidatePlan(safePlan(HVAC_Visibility_Priority_Supervisor.CandidateCause.ElectricalUnavailable))
    }
  }

  def finalise(api: EnergySafePlanComposer_Operational_Api): Unit = { }

  def safePlan(cause: HVAC_Visibility_Priority_Supervisor.CandidateCause.Type):
    HVAC_Visibility_Priority_Supervisor.CandidatePlan = {
    return HVAC_Visibility_Priority_Supervisor.CandidatePlan(
      HVAC_Visibility_Priority_Supervisor.CabinActuationPlan(
        HVAC_Visibility_Priority_Supervisor.Service.None,
        HVAC_Visibility_Priority_Supervisor.Intensity.Off,
        HVAC_Visibility_Priority_Supervisor.HeatSource.None,
        HVAC_Visibility_Priority_Supervisor.EnergyTier.None),
      cause)
  }

  def candidateCause(cause: HVAC_Visibility_Priority_Supervisor.SelectionCause.Type):
    HVAC_Visibility_Priority_Supervisor.CandidateCause.Type = {
    return cause match {
      case HVAC_Visibility_Priority_Supervisor.SelectionCause.VisibilityPriority =>
        HVAC_Visibility_Priority_Supervisor.CandidateCause.VisibilityPriority
      case HVAC_Visibility_Priority_Supervisor.SelectionCause.AwaitingRecovery =>
        HVAC_Visibility_Priority_Supervisor.CandidateCause.AwaitingRecovery
      case HVAC_Visibility_Priority_Supervisor.SelectionCause.AwaitingFreshRequest =>
        HVAC_Visibility_Priority_Supervisor.CandidateCause.AwaitingFreshRequest
      case _ => HVAC_Visibility_Priority_Supervisor.CandidateCause.None
    }
  }
}
