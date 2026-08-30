// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a35ed04bd538_2_Valid {
  @pure def check(
      doctorsignal: equiv_shared_0.EIT_Image_Availability_Coordinator.DoctorSignal.Type,
      reviewfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFacts.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_Candidate_GumboX.inititialize_IEP_Post(reviewfacts))) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_GumboX.inititialize_IEP_Post(reviewfacts))) & T))
  }
}
