// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_0b3c77f55809_Oracle_Pointwise_Realizable {
  @pure def check(
      preparation_observation: equiv_shared_0.EIT_Acquisition_Supervisor.PreparationObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_GumboX.compute_CEP_Post(preparation_observation, equiv_shared_0.EIT_Acquisition_Supervisor.PreparationFacts.READY)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_GumboX.compute_CEP_Post(preparation_observation, equiv_shared_0.EIT_Acquisition_Supervisor.PreparationFacts.NOT_READY)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_GumboX.compute_CEP_Post(preparation_observation, equiv_shared_0.EIT_Acquisition_Supervisor.PreparationFacts.FAILED)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_GumboX.compute_CEP_Post(preparation_observation, equiv_shared_0.EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT)))))
  }
}
