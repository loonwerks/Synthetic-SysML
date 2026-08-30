// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a879c7993837_3_Valid {
  @pure def check(
      accepted: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      air_report: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport,
      composed_result: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CompositionReport,
      humidity_report: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport,
      selection: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.SelectionReport,
      supervisor_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
