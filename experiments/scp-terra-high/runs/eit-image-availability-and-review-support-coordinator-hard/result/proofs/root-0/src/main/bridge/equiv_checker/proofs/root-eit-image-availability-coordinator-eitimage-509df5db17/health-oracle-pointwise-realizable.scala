// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_509df5db17fa_Oracle_Pointwise_Realizable {
  @pure def check(
      availabilityservice: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_GumboX.compute_CEP_Post(availabilityservice, equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.READY)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_GumboX.compute_CEP_Post(availabilityservice, equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.DEGRADED)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_GumboX.compute_CEP_Post(availabilityservice, equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.REPORTED_FAILURE)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_GumboX.compute_CEP_Post(availabilityservice, equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.INVALID)))))
  }
}
