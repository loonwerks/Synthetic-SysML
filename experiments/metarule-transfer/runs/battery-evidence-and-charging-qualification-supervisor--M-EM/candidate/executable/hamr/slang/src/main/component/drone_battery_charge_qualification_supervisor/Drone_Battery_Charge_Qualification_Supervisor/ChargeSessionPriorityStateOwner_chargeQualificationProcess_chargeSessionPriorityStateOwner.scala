// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner {

  // BEGIN STATE VARS
  var sessionState: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Type = Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Idle
  // END STATE VARS

  def initialise(api: ChargeSessionPriorityStateOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_conflictToAggregation(Base_Types.Boolean_example())
    api.put_resolutionToNotification(Drone_Battery_Charge_Qualification_Supervisor.SessionResolution.example())
  }

  def timeTriggered(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee SESSION_PUBLICATION
        (sessionState == ChargeSession.Idle &
          api.resolutionToNotification.newSession.sessionValue == ChargeSession.Idle |
          sessionState == ChargeSession.Eligible &
            api.resolutionToNotification.newSession.sessionValue == ChargeSession.Eligible |
          sessionState == ChargeSession.Authorized &
            api.resolutionToNotification.newSession.sessionValue == ChargeSession.Authorized |
          sessionState == ChargeSession.Suspended &
            api.resolutionToNotification.newSession.sessionValue == ChargeSession.Suspended) &
          api.resolutionToNotification.sessionConflict == (api.interfaceIn.activityObserved &
            sessionState != ChargeSession.Authorized) &
          api.conflictToAggregation == api.resolutionToNotification.sessionConflict,
        // guarantee SOURCE_SESSION_MAPPING
        sessionState == ChargeSession.Idle &
          api.resolutionToNotification.sourceSession == SourceChargeSession.Idle |
          sessionState == ChargeSession.Eligible &
            api.resolutionToNotification.sourceSession == SourceChargeSession.Eligible |
          sessionState == ChargeSession.Authorized &
            api.resolutionToNotification.sourceSession == SourceChargeSession.Authorized |
          sessionState == ChargeSession.Suspended &
            api.resolutionToNotification.sourceSession == SourceChargeSession.Suspended,
        // case SESS_01_UNEXPECTED_ACTIVITY
        (api.interfaceIn.activityObserved &
          In(sessionState) != ChargeSession.Authorized) ___>: (sessionState == ChargeSession.Suspended &
          api.resolutionToNotification.winningCase == SessionCase.SESS_01),
        // case SESS_02_BLOCKED
        ((api.interfaceIn.activityObserved &
          In(sessionState) != ChargeSession.Authorized) == F &
          api.eligibilityIn == ChargeEligibility.Blocked) ___>: (sessionState == ChargeSession.Suspended &
          api.resolutionToNotification.winningCase == SessionCase.SESS_02),
        // case SESS_03_END_TO_ELIGIBLE
        ((api.interfaceIn.activityObserved &
          In(sessionState) != ChargeSession.Authorized) == F &
          api.eligibilityIn == ChargeEligibility.Permitted &
          (In(sessionState) == ChargeSession.Authorized |
            In(sessionState) == ChargeSession.Suspended) &
          api.requestIn == ServiceRequest.EndCharge) ___>: (sessionState == ChargeSession.Eligible &
          api.resolutionToNotification.winningCase == SessionCase.SESS_03),
        // case SESS_04_END_TO_IDLE
        ((api.interfaceIn.activityObserved &
          In(sessionState) != ChargeSession.Authorized) == F &
          api.eligibilityIn == ChargeEligibility.NotNeeded &
          (In(sessionState) == ChargeSession.Authorized |
            In(sessionState) == ChargeSession.Suspended) &
          api.requestIn == ServiceRequest.EndCharge) ___>: (sessionState == ChargeSession.Idle &
          api.resolutionToNotification.winningCase == SessionCase.SESS_04),
        // case SESS_05_AUTOMATIC_WITHDRAWAL
        (In(sessionState) == ChargeSession.Authorized &
          api.eligibilityIn == ChargeEligibility.NotNeeded &
          api.requestIn != ServiceRequest.EndCharge) ___>: (sessionState == ChargeSession.Idle &
          api.resolutionToNotification.winningCase == SessionCase.SESS_05),
        // case SESS_06_RETAIN_AUTHORIZED
        (In(sessionState) == ChargeSession.Authorized &
          api.eligibilityIn == ChargeEligibility.Permitted &
          api.requestIn != ServiceRequest.EndCharge) ___>: (sessionState == ChargeSession.Authorized &
          api.resolutionToNotification.winningCase == SessionCase.SESS_06),
        // case SESS_07_FRESH_SUSPENDED_RECOVERY
        (api.interfaceIn.activityObserved == F &
          In(sessionState) == ChargeSession.Suspended &
          api.eligibilityIn == ChargeEligibility.Permitted &
          api.requestIn == ServiceRequest.BeginCharge) ___>: (sessionState == ChargeSession.Authorized &
          api.resolutionToNotification.winningCase == SessionCase.SESS_07),
        // case SESS_08_RETAIN_SUSPENDED
        (api.interfaceIn.activityObserved == F &
          In(sessionState) == ChargeSession.Suspended &
          api.eligibilityIn != ChargeEligibility.Blocked &
          (api.requestIn == ServiceRequest.EndCharge &
            api.eligibilityIn == ChargeEligibility.Permitted |
            api.requestIn == ServiceRequest.EndCharge &
              api.eligibilityIn == ChargeEligibility.NotNeeded |
            api.requestIn == ServiceRequest.BeginCharge &
              api.eligibilityIn == ChargeEligibility.Permitted) == F) ___>: (sessionState == ChargeSession.Suspended &
          api.resolutionToNotification.winningCase == SessionCase.SESS_08),
        // case SESS_09_FRESH_ELIGIBLE_BEGIN
        (api.interfaceIn.activityObserved == F &
          In(sessionState) == ChargeSession.Eligible &
          api.eligibilityIn == ChargeEligibility.Permitted &
          api.requestIn == ServiceRequest.BeginCharge) ___>: (sessionState == ChargeSession.Authorized &
          api.resolutionToNotification.winningCase == SessionCase.SESS_09),
        // case SESS_10_ELIGIBLE_NOT_NEEDED
        (api.interfaceIn.activityObserved == F &
          In(sessionState) == ChargeSession.Eligible &
          api.eligibilityIn == ChargeEligibility.NotNeeded) ___>: (sessionState == ChargeSession.Idle &
          api.resolutionToNotification.winningCase == SessionCase.SESS_10),
        // case SESS_11_RETAIN_ELIGIBLE
        (api.interfaceIn.activityObserved == F &
          In(sessionState) == ChargeSession.Eligible &
          api.eligibilityIn == ChargeEligibility.Permitted &
          api.requestIn != ServiceRequest.BeginCharge) ___>: (sessionState == ChargeSession.Eligible &
          api.resolutionToNotification.winningCase == SessionCase.SESS_11),
        // case SESS_12_IDLE_TO_ELIGIBLE
        (api.interfaceIn.activityObserved == F &
          In(sessionState) == ChargeSession.Idle &
          api.eligibilityIn == ChargeEligibility.Permitted) ___>: (sessionState == ChargeSession.Eligible &
          api.resolutionToNotification.winningCase == SessionCase.SESS_12),
        // case SESS_13_RETAIN_IDLE
        (api.interfaceIn.activityObserved == F &
          In(sessionState) == ChargeSession.Idle &
          api.eligibilityIn == ChargeEligibility.NotNeeded) ___>: (sessionState == ChargeSession.Idle &
          api.resolutionToNotification.winningCase == SessionCase.SESS_13)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_requestIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type] = api.get_requestIn()
    api.logInfo(s"Received on data port requestIn: ${apiUsage_requestIn}")
    val apiUsage_interfaceIn: Option[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts] = api.get_interfaceIn()
    api.logInfo(s"Received on data port interfaceIn: ${apiUsage_interfaceIn}")
    val apiUsage_eligibilityIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type] = api.get_eligibilityIn()
    api.logInfo(s"Received on data port eligibilityIn: ${apiUsage_eligibilityIn}")
  }

  def finalise(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = { }
}
