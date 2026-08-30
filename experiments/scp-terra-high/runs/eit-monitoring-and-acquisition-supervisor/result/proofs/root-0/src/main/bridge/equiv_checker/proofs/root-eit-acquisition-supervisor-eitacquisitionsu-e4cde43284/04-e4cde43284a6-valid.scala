// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e4cde43284a6_4_Valid {
  @pure def check(
      batch_facts: equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.Type,
      cycle_frame: equiv_shared_0.EIT_Acquisition_Supervisor.CycleFrame,
      equipment_facts: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.Type,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      cyclememory: equiv_shared_0.EIT_Acquisition_Supervisor.CycleState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_GumboX.inititialize_IEP_Post(cyclememory, cycle_frame))) ___>: (T)) & T))
  }
}
