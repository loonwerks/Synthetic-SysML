// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner {

  // BEGIN STATE VARS
  var sessionState: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type = Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Idle
  // END STATE VARS

  def initialise(api: ChargeSessionPriorityStateOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN INITIALIZES MODIFIES
        sessionState
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_SESSION
        sessionState == SourceChargeSession.Idle &&
          api.conflictToAggregation == F &&
          api.resolutionToNotification.sourceSession == SourceChargeSession.Idle &&
          api.resolutionToNotification.newSession.sessionValue == ChargeSession.Idle &&
          api.resolutionToNotification.sessionConflict == F &&
          api.resolutionToNotification.winningCase == SessionCase.SESS_13
        // END INITIALIZES ENSURES
      )
    )
    sessionState = SourceChargeSession.Idle
    api.put_conflictToAggregation(F)
    api.put_resolutionToNotification(SessionResolution(SourceChargeSession.Idle, PublishedSession(ChargeSession.Idle), F, SessionCase.SESS_13))
  }

  def timeTriggered(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = { }

  def finalise(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = { }
}
