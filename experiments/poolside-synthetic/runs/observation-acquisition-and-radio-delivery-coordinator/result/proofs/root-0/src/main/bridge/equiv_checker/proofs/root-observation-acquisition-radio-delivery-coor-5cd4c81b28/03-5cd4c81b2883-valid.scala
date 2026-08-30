// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5cd4c81b2883_3_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type,
      dronecontrolobservationnotice: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type,
      operatorcoordinationstatus: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus,
      sessionsnapshot: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
