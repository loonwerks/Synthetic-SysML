// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner {

  def initialise(api: IndicationPriorityOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALISE ENSURES initialise
        // guarantee INITIAL_SELECTION_FAIL_CLOSED
        api.selectionToDemand == SelectedIndication.InvalidSelected &
          api.selectionToSession == api.selectionToDemand &
          api.selectionToRecovery == api.selectionToDemand &
          api.selectionToEpisode == api.selectionToDemand &
          api.selectionToBrake == api.selectionToDemand
        // END INITIALISE ENSURES initialise
      )
    )
    val selection = SelectedIndication.InvalidSelected
    api.put_selectionToDemand(selection)
    api.put_selectionToSession(selection)
    api.put_selectionToRecovery(selection)
    api.put_selectionToEpisode(selection)
    api.put_selectionToBrake(selection)
  }

  def timeTriggered(api: IndicationPriorityOwner_Operational_Api): Unit = {
      Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee SELECTION_FANOUT_COHERENCE
        api.selectionToSession == api.selectionToDemand &
          api.selectionToRecovery == api.selectionToDemand &
          api.selectionToEpisode == api.selectionToDemand &
          api.selectionToBrake == api.selectionToDemand,
        // case CASE_01_INPUT_INVALID
        //   conflictClass is InputInvalid
        (api.conflictClass == ConflictClass.InputInvalid) ___>: (api.selectionToDemand == SelectedIndication.InvalidSelected),
        // case CASE_02_DEGRADED
        //   conflictClass not InputInvalid and degradationFacts active is true
        (api.conflictClass != ConflictClass.InputInvalid &
          api.degradationFacts.active) ___>: (api.selectionToDemand == SelectedIndication.DegradedSelected),
        // case CASE_03_OFF
        //   conflictClass not InputInvalid, degradationFacts active is false, lifecycleFacts offActive is true
        (api.conflictClass != ConflictClass.InputInvalid &
          api.degradationFacts.active == F &
          api.lifecycleFacts.offActive) ___>: (api.selectionToDemand == SelectedIndication.OffSelected),
        // case CASE_04_MAINTENANCE
        //   priority chain advancing to maintenance
        (api.conflictClass != ConflictClass.InputInvalid &
          api.degradationFacts.active == F &
          api.lifecycleFacts.offActive == F &
          api.maintenanceFacts.active) ___>: (api.selectionToDemand == SelectedIndication.MaintenanceSelected),
        // case CASE_05_RETURN
        //   priority chain advancing to return
        (api.conflictClass != ConflictClass.InputInvalid &
          api.degradationFacts.active == F &
          api.lifecycleFacts.offActive == F &
          api.maintenanceFacts.active == F &
          api.returnFacts.fresh) ___>: (api.selectionToDemand == SelectedIndication.ReturnSelected),
        // case CASE_06_ON
        //   priority chain advancing to on
        (api.conflictClass != ConflictClass.InputInvalid &
          api.degradationFacts.active == F &
          api.lifecycleFacts.offActive == F &
          api.maintenanceFacts.active == F &
          api.returnFacts.fresh == F &
          api.lifecycleFacts.freshOn) ___>: (api.selectionToDemand == SelectedIndication.OnSelected),
        // case CASE_07_START
        //   priority chain advancing to start
        (api.conflictClass != ConflictClass.InputInvalid &
          api.degradationFacts.active == F &
          api.lifecycleFacts.offActive == F &
          api.maintenanceFacts.active == F &
          api.returnFacts.fresh == F &
          api.lifecycleFacts.freshOn == F &
          api.lifecycleFacts.freshStart) ___>: (api.selectionToDemand == SelectedIndication.StartSelected),
        // case CASE_08_NONE
        //   priority chain default
        (api.conflictClass != ConflictClass.InputInvalid &
          api.degradationFacts.active == F &
          api.lifecycleFacts.offActive == F &
          api.maintenanceFacts.active == F &
          api.returnFacts.fresh == F &
          api.lifecycleFacts.freshOn == F &
          api.lifecycleFacts.freshStart == F) ___>: (api.selectionToDemand == SelectedIndication.NoneSelected)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val conflictClass: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type = api.get_conflictClass().get
    val lifecycleFacts: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts = api.get_lifecycleFacts().get
    val maintenanceFacts: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts = api.get_maintenanceFacts().get
    val degradationFacts: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts = api.get_degradationFacts().get
    val returnFacts: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts = api.get_returnFacts().get

    val selection: SelectedIndication.Type =
      if (conflictClass == ConflictClass.InputInvalid) SelectedIndication.InvalidSelected
      else (if (degradationFacts.active) SelectedIndication.DegradedSelected
        else (if (lifecycleFacts.offActive) SelectedIndication.OffSelected
          else (if (maintenanceFacts.active) SelectedIndication.MaintenanceSelected
            else (if (returnFacts.fresh) SelectedIndication.ReturnSelected
              else (if (lifecycleFacts.freshOn) SelectedIndication.OnSelected
                else (if (lifecycleFacts.freshStart) SelectedIndication.StartSelected
                  else SelectedIndication.NoneSelected))))))

    api.put_selectionToDemand(selection)
    api.put_selectionToSession(selection)
    api.put_selectionToRecovery(selection)
    api.put_selectionToEpisode(selection)
    api.put_selectionToBrake(selection)
  }

  def finalise(api: IndicationPriorityOwner_Operational_Api): Unit = { }
}
