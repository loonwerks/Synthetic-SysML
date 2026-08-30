// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_394776e89711_2_Valid {
  @pure def check(
      doctor_signal: equiv_shared_0.EIT_Acquisition_Supervisor.DoctorSignal.Type,
      request_facts: equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_GumboX.inititialize_IEP_Post(request_facts))) & T))
  }
}
