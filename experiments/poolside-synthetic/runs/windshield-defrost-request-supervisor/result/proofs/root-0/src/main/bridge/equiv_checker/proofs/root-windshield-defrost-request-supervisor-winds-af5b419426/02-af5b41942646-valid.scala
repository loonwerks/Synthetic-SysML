// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_af5b41942646_2_Valid {
  @pure def check(
      defrostselection: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostSelection.Type,
      requestintent: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntent.Type,
      requestvalidity: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestValidity.Type,
      in_requestmemory: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestMemory.Type,
      requestmemory: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestMemory.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_Candidate_GumboX.compute_CEP_Post(in_requestmemory, requestmemory, defrostselection, requestvalidity, requestintent))) ___>: (equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_GumboX.compute_CEP_Post(in_requestmemory, requestmemory, defrostselection, requestvalidity, requestintent))) & T))
  }
}
