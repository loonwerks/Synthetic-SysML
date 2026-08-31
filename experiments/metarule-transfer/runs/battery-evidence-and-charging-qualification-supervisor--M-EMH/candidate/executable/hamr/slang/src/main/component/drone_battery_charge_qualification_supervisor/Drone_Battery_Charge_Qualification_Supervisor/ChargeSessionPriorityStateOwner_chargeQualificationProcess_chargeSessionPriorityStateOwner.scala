// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner {

  var sessionState: SourceChargeSession.Type = SourceChargeSession.Idle

  def published(session: SourceChargeSession.Type): ChargeSession.Type = {
    var result: ChargeSession.Type = ChargeSession.Suspended
    session match {
      case SourceChargeSession.Idle => result = ChargeSession.Idle
      case SourceChargeSession.Eligible => result = ChargeSession.Eligible
      case SourceChargeSession.Authorized => result = ChargeSession.Authorized
      case _ =>
    }
    return result
  }

  def initialise(api: ChargeSessionPriorityStateOwner_Initialization_Api): Unit = {
    Contract(Modifies(sessionState, api))
    sessionState = SourceChargeSession.Idle
    api.put_conflictToAggregation(F)
    api.put_resolutionToNotification(
      SessionResolution(
        SourceChargeSession.Idle, PublishedSession(ChargeSession.Idle), F, SessionCase.SESS_13))
  }

  def timeTriggered(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = {
    Contract(Modifies(sessionState, api))
    (api.get_requestIn(), api.get_interfaceIn(), api.get_eligibilityIn()) match {
      case (Some(request), Some(interface), Some(eligibility)) =>
        val source: SourceChargeSession.Type = sessionState
        val conflict: B = interface.activityObserved && source != SourceChargeSession.Authorized
        var winningCase: SessionCase.Type = SessionCase.SESS_13
        if (conflict) {
          sessionState = SourceChargeSession.Suspended
          winningCase = SessionCase.SESS_01
        } else if (eligibility == ChargeEligibility.Blocked) {
          sessionState = SourceChargeSession.Suspended
          winningCase = SessionCase.SESS_02
        } else if ((source == SourceChargeSession.Authorized ||
                      source == SourceChargeSession.Suspended) &&
                     request == ServiceRequest.EndCharge &&
                     eligibility == ChargeEligibility.Permitted) {
          sessionState = SourceChargeSession.Eligible
          winningCase = SessionCase.SESS_03
        } else if ((source == SourceChargeSession.Authorized ||
                      source == SourceChargeSession.Suspended) &&
                     request == ServiceRequest.EndCharge &&
                     eligibility == ChargeEligibility.NotNeeded) {
          sessionState = SourceChargeSession.Idle
          winningCase = SessionCase.SESS_04
        } else if (source == SourceChargeSession.Authorized &&
                     eligibility == ChargeEligibility.NotNeeded) {
          sessionState = SourceChargeSession.Idle
          winningCase = SessionCase.SESS_05
        } else if (source == SourceChargeSession.Authorized) {
          sessionState = SourceChargeSession.Authorized
          winningCase = SessionCase.SESS_06
        } else if (source == SourceChargeSession.Suspended &&
                     eligibility == ChargeEligibility.Permitted &&
                     request == ServiceRequest.BeginCharge) {
          sessionState = SourceChargeSession.Authorized
          winningCase = SessionCase.SESS_07
        } else if (source == SourceChargeSession.Suspended) {
          sessionState = SourceChargeSession.Suspended
          winningCase = SessionCase.SESS_08
        } else if (source == SourceChargeSession.Eligible &&
                     eligibility == ChargeEligibility.Permitted &&
                     request == ServiceRequest.BeginCharge) {
          sessionState = SourceChargeSession.Authorized
          winningCase = SessionCase.SESS_09
        } else if (source == SourceChargeSession.Eligible &&
                     eligibility == ChargeEligibility.NotNeeded) {
          sessionState = SourceChargeSession.Idle
          winningCase = SessionCase.SESS_10
        } else if (source == SourceChargeSession.Eligible) {
          sessionState = SourceChargeSession.Eligible
          winningCase = SessionCase.SESS_11
        } else if (eligibility == ChargeEligibility.Permitted) {
          sessionState = SourceChargeSession.Eligible
          winningCase = SessionCase.SESS_12
        } else {
          sessionState = SourceChargeSession.Idle
        }
        val resolution: SessionResolution = SessionResolution(
          source, PublishedSession(published(sessionState)), conflict, winningCase)
        api.put_conflictToAggregation(conflict)
        api.put_resolutionToNotification(resolution)
      case _ =>
    }
  }

  def finalise(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = { }
}
