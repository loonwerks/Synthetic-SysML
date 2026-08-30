// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5c9f8a2c1127_1_Valid {
  @pure def check(
      capabilities: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet,
      composition_to_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CompositionReport,
      path: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type,
      selection: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.SelectionReport,
      treatment_plan: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
