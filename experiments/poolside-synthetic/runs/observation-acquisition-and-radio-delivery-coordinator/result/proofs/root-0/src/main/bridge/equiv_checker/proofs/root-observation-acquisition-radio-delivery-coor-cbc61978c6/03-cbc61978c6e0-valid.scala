// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cbc61978c6e0_3_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type,
      sortiecontext: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type,
      sortiequalification: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
