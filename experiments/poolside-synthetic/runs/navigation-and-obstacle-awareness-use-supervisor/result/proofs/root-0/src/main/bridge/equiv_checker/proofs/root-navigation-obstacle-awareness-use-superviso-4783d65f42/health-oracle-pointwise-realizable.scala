// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_4783d65f427a_Oracle_Pointwise_Realizable {
  @pure def check(
      gpsevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_GumboX.inititialize_IEP_Post(gpsevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_GumboX.inititialize_IEP_Post(gpsevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.LIMITED)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_GumboX.inititialize_IEP_Post(gpsevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED)))))
  }
}
