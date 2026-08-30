// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a879c7993837_4_Valid {
  @pure def check(
      accepted: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      air_report: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport,
      composed_result: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CompositionReport,
      humidity_report: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport,
      selection: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.SelectionReport,
      supervisor_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_GumboX.compute_CEP_Post(accepted, air_report, composed_result, humidity_report, selection, supervisor_status))) ___>: (T)) & T))
  }
}
