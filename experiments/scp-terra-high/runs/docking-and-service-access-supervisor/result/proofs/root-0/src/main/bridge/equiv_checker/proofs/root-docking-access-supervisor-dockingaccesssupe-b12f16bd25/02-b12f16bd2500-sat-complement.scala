// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b12f16bd2500_2_Complement {
  @pure def check(
      access_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      access_proposal: equiv_shared_0.Docking_Access_Supervisor.AccessProposal,
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_GumboX.inititialize_IEP_Post(access_proposal))) & T)))
  }
}
