// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter {

  def initialise(api: EligibilityArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_eligibilityDecision(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision)
  }

  def timeTriggered(api: EligibilityArbiter_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ARBITER_WITHDRAW
        //   if requestContext is CancelOutstanding
        (api.requestContext == RequestContext.CancelOutstanding) ___>: (api.eligibilityDecision == EligibilityDecision.Withdraw),
        // case ARBITER_POWER_INSUFFICIENT
        //   if ticket-aligned energy verdict is EnergyInsufficient and support verdict is not NoSupportVerdict
        ((api.requestContext == RequestContext.EvaluateTokenA &
          api.energyVerdictIn.ticket == TaggedTicket.TokenA &
          api.supportVerdictIn.ticket == TaggedTicket.TokenA |
          api.requestContext == RequestContext.EvaluateTokenB &
            api.energyVerdictIn.ticket == TaggedTicket.TokenB &
            api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict == EnergyVerdict.EnergyInsufficient &
          api.supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict) ___>: (api.eligibilityDecision == EligibilityDecision.DenyPower),
        // case ARBITER_POWER_UNTRUSTED
        //   if ticket-aligned energy verdict is EnergyUntrusted and support verdict is not NoSupportVerdict
        ((api.requestContext == RequestContext.EvaluateTokenA &
          api.energyVerdictIn.ticket == TaggedTicket.TokenA &
          api.supportVerdictIn.ticket == TaggedTicket.TokenA |
          api.requestContext == RequestContext.EvaluateTokenB &
            api.energyVerdictIn.ticket == TaggedTicket.TokenB &
            api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict == EnergyVerdict.EnergyUntrusted &
          api.supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict) ___>: (api.eligibilityDecision == EligibilityDecision.DenyPower),
        // case ARBITER_SUPPORT_UNAVAILABLE
        //   if ticket-aligned energy verdict is EnergyReady and support verdict is SupportUnavailable
        ((api.requestContext == RequestContext.EvaluateTokenA &
          api.energyVerdictIn.ticket == TaggedTicket.TokenA &
          api.supportVerdictIn.ticket == TaggedTicket.TokenA |
          api.requestContext == RequestContext.EvaluateTokenB &
            api.energyVerdictIn.ticket == TaggedTicket.TokenB &
            api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict == EnergyVerdict.EnergyReady &
          api.supportVerdictIn.verdict == SupportVerdict.SupportUnavailable) ___>: (api.eligibilityDecision == EligibilityDecision.DenySupport),
        // case ARBITER_SUPPORT_UNTRUSTED
        //   if ticket-aligned energy verdict is EnergyReady and support verdict is SupportUntrusted
        ((api.requestContext == RequestContext.EvaluateTokenA &
          api.energyVerdictIn.ticket == TaggedTicket.TokenA &
          api.supportVerdictIn.ticket == TaggedTicket.TokenA |
          api.requestContext == RequestContext.EvaluateTokenB &
            api.energyVerdictIn.ticket == TaggedTicket.TokenB &
            api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict == EnergyVerdict.EnergyReady &
          api.supportVerdictIn.verdict == SupportVerdict.SupportUntrusted) ___>: (api.eligibilityDecision == EligibilityDecision.DenySupport),
        // case ARBITER_PERMIT
        //   if ticket-aligned energy verdict is EnergyReady and support verdict is SupportReady
        ((api.requestContext == RequestContext.EvaluateTokenA &
          api.energyVerdictIn.ticket == TaggedTicket.TokenA &
          api.supportVerdictIn.ticket == TaggedTicket.TokenA |
          api.requestContext == RequestContext.EvaluateTokenB &
            api.energyVerdictIn.ticket == TaggedTicket.TokenB &
            api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict == EnergyVerdict.EnergyReady &
          api.supportVerdictIn.verdict == SupportVerdict.SupportReady) ___>: (api.eligibilityDecision == EligibilityDecision.Permit),
        // case ARBITER_INACTIVE_OR_MISMATCH
        //   if requestContext is not CancelOutstanding and no token-aligned verdict is available
        (api.requestContext != RequestContext.CancelOutstanding &
          !(api.requestContext == RequestContext.EvaluateTokenA &
            api.energyVerdictIn.ticket == TaggedTicket.TokenA &
            api.supportVerdictIn.ticket == TaggedTicket.TokenA |
            api.requestContext == RequestContext.EvaluateTokenB &
              api.energyVerdictIn.ticket == TaggedTicket.TokenB &
              api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict != EnergyVerdict.NoEnergyVerdict &
          api.supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict) ___>: (api.eligibilityDecision == EligibilityDecision.NoDecision)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_requestContext: Option[Forest_Observation_Eligibility_Supervisor.RequestContext.Type] = api.get_requestContext()
    api.logInfo(s"Received on data port requestContext: ${apiUsage_requestContext}")
    val apiUsage_energyVerdictIn: Option[Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict] = api.get_energyVerdictIn()
    api.logInfo(s"Received on data port energyVerdictIn: ${apiUsage_energyVerdictIn}")
    val apiUsage_supportVerdictIn: Option[Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict] = api.get_supportVerdictIn()
    api.logInfo(s"Received on data port supportVerdictIn: ${apiUsage_supportVerdictIn}")
  }

  def finalise(api: EligibilityArbiter_Operational_Api): Unit = { }
}
