// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AcquisitionCycleControl_acquisition_process_acquisition_cycle_control {

  var cycleMemory: EIT_Acquisition_Supervisor.CycleState.Type = EIT_Acquisition_Supervisor.CycleState.DORMANT

  def initialise(api: AcquisitionCycleControl_Initialization_Api): Unit = {
    Contract(
      Modifies(cycleMemory, api)
    )
    cycleMemory = EIT_Acquisition_Supervisor.CycleState.DORMANT
    api.put_cycle_frame(
      EIT_Acquisition_Supervisor.CycleFrame(
        cycleState = EIT_Acquisition_Supervisor.CycleState.DORMANT,
        batchReady = F))
  }

  def timeTriggered(api: AcquisitionCycleControl_Operational_Api): Unit = {
    Contract(
      Modifies(cycleMemory, api)
    )
    val recoveryGate: EIT_Acquisition_Supervisor.RecoveryGate.Type =
      api.get_recovery_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.RecoveryFrame) => v.recoveryGate
        case _ => EIT_Acquisition_Supervisor.RecoveryGate.OPEN
      }

    val batch_facts: EIT_Acquisition_Supervisor.BatchFacts.Type =
      api.get_batch_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.BatchFacts.Type) => v
        case _ => EIT_Acquisition_Supervisor.BatchFacts.NO_BATCH
      }

    val equipment_facts: EIT_Acquisition_Supervisor.EquipmentFacts.Type =
      api.get_equipment_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.EquipmentFacts.Type) => v
        case _ => EIT_Acquisition_Supervisor.EquipmentFacts.READY
      }

    val newCycleMemory: EIT_Acquisition_Supervisor.CycleState.Type =
      if (recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.CLOSED) {
        EIT_Acquisition_Supervisor.CycleState.RECOVERY
      } else {
        val wasRecovery: B = cycleMemory == EIT_Acquisition_Supervisor.CycleState.RECOVERY
        if (wasRecovery) {
          EIT_Acquisition_Supervisor.CycleState.DORMANT
        } else if (batch_facts == EIT_Acquisition_Supervisor.BatchFacts.USABLE) {
          EIT_Acquisition_Supervisor.CycleState.BATCH_READY
        } else if (equipment_facts == EIT_Acquisition_Supervisor.EquipmentFacts.BUSY) {
          EIT_Acquisition_Supervisor.CycleState.COLLECTING
        } else if (equipment_facts == EIT_Acquisition_Supervisor.EquipmentFacts.READY) {
          EIT_Acquisition_Supervisor.CycleState.READY
        } else {
          EIT_Acquisition_Supervisor.CycleState.DORMANT
        }
      }

    val batchReady: B =
      if (recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.CLOSED) {
        F
      } else if (newCycleMemory == EIT_Acquisition_Supervisor.CycleState.BATCH_READY) {
        T
      } else {
        F
      }

    cycleMemory = newCycleMemory

    api.put_cycle_frame(
      EIT_Acquisition_Supervisor.CycleFrame(
        cycleState = newCycleMemory,
        batchReady = batchReady))
  }

  def finalise(api: AcquisitionCycleControl_Operational_Api): Unit = { }
}
