// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter {

  def initialise(api: EligibilityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibilityDecision(EligibilityDecision.NoDecision)
  }

  def timeTriggered(api: EligibilityArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ARBITER_WITHDRAW
        //   N.md ARBITER_WITHDRAW
        (api.requestContext == RequestContext.CancelOutstanding) ___>: (api.eligibilityDecision == EligibilityDecision.Withdraw),
        // case ARBITER_POWER_INSUFFICIENT
        //   N.md ARBITER_POWER_INSUFFICIENT
        ((api.requestContext == RequestContext.EvaluateTokenA &
          api.energyVerdictIn.ticket == TaggedTicket.TokenA &
          api.supportVerdictIn.ticket == TaggedTicket.TokenA |
          api.requestContext == RequestContext.EvaluateTokenB &
            api.energyVerdictIn.ticket == TaggedTicket.TokenB &
            api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict == EnergyVerdict.EnergyInsufficient &
          api.supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict) ___>: (api.eligibilityDecision == EligibilityDecision.DenyPower),
        // case ARBITER_POWER_UNTRUSTED
        //   N.md ARBITER_POWER_UNTRUSTED
        ((api.requestContext == RequestContext.EvaluateTokenA &
          api.energyVerdictIn.ticket == TaggedTicket.TokenA &
          api.supportVerdictIn.ticket == TaggedTicket.TokenA |
          api.requestContext == RequestContext.EvaluateTokenB &
            api.energyVerdictIn.ticket == TaggedTicket.TokenB &
            api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict == EnergyVerdict.EnergyUntrusted &
          api.supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict) ___>: (api.eligibilityDecision == EligibilityDecision.DenyPower),
        // case ARBITER_SUPPORT_UNAVAILABLE
        //   N.md ARBITER_SUPPORT_UNAVAILABLE
        ((api.requestContext == RequestContext.EvaluateTokenA &
          api.energyVerdictIn.ticket == TaggedTicket.TokenA &
          api.supportVerdictIn.ticket == TaggedTicket.TokenA |
          api.requestContext == RequestContext.EvaluateTokenB &
            api.energyVerdictIn.ticket == TaggedTicket.TokenB &
            api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict == EnergyVerdict.EnergyReady &
          api.supportVerdictIn.verdict == SupportVerdict.SupportUnavailable) ___>: (api.eligibilityDecision == EligibilityDecision.DenySupport),
        // case ARBITER_SUPPORT_UNTRUSTED
        //   N.md ARBITER_SUPPORT_UNTRUSTED
        ((api.requestContext == RequestContext.EvaluateTokenA &
          api.energyVerdictIn.ticket == TaggedTicket.TokenA &
          api.supportVerdictIn.ticket == TaggedTicket.TokenA |
          api.requestContext == RequestContext.EvaluateTokenB &
            api.energyVerdictIn.ticket == TaggedTicket.TokenB &
            api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict == EnergyVerdict.EnergyReady &
          api.supportVerdictIn.verdict == SupportVerdict.SupportUntrusted) ___>: (api.eligibilityDecision == EligibilityDecision.DenySupport),
        // case ARBITER_PERMIT
        //   N.md ARBITER_PERMIT
        ((api.requestContext == RequestContext.EvaluateTokenA &
          api.energyVerdictIn.ticket == TaggedTicket.TokenA &
          api.supportVerdictIn.ticket == TaggedTicket.TokenA |
          api.requestContext == RequestContext.EvaluateTokenB &
            api.energyVerdictIn.ticket == TaggedTicket.TokenB &
            api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
          api.energyVerdictIn.verdict == EnergyVerdict.EnergyReady &
          api.supportVerdictIn.verdict == SupportVerdict.SupportReady) ___>: (api.eligibilityDecision == EligibilityDecision.Permit),
        // case ARBITER_INACTIVE_OR_MISMATCH
        //   N.md ARBITER_INACTIVE_OR_MISMATCH
        (api.requestContext != RequestContext.CancelOutstanding &
          !((api.requestContext == RequestContext.EvaluateTokenA &
            api.energyVerdictIn.ticket == TaggedTicket.TokenA &
            api.supportVerdictIn.ticket == TaggedTicket.TokenA |
            api.requestContext == RequestContext.EvaluateTokenB &
              api.energyVerdictIn.ticket == TaggedTicket.TokenB &
              api.supportVerdictIn.ticket == TaggedTicket.TokenB) &
            api.energyVerdictIn.verdict != EnergyVerdict.NoEnergyVerdict &
            api.supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict)) ___>: (api.eligibilityDecision == EligibilityDecision.NoDecision)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val context = api.get_requestContext().get
    val energy = api.get_energyVerdictIn().get
    val support = api.get_supportVerdictIn().get
    val matchingTicket =
      (context == RequestContext.EvaluateTokenA &
        energy.ticket == TaggedTicket.TokenA & support.ticket == TaggedTicket.TokenA) |
      (context == RequestContext.EvaluateTokenB &
        energy.ticket == TaggedTicket.TokenB & support.ticket == TaggedTicket.TokenB)
    val decision: EligibilityDecision.Type =
      if (context == RequestContext.CancelOutstanding) EligibilityDecision.Withdraw
      else if (!matchingTicket | energy.verdict == EnergyVerdict.NoEnergyVerdict |
        support.verdict == SupportVerdict.NoSupportVerdict) EligibilityDecision.NoDecision
      else if (energy.verdict == EnergyVerdict.EnergyInsufficient |
        energy.verdict == EnergyVerdict.EnergyUntrusted) EligibilityDecision.DenyPower
      else if (energy.verdict == EnergyVerdict.EnergyReady &
        (support.verdict == SupportVerdict.SupportUnavailable |
          support.verdict == SupportVerdict.SupportUntrusted)) EligibilityDecision.DenySupport
      else if (energy.verdict == EnergyVerdict.EnergyReady &
        support.verdict == SupportVerdict.SupportReady) EligibilityDecision.Permit
      else EligibilityDecision.NoDecision
    api.put_eligibilityDecision(decision)
  }

  def finalise(api: EligibilityArbiter_Operational_Api): Unit = { }
}
