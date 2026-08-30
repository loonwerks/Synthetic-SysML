// #Sireum

package mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor

import org.sireum._
import mining_threat_retreat_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Principal_Decision_Owner_supervisor_process_principal_decision_owner {

  // BEGIN STATE VARS
  var current_phase: Mining_Threat_Retreat_Supervisor.Operational_Phase.Type = Mining_Threat_Retreat_Supervisor.Operational_Phase.Idle
  // END STATE VARS

  def initialise(api: Principal_Decision_Owner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, current_phase),
      Ensures(
        // guarantee INITIAL_PHASE_IDLE
        //   Principal Decision Owner shall set current phase to Idle
        current_phase == Mining_Threat_Retreat_Supervisor.Operational_Phase.Idle
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_mining_decision(Mining_Threat_Retreat_Supervisor.Mining_Command.Stop)
    api.put_defense_decision(Mining_Threat_Retreat_Supervisor.Defense_Command.Stand_Down)
    api.put_movement_service_decision(Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Hold)
    api.put_phase_decision(Mining_Threat_Retreat_Supervisor.Operational_Phase.Idle)
    api.put_fault_decision(Mining_Threat_Retreat_Supervisor.Input_Fault.Clear)
    current_phase = Mining_Threat_Retreat_Supervisor.Operational_Phase.Idle
  }

  def timeTriggered(api: Principal_Decision_Owner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        api,
        current_phase
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_01_INVALID_RETREAT
        //   invalid input with valid retreat availability and mining/defending/retreating entry
        ((api.threat_input.threat_status == Threat_Status.Invalid |
          api.cargo_input.cargo_status == Cargo_Status.Invalid |
          api.capacitor_input.capacitor_status == Capacitor_Status.Invalid |
          api.request_input.request_status == Request_Status.Invalid |
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Invalid |
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Invalid |
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Invalid |
          api.service_progress_input.service_progress_status == Service_Progress_Status.Invalid) &
          (In(current_phase) == Operational_Phase.Mining |
            In(current_phase) == Operational_Phase.Defending |
            In(current_phase) == Operational_Phase.Retreating) &
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
          api.retreat_availability_input.retreat_available == Retreat_Availability.Available) ___>: (api.mining_decision == Mining_Command.Stop &
          api.defense_decision == Defense_Command.Stand_Down &
          api.movement_service_decision == Movement_Service_Command.Retreat &
          api.phase_decision == Operational_Phase.Retreating &
          api.fault_decision == Input_Fault.Asserted &
          current_phase == Operational_Phase.Retreating),
        // case CASE_02_INVALID_HOLD
        //   invalid input otherwise not eligible for valid retreat
        ((api.threat_input.threat_status == Threat_Status.Invalid |
          api.cargo_input.cargo_status == Cargo_Status.Invalid |
          api.capacitor_input.capacitor_status == Capacitor_Status.Invalid |
          api.request_input.request_status == Request_Status.Invalid |
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Invalid |
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Invalid |
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Invalid |
          api.service_progress_input.service_progress_status == Service_Progress_Status.Invalid) &
          !((In(current_phase) == Operational_Phase.Mining |
            In(current_phase) == Operational_Phase.Defending |
            In(current_phase) == Operational_Phase.Retreating) &
            api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
            api.retreat_availability_input.retreat_available == Retreat_Availability.Available)) ___>: (api.mining_decision == Mining_Command.Stop &
          api.defense_decision == Defense_Command.Stand_Down &
          api.movement_service_decision == Movement_Service_Command.Hold &
          api.phase_decision == Operational_Phase.Fault_Hold &
          api.fault_decision == Input_Fault.Asserted &
          current_phase == Operational_Phase.Fault_Hold),
        // case CASE_03_VALID_RETREAT
        //   all valid, service away, retreat available, and a retreat/force condition holds
        (api.threat_input.threat_status == Threat_Status.Valid &
          api.cargo_input.cargo_status == Cargo_Status.Valid &
          api.capacitor_input.capacitor_status == Capacitor_Status.Valid &
          api.request_input.request_status == Request_Status.Valid &
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
          api.service_progress_input.service_progress_status == Service_Progress_Status.Valid &
          api.service_progress_input.service_progress == Service_Progress.Away &
          api.retreat_availability_input.retreat_available == Retreat_Availability.Available &
          (In(current_phase) == Operational_Phase.Retreating |
            In(current_phase) == Operational_Phase.Fault_Hold |
            api.request_input.operator_request == Operator_Request.Retreat |
            api.cargo_input.cargo_band == Cargo_Band.Full |
            api.capacitor_input.capacitor_band == Capacitor_Band.Critical |
            api.threat_input.threat == Threat_Value.Hostile &
              api.defense_availability_input.defense_available == Defense_Availability.Unavailable)) ___>: (api.mining_decision == Mining_Command.Stop &
          api.defense_decision == Defense_Command.Stand_Down &
          api.movement_service_decision == Movement_Service_Command.Retreat &
          api.phase_decision == Operational_Phase.Retreating &
          api.fault_decision == Input_Fault.Clear &
          current_phase == Operational_Phase.Retreating),
        // case CASE_04_VALID_RETREAT_UNAVAILABLE
        //   all valid, service away, retreat unavailable, and a retreat/force condition holds
        (api.threat_input.threat_status == Threat_Status.Valid &
          api.cargo_input.cargo_status == Cargo_Status.Valid &
          api.capacitor_input.capacitor_status == Capacitor_Status.Valid &
          api.request_input.request_status == Request_Status.Valid &
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
          api.service_progress_input.service_progress_status == Service_Progress_Status.Valid &
          api.service_progress_input.service_progress == Service_Progress.Away &
          api.retreat_availability_input.retreat_available == Retreat_Availability.Unavailable &
          (In(current_phase) == Operational_Phase.Retreating |
            In(current_phase) == Operational_Phase.Fault_Hold |
            api.request_input.operator_request == Operator_Request.Retreat |
            api.cargo_input.cargo_band == Cargo_Band.Full |
            api.capacitor_input.capacitor_band == Capacitor_Band.Critical |
            api.threat_input.threat == Threat_Value.Hostile &
              api.defense_availability_input.defense_available == Defense_Availability.Unavailable)) ___>: (api.mining_decision == Mining_Command.Stop &
          api.defense_decision == Defense_Command.Stand_Down &
          api.movement_service_decision == Movement_Service_Command.Hold &
          api.phase_decision == Operational_Phase.Fault_Hold &
          api.fault_decision == Input_Fault.Clear &
          current_phase == Operational_Phase.Fault_Hold),
        // case CASE_05_DOCK
        //   all valid, service at station, and entry retreating or fault hold
        (api.threat_input.threat_status == Threat_Status.Valid &
          api.cargo_input.cargo_status == Cargo_Status.Valid &
          api.capacitor_input.capacitor_status == Capacitor_Status.Valid &
          api.request_input.request_status == Request_Status.Valid &
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
          api.service_progress_input.service_progress_status == Service_Progress_Status.Valid &
          api.service_progress_input.service_progress == Service_Progress.At_Station &
          (In(current_phase) == Operational_Phase.Retreating |
            In(current_phase) == Operational_Phase.Fault_Hold)) ___>: (api.mining_decision == Mining_Command.Stop &
          api.defense_decision == Defense_Command.Stand_Down &
          api.movement_service_decision == Movement_Service_Command.Dock &
          api.phase_decision == Operational_Phase.Retreating &
          api.fault_decision == Input_Fault.Clear &
          current_phase == Operational_Phase.Retreating),
        // case CASE_06_OFFLOAD
        //   all valid, service docked loaded, and entry retreating/servicing/fault hold
        (api.threat_input.threat_status == Threat_Status.Valid &
          api.cargo_input.cargo_status == Cargo_Status.Valid &
          api.capacitor_input.capacitor_status == Capacitor_Status.Valid &
          api.request_input.request_status == Request_Status.Valid &
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
          api.service_progress_input.service_progress_status == Service_Progress_Status.Valid &
          api.service_progress_input.service_progress == Service_Progress.Docked_Loaded &
          (In(current_phase) == Operational_Phase.Retreating |
            In(current_phase) == Operational_Phase.Servicing |
            In(current_phase) == Operational_Phase.Fault_Hold)) ___>: (api.mining_decision == Mining_Command.Stop &
          api.defense_decision == Defense_Command.Stand_Down &
          api.movement_service_decision == Movement_Service_Command.Offload &
          api.phase_decision == Operational_Phase.Servicing &
          api.fault_decision == Input_Fault.Clear &
          current_phase == Operational_Phase.Servicing),
        // case CASE_07_RESUPPLY
        //   all valid, service offload confirmed, and entry servicing or fault hold
        (api.threat_input.threat_status == Threat_Status.Valid &
          api.cargo_input.cargo_status == Cargo_Status.Valid &
          api.capacitor_input.capacitor_status == Capacitor_Status.Valid &
          api.request_input.request_status == Request_Status.Valid &
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
          api.service_progress_input.service_progress_status == Service_Progress_Status.Valid &
          api.service_progress_input.service_progress == Service_Progress.Offload_Confirmed &
          (In(current_phase) == Operational_Phase.Servicing |
            In(current_phase) == Operational_Phase.Fault_Hold)) ___>: (api.mining_decision == Mining_Command.Stop &
          api.defense_decision == Defense_Command.Stand_Down &
          api.movement_service_decision == Movement_Service_Command.Resupply &
          api.phase_decision == Operational_Phase.Servicing &
          api.fault_decision == Input_Fault.Clear &
          current_phase == Operational_Phase.Servicing),
        // case CASE_08_ACKNOWLEDGE_READY
        //   all valid, service resupply confirmed, and entry servicing or fault hold
        (api.threat_input.threat_status == Threat_Status.Valid &
          api.cargo_input.cargo_status == Cargo_Status.Valid &
          api.capacitor_input.capacitor_status == Capacitor_Status.Valid &
          api.request_input.request_status == Request_Status.Valid &
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
          api.service_progress_input.service_progress_status == Service_Progress_Status.Valid &
          api.service_progress_input.service_progress == Service_Progress.Resupply_Confirmed &
          (In(current_phase) == Operational_Phase.Servicing |
            In(current_phase) == Operational_Phase.Fault_Hold)) ___>: (api.mining_decision == Mining_Command.Stop &
          api.defense_decision == Defense_Command.Stand_Down &
          api.movement_service_decision == Movement_Service_Command.Acknowledge_Ready &
          api.phase_decision == Operational_Phase.Idle &
          api.fault_decision == Input_Fault.Clear &
          current_phase == Operational_Phase.Idle),
        // case CASE_09_HOSTILE_DEFENSE
        //   all valid, entry idle/mining/defending, service away, hostile, non-retreat, non-full, non-critical, defense available
        (api.threat_input.threat_status == Threat_Status.Valid &
          api.cargo_input.cargo_status == Cargo_Status.Valid &
          api.capacitor_input.capacitor_status == Capacitor_Status.Valid &
          api.request_input.request_status == Request_Status.Valid &
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
          api.service_progress_input.service_progress_status == Service_Progress_Status.Valid &
          (In(current_phase) == Operational_Phase.Idle |
            In(current_phase) == Operational_Phase.Mining |
            In(current_phase) == Operational_Phase.Defending) &
          api.service_progress_input.service_progress == Service_Progress.Away &
          api.threat_input.threat == Threat_Value.Hostile &
          api.request_input.operator_request != Operator_Request.Retreat &
          api.cargo_input.cargo_band != Cargo_Band.Full &
          api.capacitor_input.capacitor_band != Capacitor_Band.Critical &
          api.defense_availability_input.defense_available == Defense_Availability.Available) ___>: (api.mining_decision == Mining_Command.Stop &
          api.defense_decision == Defense_Command.Engage &
          api.movement_service_decision == Movement_Service_Command.Hold &
          api.phase_decision == Operational_Phase.Defending &
          api.fault_decision == Input_Fault.Clear &
          current_phase == Operational_Phase.Defending),
        // case CASE_10_MINING
        //   all valid, entry idle/mining/defending, service away, clear, mine, partial, non-critical-cap, mining available
        (api.threat_input.threat_status == Threat_Status.Valid &
          api.cargo_input.cargo_status == Cargo_Status.Valid &
          api.capacitor_input.capacitor_status == Capacitor_Status.Valid &
          api.request_input.request_status == Request_Status.Valid &
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
          api.service_progress_input.service_progress_status == Service_Progress_Status.Valid &
          (In(current_phase) == Operational_Phase.Idle |
            In(current_phase) == Operational_Phase.Mining |
            In(current_phase) == Operational_Phase.Defending) &
          api.service_progress_input.service_progress == Service_Progress.Away &
          api.threat_input.threat == Threat_Value.Clear &
          api.request_input.operator_request == Operator_Request.Mine &
          api.cargo_input.cargo_band == Cargo_Band.Partial &
          (api.capacitor_input.capacitor_band == Capacitor_Band.Reserve |
            api.capacitor_input.capacitor_band == Capacitor_Band.Ready) &
          api.mining_availability_input.mining_available == Mining_Availability.Available) ___>: (api.mining_decision == Mining_Command.Mine &
          api.defense_decision == Defense_Command.Stand_Down &
          api.movement_service_decision == Movement_Service_Command.Hold &
          api.phase_decision == Operational_Phase.Mining &
          api.fault_decision == Input_Fault.Clear &
          current_phase == Operational_Phase.Mining),
        // case CASE_11_VALID_IDLE_INHIBITION
        //   all valid, entry idle/mining/defending, service away, and no retreat/force condition
        (api.threat_input.threat_status == Threat_Status.Valid &
          api.cargo_input.cargo_status == Cargo_Status.Valid &
          api.capacitor_input.capacitor_status == Capacitor_Status.Valid &
          api.request_input.request_status == Request_Status.Valid &
          api.mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
          api.defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
          api.retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
          api.service_progress_input.service_progress_status == Service_Progress_Status.Valid &
          (In(current_phase) == Operational_Phase.Idle |
            In(current_phase) == Operational_Phase.Mining |
            In(current_phase) == Operational_Phase.Defending) &
          api.service_progress_input.service_progress == Service_Progress.Away &
          !(api.request_input.operator_request == Operator_Request.Retreat |
            api.cargo_input.cargo_band == Cargo_Band.Full |
            api.capacitor_input.capacitor_band == Capacitor_Band.Critical |
            api.threat_input.threat == Threat_Value.Hostile &
              api.defense_availability_input.defense_available == Defense_Availability.Unavailable) &
          api.threat_input.threat != Threat_Value.Hostile &
          !(api.threat_input.threat == Threat_Value.Clear &
            api.request_input.operator_request == Operator_Request.Mine &
            api.cargo_input.cargo_band == Cargo_Band.Partial &
            (api.capacitor_input.capacitor_band == Capacitor_Band.Reserve |
              api.capacitor_input.capacitor_band == Capacitor_Band.Ready) &
            api.mining_availability_input.mining_available == Mining_Availability.Available)) ___>: (api.mining_decision == Mining_Command.Stop &
          api.defense_decision == Defense_Command.Stand_Down &
          api.movement_service_decision == Movement_Service_Command.Hold &
          api.phase_decision == Operational_Phase.Idle &
          api.fault_decision == Input_Fault.Clear &
          current_phase == Operational_Phase.Idle)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val threat_input: Mining_Threat_Retreat_Supervisor.Threat_Observation = api.get_threat_input().get
    api.logInfo(s"Received on data port threat_input: ${threat_input}")
    val cargo_input: Mining_Threat_Retreat_Supervisor.Cargo_Observation = api.get_cargo_input().get
    api.logInfo(s"Received on data port cargo_input: ${cargo_input}")
    val capacitor_input: Mining_Threat_Retreat_Supervisor.Capacitor_Observation = api.get_capacitor_input().get
    api.logInfo(s"Received on data port capacitor_input: ${capacitor_input}")
    val request_input: Mining_Threat_Retreat_Supervisor.Request_Observation = api.get_request_input().get
    api.logInfo(s"Received on data port request_input: ${request_input}")
    val mining_availability_input: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation = api.get_mining_availability_input().get
    api.logInfo(s"Received on data port mining_availability_input: ${mining_availability_input}")
    val defense_availability_input: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation = api.get_defense_availability_input().get
    api.logInfo(s"Received on data port defense_availability_input: ${defense_availability_input}")
    val retreat_availability_input: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation = api.get_retreat_availability_input().get
    api.logInfo(s"Received on data port retreat_availability_input: ${retreat_availability_input}")
    val service_progress_input: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation = api.get_service_progress_input().get
    api.logInfo(s"Received on data port service_progress_input: ${service_progress_input}")

    val invalidInput: B =
      threat_input.threat_status == Threat_Status.Invalid |
        cargo_input.cargo_status == Cargo_Status.Invalid |
        capacitor_input.capacitor_status == Capacitor_Status.Invalid |
        request_input.request_status == Request_Status.Invalid |
        mining_availability_input.mining_availability_status == Mining_Availability_Status.Invalid |
        defense_availability_input.defense_availability_status == Defense_Availability_Status.Invalid |
        retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Invalid |
        service_progress_input.service_progress_status == Service_Progress_Status.Invalid

    val allValid: B =
      threat_input.threat_status == Threat_Status.Valid &
        cargo_input.cargo_status == Cargo_Status.Valid &
        capacitor_input.capacitor_status == Capacitor_Status.Valid &
        request_input.request_status == Request_Status.Valid &
        mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
        defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
        retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
        service_progress_input.service_progress_status == Service_Progress_Status.Valid

    val inMiningDefendingRetreating: B =
      current_phase == Operational_Phase.Mining |
        current_phase == Operational_Phase.Defending |
        current_phase == Operational_Phase.Retreating

    val inIdleMiningDefending: B =
      current_phase == Operational_Phase.Idle |
        current_phase == Operational_Phase.Mining |
        current_phase == Operational_Phase.Defending

    val retreatForceCondition: B =
      current_phase == Operational_Phase.Retreating |
        current_phase == Operational_Phase.Fault_Hold |
        request_input.operator_request == Operator_Request.Retreat |
        cargo_input.cargo_band == Cargo_Band.Full |
        capacitor_input.capacitor_band == Capacitor_Band.Critical |
        (threat_input.threat == Threat_Value.Hostile &
          defense_availability_input.defense_available == Defense_Availability.Unavailable)

    val entryRetreatingOrFaultHold: B =
      current_phase == Operational_Phase.Retreating |
        current_phase == Operational_Phase.Fault_Hold

    val entryServicingOrFaultHold: B =
      current_phase == Operational_Phase.Servicing |
        current_phase == Operational_Phase.Fault_Hold

    val entryRetreatingServicingFaultHold: B =
      current_phase == Operational_Phase.Retreating |
        current_phase == Operational_Phase.Servicing |
        current_phase == Operational_Phase.Fault_Hold

    val retreatEligible: B =
      (inMiningDefendingRetreating) &
        retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
        retreat_availability_input.retreat_available == Retreat_Availability.Available

    val case01: B = invalidInput & retreatEligible
    val case02: B = invalidInput & !retreatEligible

    val case03: B = allValid &
      service_progress_input.service_progress == Service_Progress.Away &
      retreat_availability_input.retreat_available == Retreat_Availability.Available &
      retreatForceCondition
    val case04: B = allValid &
      service_progress_input.service_progress == Service_Progress.Away &
      retreat_availability_input.retreat_available == Retreat_Availability.Unavailable &
      retreatForceCondition
    val case05: B = allValid &
      service_progress_input.service_progress == Service_Progress.At_Station &
      entryRetreatingOrFaultHold
    val case06: B = allValid &
      service_progress_input.service_progress == Service_Progress.Docked_Loaded &
      entryRetreatingServicingFaultHold
    val case07: B = allValid &
      service_progress_input.service_progress == Service_Progress.Offload_Confirmed &
      entryServicingOrFaultHold
    val case08: B = allValid &
      service_progress_input.service_progress == Service_Progress.Resupply_Confirmed &
      entryServicingOrFaultHold
    val case09: B = allValid &
      inIdleMiningDefending &
      service_progress_input.service_progress == Service_Progress.Away &
      threat_input.threat == Threat_Value.Hostile &
      request_input.operator_request != Operator_Request.Retreat &
      cargo_input.cargo_band != Cargo_Band.Full &
      capacitor_input.capacitor_band != Capacitor_Band.Critical &
      defense_availability_input.defense_available == Defense_Availability.Available
    val case10: B = allValid &
      inIdleMiningDefending &
      service_progress_input.service_progress == Service_Progress.Away &
      threat_input.threat == Threat_Value.Clear &
      request_input.operator_request == Operator_Request.Mine &
      cargo_input.cargo_band == Cargo_Band.Partial &
      (capacitor_input.capacitor_band == Capacitor_Band.Reserve |
        capacitor_input.capacitor_band == Capacitor_Band.Ready) &
      mining_availability_input.mining_available == Mining_Availability.Available

    val miningForceCondition: B =
      threat_input.threat == Threat_Value.Clear &
        request_input.operator_request == Operator_Request.Mine &
        cargo_input.cargo_band == Cargo_Band.Partial &
        (capacitor_input.capacitor_band == Capacitor_Band.Reserve |
          capacitor_input.capacitor_band == Capacitor_Band.Ready) &
        mining_availability_input.mining_available == Mining_Availability.Available

    val case11RetreatForce: B =
      request_input.operator_request == Operator_Request.Retreat |
        cargo_input.cargo_band == Cargo_Band.Full |
        capacitor_input.capacitor_band == Capacitor_Band.Critical |
        (threat_input.threat == Threat_Value.Hostile &
          defense_availability_input.defense_available == Defense_Availability.Unavailable)

    val case11: B = allValid &
      inIdleMiningDefending &
      service_progress_input.service_progress == Service_Progress.Away &
      !case11RetreatForce &
      threat_input.threat != Threat_Value.Hostile &
      !miningForceCondition

    if (case01) {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Retreat)
      api.put_phase_decision(Operational_Phase.Retreating)
      api.put_fault_decision(Input_Fault.Asserted)
      current_phase = Operational_Phase.Retreating
    } else if (case02) {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Hold)
      api.put_phase_decision(Operational_Phase.Fault_Hold)
      api.put_fault_decision(Input_Fault.Asserted)
      current_phase = Operational_Phase.Fault_Hold
    } else if (case03) {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Retreat)
      api.put_phase_decision(Operational_Phase.Retreating)
      api.put_fault_decision(Input_Fault.Clear)
      current_phase = Operational_Phase.Retreating
    } else if (case04) {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Hold)
      api.put_phase_decision(Operational_Phase.Fault_Hold)
      api.put_fault_decision(Input_Fault.Clear)
      current_phase = Operational_Phase.Fault_Hold
    } else if (case05) {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Dock)
      api.put_phase_decision(Operational_Phase.Retreating)
      api.put_fault_decision(Input_Fault.Clear)
      current_phase = Operational_Phase.Retreating
    } else if (case06) {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Offload)
      api.put_phase_decision(Operational_Phase.Servicing)
      api.put_fault_decision(Input_Fault.Clear)
      current_phase = Operational_Phase.Servicing
    } else if (case07) {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Resupply)
      api.put_phase_decision(Operational_Phase.Servicing)
      api.put_fault_decision(Input_Fault.Clear)
      current_phase = Operational_Phase.Servicing
    } else if (case08) {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Acknowledge_Ready)
      api.put_phase_decision(Operational_Phase.Idle)
      api.put_fault_decision(Input_Fault.Clear)
      current_phase = Operational_Phase.Idle
    } else if (case09) {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Engage)
      api.put_movement_service_decision(Movement_Service_Command.Hold)
      api.put_phase_decision(Operational_Phase.Defending)
      api.put_fault_decision(Input_Fault.Clear)
      current_phase = Operational_Phase.Defending
    } else if (case10) {
      api.put_mining_decision(Mining_Command.Mine)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Hold)
      api.put_phase_decision(Operational_Phase.Mining)
      api.put_fault_decision(Input_Fault.Clear)
      current_phase = Operational_Phase.Mining
    } else if (case11) {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Hold)
      api.put_phase_decision(Operational_Phase.Idle)
      api.put_fault_decision(Input_Fault.Clear)
      current_phase = Operational_Phase.Idle
    } else {
      api.put_mining_decision(Mining_Command.Stop)
      api.put_defense_decision(Defense_Command.Stand_Down)
      api.put_movement_service_decision(Movement_Service_Command.Hold)
      api.put_phase_decision(Operational_Phase.Idle)
      api.put_fault_decision(Input_Fault.Clear)
      current_phase = Operational_Phase.Idle
    }
  }

  def finalise(api: Principal_Decision_Owner_Operational_Api): Unit = { }
}
