// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8dddc08facf4_2_Complement {
  @pure def check(
      inertialassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      inertialevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_GumboX.compute_CEP_Post(inertialevidence, inertialassessment))) & T)))
  }
}
