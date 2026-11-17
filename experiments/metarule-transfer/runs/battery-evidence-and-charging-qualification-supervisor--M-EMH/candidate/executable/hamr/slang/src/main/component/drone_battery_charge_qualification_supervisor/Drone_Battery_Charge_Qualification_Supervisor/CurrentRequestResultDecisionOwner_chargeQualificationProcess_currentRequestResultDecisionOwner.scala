// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner {

  def initialise(api: CurrentRequestResultDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_publicFactsOut(PublicDecisionFacts(
      AdvisoryFacts(PilotAdvisory.ADVISORY_UNKNOWN),
      PublishedRequestResult(RequestResult.None),
      PublishedSession(ChargeSession.Idle)))
  }

  def timeTriggered(api: CurrentRequestResultDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_requestIn(), api.get_attentionClearedIn(), api.get_advisoryIn(), api.get_sessionIn()) match {
      case (Some(request), Some(cleared), Some(advisory), Some(session)) =>
        val result: RequestResult.Type = request match {
          case ServiceRequest.None => RequestResult.None
          case ServiceRequest.Assess =>
            if (advisory.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN) RequestResult.Deferred
            else RequestResult.Accepted
          case ServiceRequest.BeginCharge =>
            if (session.winningCase == SessionCase.SESS_07 ||
                session.winningCase == SessionCase.SESS_09) RequestResult.Accepted
            else if (session.winningCase == SessionCase.SESS_01 ||
                     session.winningCase == SessionCase.SESS_02 ||
                     session.winningCase == SessionCase.SESS_08) RequestResult.Deferred
            else if (session.winningCase == SessionCase.SESS_06) RequestResult.NoEffect
            else RequestResult.Rejected
          case ServiceRequest.EndCharge =>
            if (session.winningCase == SessionCase.SESS_03 ||
                session.winningCase == SessionCase.SESS_04) RequestResult.Accepted
            else RequestResult.NoEffect
          case _ =>
            if (cleared) RequestResult.Accepted else RequestResult.NoEffect
        }
        api.put_publicFactsOut(
          PublicDecisionFacts(advisory, PublishedRequestResult(result), session.newSession))
      case _ =>
    }
  }

  def finalise(api: CurrentRequestResultDecisionOwner_Operational_Api): Unit = { }
}
