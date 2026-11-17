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
        val apiUsage_requestIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type] = api.get_requestIn()
    api.logInfo(s"Received on data port requestIn: ${apiUsage_requestIn}")
    val apiUsage_attentionClearedIn: Option[Base_Types.Boolean] = api.get_attentionClearedIn()
    api.logInfo(s"Received on data port attentionClearedIn: ${apiUsage_attentionClearedIn}")
    val apiUsage_advisoryIn: Option[Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts] = api.get_advisoryIn()
    api.logInfo(s"Received on data port advisoryIn: ${apiUsage_advisoryIn}")
    val apiUsage_sessionIn: Option[Drone_Battery_Charge_Qualification_Supervisor.SessionResolution] = api.get_sessionIn()
    api.logInfo(s"Received on data port sessionIn: ${apiUsage_sessionIn}")
    val result: RequestResult.Type =
      if (apiUsage_requestIn.get == ServiceRequest.None) RequestResult.None
      else if (apiUsage_requestIn.get == ServiceRequest.Assess &
               apiUsage_advisoryIn.get.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN) RequestResult.Deferred
      else if (apiUsage_requestIn.get == ServiceRequest.Assess) RequestResult.Accepted
      else if (apiUsage_requestIn.get == ServiceRequest.BeginCharge &
               (apiUsage_sessionIn.get.winningCase == SessionCase.SESS_07 |
                apiUsage_sessionIn.get.winningCase == SessionCase.SESS_09)) RequestResult.Accepted
      else if (apiUsage_requestIn.get == ServiceRequest.BeginCharge &
               (apiUsage_sessionIn.get.winningCase == SessionCase.SESS_01 |
                apiUsage_sessionIn.get.winningCase == SessionCase.SESS_02 |
                apiUsage_sessionIn.get.winningCase == SessionCase.SESS_08)) RequestResult.Deferred
      else if (apiUsage_requestIn.get == ServiceRequest.BeginCharge &
               apiUsage_sessionIn.get.winningCase == SessionCase.SESS_06) RequestResult.NoEffect
      else if (apiUsage_requestIn.get == ServiceRequest.BeginCharge) RequestResult.Rejected
      else if (apiUsage_requestIn.get == ServiceRequest.EndCharge &
               (apiUsage_sessionIn.get.winningCase == SessionCase.SESS_03 |
                apiUsage_sessionIn.get.winningCase == SessionCase.SESS_04)) RequestResult.Accepted
      else if (apiUsage_requestIn.get == ServiceRequest.EndCharge) RequestResult.NoEffect
      else if (apiUsage_attentionClearedIn.get) RequestResult.Accepted
      else RequestResult.NoEffect
    api.put_publicFactsOut(PublicDecisionFacts(
      apiUsage_advisoryIn.get,
      PublishedRequestResult(result),
      apiUsage_sessionIn.get.newSession))
  }

  def finalise(api: CurrentRequestResultDecisionOwner_Operational_Api): Unit = { }
}
