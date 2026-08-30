// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_93ffd32d1bcb_3_Valid {
  @pure def check(
      preparation_facts: equiv_shared_0.EIT_Acquisition_Supervisor.PreparationFacts.Type,
      preparation_observation: equiv_shared_0.EIT_Acquisition_Supervisor.PreparationObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
