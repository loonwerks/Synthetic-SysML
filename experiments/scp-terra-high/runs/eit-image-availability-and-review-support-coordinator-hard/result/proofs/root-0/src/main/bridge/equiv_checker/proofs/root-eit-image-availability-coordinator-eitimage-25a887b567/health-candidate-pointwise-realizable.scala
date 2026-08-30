// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_25a887b56760_Candidate_Pointwise_Realizable {
  @pure def check(
      preparationcontext: equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContext.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_Candidate_GumboX.compute_CEP_Post(preparationcontext, equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.NO_CONTEXT)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_Candidate_GumboX.compute_CEP_Post(preparationcontext, equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.PARTIAL_CONTEXT)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_Candidate_GumboX.compute_CEP_Post(preparationcontext, equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.COMPLETE_CONTEXT)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_Candidate_GumboX.compute_CEP_Post(preparationcontext, equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.REPORTED_FAILURE)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_Candidate_GumboX.compute_CEP_Post(preparationcontext, equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.INVALID)))))
  }
}
