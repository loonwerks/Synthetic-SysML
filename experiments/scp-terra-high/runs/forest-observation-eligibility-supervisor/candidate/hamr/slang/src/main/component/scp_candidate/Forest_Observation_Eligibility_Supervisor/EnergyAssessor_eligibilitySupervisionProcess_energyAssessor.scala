// #Sireum

package scp_candidate.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyAssessor_eligibilitySupervisionProcess_energyAssessor {

  def initialise(api: EnergyAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ENERGY_VERDICT
        api.energyVerdictOut.ticket == TaggedTicket.NoTicket &
          api.energyVerdictOut.verdict == EnergyVerdict.NoEnergyVerdict
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_energyVerdictOut(TaggedEnergyVerdict(
      EnergyVerdict.NoEnergyVerdict,
      TaggedTicket.NoTicket))
  }

  def timeTriggered(api: EnergyAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val ticket: Option[EvaluationTicket.Type] = api.get_evaluationTicket()
    val evidence: Option[EnergyEvidence.Type] = api.get_energyEvidence()
    val result: TaggedEnergyVerdict = (ticket, evidence) match {
      case (Some(EvaluationTicket.TokenA), Some(EnergyEvidence.AdequateCurrent)) =>
        TaggedEnergyVerdict(EnergyVerdict.EnergyReady, TaggedTicket.TokenA)
      case (Some(EvaluationTicket.TokenB), Some(EnergyEvidence.AdequateCurrent)) =>
        TaggedEnergyVerdict(EnergyVerdict.EnergyReady, TaggedTicket.TokenB)
      case (Some(EvaluationTicket.TokenA), Some(EnergyEvidence.LowCurrent)) =>
        TaggedEnergyVerdict(EnergyVerdict.EnergyInsufficient, TaggedTicket.TokenA)
      case (Some(EvaluationTicket.TokenB), Some(EnergyEvidence.LowCurrent)) =>
        TaggedEnergyVerdict(EnergyVerdict.EnergyInsufficient, TaggedTicket.TokenB)
      case (Some(EvaluationTicket.TokenA), _) =>
        TaggedEnergyVerdict(EnergyVerdict.EnergyUntrusted, TaggedTicket.TokenA)
      case (Some(EvaluationTicket.TokenB), _) =>
        TaggedEnergyVerdict(EnergyVerdict.EnergyUntrusted, TaggedTicket.TokenB)
      case _ => TaggedEnergyVerdict(EnergyVerdict.NoEnergyVerdict, TaggedTicket.NoTicket)
    }
    api.put_energyVerdictOut(result)
  }

  def finalise(api: EnergyAssessor_Operational_Api): Unit = { }
}
