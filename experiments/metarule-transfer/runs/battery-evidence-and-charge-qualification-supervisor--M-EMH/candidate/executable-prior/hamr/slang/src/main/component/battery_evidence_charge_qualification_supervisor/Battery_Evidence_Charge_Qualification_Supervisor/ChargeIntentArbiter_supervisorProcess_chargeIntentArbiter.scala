// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter {

  def initialise(api: ChargeIntentArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_chargeDecision(Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.NO_CHANGE)
  }

  def timeTriggered(api: ChargeIntentArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_chargeRequest: Option[Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type] = api.get_chargeRequest()
    api.logInfo(s"Received on data port chargeRequest: ${apiUsage_chargeRequest}")
    val apiUsage_chargeEligibilityEnvelope: Option[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type] = api.get_chargeEligibilityEnvelope()
    api.logInfo(s"Received on data port chargeEligibilityEnvelope: ${apiUsage_chargeEligibilityEnvelope}")
  }

  def finalise(api: ChargeIntentArbiter_Operational_Api): Unit = { }
}
