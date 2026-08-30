// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ff0af95bcd65_4_Valid {
  @pure def check(
      defrostselection: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostSelection.Type,
      requestintent: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntent.Type,
      requestvalidity: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestValidity.Type,
      requestmemory: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestMemory.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_GumboX.inititialize_IEP_Post(requestmemory, requestintent))) ___>: (equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_Candidate_GumboX.inititialize_IEP_Post(requestmemory, requestintent))) & T))
  }
}
