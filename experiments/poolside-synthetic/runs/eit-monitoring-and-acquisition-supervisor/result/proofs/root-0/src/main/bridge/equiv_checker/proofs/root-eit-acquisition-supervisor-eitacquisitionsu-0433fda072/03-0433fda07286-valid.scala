// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0433fda07286_3_Valid {
  @pure def check(
      batch_facts: equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.Type,
      equipment_facts: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.Type,
      fault_summary: equiv_shared_0.EIT_Acquisition_Supervisor.FaultSummary,
      image_result_facts: equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultFacts.Type,
      preparation_facts: equiv_shared_0.EIT_Acquisition_Supervisor.PreparationFacts.Type,
      request_facts: equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
