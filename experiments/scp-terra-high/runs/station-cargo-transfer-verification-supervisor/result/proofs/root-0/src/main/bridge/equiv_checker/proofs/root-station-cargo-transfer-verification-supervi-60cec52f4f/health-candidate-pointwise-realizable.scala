// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_60cec52f4ff1_Candidate_Pointwise_Realizable {
  @pure def check(
      sessionexpectation: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type,
      transferevidence: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(sessionexpectation, transferevidence, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Neutral)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(sessionexpectation, transferevidence, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.RecoveryNeutral)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(sessionexpectation, transferevidence, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.NotComplete)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(sessionexpectation, transferevidence, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Complete)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(sessionexpectation, transferevidence, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Fault)))))
  }
}
