// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_db2e811e7907_2_Complement {
  @pure def check(
      equipment_facts: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.Type,
      preparation_facts: equiv_shared_0.EIT_Acquisition_Supervisor.PreparationFacts.Type,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      request_facts: equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord,
      start_feasibility: equiv_shared_0.EIT_Acquisition_Supervisor.StartFeasibility.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_GumboX.compute_CEP_Post(equipment_facts, preparation_facts, recovery_frame, request_facts, start_feasibility))) & T)))
  }
}
