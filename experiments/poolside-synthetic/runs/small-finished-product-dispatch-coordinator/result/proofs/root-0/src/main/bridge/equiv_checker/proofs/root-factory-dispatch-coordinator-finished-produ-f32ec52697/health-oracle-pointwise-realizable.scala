// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_f32ec5269731_Oracle_Pointwise_Realizable {
  @pure def check(
      raw_availability: equiv_shared_0.Factory_Dispatch_Coordinator.Product_Availability_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_GumboX.compute_CEP_Post(raw_availability, equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_Value.Invalid_Availability)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_GumboX.compute_CEP_Post(raw_availability, equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_Value.Product_Unavailable)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_GumboX.compute_CEP_Post(raw_availability, equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_Value.Product_Available)))))
  }
}
