// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Principal_Decision_Owner_supervisor_process_principal_decision_owner {

  // BEGIN STATE VARS
  var current_phase: Mining_Threat_Retreat_Supervisor.Operational_Phase.Type = Mining_Threat_Retreat_Supervisor.Operational_Phase.Idle
  // END STATE VARS

  def initialise(api: Principal_Decision_Owner_Initialization_Api): Unit = {
    Contract(
      Modifies(current_phase, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_PHASE_IDLE
        current_phase == Operational_Phase.Idle
        // END INITIALIZES ENSURES
      )
    )
    current_phase = Operational_Phase.Idle
    emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
      Movement_Service_Command.Hold, Operational_Phase.Idle, Input_Fault.Clear)
  }

  def timeTriggered(api: Principal_Decision_Owner_Operational_Api): Unit = {
    Contract(Modifies(current_phase, api))
    decide(api, api.get_threat_input().get, api.get_cargo_input().get,
      api.get_capacitor_input().get, api.get_request_input().get,
      api.get_mining_availability_input().get, api.get_defense_availability_input().get,
      api.get_retreat_availability_input().get, api.get_service_progress_input().get)
  }

  def decide(
    api: Principal_Decision_Owner_Operational_Api,
    threat: Threat_Observation,
    cargo: Cargo_Observation,
    capacitor: Capacitor_Observation,
    request: Request_Observation,
    miningAvailability: Mining_Availability_Observation,
    defenseAvailability: Defense_Availability_Observation,
    retreatAvailability: Retreat_Availability_Observation,
    serviceProgress: Service_Progress_Observation): Unit = {
    Contract(Modifies(current_phase, api))

    val invalid =
      threat.threat_status == Threat_Status.Invalid |
      cargo.cargo_status == Cargo_Status.Invalid |
      capacitor.capacitor_status == Capacitor_Status.Invalid |
      request.request_status == Request_Status.Invalid |
      miningAvailability.mining_availability_status == Mining_Availability_Status.Invalid |
      defenseAvailability.defense_availability_status == Defense_Availability_Status.Invalid |
      retreatAvailability.retreat_availability_status == Retreat_Availability_Status.Invalid |
      serviceProgress.service_progress_status == Service_Progress_Status.Invalid

    if (invalid) {
      val retreating =
        current_phase == Operational_Phase.Mining |
        current_phase == Operational_Phase.Defending |
        current_phase == Operational_Phase.Retreating
      if (retreating &
        retreatAvailability.retreat_availability_status == Retreat_Availability_Status.Valid &
        retreatAvailability.retreat_available == Retreat_Availability.Available) {
        current_phase = Operational_Phase.Retreating
        emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
          Movement_Service_Command.Retreat, Operational_Phase.Retreating,
          Input_Fault.Asserted)
      } else {
        current_phase = Operational_Phase.Fault_Hold
        emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
          Movement_Service_Command.Hold, Operational_Phase.Fault_Hold,
          Input_Fault.Asserted)
      }
    } else if (serviceProgress.service_progress == Service_Progress.Away) {
      val retreatTrigger =
        current_phase == Operational_Phase.Retreating |
        current_phase == Operational_Phase.Fault_Hold |
        request.operator_request == Operator_Request.Retreat |
        cargo.cargo_band == Cargo_Band.Full |
        capacitor.capacitor_band == Capacitor_Band.Critical |
        (threat.threat == Threat_Value.Hostile &
          defenseAvailability.defense_available == Defense_Availability.Unavailable)

      if (retreatTrigger) {
        if (retreatAvailability.retreat_available == Retreat_Availability.Available) {
          current_phase = Operational_Phase.Retreating
          emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
            Movement_Service_Command.Retreat, Operational_Phase.Retreating,
            Input_Fault.Clear)
        } else {
          current_phase = Operational_Phase.Fault_Hold
          emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
            Movement_Service_Command.Hold, Operational_Phase.Fault_Hold,
            Input_Fault.Clear)
        }
      } else {
        val activePhase =
          current_phase == Operational_Phase.Idle |
          current_phase == Operational_Phase.Mining |
          current_phase == Operational_Phase.Defending
        if (activePhase & threat.threat == Threat_Value.Hostile &
          defenseAvailability.defense_available == Defense_Availability.Available) {
          current_phase = Operational_Phase.Defending
          emit(api, Mining_Command.Stop, Defense_Command.Engage,
            Movement_Service_Command.Hold, Operational_Phase.Defending,
            Input_Fault.Clear)
        } else if (activePhase & threat.threat == Threat_Value.Clear &
          request.operator_request == Operator_Request.Mine &
          cargo.cargo_band == Cargo_Band.Partial &
          (capacitor.capacitor_band == Capacitor_Band.Reserve |
            capacitor.capacitor_band == Capacitor_Band.Ready) &
          miningAvailability.mining_available == Mining_Availability.Available) {
          current_phase = Operational_Phase.Mining
          emit(api, Mining_Command.Mine, Defense_Command.Stand_Down,
            Movement_Service_Command.Hold, Operational_Phase.Mining,
            Input_Fault.Clear)
        } else {
          current_phase = Operational_Phase.Idle
          emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
            Movement_Service_Command.Hold, Operational_Phase.Idle,
            Input_Fault.Clear)
        }
      }
    } else if (serviceProgress.service_progress == Service_Progress.At_Station &
      (current_phase == Operational_Phase.Retreating |
        current_phase == Operational_Phase.Fault_Hold)) {
      current_phase = Operational_Phase.Retreating
      emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
        Movement_Service_Command.Dock, Operational_Phase.Retreating,
        Input_Fault.Clear)
    } else if (serviceProgress.service_progress == Service_Progress.Docked_Loaded &
      (current_phase == Operational_Phase.Retreating |
        current_phase == Operational_Phase.Servicing |
        current_phase == Operational_Phase.Fault_Hold)) {
      current_phase = Operational_Phase.Servicing
      emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
        Movement_Service_Command.Offload, Operational_Phase.Servicing,
        Input_Fault.Clear)
    } else if (serviceProgress.service_progress == Service_Progress.Offload_Confirmed &
      (current_phase == Operational_Phase.Servicing |
        current_phase == Operational_Phase.Fault_Hold)) {
      current_phase = Operational_Phase.Servicing
      emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
        Movement_Service_Command.Resupply, Operational_Phase.Servicing,
        Input_Fault.Clear)
    } else if (serviceProgress.service_progress == Service_Progress.Resupply_Confirmed &
      (current_phase == Operational_Phase.Servicing |
        current_phase == Operational_Phase.Fault_Hold)) {
      current_phase = Operational_Phase.Idle
      emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
        Movement_Service_Command.Acknowledge_Ready, Operational_Phase.Idle,
        Input_Fault.Clear)
    } else {
      current_phase = Operational_Phase.Idle
      emit(api, Mining_Command.Stop, Defense_Command.Stand_Down,
        Movement_Service_Command.Hold, Operational_Phase.Idle,
        Input_Fault.Clear)
    }
  }

  def emit(
    api: Principal_Decision_Owner_Api,
    mining: Mining_Command.Type,
    defense: Defense_Command.Type,
    movement: Movement_Service_Command.Type,
    phase: Operational_Phase.Type,
    fault: Input_Fault.Type): Unit = {
    Contract(Modifies(api))
    api.put_mining_decision(mining)
    api.put_defense_decision(defense)
    api.put_movement_service_decision(movement)
    api.put_phase_decision(phase)
    api.put_fault_decision(fault)
  }

  def finalise(api: Principal_Decision_Owner_Operational_Api): Unit = { }
}
