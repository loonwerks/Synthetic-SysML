// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_88e03f552b93_1_Valid {
  @pure def check(
      cameraevidence: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type,
      radioevidence: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type,
      sessionphaseinput: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type,
      sessionproposal: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type,
      sortiequalification: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
