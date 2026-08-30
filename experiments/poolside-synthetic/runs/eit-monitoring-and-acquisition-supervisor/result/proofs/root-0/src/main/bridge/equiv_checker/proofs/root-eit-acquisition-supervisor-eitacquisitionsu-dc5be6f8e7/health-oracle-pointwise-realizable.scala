// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_dc5be6f8e784_Oracle_Pointwise_Realizable {
  @pure def check(
      cycle_frame: equiv_shared_0.EIT_Acquisition_Supervisor.CycleFrame,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      session_frame: equiv_shared_0.EIT_Acquisition_Supervisor.SessionFrame): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Supervisor.Proposal.PROPOSED)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED)))))
  }
}
