// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner {

  // BEGIN STATE VARS
  var demandMemory: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type =
    Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Dormant
  // END STATE VARS

  def initialise(api: OperatingDemandOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, demandMemory),
      Ensures(
        // BEGIN INITIALISE ENSURES initialise
        // guarantee INITIAL_DEMAND_DORMANT
        demandMemory == OperatingDemand.Dormant &
          api.demandSnapshot.currentDemand == PriorOperatingDemand.Dormant &
          api.demandSnapshot.nextDemand == OperatingDemand.Dormant
        // END INITIALISE ENSURES initialise
      )
    )
    demandMemory = OperatingDemand.Dormant
    api.put_demandSnapshot(Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot(
      currentDemand = PriorOperatingDemand.Dormant,
      nextDemand = OperatingDemand.Dormant))
  }

  def timeTriggered(api: OperatingDemandOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, demandMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee DEMAND_SNAPSHOT_COHERENCE
        (In(demandMemory) == OperatingDemand.Dormant & api.demandSnapshot.currentDemand == PriorOperatingDemand.Dormant |
          In(demandMemory) == OperatingDemand.Staged & api.demandSnapshot.currentDemand == PriorOperatingDemand.Staged |
          In(demandMemory) == OperatingDemand.RunRequested & api.demandSnapshot.currentDemand == PriorOperatingDemand.RunRequested) &
          api.demandSnapshot.nextDemand == demandMemory,
        // case CASE_09_DEMAND_CLEAR
        (api.selectedIndication == SelectedIndication.InvalidSelected |
          api.selectedIndication == SelectedIndication.DegradedSelected |
          api.selectedIndication == SelectedIndication.OffSelected) ___>: demandMemory == OperatingDemand.Dormant,
        // case CASE_10_DEMAND_STAGE
        (api.selectedIndication != SelectedIndication.InvalidSelected &
          api.selectedIndication != SelectedIndication.DegradedSelected &
          api.selectedIndication != SelectedIndication.OffSelected &
          (api.recoveryDecision == RecoveryDecision.Confirm |
            api.selectedIndication == SelectedIndication.StartSelected & In(demandMemory) == OperatingDemand.Dormant)) ___>: demandMemory == OperatingDemand.Staged,
        // case CASE_11_DEMAND_RUN
        (api.selectedIndication == SelectedIndication.OnSelected &
          api.recoveryDecision != RecoveryDecision.Confirm &
          In(demandMemory) == OperatingDemand.Staged) ___>: demandMemory == OperatingDemand.RunRequested,
        // case CASE_12_DEMAND_RETAIN
        (api.selectedIndication != SelectedIndication.InvalidSelected &
          api.selectedIndication != SelectedIndication.DegradedSelected &
          api.selectedIndication != SelectedIndication.OffSelected &
          api.recoveryDecision != RecoveryDecision.Confirm &
          (api.selectedIndication != SelectedIndication.StartSelected | In(demandMemory) != OperatingDemand.Dormant) &
          (api.selectedIndication != SelectedIndication.OnSelected | In(demandMemory) != OperatingDemand.Staged)) ___>: demandMemory == In(demandMemory)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val selectedIndication: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type = api.get_selectedIndication().get
    val recoveryDecision: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type = api.get_recoveryDecision().get

    val priorDemand: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Type = demandMemory match {
      case OperatingDemand.Dormant => PriorOperatingDemand.Dormant
      case OperatingDemand.Staged => PriorOperatingDemand.Staged
      case OperatingDemand.RunRequested => PriorOperatingDemand.RunRequested
    }

    val clear: B = selectedIndication == SelectedIndication.InvalidSelected |
      selectedIndication == SelectedIndication.DegradedSelected |
      selectedIndication == SelectedIndication.OffSelected

    if (clear) {
      // CASE_09_DEMAND_CLEAR
      demandMemory = OperatingDemand.Dormant
    } else {
      val stage: B = recoveryDecision == RecoveryDecision.Confirm |
        (selectedIndication == SelectedIndication.StartSelected & demandMemory == OperatingDemand.Dormant)
      val run: B = selectedIndication == SelectedIndication.OnSelected &
        recoveryDecision != RecoveryDecision.Confirm &
        demandMemory == OperatingDemand.Staged

      if (stage) {
        // CASE_10_DEMAND_STAGE
        demandMemory = OperatingDemand.Staged
      } else if (run) {
        // CASE_11_DEMAND_RUN
        demandMemory = OperatingDemand.RunRequested
      }
      // CASE_12_DEMAND_RETAIN: otherwise demandMemory unchanged
    }

    api.put_demandSnapshot(Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot(
      currentDemand = priorDemand,
      nextDemand = demandMemory))
  }

  def finalise(api: OperatingDemandOwner_Operational_Api): Unit = { }
}
