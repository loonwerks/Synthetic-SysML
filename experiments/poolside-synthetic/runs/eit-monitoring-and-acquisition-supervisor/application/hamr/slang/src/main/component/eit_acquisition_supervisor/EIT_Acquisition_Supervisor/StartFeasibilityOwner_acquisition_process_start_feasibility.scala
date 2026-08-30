// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object StartFeasibilityOwner_acquisition_process_start_feasibility {

  def initialise(api: StartFeasibilityOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_start_feasibility(EIT_Acquisition_Supervisor.StartFeasibility.NOT_FEASIBLE)
  }

  def timeTriggered(api: StartFeasibilityOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val request_facts: EIT_Acquisition_Supervisor.RequestFactsRecord =
      api.get_request_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.RequestFactsRecord) => v
        case _ => EIT_Acquisition_Supervisor.RequestFactsRecord.example()
      }

    val preparation_facts: EIT_Acquisition_Supervisor.PreparationFacts.Type =
      api.get_preparation_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.PreparationFacts.Type) => v
        case _ => EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT
      }

    val equipment_facts: EIT_Acquisition_Supervisor.EquipmentFacts.Type =
      api.get_equipment_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.EquipmentFacts.Type) => v
        case _ => EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT
      }

    val recovery_frame: EIT_Acquisition_Supervisor.RecoveryFrame =
      api.get_recovery_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.RecoveryFrame) => v
        case _ => EIT_Acquisition_Supervisor.RecoveryFrame.example()
      }

    val start_feasibility: EIT_Acquisition_Supervisor.StartFeasibility.Type =
      if (request_facts.requestClass == EIT_Acquisition_Supervisor.RequestClass.START_REQUEST &&
          preparation_facts == EIT_Acquisition_Supervisor.PreparationFacts.READY &&
          equipment_facts == EIT_Acquisition_Supervisor.EquipmentFacts.READY &&
          recovery_frame.recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.OPEN) {
        EIT_Acquisition_Supervisor.StartFeasibility.FEASIBLE
      } else {
        EIT_Acquisition_Supervisor.StartFeasibility.NOT_FEASIBLE
      }

    api.put_start_feasibility(start_feasibility)
  }

  def finalise(api: StartFeasibilityOwner_Operational_Api): Unit = { }
}
