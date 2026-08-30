// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ff668c3058d4_2_Valid {
  @pure def check(
      contextfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.Type,
      preparationcontext: equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContext.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_GumboX.inititialize_IEP_Post(contextfacts))) & T))
  }
}
