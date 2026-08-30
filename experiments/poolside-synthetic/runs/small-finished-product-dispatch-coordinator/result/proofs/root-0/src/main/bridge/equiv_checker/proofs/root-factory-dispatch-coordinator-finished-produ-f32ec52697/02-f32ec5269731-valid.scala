// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f32ec5269731_2_Valid {
  @pure def check(
      availability_assessment: equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type,
      raw_availability: equiv_shared_0.Factory_Dispatch_Coordinator.Product_Availability_Sample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_Candidate_GumboX.compute_CEP_Post(raw_availability, availability_assessment))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_GumboX.compute_CEP_Post(raw_availability, availability_assessment))) & T))
  }
}
