// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cbc61978c6e0_2_Complement {
  @pure def check(
      batteryassessment: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type,
      sortiecontext: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type,
      sortiequalification: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_GumboX.compute_CEP_Post(batteryassessment, sortiecontext, sortiequalification))) & T)))
  }
}
