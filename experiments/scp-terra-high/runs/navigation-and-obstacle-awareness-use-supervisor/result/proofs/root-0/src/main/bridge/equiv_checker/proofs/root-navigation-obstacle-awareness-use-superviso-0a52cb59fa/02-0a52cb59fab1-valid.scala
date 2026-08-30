// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0a52cb59fab1_2_Valid {
  @pure def check(
      barometricassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      barometricevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(barometricevidence, barometricassessment))) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_GumboX.compute_CEP_Post(barometricevidence, barometricassessment))) & T))
  }
}
