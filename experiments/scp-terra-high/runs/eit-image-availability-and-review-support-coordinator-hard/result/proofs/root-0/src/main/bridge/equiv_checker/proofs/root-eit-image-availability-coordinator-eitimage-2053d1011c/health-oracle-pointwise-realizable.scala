// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_2053d1011c20_Oracle_Pointwise_Realizable {
  @pure def check(
      availabilityframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame,
      reviewframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFrame): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_GumboX.compute_CEP_Post(availabilityframe, reviewframe, equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationFrame(proposal = equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationProposal.NONE))) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_GumboX.compute_CEP_Post(availabilityframe, reviewframe, equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationFrame(proposal = equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationProposal.CLOSE))) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_GumboX.compute_CEP_Post(availabilityframe, reviewframe, equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationFrame(proposal = equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationProposal.OPEN))) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_GumboX.compute_CEP_Post(availabilityframe, reviewframe, equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationFrame(proposal = equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationProposal.OFFER))))))
  }
}
