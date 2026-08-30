// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_99ba2f5fb09d_2_Complement {
  @pure def check(
      availabilityservice: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceObservation.Type,
      servicefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_GumboX.inititialize_IEP_Post(servicefacts))) & T)))
  }
}
