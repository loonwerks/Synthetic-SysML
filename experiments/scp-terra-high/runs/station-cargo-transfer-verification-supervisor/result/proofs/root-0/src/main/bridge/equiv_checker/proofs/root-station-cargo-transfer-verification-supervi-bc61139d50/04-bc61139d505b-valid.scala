// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bc61139d505b_4_Valid {
  @pure def check(
      sessionexpectation: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type,
      shipfinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type,
      transferevidence: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_GumboX.inititialize_IEP_Post(shipfinding))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_Candidate_GumboX.inititialize_IEP_Post(shipfinding))) & T))
  }
}
