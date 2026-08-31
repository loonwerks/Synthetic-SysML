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
      Modifies(sessionState, api),
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
        // guarantee SOURCE_SESSION_MAPPING
        sessionState == SourceChargeSession.Idle &
          api.resolutionToNotification.sourceSession == SourceChargeSession.Idle |
          sessionState == SourceChargeSession.Eligible &
            api.resolutionToNotification.sourceSession == SourceChargeSession.Eligible |
          sessionState == SourceChargeSession.Authorized &
            api.resolutionToNotification.sourceSession == SourceChargeSession.Authorized |
          sessionState == SourceChargeSession.Suspended &
            api.resolutionToNotification.sourceSession == SourceChargeSession.Suspended,
        // case SESS_01_UNEXPECTED_ACTIVITY
        (api.interfaceIn.activityObserved &
          In(sessionState) != SourceChargeSession.Authorized) ___>: (sessionState == SourceChargeSession.Suspended &
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
        val apiUsage_requestIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type] = api.get_requestIn()
    api.logInfo(s"Received on data port requestIn: ${apiUsage_requestIn}")
    val apiUsage_interfaceIn: Option[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts] = api.get_interfaceIn()
    api.logInfo(s"Received on data port interfaceIn: ${apiUsage_interfaceIn}")
    val apiUsage_eligibilityIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type] = api.get_eligibilityIn()
    api.logInfo(s"Received on data port eligibilityIn: ${apiUsage_eligibilityIn}")
    val prior = sessionState
    val outcome: (SourceChargeSession.Type, SessionCase.Type) =
      if (apiUsage_interfaceIn.get.activityObserved & prior != SourceChargeSession.Authorized)
        (SourceChargeSession.Suspended, SessionCase.SESS_01)
      else if (apiUsage_eligibilityIn.get == ChargeEligibility.Blocked)
        (SourceChargeSession.Suspended, SessionCase.SESS_02)
      else if ((prior == SourceChargeSession.Authorized | prior == SourceChargeSession.Suspended) &
               apiUsage_eligibilityIn.get == ChargeEligibility.Permitted & apiUsage_requestIn.get == ServiceRequest.EndCharge)
        (SourceChargeSession.Eligible, SessionCase.SESS_03)
      else if ((prior == SourceChargeSession.Authorized | prior == SourceChargeSession.Suspended) &
               apiUsage_eligibilityIn.get == ChargeEligibility.NotNeeded & apiUsage_requestIn.get == ServiceRequest.EndCharge)
        (SourceChargeSession.Idle, SessionCase.SESS_04)
      else if (prior == SourceChargeSession.Authorized & apiUsage_eligibilityIn.get == ChargeEligibility.NotNeeded &
               apiUsage_requestIn.get != ServiceRequest.EndCharge)
        (SourceChargeSession.Idle, SessionCase.SESS_05)
      else if (prior == SourceChargeSession.Authorized & apiUsage_eligibilityIn.get == ChargeEligibility.Permitted &
               apiUsage_requestIn.get != ServiceRequest.EndCharge)
        (SourceChargeSession.Authorized, SessionCase.SESS_06)
      else if (!apiUsage_interfaceIn.get.activityObserved & prior == SourceChargeSession.Suspended &
               apiUsage_eligibilityIn.get == ChargeEligibility.Permitted & apiUsage_requestIn.get == ServiceRequest.BeginCharge)
        (SourceChargeSession.Authorized, SessionCase.SESS_07)
      else if (!apiUsage_interfaceIn.get.activityObserved & prior == SourceChargeSession.Suspended &
               apiUsage_eligibilityIn.get != ChargeEligibility.Blocked)
        (SourceChargeSession.Suspended, SessionCase.SESS_08)
      else if (!apiUsage_interfaceIn.get.activityObserved & prior == SourceChargeSession.Eligible &
               apiUsage_eligibilityIn.get == ChargeEligibility.Permitted & apiUsage_requestIn.get == ServiceRequest.BeginCharge)
        (SourceChargeSession.Authorized, SessionCase.SESS_09)
      else if (!apiUsage_interfaceIn.get.activityObserved & prior == SourceChargeSession.Eligible &
               apiUsage_eligibilityIn.get == ChargeEligibility.NotNeeded)
        (SourceChargeSession.Idle, SessionCase.SESS_10)
      else if (!apiUsage_interfaceIn.get.activityObserved & prior == SourceChargeSession.Eligible &
               apiUsage_eligibilityIn.get == ChargeEligibility.Permitted)
        (SourceChargeSession.Eligible, SessionCase.SESS_11)
      else if (!apiUsage_interfaceIn.get.activityObserved & prior == SourceChargeSession.Idle &
               apiUsage_eligibilityIn.get == ChargeEligibility.Permitted)
        (SourceChargeSession.Eligible, SessionCase.SESS_12)
      else (SourceChargeSession.Idle, SessionCase.SESS_13)
    sessionState = outcome._1
    val published: ChargeSession.Type =
      if (sessionState == SourceChargeSession.Idle) ChargeSession.Idle
      else if (sessionState == SourceChargeSession.Eligible) ChargeSession.Eligible
      else if (sessionState == SourceChargeSession.Authorized) ChargeSession.Authorized
      else ChargeSession.Suspended
    val conflict = apiUsage_interfaceIn.get.activityObserved & sessionState != SourceChargeSession.Authorized
    val resolution: SessionResolution = SessionResolution(
      sessionState,
      PublishedSession(published),
      conflict,
      outcome._2)
    api.put_conflictToAggregation(conflict)
    api.put_resolutionToNotification(resolution)
  }

  def finalise(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = { }
}
