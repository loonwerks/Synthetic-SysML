// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_605badec09ce_2_Complement {
  @pure def check(
      barometricassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      gpsassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      inertialassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      outcomebasis: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type,
      proposalbasis: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_GumboX.compute_CEP_Post(barometricassessment, gpsassessment, inertialassessment, outcomebasis, proposalbasis))) & T)))
  }
}
