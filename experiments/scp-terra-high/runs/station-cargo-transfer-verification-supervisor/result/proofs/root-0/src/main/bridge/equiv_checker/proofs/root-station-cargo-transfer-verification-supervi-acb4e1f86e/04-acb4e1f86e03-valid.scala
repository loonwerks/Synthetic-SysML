// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_acb4e1f86e03_4_Valid {
  @pure def check(
      receiptevidence: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type,
      sessionexpectation: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type,
      warehousefinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_GumboX.compute_CEP_Post(receiptevidence, sessionexpectation, warehousefinding))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(receiptevidence, sessionexpectation, warehousefinding))) & T))
  }
}
