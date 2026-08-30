// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_25a887b56760_4_Valid {
  @pure def check(
      contextfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.Type,
      preparationcontext: equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContext.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_GumboX.compute_CEP_Post(preparationcontext, contextfacts))) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_Candidate_GumboX.compute_CEP_Post(preparationcontext, contextfacts))) & T))
  }
}
