// #Sireum

package scp_candidate.Drone_Battery_Charge_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner {

  def initialise(api: Charge_Qualification_Owner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_authorization(Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge)
    val initialDecision = Drone_Battery_Charge_Supervisor.ChargeDecision(
      authorization = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge,
      disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive)
    api.put_decision_to_attention(initialDecision)
    api.put_decision_to_readiness(initialDecision)
  }

  def timeTriggered(api: Charge_Qualification_Owner_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: Charge_Qualification_Owner_Operational_Api): Unit = { }
}
