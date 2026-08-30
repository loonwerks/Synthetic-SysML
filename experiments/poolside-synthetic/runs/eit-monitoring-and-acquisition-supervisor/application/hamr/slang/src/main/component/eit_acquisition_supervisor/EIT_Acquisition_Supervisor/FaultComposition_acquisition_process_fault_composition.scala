// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultComposition_acquisition_process_fault_composition {

  def initialise(api: FaultComposition_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_fault_summary(
      EIT_Acquisition_Supervisor.FaultSummary(
        faultPresent = F,
        dominantFault = EIT_Acquisition_Supervisor.DominantFault.NONE,
        multipleFaults = F))
  }

  def timeTriggered(api: FaultComposition_Operational_Api): Unit = {
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

    val batch_facts: EIT_Acquisition_Supervisor.BatchFacts.Type =
      api.get_batch_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.BatchFacts.Type) => v
        case _ => EIT_Acquisition_Supervisor.BatchFacts.INPUT_FAULT
      }

    val image_result_facts: EIT_Acquisition_Supervisor.ImageResultFacts.Type =
      api.get_image_result_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.ImageResultFacts.Type) => v
        case _ => EIT_Acquisition_Supervisor.ImageResultFacts.INPUT_FAULT
      }

    val prepInputFault: B = preparation_facts == EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT
    val equipInputFault: B = equipment_facts == EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT
    val batchInputFault: B = batch_facts == EIT_Acquisition_Supervisor.BatchFacts.INPUT_FAULT
    val imageInputFault: B = image_result_facts == EIT_Acquisition_Supervisor.ImageResultFacts.INPUT_FAULT
    val prepFailed: B = preparation_facts == EIT_Acquisition_Supervisor.PreparationFacts.FAILED
    val equipFailed: B = equipment_facts == EIT_Acquisition_Supervisor.EquipmentFacts.FAILED
    val batchFailed: B = batch_facts == EIT_Acquisition_Supervisor.BatchFacts.FAILED
    val imageFailed: B = image_result_facts == EIT_Acquisition_Supervisor.ImageResultFacts.FAILED

    val requestFault: B = request_facts.requestFault

    val faultCount: Z = (if (requestFault) 1 else 0) +
      (if (prepInputFault) 1 else 0) +
      (if (equipInputFault) 1 else 0) +
      (if (batchInputFault) 1 else 0) +
      (if (imageInputFault) 1 else 0) +
      (if (prepFailed) 1 else 0) +
      (if (equipFailed) 1 else 0) +
      (if (batchFailed) 1 else 0) +
      (if (imageFailed) 1 else 0)

    val faultPresent: B = faultCount > 0
    val multipleFaults: B = faultCount >= 2

    val dominantFault: EIT_Acquisition_Supervisor.DominantFault.Type =
      if (requestFault) {
        EIT_Acquisition_Supervisor.DominantFault.REQUEST_INPUT
      } else if (prepInputFault) {
        EIT_Acquisition_Supervisor.DominantFault.PREPARATION_INPUT
      } else if (equipInputFault) {
        EIT_Acquisition_Supervisor.DominantFault.EQUIPMENT_INPUT
      } else if (batchInputFault) {
        EIT_Acquisition_Supervisor.DominantFault.BATCH_INPUT
      } else if (imageInputFault) {
        EIT_Acquisition_Supervisor.DominantFault.IMAGE_INPUT
      } else if (prepFailed) {
        EIT_Acquisition_Supervisor.DominantFault.PREPARATION_FAILURE
      } else if (equipFailed) {
        EIT_Acquisition_Supervisor.DominantFault.EQUIPMENT_FAILURE
      } else if (batchFailed) {
        EIT_Acquisition_Supervisor.DominantFault.BATCH_FAILURE
      } else if (imageFailed) {
        EIT_Acquisition_Supervisor.DominantFault.IMAGE_FAILURE
      } else {
        EIT_Acquisition_Supervisor.DominantFault.NONE
      }

    val faultSummary: EIT_Acquisition_Supervisor.FaultSummary =
      EIT_Acquisition_Supervisor.FaultSummary(
        faultPresent = faultPresent,
        dominantFault = dominantFault,
        multipleFaults = multipleFaults)

    api.put_fault_summary(faultSummary)
  }

  def finalise(api: FaultComposition_Operational_Api): Unit = { }
}
