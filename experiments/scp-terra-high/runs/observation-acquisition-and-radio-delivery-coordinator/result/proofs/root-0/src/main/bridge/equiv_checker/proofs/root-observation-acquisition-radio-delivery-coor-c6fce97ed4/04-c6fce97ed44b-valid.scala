// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c6fce97ed44b_4_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type,
      sortiecontext: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type,
      sortiequalification: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_GumboX.inititialize_IEP_Post(batteryassessment, sortiecontext, sortiequalification))) ___>: (T)) & T))
  }
}
