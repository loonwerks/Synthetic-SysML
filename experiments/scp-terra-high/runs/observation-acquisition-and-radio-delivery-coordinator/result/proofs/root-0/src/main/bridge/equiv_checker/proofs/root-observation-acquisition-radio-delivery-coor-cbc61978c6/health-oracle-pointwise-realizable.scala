// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_cbc61978c6e0_Oracle_Pointwise_Realizable {
  @pure def check(
      batteryassessment: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type,
      sortiecontext: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_GumboX.compute_CEP_Post(batteryassessment, sortiecontext, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_GumboX.compute_CEP_Post(batteryassessment, sortiecontext, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_GumboX.compute_CEP_Post(batteryassessment, sortiecontext, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_CONTEXT)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_GumboX.compute_CEP_Post(batteryassessment, sortiecontext, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE)))))
  }
}
