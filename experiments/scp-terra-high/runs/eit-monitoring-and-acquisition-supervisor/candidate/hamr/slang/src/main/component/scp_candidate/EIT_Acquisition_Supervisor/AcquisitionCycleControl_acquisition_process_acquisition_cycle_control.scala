// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AcquisitionCycleControl_acquisition_process_acquisition_cycle_control {
  var cycleMemory: EIT_Acquisition_Supervisor.CycleState.Type = EIT_Acquisition_Supervisor.CycleState.DORMANT

  def initialise(api: AcquisitionCycleControl_Initialization_Api): Unit = {
    Contract(Modifies(api, cycleMemory))
    cycleMemory = EIT_Acquisition_Supervisor.CycleState.DORMANT
    api.put_cycle_frame(EIT_Acquisition_Supervisor.CycleFrame(cycleMemory, F))
  }

  def timeTriggered(api: AcquisitionCycleControl_Operational_Api): Unit = {
    Contract(Modifies(api, cycleMemory))
    val equipment: EIT_Acquisition_Supervisor.EquipmentFacts.Type = api.get_equipment_facts().get
    val batch: EIT_Acquisition_Supervisor.BatchFacts.Type = api.get_batch_facts().get
    val recovery: EIT_Acquisition_Supervisor.RecoveryFrame = api.get_recovery_frame().get
    if (recovery.recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.CLOSED) {
      cycleMemory = EIT_Acquisition_Supervisor.CycleState.RECOVERY
    } else if (cycleMemory == EIT_Acquisition_Supervisor.CycleState.RECOVERY) {
      cycleMemory = EIT_Acquisition_Supervisor.CycleState.DORMANT
    } else if (batch == EIT_Acquisition_Supervisor.BatchFacts.USABLE) {
      cycleMemory = EIT_Acquisition_Supervisor.CycleState.BATCH_READY
    } else if (equipment == EIT_Acquisition_Supervisor.EquipmentFacts.BUSY) {
      cycleMemory = EIT_Acquisition_Supervisor.CycleState.COLLECTING
    } else if (equipment == EIT_Acquisition_Supervisor.EquipmentFacts.READY) {
      cycleMemory = EIT_Acquisition_Supervisor.CycleState.READY
    } else {
      cycleMemory = EIT_Acquisition_Supervisor.CycleState.DORMANT
    }
    api.put_cycle_frame(EIT_Acquisition_Supervisor.CycleFrame(cycleMemory, F))
  }

  def finalise(api: AcquisitionCycleControl_Operational_Api): Unit = { }
}
