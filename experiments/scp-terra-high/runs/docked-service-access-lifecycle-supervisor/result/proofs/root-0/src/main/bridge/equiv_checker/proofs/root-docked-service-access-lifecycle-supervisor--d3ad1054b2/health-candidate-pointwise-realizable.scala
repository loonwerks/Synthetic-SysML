// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d3ad1054b2fa_Candidate_Pointwise_Realizable {
  @pure def check(
      pilotintent: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_Candidate_GumboX.compute_CEP_Post(pilotintent, equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.NO_ACTION)) |
        (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_Candidate_GumboX.compute_CEP_Post(pilotintent, equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.DOCK_REQUEST)) |
        (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_Candidate_GumboX.compute_CEP_Post(pilotintent, equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.UNDOCK_REQUEST)) |
        (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_Candidate_GumboX.compute_CEP_Post(pilotintent, equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.RESET_REQUEST)) |
        (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_Candidate_GumboX.compute_CEP_Post(pilotintent, equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.INTENT_FAULT)))))
  }
}
