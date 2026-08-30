// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0ba1aa510a5e_3_Valid {
  @pure def check(
      doctor_signal: equiv_shared_0.EIT_Acquisition_Supervisor.DoctorSignal.Type,
      request_facts: equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
