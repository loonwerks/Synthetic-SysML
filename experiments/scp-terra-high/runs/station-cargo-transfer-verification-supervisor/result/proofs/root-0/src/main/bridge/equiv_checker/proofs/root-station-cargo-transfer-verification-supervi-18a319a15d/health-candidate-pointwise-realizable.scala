// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_18a319a15d18_Candidate_Pointwise_Realizable {
  @pure def check(
      shipfinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type,
      warehousefinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_Candidate_GumboX.compute_CEP_Post(shipfinding, warehousefinding, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Neutral)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_Candidate_GumboX.compute_CEP_Post(shipfinding, warehousefinding, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Awaiting)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_Candidate_GumboX.compute_CEP_Post(shipfinding, warehousefinding, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Verified)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_Candidate_GumboX.compute_CEP_Post(shipfinding, warehousefinding, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.RecoveryRequired)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_Candidate_GumboX.compute_CEP_Post(shipfinding, warehousefinding, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.RecoveryClearable)))))
  }
}
