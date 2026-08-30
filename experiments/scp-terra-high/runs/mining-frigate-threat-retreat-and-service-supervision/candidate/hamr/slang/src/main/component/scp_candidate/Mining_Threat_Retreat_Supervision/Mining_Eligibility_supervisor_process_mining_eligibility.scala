// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Mining_Eligibility_supervisor_process_mining_eligibility {

  def initialise(api: Mining_Eligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_mining_proposal(Mining_Threat_Retreat_Supervision.ProposalValue(s32"0"))
  }

  def timeTriggered(api: Mining_Eligibility_Operational_Api): Unit = {
    Contract(Modifies(api))
    val intent = api.get_intent().get
    val disposition = api.get_threat_disposition().get
    val assessment = api.get_assessment().get
    val gate = api.get_recovery_gate().get
    val proposal: S32 =
      if (gate.gate_code == s32"0" & intent.intent_code == s32"1" &
        disposition.disposition_code == s32"1" & assessment.mining_ready) s32"1" else s32"0"
    api.put_mining_proposal(Mining_Threat_Retreat_Supervision.ProposalValue(proposal))
  }

  def finalise(api: Mining_Eligibility_Operational_Api): Unit = { }
}
