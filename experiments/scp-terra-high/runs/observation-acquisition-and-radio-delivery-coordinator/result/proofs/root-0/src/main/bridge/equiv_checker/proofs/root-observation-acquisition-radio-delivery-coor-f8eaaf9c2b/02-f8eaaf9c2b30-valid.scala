// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f8eaaf9c2b30_2_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type,
      dronecontrolobservationnotice: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type,
      operatorcoordinationstatus: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus,
      sessionsnapshot: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_GumboX.inititialize_IEP_Post(batteryassessment, sessionsnapshot, dronecontrolobservationnotice, operatorcoordinationstatus))) & T))
  }
}
