// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8f42b17c9016_4_Valid {
  @pure def check(
      gpsassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      gpsevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_GumboX.compute_CEP_Post(gpsevidence, gpsassessment))) ___>: (T)) & T))
  }
}
