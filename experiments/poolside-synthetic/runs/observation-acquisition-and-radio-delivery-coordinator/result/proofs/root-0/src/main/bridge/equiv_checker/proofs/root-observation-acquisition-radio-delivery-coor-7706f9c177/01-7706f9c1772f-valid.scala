// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7706f9c1772f_1_Valid {
  @pure def check(
      cameraacquisitioncommand: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type,
      radiodeliverycommand: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type,
      sessiondecision: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type,
      sessionphaseoutput: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type,
      sessionsnapshot: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot,
      in_committedsession: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type,
      committedsession: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
