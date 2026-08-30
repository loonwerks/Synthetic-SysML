// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_736ff93f673c_4_Valid {
  @pure def check(
      batch_facts: equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.Type,
      cycle_frame: equiv_shared_0.EIT_Acquisition_Supervisor.CycleFrame,
      equipment_facts: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.Type,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      in_cyclememory: equiv_shared_0.EIT_Acquisition_Supervisor.CycleState.Type,
      cyclememory: equiv_shared_0.EIT_Acquisition_Supervisor.CycleState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_GumboX.compute_CEP_Post(in_cyclememory, cyclememory, batch_facts, equipment_facts, recovery_frame, cycle_frame))) ___>: (T)) & T))
  }
}
