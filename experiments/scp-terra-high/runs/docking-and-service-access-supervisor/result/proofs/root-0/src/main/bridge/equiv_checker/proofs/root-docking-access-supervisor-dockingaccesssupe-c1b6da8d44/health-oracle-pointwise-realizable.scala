// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_c1b6da8d4460_Oracle_Pointwise_Realizable {
  @pure def check(
      berth_transition_evidence: equiv_shared_0.Docking_Access_Supervisor.BerthTransitionEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.UNKNOWN, equiv_shared_0.Docking_Access_Supervisor.BerthState.UNKNOWN)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.AVAILABLE, equiv_shared_0.Docking_Access_Supervisor.BerthState.UNKNOWN)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.RESERVED, equiv_shared_0.Docking_Access_Supervisor.BerthState.UNKNOWN)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.SECURED, equiv_shared_0.Docking_Access_Supervisor.BerthState.UNKNOWN)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.RELEASED, equiv_shared_0.Docking_Access_Supervisor.BerthState.UNKNOWN)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.UNKNOWN, equiv_shared_0.Docking_Access_Supervisor.BerthState.AVAILABLE)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.AVAILABLE, equiv_shared_0.Docking_Access_Supervisor.BerthState.AVAILABLE)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.RESERVED, equiv_shared_0.Docking_Access_Supervisor.BerthState.AVAILABLE)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.SECURED, equiv_shared_0.Docking_Access_Supervisor.BerthState.AVAILABLE)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.RELEASED, equiv_shared_0.Docking_Access_Supervisor.BerthState.AVAILABLE)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.UNKNOWN, equiv_shared_0.Docking_Access_Supervisor.BerthState.RESERVED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.AVAILABLE, equiv_shared_0.Docking_Access_Supervisor.BerthState.RESERVED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.RESERVED, equiv_shared_0.Docking_Access_Supervisor.BerthState.RESERVED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.SECURED, equiv_shared_0.Docking_Access_Supervisor.BerthState.RESERVED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.RELEASED, equiv_shared_0.Docking_Access_Supervisor.BerthState.RESERVED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.UNKNOWN, equiv_shared_0.Docking_Access_Supervisor.BerthState.SECURED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.AVAILABLE, equiv_shared_0.Docking_Access_Supervisor.BerthState.SECURED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.RESERVED, equiv_shared_0.Docking_Access_Supervisor.BerthState.SECURED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.SECURED, equiv_shared_0.Docking_Access_Supervisor.BerthState.SECURED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.RELEASED, equiv_shared_0.Docking_Access_Supervisor.BerthState.SECURED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.UNKNOWN, equiv_shared_0.Docking_Access_Supervisor.BerthState.RELEASED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.AVAILABLE, equiv_shared_0.Docking_Access_Supervisor.BerthState.RELEASED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.RESERVED, equiv_shared_0.Docking_Access_Supervisor.BerthState.RELEASED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.SECURED, equiv_shared_0.Docking_Access_Supervisor.BerthState.RELEASED)) |
        (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.BerthState.RELEASED, equiv_shared_0.Docking_Access_Supervisor.BerthState.RELEASED)))))
  }
}
