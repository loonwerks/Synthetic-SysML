// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a6c3175671ad_4_Valid {
  @pure def check(
      equipment_facts: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.Type,
      preparation_facts: equiv_shared_0.EIT_Acquisition_Supervisor.PreparationFacts.Type,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      request_facts: equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord,
      start_feasibility: equiv_shared_0.EIT_Acquisition_Supervisor.StartFeasibility.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_GumboX.inititialize_IEP_Post(start_feasibility))) ___>: (T)) & T))
  }
}
