// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_acb4e1f86e03_Oracle_Pointwise_Realizable {
  @pure def check(
      receiptevidence: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type,
      sessionexpectation: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_GumboX.compute_CEP_Post(receiptevidence, sessionexpectation, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Neutral)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_GumboX.compute_CEP_Post(receiptevidence, sessionexpectation, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.RecoveryNeutral)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_GumboX.compute_CEP_Post(receiptevidence, sessionexpectation, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Missing)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_GumboX.compute_CEP_Post(receiptevidence, sessionexpectation, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Match)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_GumboX.compute_CEP_Post(receiptevidence, sessionexpectation, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Fault)))))
  }
}
