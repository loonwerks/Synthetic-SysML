// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner {

  def initialise(api: AuthorizationStatusCompositionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

  }

  def timeTriggered(api: AuthorizationStatusCompositionOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee STATUS_PRESERVES_OWNER_FACTS
        api.pilotStatusOut.statusAdvisory.advisoryValue == api.publicFactsIn.advisory.advisoryValue &
          api.pilotStatusOut.statusSession.sessionValue == api.publicFactsIn.newSession.sessionValue &
          api.pilotStatusOut.statusRequestResult.requestResultValue == api.publicFactsIn.requestResult.requestResultValue &
          api.pilotStatusOut.faults.batteryFault == api.faultsIn.vector.batteryFault &
          api.pilotStatusOut.faults.chargerFault == api.faultsIn.vector.chargerFault &
          api.pilotStatusOut.faults.interfaceFault == api.faultsIn.vector.interfaceFault &
          api.pilotStatusOut.faults.contextFault == api.faultsIn.vector.contextFault &
          api.pilotStatusOut.faults.sessionConflict == api.faultsIn.vector.sessionConflict &
          api.pilotStatusOut.aggregateFault == api.faultsIn.aggregateFault,
        // case AUTHORIZATION_PERMITTED
        (api.publicFactsIn.newSession.sessionValue == ChargeSession.Authorized &
          !(api.faultsIn.aggregateFault)) ___>: (api.chargeAuthorizationOut == ChargeAuthorization.Permitted),
        // case AUTHORIZATION_DENIED
        (api.publicFactsIn.newSession.sessionValue != ChargeSession.Authorized |
          api.faultsIn.aggregateFault) ___>: (api.chargeAuthorizationOut == ChargeAuthorization.Denied)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val publicFacts = api.get_publicFactsIn().get
    val faults = api.get_faultsIn().get
    api.put_pilotStatusOut(PilotStatus(publicFacts.advisory, publicFacts.newSession,
      publicFacts.requestResult, faults.vector, faults.aggregateFault))
    api.put_chargeAuthorizationOut(if (publicFacts.newSession.sessionValue == ChargeSession.Authorized &
      !faults.aggregateFault) ChargeAuthorization.Permitted else ChargeAuthorization.Denied)
  }

  def finalise(api: AuthorizationStatusCompositionOwner_Operational_Api): Unit = { }
}
