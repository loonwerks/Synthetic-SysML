// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner {

  def initialise(api: AuthorizationStatusCompositionOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_PUBLIC_OUTCOMES
        api.chargeAuthorizationOut == ChargeAuthorization.Denied &&
          api.pilotStatusOut.statusAdvisory.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN &&
          api.pilotStatusOut.statusSession.sessionValue == ChargeSession.Idle &&
          api.pilotStatusOut.statusRequestResult.requestResultValue == RequestResult.None &&
          api.pilotStatusOut.faults.batteryFault == T &&
          api.pilotStatusOut.faults.chargerFault == T &&
          api.pilotStatusOut.faults.interfaceFault == T &&
          api.pilotStatusOut.faults.contextFault == T &&
          api.pilotStatusOut.faults.sessionConflict == F &&
          api.pilotStatusOut.aggregateFault == T
        // END INITIALIZES ENSURES
      )
    )
    api.put_pilotStatusOut(PilotStatus(AdvisoryFacts(PilotAdvisory.ADVISORY_UNKNOWN), PublishedSession(ChargeSession.Idle), PublishedRequestResult(RequestResult.None), FaultVector(T, T, T, T, F), T))
    api.put_chargeAuthorizationOut(Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Denied)
  }

  def timeTriggered(api: AuthorizationStatusCompositionOwner_Operational_Api): Unit = { }

  def finalise(api: AuthorizationStatusCompositionOwner_Operational_Api): Unit = { }
}
