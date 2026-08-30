// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4783d65f427a_3_Valid {
  @pure def check(
      gpsassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      gpsevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
