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
    // example api usage

    val apiUsage_publicFactsIn: Option[Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts] = api.get_publicFactsIn()
    api.logInfo(s"Received on data port publicFactsIn: ${apiUsage_publicFactsIn}")
    val apiUsage_faultsIn: Option[Drone_Battery_Charge_Qualification_Supervisor.FaultFacts] = api.get_faultsIn()
    api.logInfo(s"Received on data port faultsIn: ${apiUsage_faultsIn}")
  }

  def finalise(api: AuthorizationStatusCompositionOwner_Operational_Api): Unit = { }
}
