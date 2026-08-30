// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e4cde43284a6_3_Valid {
  @pure def check(
      batch_facts: equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.Type,
      cycle_frame: equiv_shared_0.EIT_Acquisition_Supervisor.CycleFrame,
      equipment_facts: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.Type,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      cyclememory: equiv_shared_0.EIT_Acquisition_Supervisor.CycleState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
