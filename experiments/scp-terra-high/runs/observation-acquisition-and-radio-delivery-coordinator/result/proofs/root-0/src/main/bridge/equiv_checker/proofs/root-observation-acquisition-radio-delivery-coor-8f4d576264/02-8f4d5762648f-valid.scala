// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8f4d5762648f_2_Valid {
  @pure def check(
      cameraacquisitioncommand: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type,
      radiodeliverycommand: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type,
      sessiondecision: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type,
      sessionphaseoutput: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type,
      sessionsnapshot: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot,
      committedsession: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_GumboX.inititialize_IEP_Post(committedsession, cameraacquisitioncommand, radiodeliverycommand, sessionphaseoutput, sessionsnapshot))) & T))
  }
}
