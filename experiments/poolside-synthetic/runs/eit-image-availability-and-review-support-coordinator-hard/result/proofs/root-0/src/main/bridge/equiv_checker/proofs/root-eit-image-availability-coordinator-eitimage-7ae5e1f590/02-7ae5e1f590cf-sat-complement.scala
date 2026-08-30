// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7ae5e1f590cf_2_Complement {
  @pure def check(
      doctorsignal: equiv_shared_0.EIT_Image_Availability_Coordinator.DoctorSignal.Type,
      reviewfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFacts.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_GumboX.compute_CEP_Post(doctorsignal, reviewfacts))) & T)))
  }
}
