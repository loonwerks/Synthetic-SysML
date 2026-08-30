// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_86bd55d2da32_2_Complement {
  @pure def check(
      contextfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.Type,
      faultsummary: equiv_shared_0.EIT_Image_Availability_Coordinator.FaultSummary,
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      reviewfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFacts.Type,
      servicefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_GumboX.inititialize_IEP_Post(faultsummary))) & T)))
  }
}
