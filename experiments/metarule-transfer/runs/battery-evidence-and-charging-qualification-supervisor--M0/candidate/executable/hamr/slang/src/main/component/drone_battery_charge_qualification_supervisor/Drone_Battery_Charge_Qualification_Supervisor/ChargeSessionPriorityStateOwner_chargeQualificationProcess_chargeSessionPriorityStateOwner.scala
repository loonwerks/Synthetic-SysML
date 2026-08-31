// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner {

  // BEGIN STATE VARS
  var sessionState: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type = Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Idle
  // END STATE VARS

  def initialise(api: ChargeSessionPriorityStateOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

  }

  def timeTriggered(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, sessionState),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee SESSION_PUBLICATION
        (sessionState == SourceChargeSession.Idle &
          api.resolutionToNotification.newSession.sessionValue == ChargeSession.Idle |
          sessionState == SourceChargeSession.Eligible &
            api.resolutionToNotification.newSession.sessionValue == ChargeSession.Eligible |
          sessionState == SourceChargeSession.Authorized &
            api.resolutionToNotification.newSession.sessionValue == ChargeSession.Authorized |
          sessionState == SourceChargeSession.Suspended &
            api.resolutionToNotification.newSession.sessionValue == ChargeSession.Suspended) &
          api.resolutionToNotification.sessionConflict == (api.interfaceIn.activityObserved &
            sessionState != SourceChargeSession.Authorized) &
          api.conflictToAggregation == api.resolutionToNotification.sessionConflict,
        // case SESS_01_UNEXPECTED_ACTIVITY
        (api.interfaceIn.activityObserved &
          In(sessionState) != SourceChargeSession.Authorized) ___>: (sessionState == SourceChargeSession.Suspended &
          api.resolutionToNotification.sourceSession != SourceChargeSession.Authorized &
          api.resolutionToNotification.winningCase == SessionCase.SESS_01),
        // case SESS_02_BLOCKED
        (!(api.interfaceIn.activityObserved &
          In(sessionState) != SourceChargeSession.Authorized) &
          api.eligibilityIn == ChargeEligibility.Blocked) ___>: (sessionState == SourceChargeSession.Suspended &
          api.resolutionToNotification.winningCase == SessionCase.SESS_02),
        // case SESS_03_END_TO_ELIGIBLE
        (!(api.interfaceIn.activityObserved &
          In(sessionState) != SourceChargeSession.Authorized) &
          api.eligibilityIn == ChargeEligibility.Permitted &
          (In(sessionState) == SourceChargeSession.Authorized |
            In(sessionState) == SourceChargeSession.Suspended) &
          api.requestIn == ServiceRequest.EndCharge) ___>: (sessionState == SourceChargeSession.Eligible &
          api.resolutionToNotification.winningCase == SessionCase.SESS_03),
        // case SESS_04_END_TO_IDLE
        (!(api.interfaceIn.activityObserved &
          In(sessionState) != SourceChargeSession.Authorized) &
          api.eligibilityIn == ChargeEligibility.NotNeeded &
          (In(sessionState) == SourceChargeSession.Authorized |
            In(sessionState) == SourceChargeSession.Suspended) &
          api.requestIn == ServiceRequest.EndCharge) ___>: (sessionState == SourceChargeSession.Idle &
          api.resolutionToNotification.winningCase == SessionCase.SESS_04),
        // case SESS_05_AUTOMATIC_WITHDRAWAL
        (In(sessionState) == SourceChargeSession.Authorized &
          api.eligibilityIn == ChargeEligibility.NotNeeded &
          api.requestIn != ServiceRequest.EndCharge) ___>: (sessionState == SourceChargeSession.Idle &
          api.resolutionToNotification.winningCase == SessionCase.SESS_05),
        // case SESS_06_RETAIN_AUTHORIZED
        (In(sessionState) == SourceChargeSession.Authorized &
          api.eligibilityIn == ChargeEligibility.Permitted &
          api.requestIn != ServiceRequest.EndCharge) ___>: (sessionState == SourceChargeSession.Authorized &
          api.resolutionToNotification.winningCase == SessionCase.SESS_06),
        // case SESS_07_FRESH_SUSPENDED_RECOVERY
        (!(api.interfaceIn.activityObserved) &
          In(sessionState) == SourceChargeSession.Suspended &
          api.eligibilityIn == ChargeEligibility.Permitted &
          api.requestIn == ServiceRequest.BeginCharge) ___>: (sessionState == SourceChargeSession.Authorized &
          api.resolutionToNotification.winningCase == SessionCase.SESS_07),
        // case SESS_08_RETAIN_SUSPENDED
        (!(api.interfaceIn.activityObserved) &
          In(sessionState) == SourceChargeSession.Suspended &
          api.eligibilityIn != ChargeEligibility.Blocked &
          !(api.requestIn == ServiceRequest.EndCharge &
            api.eligibilityIn == ChargeEligibility.Permitted |
            api.requestIn == ServiceRequest.EndCharge &
              api.eligibilityIn == ChargeEligibility.NotNeeded |
            api.requestIn == ServiceRequest.BeginCharge &
              api.eligibilityIn == ChargeEligibility.Permitted)) ___>: (sessionState == SourceChargeSession.Suspended &
          api.resolutionToNotification.winningCase == SessionCase.SESS_08),
        // case SESS_09_FRESH_ELIGIBLE_BEGIN
        (!(api.interfaceIn.activityObserved) &
          In(sessionState) == SourceChargeSession.Eligible &
          api.eligibilityIn == ChargeEligibility.Permitted &
          api.requestIn == ServiceRequest.BeginCharge) ___>: (sessionState == SourceChargeSession.Authorized &
          api.resolutionToNotification.winningCase == SessionCase.SESS_09),
        // case SESS_10_ELIGIBLE_NOT_NEEDED
        (!(api.interfaceIn.activityObserved) &
          In(sessionState) == SourceChargeSession.Eligible &
          api.eligibilityIn == ChargeEligibility.NotNeeded) ___>: (sessionState == SourceChargeSession.Idle &
          api.resolutionToNotification.winningCase == SessionCase.SESS_10),
        // case SESS_11_RETAIN_ELIGIBLE
        (!(api.interfaceIn.activityObserved) &
          In(sessionState) == SourceChargeSession.Eligible &
          api.eligibilityIn == ChargeEligibility.Permitted &
          api.requestIn != ServiceRequest.BeginCharge) ___>: (sessionState == SourceChargeSession.Eligible &
          api.resolutionToNotification.winningCase == SessionCase.SESS_11),
        // case SESS_12_IDLE_TO_ELIGIBLE
        (!(api.interfaceIn.activityObserved) &
          In(sessionState) == SourceChargeSession.Idle &
          api.eligibilityIn == ChargeEligibility.Permitted) ___>: (sessionState == SourceChargeSession.Eligible &
          api.resolutionToNotification.winningCase == SessionCase.SESS_12),
        // case SESS_13_RETAIN_IDLE
        (!(api.interfaceIn.activityObserved) &
          In(sessionState) == SourceChargeSession.Idle &
          api.eligibilityIn == ChargeEligibility.NotNeeded) ___>: (sessionState == SourceChargeSession.Idle &
          api.resolutionToNotification.winningCase == SessionCase.SESS_13)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val request = api.get_requestIn().get
    val interface = api.get_interfaceIn().get
    val eligibility = api.get_eligibilityIn().get
    val source = sessionState
    val conflict = interface.activityObserved & source != SourceChargeSession.Authorized
    val next: SourceChargeSession.Type =
      if (conflict | eligibility == ChargeEligibility.Blocked) SourceChargeSession.Suspended
      else if ((source == SourceChargeSession.Authorized | source == SourceChargeSession.Suspended) &
        request == ServiceRequest.EndCharge) if (eligibility == ChargeEligibility.Permitted) SourceChargeSession.Eligible else SourceChargeSession.Idle
      else if (source == SourceChargeSession.Authorized) if (eligibility == ChargeEligibility.NotNeeded) SourceChargeSession.Idle else SourceChargeSession.Authorized
      else if (source == SourceChargeSession.Suspended) if (eligibility == ChargeEligibility.Permitted & request == ServiceRequest.BeginCharge) SourceChargeSession.Authorized else SourceChargeSession.Suspended
      else if (source == SourceChargeSession.Eligible) if (eligibility == ChargeEligibility.NotNeeded) SourceChargeSession.Idle else if (request == ServiceRequest.BeginCharge) SourceChargeSession.Authorized else SourceChargeSession.Eligible
      else if (eligibility == ChargeEligibility.Permitted) SourceChargeSession.Eligible else SourceChargeSession.Idle
    val winner: SessionCase.Type =
      if (conflict) SessionCase.SESS_01 else if (eligibility == ChargeEligibility.Blocked) SessionCase.SESS_02
      else if ((source == SourceChargeSession.Authorized | source == SourceChargeSession.Suspended) & request == ServiceRequest.EndCharge & eligibility == ChargeEligibility.Permitted) SessionCase.SESS_03
      else if ((source == SourceChargeSession.Authorized | source == SourceChargeSession.Suspended) & request == ServiceRequest.EndCharge) SessionCase.SESS_04
      else if (source == SourceChargeSession.Authorized & next == SourceChargeSession.Idle) SessionCase.SESS_05
      else if (source == SourceChargeSession.Authorized) SessionCase.SESS_06
      else if (source == SourceChargeSession.Suspended & next == SourceChargeSession.Authorized) SessionCase.SESS_07
      else if (source == SourceChargeSession.Suspended) SessionCase.SESS_08
      else if (source == SourceChargeSession.Eligible & next == SourceChargeSession.Authorized) SessionCase.SESS_09
      else if (source == SourceChargeSession.Eligible & next == SourceChargeSession.Idle) SessionCase.SESS_10
      else if (source == SourceChargeSession.Eligible) SessionCase.SESS_11
      else if (next == SourceChargeSession.Eligible) SessionCase.SESS_12 else SessionCase.SESS_13
    sessionState = next
    val published: ChargeSession.Type = if (next == SourceChargeSession.Idle) ChargeSession.Idle else if (next == SourceChargeSession.Eligible) ChargeSession.Eligible else if (next == SourceChargeSession.Authorized) ChargeSession.Authorized else ChargeSession.Suspended
    api.put_resolutionToNotification(SessionResolution(source, PublishedSession(published), conflict, winner))
    api.put_conflictToAggregation(conflict)
  }

  def finalise(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = { }
}
