// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e2999fb80343_3_Valid {
  @pure def check(
      barometricassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      gpsassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      inertialassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      outcomebasis: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type,
      proposalbasis: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
