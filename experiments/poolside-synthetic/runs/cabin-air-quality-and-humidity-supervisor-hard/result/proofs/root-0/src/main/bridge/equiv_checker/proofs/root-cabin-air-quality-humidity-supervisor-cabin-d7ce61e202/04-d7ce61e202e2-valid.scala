// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d7ce61e202e2_4_Valid {
  @pure def check(
      accepted: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      filter_proposal: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport,
      humidity_proposal: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport,
      routine_proposal: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport,
      selection_to_composer: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.SelectionReport,
      selection_to_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.SelectionReport): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_GumboX.inititialize_IEP_Post(selection_to_composer, selection_to_status))) ___>: (T)) & T))
  }
}
