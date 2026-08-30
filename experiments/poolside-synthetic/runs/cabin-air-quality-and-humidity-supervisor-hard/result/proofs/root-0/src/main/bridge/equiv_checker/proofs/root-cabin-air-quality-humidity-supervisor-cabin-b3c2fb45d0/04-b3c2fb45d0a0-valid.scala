// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b3c2fb45d0a0_4_Valid {
  @pure def check(
      accepted: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      capability: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact,
      path: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type,
      proposal: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_GumboX.inititialize_IEP_Post(proposal))) ___>: (T)) & T))
  }
}
