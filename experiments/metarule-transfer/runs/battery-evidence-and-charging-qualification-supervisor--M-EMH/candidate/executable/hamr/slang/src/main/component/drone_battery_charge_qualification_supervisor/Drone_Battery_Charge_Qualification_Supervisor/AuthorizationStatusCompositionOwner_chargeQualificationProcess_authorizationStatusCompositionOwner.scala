// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner {

  def initialise(api: AuthorizationStatusCompositionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_pilotStatusOut(PilotStatus(
      AdvisoryFacts(PilotAdvisory.ADVISORY_UNKNOWN),
      PublishedSession(ChargeSession.Idle),
      PublishedRequestResult(RequestResult.None),
      FaultVector(T, T, T, T, F),
      T))
    api.put_chargeAuthorizationOut(ChargeAuthorization.Denied)
  }

  def timeTriggered(api: AuthorizationStatusCompositionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_publicFactsIn(), api.get_faultsIn()) match {
      case (Some(publicFacts), Some(faults)) =>
        api.put_pilotStatusOut(PilotStatus(
          publicFacts.advisory,
          publicFacts.newSession,
          publicFacts.requestResult,
          faults.vector,
          faults.aggregateFault))
        val authorization: ChargeAuthorization.Type =
          if (publicFacts.newSession.sessionValue == ChargeSession.Authorized &&
              !faults.aggregateFault) ChargeAuthorization.Permitted
          else ChargeAuthorization.Denied
        api.put_chargeAuthorizationOut(authorization)
      case _ =>
    }
  }

  def finalise(api: AuthorizationStatusCompositionOwner_Operational_Api): Unit = { }
}
