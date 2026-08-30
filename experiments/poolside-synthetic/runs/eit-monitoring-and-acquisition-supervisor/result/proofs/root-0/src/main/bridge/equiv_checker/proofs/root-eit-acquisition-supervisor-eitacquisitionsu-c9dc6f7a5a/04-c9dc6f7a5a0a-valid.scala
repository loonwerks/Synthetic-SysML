// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c9dc6f7a5a0a_4_Valid {
  @pure def check(
      batch_facts: equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.Type,
      equipment_facts: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.Type,
      fault_summary: equiv_shared_0.EIT_Acquisition_Supervisor.FaultSummary,
      image_result_facts: equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultFacts.Type,
      preparation_facts: equiv_shared_0.EIT_Acquisition_Supervisor.PreparationFacts.Type,
      request_facts: equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_GumboX.compute_CEP_Post(batch_facts, equipment_facts, image_result_facts, preparation_facts, request_facts, fault_summary))) ___>: (T)) & T))
  }
}
