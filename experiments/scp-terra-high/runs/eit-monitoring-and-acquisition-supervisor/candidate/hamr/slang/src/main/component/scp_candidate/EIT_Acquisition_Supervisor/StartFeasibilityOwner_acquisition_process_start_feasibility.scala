// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object StartFeasibilityOwner_acquisition_process_start_feasibility {

  def initialise(api: StartFeasibilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_start_feasibility(EIT_Acquisition_Supervisor.StartFeasibility.NOT_FEASIBLE)
  }

  def timeTriggered(api: StartFeasibilityOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val request: EIT_Acquisition_Supervisor.RequestFactsRecord = api.get_request_facts().get
    val preparation: EIT_Acquisition_Supervisor.PreparationFacts.Type = api.get_preparation_facts().get
    val equipment: EIT_Acquisition_Supervisor.EquipmentFacts.Type = api.get_equipment_facts().get
    val recovery: EIT_Acquisition_Supervisor.RecoveryFrame = api.get_recovery_frame().get
    var result: EIT_Acquisition_Supervisor.StartFeasibility.Type = EIT_Acquisition_Supervisor.StartFeasibility.NOT_FEASIBLE
    if (request.requestClass == EIT_Acquisition_Supervisor.RequestClass.START_REQUEST &&
          preparation == EIT_Acquisition_Supervisor.PreparationFacts.READY &&
          equipment == EIT_Acquisition_Supervisor.EquipmentFacts.READY &&
          recovery.recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.OPEN) {
      result = EIT_Acquisition_Supervisor.StartFeasibility.FEASIBLE
    }
    api.put_start_feasibility(result)
  }

  def finalise(api: StartFeasibilityOwner_Operational_Api): Unit = { }
}
