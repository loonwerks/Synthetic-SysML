// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner {

  def initialise(api: Charge_Qualification_Owner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_authorization(Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge)
    api.put_decision_to_attention(Drone_Battery_Charge_Supervisor.ChargeDecision.example())
    api.put_decision_to_readiness(Drone_Battery_Charge_Supervisor.ChargeDecision.example())
  }

  def timeTriggered(api: Charge_Qualification_Owner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_battery_evidence: Option[Drone_Battery_Charge_Supervisor.BatteryEvidence.Type] = api.get_battery_evidence()
    api.logInfo(s"Received on data port battery_evidence: ${apiUsage_battery_evidence}")
    val apiUsage_charge_context: Option[Drone_Battery_Charge_Supervisor.ChargeContext.Type] = api.get_charge_context()
    api.logInfo(s"Received on data port charge_context: ${apiUsage_charge_context}")
    val apiUsage_qualified_intent: Option[Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type] = api.get_qualified_intent()
    api.logInfo(s"Received on data port qualified_intent: ${apiUsage_qualified_intent}")
  }

  def finalise(api: Charge_Qualification_Owner_Operational_Api): Unit = { }
}
