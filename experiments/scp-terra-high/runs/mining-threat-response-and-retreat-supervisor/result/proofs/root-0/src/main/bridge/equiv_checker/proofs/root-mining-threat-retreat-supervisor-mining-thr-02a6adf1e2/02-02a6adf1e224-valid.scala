// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_02a6adf1e224_2_Valid {
  @pure def check(
      fault: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Fault_Fact,
      mission_candidate: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Proposal,
      phase_context: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_Context,
      phase_state: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_State_Input,
      resolved_atomic_result: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result,
      resource_publication: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts,
      response_candidate: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Response_Proposal,
      threat_publication: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts,
      owned_phase: S32): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_GumboX.inititialize_IEP_Post(owned_phase, phase_context, resolved_atomic_result))) & T))
  }
}
