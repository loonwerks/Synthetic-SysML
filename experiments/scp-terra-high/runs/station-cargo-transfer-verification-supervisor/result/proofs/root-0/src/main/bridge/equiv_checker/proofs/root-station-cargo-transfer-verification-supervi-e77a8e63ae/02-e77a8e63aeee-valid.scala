// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e77a8e63aeee_2_Valid {
  @pure def check(
      shipfinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type,
      verificationdisposition: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type,
      warehousefinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_Candidate_GumboX.inititialize_IEP_Post(verificationdisposition))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_GumboX.inititialize_IEP_Post(verificationdisposition))) & T))
  }
}
