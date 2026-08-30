// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0b3c77f55809_2_Complement {
  @pure def check(
      preparation_facts: equiv_shared_0.EIT_Acquisition_Supervisor.PreparationFacts.Type,
      preparation_observation: equiv_shared_0.EIT_Acquisition_Supervisor.PreparationObservation.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_GumboX.compute_CEP_Post(preparation_observation, preparation_facts))) & T)))
  }
}
