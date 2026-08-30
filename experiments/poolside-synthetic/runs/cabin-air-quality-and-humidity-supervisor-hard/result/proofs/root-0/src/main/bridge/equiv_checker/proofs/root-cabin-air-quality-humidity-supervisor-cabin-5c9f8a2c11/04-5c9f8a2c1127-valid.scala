// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5c9f8a2c1127_4_Valid {
  @pure def check(
      capabilities: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet,
      composition_to_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CompositionReport,
      path: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type,
      selection: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.SelectionReport,
      treatment_plan: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_GumboX.compute_CEP_Post(capabilities, path, selection, composition_to_status, treatment_plan))) ___>: (T)) & T))
  }
}
