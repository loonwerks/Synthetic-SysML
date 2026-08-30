// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b63c453ee045_2_Complement {
  @pure def check(
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      request_facts: equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord,
      session_frame: equiv_shared_0.EIT_Acquisition_Supervisor.SessionFrame,
      start_feasibility: equiv_shared_0.EIT_Acquisition_Supervisor.StartFeasibility.Type,
      in_sessionmemory: equiv_shared_0.EIT_Acquisition_Supervisor.SessionState.Type,
      sessionmemory: equiv_shared_0.EIT_Acquisition_Supervisor.SessionState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_GumboX.compute_CEP_Post(in_sessionmemory, sessionmemory, recovery_frame, request_facts, start_feasibility, session_frame))) & T)))
  }
}
