// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner {

  def initialise(api: CurrentRequestResultDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

  }

  def timeTriggered(api: CurrentRequestResultDecisionOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PUBLIC_DECISION_COPIES
        api.publicFactsOut.advisory.advisoryValue == api.advisoryIn.advisoryValue &
          api.publicFactsOut.newSession.sessionValue == api.sessionIn.newSession.sessionValue,
        // case REQUEST_NONE
        (api.requestIn == ServiceRequest.None) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.None),
        // case ASSESS_DEFERRED
        (api.requestIn == ServiceRequest.Assess &
          api.advisoryIn.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.Deferred),
        // case ASSESS_ACCEPTED
        (api.requestIn == ServiceRequest.Assess &
          api.advisoryIn.advisoryValue != PilotAdvisory.ADVISORY_UNKNOWN) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted),
        // case BEGIN_ACCEPTED
        (api.requestIn == ServiceRequest.BeginCharge &
          (api.sessionIn.winningCase == SessionCase.SESS_07 |
            api.sessionIn.winningCase == SessionCase.SESS_09)) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted),
        // case BEGIN_DEFERRED
        (api.requestIn == ServiceRequest.BeginCharge &
          (api.sessionIn.winningCase == SessionCase.SESS_01 |
            api.sessionIn.winningCase == SessionCase.SESS_02 |
            api.sessionIn.winningCase == SessionCase.SESS_08)) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.Deferred),
        // case BEGIN_NO_EFFECT
        (api.requestIn == ServiceRequest.BeginCharge &
          api.sessionIn.winningCase == SessionCase.SESS_06) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect),
        // case BEGIN_REJECTED
        (api.requestIn == ServiceRequest.BeginCharge &
          api.sessionIn.winningCase != SessionCase.SESS_01 &
          api.sessionIn.winningCase != SessionCase.SESS_02 &
          api.sessionIn.winningCase != SessionCase.SESS_06 &
          api.sessionIn.winningCase != SessionCase.SESS_07 &
          api.sessionIn.winningCase != SessionCase.SESS_08 &
          api.sessionIn.winningCase != SessionCase.SESS_09) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.Rejected),
        // case END_ACCEPTED
        (api.requestIn == ServiceRequest.EndCharge &
          (api.sessionIn.winningCase == SessionCase.SESS_03 |
            api.sessionIn.winningCase == SessionCase.SESS_04)) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted),
        // case END_NO_EFFECT
        (api.requestIn == ServiceRequest.EndCharge &
          api.sessionIn.winningCase != SessionCase.SESS_03 &
          api.sessionIn.winningCase != SessionCase.SESS_04) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect),
        // case ACKNOWLEDGEMENT_ACCEPTED
        (api.requestIn == ServiceRequest.AcknowledgeNotice &
          api.attentionClearedIn) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted),
        // case ACKNOWLEDGEMENT_NO_EFFECT
        (api.requestIn == ServiceRequest.AcknowledgeNotice &
          !(api.attentionClearedIn)) ___>: (api.publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val request = api.get_requestIn().get
    val cleared = api.get_attentionClearedIn().get
    val advisory = api.get_advisoryIn().get
    val session = api.get_sessionIn().get
    val result: RequestResult.Type =
      if (request == ServiceRequest.None) RequestResult.None
      else if (request == ServiceRequest.Assess) if (advisory.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN) RequestResult.Deferred else RequestResult.Accepted
      else if (request == ServiceRequest.BeginCharge) if (session.winningCase == SessionCase.SESS_07 | session.winningCase == SessionCase.SESS_09) RequestResult.Accepted
      else if (session.winningCase == SessionCase.SESS_01 | session.winningCase == SessionCase.SESS_02 | session.winningCase == SessionCase.SESS_08) RequestResult.Deferred
      else if (session.winningCase == SessionCase.SESS_06) RequestResult.NoEffect else RequestResult.Rejected
      else if (request == ServiceRequest.EndCharge) if (session.winningCase == SessionCase.SESS_03 | session.winningCase == SessionCase.SESS_04) RequestResult.Accepted else RequestResult.NoEffect
      else if (cleared) RequestResult.Accepted else RequestResult.NoEffect
    api.put_publicFactsOut(PublicDecisionFacts(advisory, PublishedRequestResult(result), session.newSession))
  }

  def finalise(api: CurrentRequestResultDecisionOwner_Operational_Api): Unit = { }
}
