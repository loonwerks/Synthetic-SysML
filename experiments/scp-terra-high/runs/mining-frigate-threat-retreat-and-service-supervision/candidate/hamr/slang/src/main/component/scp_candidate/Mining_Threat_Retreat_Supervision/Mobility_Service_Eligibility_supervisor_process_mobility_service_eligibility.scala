// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility {

  def initialise(api: Mobility_Service_Eligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_mobility_proposal(Mining_Threat_Retreat_Supervision.MobilityProposalValue(s32"0"))
  }

  def timeTriggered(api: Mobility_Service_Eligibility_Operational_Api): Unit = {
    Contract(Modifies(api))
    val intent = api.get_intent().get
    val disposition = api.get_threat_disposition().get
    val assessment = api.get_assessment().get
    val gate = api.get_recovery_gate().get
    val retreat: B =
      gate.gate_code == s32"0" & assessment.retreat_feasible &
        (disposition.disposition_code == s32"3" | assessment.cargo_full |
          intent.intent_code == s32"3")
    val proposal: S32 =
      if (retreat) s32"1"
      else if (gate.gate_code == s32"0" & assessment.dock_service_applicable) s32"2"
      else s32"0"
    api.put_mobility_proposal(Mining_Threat_Retreat_Supervision.MobilityProposalValue(proposal))
  }

  def finalise(api: Mobility_Service_Eligibility_Operational_Api): Unit = { }
}
