// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1c80653bf8e8_3_Valid {
  @pure def check(
      arbitrationdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.ArbitrationDecision,
      doctorrequest: equiv_shared_0.EIT_Acquisition_Session_Coordinator.DoctorRequest.Type,
      eligibilityenvelope: equiv_shared_0.EIT_Acquisition_Session_Coordinator.EligibilityEnvelope,
      technicianrequest: equiv_shared_0.EIT_Acquisition_Session_Coordinator.TechnicianRequest.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
