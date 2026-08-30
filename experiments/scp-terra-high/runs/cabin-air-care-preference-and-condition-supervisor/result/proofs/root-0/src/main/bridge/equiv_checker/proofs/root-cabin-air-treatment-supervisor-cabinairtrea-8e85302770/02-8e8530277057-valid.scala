// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8e8530277057_2_Valid {
  @pure def check(
      aircareselection: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirCareSelection.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      requestvalidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestValidity.Type,
      in_requestmemory: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestMemory.Type,
      requestmemory: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestMemory.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_Candidate_GumboX.compute_CEP_Post(in_requestmemory, requestmemory, aircareselection, requestvalidity, requestintent))) ___>: (equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_GumboX.compute_CEP_Post(in_requestmemory, requestmemory, aircareselection, requestvalidity, requestintent))) & T))
  }
}
