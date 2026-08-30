// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FaultComposition_acquisition_process_fault_composition {

  def initialise(api: FaultComposition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_fault_summary(EIT_Acquisition_Supervisor.FaultSummary(F, EIT_Acquisition_Supervisor.DominantFault.NONE, F))
  }

  def timeTriggered(api: FaultComposition_Operational_Api): Unit = {
    Contract(Modifies(api))
    val request: EIT_Acquisition_Supervisor.RequestFactsRecord = api.get_request_facts().get
    val preparation: EIT_Acquisition_Supervisor.PreparationFacts.Type = api.get_preparation_facts().get
    val equipment: EIT_Acquisition_Supervisor.EquipmentFacts.Type = api.get_equipment_facts().get
    val batch: EIT_Acquisition_Supervisor.BatchFacts.Type = api.get_batch_facts().get
    val image: EIT_Acquisition_Supervisor.ImageResultFacts.Type = api.get_image_result_facts().get
    val f1: B = request.requestFault
    val f2: B = preparation == EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT
    val f3: B = equipment == EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT
    val f4: B = batch == EIT_Acquisition_Supervisor.BatchFacts.INPUT_FAULT
    val f5: B = image == EIT_Acquisition_Supervisor.ImageResultFacts.INPUT_FAULT
    val f6: B = preparation == EIT_Acquisition_Supervisor.PreparationFacts.FAILED
    val f7: B = equipment == EIT_Acquisition_Supervisor.EquipmentFacts.FAILED
    val f8: B = batch == EIT_Acquisition_Supervisor.BatchFacts.FAILED
    val f9: B = image == EIT_Acquisition_Supervisor.ImageResultFacts.FAILED
    val faultPresent: B = f1 || f2 || f3 || f4 || f5 || f6 || f7 || f8 || f9
    val multiple: B =
      (f1 && (f2 || f3 || f4 || f5 || f6 || f7 || f8 || f9)) ||
      (f2 && (f3 || f4 || f5 || f6 || f7 || f8 || f9)) ||
      (f3 && (f4 || f5 || f6 || f7 || f8 || f9)) ||
      (f4 && (f5 || f6 || f7 || f8 || f9)) ||
      (f5 && (f6 || f7 || f8 || f9)) ||
      (f6 && (f7 || f8 || f9)) ||
      (f7 && (f8 || f9)) ||
      (f8 && f9)
    var dominant: EIT_Acquisition_Supervisor.DominantFault.Type = EIT_Acquisition_Supervisor.DominantFault.NONE
    if (request.requestFault) { dominant = EIT_Acquisition_Supervisor.DominantFault.REQUEST_INPUT }
    else if (preparation == EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT) { dominant = EIT_Acquisition_Supervisor.DominantFault.PREPARATION_INPUT }
    else if (equipment == EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT) { dominant = EIT_Acquisition_Supervisor.DominantFault.EQUIPMENT_INPUT }
    else if (batch == EIT_Acquisition_Supervisor.BatchFacts.INPUT_FAULT) { dominant = EIT_Acquisition_Supervisor.DominantFault.BATCH_INPUT }
    else if (image == EIT_Acquisition_Supervisor.ImageResultFacts.INPUT_FAULT) { dominant = EIT_Acquisition_Supervisor.DominantFault.IMAGE_INPUT }
    else if (preparation == EIT_Acquisition_Supervisor.PreparationFacts.FAILED) { dominant = EIT_Acquisition_Supervisor.DominantFault.PREPARATION_FAILURE }
    else if (equipment == EIT_Acquisition_Supervisor.EquipmentFacts.FAILED) { dominant = EIT_Acquisition_Supervisor.DominantFault.EQUIPMENT_FAILURE }
    else if (batch == EIT_Acquisition_Supervisor.BatchFacts.FAILED) { dominant = EIT_Acquisition_Supervisor.DominantFault.BATCH_FAILURE }
    else if (image == EIT_Acquisition_Supervisor.ImageResultFacts.FAILED) { dominant = EIT_Acquisition_Supervisor.DominantFault.IMAGE_FAILURE }
    api.put_fault_summary(EIT_Acquisition_Supervisor.FaultSummary(faultPresent, dominant, multiple))
  }

  def finalise(api: FaultComposition_Operational_Api): Unit = { }
}
