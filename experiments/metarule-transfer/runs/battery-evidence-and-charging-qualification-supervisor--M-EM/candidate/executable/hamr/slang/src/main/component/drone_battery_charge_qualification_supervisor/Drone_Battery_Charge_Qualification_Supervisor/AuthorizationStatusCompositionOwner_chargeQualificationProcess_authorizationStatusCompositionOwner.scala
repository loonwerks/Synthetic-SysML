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

    api.put_pilotStatusOut(Drone_Battery_Charge_Qualification_Supervisor.PilotStatus.example())
    api.put_chargeAuthorizationOut(Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Denied)
  }

  def timeTriggered(api: AuthorizationStatusCompositionOwner_Operational_Api): Unit = {
    Contract(
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
          api.faultsIn.aggregateFault == F) ___>: (api.chargeAuthorizationOut == ChargeAuthorization.Permitted),
        // case AUTHORIZATION_DENIED
        (api.publicFactsIn.newSession.sessionValue != ChargeSession.Authorized |
          api.faultsIn.aggregateFault) ___>: (api.chargeAuthorizationOut == ChargeAuthorization.Denied)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_publicFactsIn: Option[Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts] = api.get_publicFactsIn()
    api.logInfo(s"Received on data port publicFactsIn: ${apiUsage_publicFactsIn}")
    val apiUsage_faultsIn: Option[Drone_Battery_Charge_Qualification_Supervisor.FaultFacts] = api.get_faultsIn()
    api.logInfo(s"Received on data port faultsIn: ${apiUsage_faultsIn}")
  }

  def finalise(api: AuthorizationStatusCompositionOwner_Operational_Api): Unit = { }
}
