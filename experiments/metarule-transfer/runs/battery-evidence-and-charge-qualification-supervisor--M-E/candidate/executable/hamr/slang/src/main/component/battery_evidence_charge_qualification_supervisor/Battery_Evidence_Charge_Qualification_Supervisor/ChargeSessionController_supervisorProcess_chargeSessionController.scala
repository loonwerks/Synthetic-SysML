// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeSessionController_supervisorProcess_chargeSessionController {

  def initialise(api: ChargeSessionController_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_currentChargeSession(Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE)
    api.put_chargeSessionSnapshot(Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot.example())
    api.put_chargePermission(Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.DISABLED)
  }

  def timeTriggered(api: ChargeSessionController_Operational_Api): Unit = {
    // example api usage

    val apiUsage_chargeDecision: Option[Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type] = api.get_chargeDecision()
    api.logInfo(s"Received on data port chargeDecision: ${apiUsage_chargeDecision}")
  }

  def finalise(api: ChargeSessionController_Operational_Api): Unit = { }
}
