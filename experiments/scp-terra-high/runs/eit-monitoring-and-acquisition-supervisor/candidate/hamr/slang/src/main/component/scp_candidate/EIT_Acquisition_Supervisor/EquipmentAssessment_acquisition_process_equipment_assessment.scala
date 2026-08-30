// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EquipmentAssessment_acquisition_process_equipment_assessment {

  def initialise(api: EquipmentAssessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_equipment_facts(EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT)
  }

  def timeTriggered(api: EquipmentAssessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    val observation: EIT_Acquisition_Supervisor.EquipmentObservation.Type = api.get_equipment_observation().get
    var facts: EIT_Acquisition_Supervisor.EquipmentFacts.Type = EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT
    if (observation == EIT_Acquisition_Supervisor.EquipmentObservation.READY) {
      facts = EIT_Acquisition_Supervisor.EquipmentFacts.READY
    } else if (observation == EIT_Acquisition_Supervisor.EquipmentObservation.NOT_READY) {
      facts = EIT_Acquisition_Supervisor.EquipmentFacts.NOT_READY
    } else if (observation == EIT_Acquisition_Supervisor.EquipmentObservation.BUSY) {
      facts = EIT_Acquisition_Supervisor.EquipmentFacts.BUSY
    } else if (observation == EIT_Acquisition_Supervisor.EquipmentObservation.FAULTED) {
      facts = EIT_Acquisition_Supervisor.EquipmentFacts.FAILED
    }
    api.put_equipment_facts(facts)
  }

  def finalise(api: EquipmentAssessment_Operational_Api): Unit = { }
}
