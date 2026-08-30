// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EquipmentAssessment_acquisition_process_equipment_assessment {

  def initialise(api: EquipmentAssessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_equipment_facts(EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT)
  }

  def timeTriggered(api: EquipmentAssessment_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val equipment_observation: EIT_Acquisition_Supervisor.EquipmentObservation.Type =
      api.get_equipment_observation() match {
        case Some(v: EIT_Acquisition_Supervisor.EquipmentObservation.Type) => v
        case _ => EIT_Acquisition_Supervisor.EquipmentObservation.READY
      }

    val equipment_facts: EIT_Acquisition_Supervisor.EquipmentFacts.Type = equipment_observation match {
      case EIT_Acquisition_Supervisor.EquipmentObservation.READY => EIT_Acquisition_Supervisor.EquipmentFacts.READY
      case EIT_Acquisition_Supervisor.EquipmentObservation.NOT_READY => EIT_Acquisition_Supervisor.EquipmentFacts.NOT_READY
      case EIT_Acquisition_Supervisor.EquipmentObservation.BUSY => EIT_Acquisition_Supervisor.EquipmentFacts.BUSY
      case EIT_Acquisition_Supervisor.EquipmentObservation.FAULTED => EIT_Acquisition_Supervisor.EquipmentFacts.FAILED
      case EIT_Acquisition_Supervisor.EquipmentObservation.INVALID_HEALTH_STATUS => EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT
      case EIT_Acquisition_Supervisor.EquipmentObservation.INVALID_AVAILABILITY_STATUS => EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT
    }

    api.put_equipment_facts(equipment_facts)
  }

  def finalise(api: EquipmentAssessment_Operational_Api): Unit = { }
}
