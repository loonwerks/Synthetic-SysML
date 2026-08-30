// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_18a319a15d18_4_Valid {
  @pure def check(
      shipfinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type,
      verificationdisposition: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type,
      warehousefinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_GumboX.compute_CEP_Post(shipfinding, warehousefinding, verificationdisposition))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_Candidate_GumboX.compute_CEP_Post(shipfinding, warehousefinding, verificationdisposition))) & T))
  }
}
