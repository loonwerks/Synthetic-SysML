package Mining_Threat_Retreat_Supervisor {

  private import HAMR::*;

  // @trace MON-01
  enum def Threat_Value {
    enum Clear;
    enum Suspect;
    enum Hostile;
  }

  // @trace MON-02
  enum def Cargo_Band {
    enum Partial;
    enum Near_Full;
    enum Full;
  }

  // @trace MON-03
  enum def Capacitor_Band {
    enum Critical;
    enum Reserve;
    enum Ready;
  }

  // @trace MON-04
  enum def Operator_Request {
    enum Idle;
    enum Mine;
    enum Retreat;
  }

  // @trace MON-05
  enum def Mining_Availability {
    enum Available;
    enum Unavailable;
  }

  // @trace MON-06
  enum def Defense_Availability {
    enum Available;
    enum Unavailable;
  }

  // @trace MON-07
  enum def Retreat_Availability {
    enum Available;
    enum Unavailable;
  }

  // @trace MON-08
  enum def Service_Progress {
    enum Away;
    enum At_Station;
    enum Docked_Loaded;
    enum Offload_Confirmed;
    enum Resupply_Confirmed;
  }

  // @trace MON-01
  enum def Threat_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-02
  enum def Cargo_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-03
  enum def Capacitor_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-04
  enum def Request_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-05
  enum def Mining_Availability_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-06
  enum def Defense_Availability_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-07
  enum def Retreat_Availability_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-08
  enum def Service_Progress_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace CTRL-01
  enum def Mining_Command {
    enum Stop;
    enum Mine;
  }

  // @trace CTRL-02
  enum def Defense_Command {
    enum Stand_Down;
    enum Engage;
  }

  // @trace CTRL-03
  enum def Movement_Service_Command {
    enum Hold;
    enum Retreat;
    enum Dock;
    enum Offload;
    enum Resupply;
    enum Acknowledge_Ready;
  }

  // @trace CTRL-04 MODE-01 MODE-02 MODE-03 MODE-04 MODE-05 MODE-06
  enum def Operational_Phase {
    enum Idle;
    enum Mining;
    enum Defending;
    enum Retreating;
    enum Servicing;
    enum Fault_Hold;
  }

  // @trace CTRL-05 DEF-01
  enum def Input_Fault {
    enum Clear;
    enum Asserted;
  }

  // @trace MON-01 INT-01 ASM-01
  part def Threat_Observation :> Data {
    // @trace MON-01
    attribute threat : Threat_Value;
    // @trace MON-01
    attribute threat_status : Threat_Status;
  }

  // @trace MON-02 INT-02 ASM-01
  part def Cargo_Observation :> Data {
    // @trace MON-02
    attribute cargo_band : Cargo_Band;
    // @trace MON-02
    attribute cargo_status : Cargo_Status;
  }

  // @trace MON-03 INT-03 ASM-01
  part def Capacitor_Observation :> Data {
    // @trace MON-03
    attribute capacitor_band : Capacitor_Band;
    // @trace MON-03
    attribute capacitor_status : Capacitor_Status;
  }

  // @trace MON-04 INT-04 ASM-01
  part def Request_Observation :> Data {
    // @trace MON-04
    attribute operator_request : Operator_Request;
    // @trace MON-04
    attribute request_status : Request_Status;
  }

  // @trace MON-05 INT-05 ASM-01
  part def Mining_Availability_Observation :> Data {
    // @trace MON-05
    attribute mining_available : Mining_Availability;
    // @trace MON-05
    attribute mining_availability_status : Mining_Availability_Status;
  }

  // @trace MON-06 INT-06 ASM-01
  part def Defense_Availability_Observation :> Data {
    // @trace MON-06
    attribute defense_available : Defense_Availability;
    // @trace MON-06
    attribute defense_availability_status : Defense_Availability_Status;
  }

  // @trace MON-07 INT-07 ASM-01
  part def Retreat_Availability_Observation :> Data {
    // @trace MON-07
    attribute retreat_available : Retreat_Availability;
    // @trace MON-07
    attribute retreat_availability_status : Retreat_Availability_Status;
  }

  // @trace MON-08 INT-08 ASM-01
  part def Service_Progress_Observation :> Data {
    // @trace MON-08
    attribute service_progress : Service_Progress;
    // @trace MON-08
    attribute service_progress_status : Service_Progress_Status;
  }

  // @trace PART-02 CONTRACT-LOCAL-01
  part def Threat_Qualification :> Thread {
    // @trace INT-01 MON-01
    port raw_threat : DataPort { in :>> type : Threat_Observation; }
    // @trace INT-01 MON-01
    port qualified_threat : DataPort { out :>> type : Threat_Observation; }

    language "GUMBO" /*{
      compute
        // @trace CONTRACT-LOCAL-01 CONTRACT-LOCAL-04 PART-02 INT-01 MON-01
        guarantee PRESERVE_THREAT "Threat qualification preserves the value and independent status exactly":
          qualified_threat == raw_threat;
    }*/
  }

  // @trace PART-03 CONTRACT-LOCAL-01
  part def Resource_Qualification :> Thread {
    // @trace INT-02 MON-02
    port raw_cargo : DataPort { in :>> type : Cargo_Observation; }
    // @trace INT-02 MON-02
    port qualified_cargo : DataPort { out :>> type : Cargo_Observation; }
    // @trace INT-03 MON-03
    port raw_capacitor : DataPort { in :>> type : Capacitor_Observation; }
    // @trace INT-03 MON-03
    port qualified_capacitor : DataPort { out :>> type : Capacitor_Observation; }

    language "GUMBO" /*{
      compute
        // @trace CONTRACT-LOCAL-01 CONTRACT-LOCAL-04 PART-03 INT-02 INT-03 MON-02 MON-03
        guarantee PRESERVE_RESOURCES "Resource qualification preserves both value and independent status pairs exactly":
          qualified_cargo == raw_cargo &
          qualified_capacitor == raw_capacitor;
    }*/
  }

  // @trace PART-04 CONTRACT-LOCAL-01
  part def Request_Availability_Qualification :> Thread {
    // @trace INT-04 MON-04
    port raw_request : DataPort { in :>> type : Request_Observation; }
    // @trace INT-04 MON-04
    port qualified_request : DataPort { out :>> type : Request_Observation; }
    // @trace INT-05 MON-05
    port raw_mining_availability : DataPort { in :>> type : Mining_Availability_Observation; }
    // @trace INT-05 MON-05
    port qualified_mining_availability : DataPort { out :>> type : Mining_Availability_Observation; }
    // @trace INT-06 MON-06
    port raw_defense_availability : DataPort { in :>> type : Defense_Availability_Observation; }
    // @trace INT-06 MON-06
    port qualified_defense_availability : DataPort { out :>> type : Defense_Availability_Observation; }
    // @trace INT-07 MON-07
    port raw_retreat_availability : DataPort { in :>> type : Retreat_Availability_Observation; }
    // @trace INT-07 MON-07
    port qualified_retreat_availability : DataPort { out :>> type : Retreat_Availability_Observation; }

    language "GUMBO" /*{
      compute
        // @trace CONTRACT-LOCAL-01 CONTRACT-LOCAL-04 PART-04 INT-04 INT-05 INT-06 INT-07 MON-04 MON-05 MON-06 MON-07
        guarantee PRESERVE_REQUEST_AND_AVAILABILITY "Request and availability qualification preserves all four value/status pairs exactly":
          qualified_request == raw_request &
          qualified_mining_availability == raw_mining_availability &
          qualified_defense_availability == raw_defense_availability &
          qualified_retreat_availability == raw_retreat_availability;
    }*/
  }

  // @trace PART-01 GOAL-01 GOAL-02 GOAL-03 GOAL-04 CONTRACT-LOCAL-03
  part def Principal_Decision_Owner :> Thread {
    // @trace INT-01 MON-01
    port threat_input : DataPort { in :>> type : Threat_Observation; }
    // @trace INT-02 MON-02
    port cargo_input : DataPort { in :>> type : Cargo_Observation; }
    // @trace INT-03 MON-03
    port capacitor_input : DataPort { in :>> type : Capacitor_Observation; }
    // @trace INT-04 MON-04
    port request_input : DataPort { in :>> type : Request_Observation; }
    // @trace INT-05 MON-05
    port mining_availability_input : DataPort { in :>> type : Mining_Availability_Observation; }
    // @trace INT-06 MON-06
    port defense_availability_input : DataPort { in :>> type : Defense_Availability_Observation; }
    // @trace INT-07 MON-07
    port retreat_availability_input : DataPort { in :>> type : Retreat_Availability_Observation; }
    // @trace INT-08 MON-08
    port service_progress_input : DataPort { in :>> type : Service_Progress_Observation; }
    // @trace INT-09 CTRL-01
    port mining_decision : DataPort { out :>> type : Mining_Command; }
    // @trace INT-10 CTRL-02
    port defense_decision : DataPort { out :>> type : Defense_Command; }
    // @trace INT-11 CTRL-03
    port movement_service_decision : DataPort { out :>> type : Movement_Service_Command; }
    // @trace INT-12 CTRL-04
    port phase_decision : DataPort { out :>> type : Operational_Phase; }
    // @trace INT-13 CTRL-05
    port fault_decision : DataPort { out :>> type : Input_Fault; }

    language "GUMBO" /*{
      // @trace CONTRACT-LOCAL-03 PART-01 CONS-01 DEF-02
      state
        current_phase: Operational_Phase;

      initialize
        // @trace CONTRACT-LOCAL-03 CONS-01 MODE-01
        guarantee INITIAL_PHASE_IDLE "The principal owner initializes its sole phase state explicitly to Idle":
          current_phase == Operational_Phase.Idle;

      compute
        // @trace PARTITION-01 CONTRACT-LOCAL-04
        compute_cases
          // @trace FAULT-01 CASE-01 DEF-01 DEF-04 RISK-01 TRANS-03
          case CASE_01_INVALID_RETREAT "Invalid input in an active or retreating phase uses valid available retreat and asserts the input fault":
            assume
              (threat_input.threat_status == Threat_Status.Invalid |
               cargo_input.cargo_status == Cargo_Status.Invalid |
               capacitor_input.capacitor_status == Capacitor_Status.Invalid |
               request_input.request_status == Request_Status.Invalid |
               mining_availability_input.mining_availability_status == Mining_Availability_Status.Invalid |
               defense_availability_input.defense_availability_status == Defense_Availability_Status.Invalid |
               retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Invalid |
               service_progress_input.service_progress_status == Service_Progress_Status.Invalid) &
              (In(current_phase) == Operational_Phase.Mining |
               In(current_phase) == Operational_Phase.Defending |
               In(current_phase) == Operational_Phase.Retreating) &
              retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
              retreat_availability_input.retreat_available == Retreat_Availability.Available;
            guarantee
              mining_decision == Mining_Command.Stop &
              defense_decision == Defense_Command.Stand_Down &
              movement_service_decision == Movement_Service_Command.Retreat &
              phase_decision == Operational_Phase.Retreating &
              fault_decision == Input_Fault.Asserted &
              current_phase == Operational_Phase.Retreating;

          // @trace FAULT-02 CASE-02 DEF-01 DEF-04 RISK-01 TRANS-04
          case CASE_02_INVALID_HOLD "Every other invalid snapshot holds in Fault_Hold and asserts the input fault":
            assume
              (threat_input.threat_status == Threat_Status.Invalid |
               cargo_input.cargo_status == Cargo_Status.Invalid |
               capacitor_input.capacitor_status == Capacitor_Status.Invalid |
               request_input.request_status == Request_Status.Invalid |
               mining_availability_input.mining_availability_status == Mining_Availability_Status.Invalid |
               defense_availability_input.defense_availability_status == Defense_Availability_Status.Invalid |
               retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Invalid |
               service_progress_input.service_progress_status == Service_Progress_Status.Invalid) &
              not (
                (In(current_phase) == Operational_Phase.Mining |
                 In(current_phase) == Operational_Phase.Defending |
                 In(current_phase) == Operational_Phase.Retreating) &
                retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
                retreat_availability_input.retreat_available == Retreat_Availability.Available
              );
            guarantee
              mining_decision == Mining_Command.Stop &
              defense_decision == Defense_Command.Stand_Down &
              movement_service_decision == Movement_Service_Command.Hold &
              phase_decision == Operational_Phase.Fault_Hold &
              fault_decision == Input_Fault.Asserted &
              current_phase == Operational_Phase.Fault_Hold;

          // @trace BEH-01 CASE-03 CONS-04 DEF-03 DEF-04 TRANS-03 TRANS-04
          case CASE_03_VALID_RETREAT "Valid away retreat persistence, recovery, or a new trigger commands available retreat":
            assume
              threat_input.threat_status == Threat_Status.Valid &
              cargo_input.cargo_status == Cargo_Status.Valid &
              capacitor_input.capacitor_status == Capacitor_Status.Valid &
              request_input.request_status == Request_Status.Valid &
              mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
              defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
              retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
              service_progress_input.service_progress_status == Service_Progress_Status.Valid &
              service_progress_input.service_progress == Service_Progress.Away &
              retreat_availability_input.retreat_available == Retreat_Availability.Available &
              (In(current_phase) == Operational_Phase.Retreating |
               In(current_phase) == Operational_Phase.Fault_Hold |
               request_input.operator_request == Operator_Request.Retreat |
               cargo_input.cargo_band == Cargo_Band.Full |
               capacitor_input.capacitor_band == Capacitor_Band.Critical |
               (threat_input.threat == Threat_Value.Hostile &
                defense_availability_input.defense_available == Defense_Availability.Unavailable));
            guarantee
              mining_decision == Mining_Command.Stop &
              defense_decision == Defense_Command.Stand_Down &
              movement_service_decision == Movement_Service_Command.Retreat &
              phase_decision == Operational_Phase.Retreating &
              fault_decision == Input_Fault.Clear &
              current_phase == Operational_Phase.Retreating;

          // @trace FAULT-03 CASE-04 CONS-04 DEF-03 DEF-04 RISK-02 TRANS-04
          case CASE_04_VALID_RETREAT_UNAVAILABLE "Valid away retreat persistence, recovery, or a new trigger holds when retreat is unavailable":
            assume
              threat_input.threat_status == Threat_Status.Valid &
              cargo_input.cargo_status == Cargo_Status.Valid &
              capacitor_input.capacitor_status == Capacitor_Status.Valid &
              request_input.request_status == Request_Status.Valid &
              mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
              defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
              retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
              service_progress_input.service_progress_status == Service_Progress_Status.Valid &
              service_progress_input.service_progress == Service_Progress.Away &
              retreat_availability_input.retreat_available == Retreat_Availability.Unavailable &
              (In(current_phase) == Operational_Phase.Retreating |
               In(current_phase) == Operational_Phase.Fault_Hold |
               request_input.operator_request == Operator_Request.Retreat |
               cargo_input.cargo_band == Cargo_Band.Full |
               capacitor_input.capacitor_band == Capacitor_Band.Critical |
               (threat_input.threat == Threat_Value.Hostile &
                defense_availability_input.defense_available == Defense_Availability.Unavailable));
            guarantee
              mining_decision == Mining_Command.Stop &
              defense_decision == Defense_Command.Stand_Down &
              movement_service_decision == Movement_Service_Command.Hold &
              phase_decision == Operational_Phase.Fault_Hold &
              fault_decision == Input_Fault.Clear &
              current_phase == Operational_Phase.Fault_Hold;

          // @trace BEH-02 CASE-05 DEF-04 MODE-04 TRANS-03
          case CASE_05_DOCK "Valid retreat or recovery at station commands docking and remains Retreating":
            assume
              threat_input.threat_status == Threat_Status.Valid &
              cargo_input.cargo_status == Cargo_Status.Valid &
              capacitor_input.capacitor_status == Capacitor_Status.Valid &
              request_input.request_status == Request_Status.Valid &
              mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
              defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
              retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
              service_progress_input.service_progress_status == Service_Progress_Status.Valid &
              service_progress_input.service_progress == Service_Progress.At_Station &
              (In(current_phase) == Operational_Phase.Retreating |
               In(current_phase) == Operational_Phase.Fault_Hold);
            guarantee
              mining_decision == Mining_Command.Stop &
              defense_decision == Defense_Command.Stand_Down &
              movement_service_decision == Movement_Service_Command.Dock &
              phase_decision == Operational_Phase.Retreating &
              fault_decision == Input_Fault.Clear &
              current_phase == Operational_Phase.Retreating;

          // @trace BEH-03 CASE-06 DEF-04 MODE-05 TRANS-03 TRANS-05
          case CASE_06_OFFLOAD "Valid docked loaded retreat, service, or recovery commands offload and enters Servicing":
            assume
              threat_input.threat_status == Threat_Status.Valid &
              cargo_input.cargo_status == Cargo_Status.Valid &
              capacitor_input.capacitor_status == Capacitor_Status.Valid &
              request_input.request_status == Request_Status.Valid &
              mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
              defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
              retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
              service_progress_input.service_progress_status == Service_Progress_Status.Valid &
              service_progress_input.service_progress == Service_Progress.Docked_Loaded &
              (In(current_phase) == Operational_Phase.Retreating |
               In(current_phase) == Operational_Phase.Servicing |
               In(current_phase) == Operational_Phase.Fault_Hold);
            guarantee
              mining_decision == Mining_Command.Stop &
              defense_decision == Defense_Command.Stand_Down &
              movement_service_decision == Movement_Service_Command.Offload &
              phase_decision == Operational_Phase.Servicing &
              fault_decision == Input_Fault.Clear &
              current_phase == Operational_Phase.Servicing;

          // @trace BEH-04 CASE-07 DEF-04 MODE-05 TRANS-05
          case CASE_07_RESUPPLY "Valid confirmed offload during service or recovery commands resupply and remains Servicing":
            assume
              threat_input.threat_status == Threat_Status.Valid &
              cargo_input.cargo_status == Cargo_Status.Valid &
              capacitor_input.capacitor_status == Capacitor_Status.Valid &
              request_input.request_status == Request_Status.Valid &
              mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
              defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
              retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
              service_progress_input.service_progress_status == Service_Progress_Status.Valid &
              service_progress_input.service_progress == Service_Progress.Offload_Confirmed &
              (In(current_phase) == Operational_Phase.Servicing |
               In(current_phase) == Operational_Phase.Fault_Hold);
            guarantee
              mining_decision == Mining_Command.Stop &
              defense_decision == Defense_Command.Stand_Down &
              movement_service_decision == Movement_Service_Command.Resupply &
              phase_decision == Operational_Phase.Servicing &
              fault_decision == Input_Fault.Clear &
              current_phase == Operational_Phase.Servicing;

          // @trace BEH-05 CASE-08 DEF-04 MODE-01 TRANS-05
          case CASE_08_ACKNOWLEDGE_READY "Valid confirmed resupply during service or recovery acknowledges readiness and returns to Idle":
            assume
              threat_input.threat_status == Threat_Status.Valid &
              cargo_input.cargo_status == Cargo_Status.Valid &
              capacitor_input.capacitor_status == Capacitor_Status.Valid &
              request_input.request_status == Request_Status.Valid &
              mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
              defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
              retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
              service_progress_input.service_progress_status == Service_Progress_Status.Valid &
              service_progress_input.service_progress == Service_Progress.Resupply_Confirmed &
              (In(current_phase) == Operational_Phase.Servicing |
               In(current_phase) == Operational_Phase.Fault_Hold);
            guarantee
              mining_decision == Mining_Command.Stop &
              defense_decision == Defense_Command.Stand_Down &
              movement_service_decision == Movement_Service_Command.Acknowledge_Ready &
              phase_decision == Operational_Phase.Idle &
              fault_decision == Input_Fault.Clear &
              current_phase == Operational_Phase.Idle;

          // @trace BEH-06 CASE-09 CONS-02 CONS-04 DEF-04 MODE-03 TRANS-02
          case CASE_09_HOSTILE_DEFENSE "A valid operational hostile snapshot with every retreat trigger excluded engages available defense":
            assume
              threat_input.threat_status == Threat_Status.Valid &
              cargo_input.cargo_status == Cargo_Status.Valid &
              capacitor_input.capacitor_status == Capacitor_Status.Valid &
              request_input.request_status == Request_Status.Valid &
              mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
              defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
              retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
              service_progress_input.service_progress_status == Service_Progress_Status.Valid &
              (In(current_phase) == Operational_Phase.Idle |
               In(current_phase) == Operational_Phase.Mining |
               In(current_phase) == Operational_Phase.Defending) &
              service_progress_input.service_progress == Service_Progress.Away &
              threat_input.threat == Threat_Value.Hostile &
              request_input.operator_request != Operator_Request.Retreat &
              cargo_input.cargo_band != Cargo_Band.Full &
              capacitor_input.capacitor_band != Capacitor_Band.Critical &
              defense_availability_input.defense_available == Defense_Availability.Available;
            guarantee
              mining_decision == Mining_Command.Stop &
              defense_decision == Defense_Command.Engage &
              movement_service_decision == Movement_Service_Command.Hold &
              phase_decision == Operational_Phase.Defending &
              fault_decision == Input_Fault.Clear &
              current_phase == Operational_Phase.Defending;

          // @trace BEH-07 CASE-10 CONS-03 DEF-04 MODE-02 TRANS-01
          case CASE_10_MINING "A valid operational clear-threat mining request at the exact permissive resource bands mines when available":
            assume
              threat_input.threat_status == Threat_Status.Valid &
              cargo_input.cargo_status == Cargo_Status.Valid &
              capacitor_input.capacitor_status == Capacitor_Status.Valid &
              request_input.request_status == Request_Status.Valid &
              mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
              defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
              retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
              service_progress_input.service_progress_status == Service_Progress_Status.Valid &
              (In(current_phase) == Operational_Phase.Idle |
               In(current_phase) == Operational_Phase.Mining |
               In(current_phase) == Operational_Phase.Defending) &
              service_progress_input.service_progress == Service_Progress.Away &
              threat_input.threat == Threat_Value.Clear &
              request_input.operator_request == Operator_Request.Mine &
              cargo_input.cargo_band == Cargo_Band.Partial &
              (capacitor_input.capacitor_band == Capacitor_Band.Reserve |
               capacitor_input.capacitor_band == Capacitor_Band.Ready) &
              mining_availability_input.mining_available == Mining_Availability.Available;
            guarantee
              mining_decision == Mining_Command.Mine &
              defense_decision == Defense_Command.Stand_Down &
              movement_service_decision == Movement_Service_Command.Hold &
              phase_decision == Operational_Phase.Mining &
              fault_decision == Input_Fault.Clear &
              current_phase == Operational_Phase.Mining;

          // @trace BEH-08 CASE-11 CONS-02 CONS-03 CONS-04 DEF-03 DEF-04 MODE-01 TRANS-01 TRANS-02
          case CASE_11_VALID_IDLE_INHIBITION "Every remaining admissible valid operational snapshot inhibits mining and defense and returns to Idle":
            assume
              threat_input.threat_status == Threat_Status.Valid &
              cargo_input.cargo_status == Cargo_Status.Valid &
              capacitor_input.capacitor_status == Capacitor_Status.Valid &
              request_input.request_status == Request_Status.Valid &
              mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid &
              defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid &
              retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid &
              service_progress_input.service_progress_status == Service_Progress_Status.Valid &
              (In(current_phase) == Operational_Phase.Idle |
               In(current_phase) == Operational_Phase.Mining |
               In(current_phase) == Operational_Phase.Defending) &
              service_progress_input.service_progress == Service_Progress.Away &
              not (
                request_input.operator_request == Operator_Request.Retreat |
                cargo_input.cargo_band == Cargo_Band.Full |
                capacitor_input.capacitor_band == Capacitor_Band.Critical |
                (threat_input.threat == Threat_Value.Hostile &
                 defense_availability_input.defense_available == Defense_Availability.Unavailable)
              ) &
              threat_input.threat != Threat_Value.Hostile &
              not (
                threat_input.threat == Threat_Value.Clear &
                request_input.operator_request == Operator_Request.Mine &
                cargo_input.cargo_band == Cargo_Band.Partial &
                (capacitor_input.capacitor_band == Capacitor_Band.Reserve |
                 capacitor_input.capacitor_band == Capacitor_Band.Ready) &
                mining_availability_input.mining_available == Mining_Availability.Available
              );
            guarantee
              mining_decision == Mining_Command.Stop &
              defense_decision == Defense_Command.Stand_Down &
              movement_service_decision == Movement_Service_Command.Hold &
              phase_decision == Operational_Phase.Idle &
              fault_decision == Input_Fault.Clear &
              current_phase == Operational_Phase.Idle;
    }*/
  }

  // @trace PART-05 CONTRACT-LOCAL-02
  part def Mining_Command_Delivery :> Thread {
    // @trace INT-09 CTRL-01
    port mining_in : DataPort { in :>> type : Mining_Command; }
    // @trace INT-09 CTRL-01
    port mining_out : DataPort { out :>> type : Mining_Command; }

    language "GUMBO" /*{
      compute
        // @trace CONTRACT-LOCAL-02 CONTRACT-LOCAL-04 PART-05 INT-09 CTRL-01
        guarantee PRESERVE_MINING_COMMAND "Mining delivery preserves the principal owner's selected command exactly":
          mining_out == mining_in;
    }*/
  }

  // @trace PART-06 CONTRACT-LOCAL-02
  part def Defense_Command_Delivery :> Thread {
    // @trace INT-10 CTRL-02
    port defense_in : DataPort { in :>> type : Defense_Command; }
    // @trace INT-10 CTRL-02
    port defense_out : DataPort { out :>> type : Defense_Command; }

    language "GUMBO" /*{
      compute
        // @trace CONTRACT-LOCAL-02 CONTRACT-LOCAL-04 PART-06 INT-10 CTRL-02
        guarantee PRESERVE_DEFENSE_COMMAND "Defense delivery preserves the principal owner's selected command exactly":
          defense_out == defense_in;
    }*/
  }

  // @trace PART-07 CONTRACT-LOCAL-02
  part def Movement_Service_Command_Delivery :> Thread {
    // @trace INT-11 CTRL-03
    port movement_service_in : DataPort { in :>> type : Movement_Service_Command; }
    // @trace INT-11 CTRL-03
    port movement_service_out : DataPort { out :>> type : Movement_Service_Command; }

    language "GUMBO" /*{
      compute
        // @trace CONTRACT-LOCAL-02 CONTRACT-LOCAL-04 PART-07 INT-11 CTRL-03
        guarantee PRESERVE_MOVEMENT_SERVICE_COMMAND "Movement and service delivery preserves the principal owner's selected command exactly":
          movement_service_out == movement_service_in;
    }*/
  }

  // @generated-support behavior-free HAMR Process containment for PART-01 through PART-07
  // @trace STRUCT-02 GEN-SUPPORT-01
  part def Supervisor_Process :> Process {
    // @trace PART-02
    part threat_qualification : Threat_Qualification;
    // @trace PART-03
    part resource_qualification : Resource_Qualification;
    // @trace PART-04
    part request_availability_qualification : Request_Availability_Qualification;
    // @trace PART-01
    part principal_decision_owner : Principal_Decision_Owner;
    // @trace PART-05
    part mining_command_delivery : Mining_Command_Delivery;
    // @trace PART-06
    part defense_command_delivery : Defense_Command_Delivery;
    // @trace PART-07
    part movement_service_command_delivery : Movement_Service_Command_Delivery;

    // @generated-support routing-only Process boundary port for INT-01
    // @trace INT-01
    port threat_observation : DataPort { in :>> type : Threat_Observation; }
    // @generated-support routing-only Process boundary port for INT-02
    // @trace INT-02
    port cargo_observation : DataPort { in :>> type : Cargo_Observation; }
    // @generated-support routing-only Process boundary port for INT-03
    // @trace INT-03
    port capacitor_observation : DataPort { in :>> type : Capacitor_Observation; }
    // @generated-support routing-only Process boundary port for INT-04
    // @trace INT-04
    port request_observation : DataPort { in :>> type : Request_Observation; }
    // @generated-support routing-only Process boundary port for INT-05
    // @trace INT-05
    port mining_availability_observation : DataPort { in :>> type : Mining_Availability_Observation; }
    // @generated-support routing-only Process boundary port for INT-06
    // @trace INT-06
    port defense_availability_observation : DataPort { in :>> type : Defense_Availability_Observation; }
    // @generated-support routing-only Process boundary port for INT-07
    // @trace INT-07
    port retreat_availability_observation : DataPort { in :>> type : Retreat_Availability_Observation; }
    // @generated-support routing-only Process boundary port for INT-08
    // @trace INT-08
    port service_progress_observation : DataPort { in :>> type : Service_Progress_Observation; }
    // @generated-support routing-only Process boundary port for INT-09
    // @trace INT-09
    port mining_command : DataPort { out :>> type : Mining_Command; }
    // @generated-support routing-only Process boundary port for INT-10
    // @trace INT-10
    port defense_command : DataPort { out :>> type : Defense_Command; }
    // @generated-support routing-only Process boundary port for INT-11
    // @trace INT-11
    port movement_service_command : DataPort { out :>> type : Movement_Service_Command; }
    // @generated-support routing-only Process boundary port for INT-12
    // @trace INT-12
    port phase_report : DataPort { out :>> type : Operational_Phase; }
    // @generated-support routing-only Process boundary port for INT-13
    // @trace INT-13
    port input_fault : DataPort { out :>> type : Input_Fault; }

    // @generated-support inbound refinement hop for INT-01
    // @trace INT-01
    connection route_threat_to_qualifier : PortConnection
      connect threat_observation to threat_qualification.raw_threat;
    // @trace INT-01 PART-02 PART-01
    connection qualified_threat_to_owner : PortConnection
      connect threat_qualification.qualified_threat to principal_decision_owner.threat_input;

    // @generated-support inbound refinement hop for INT-02
    // @trace INT-02
    connection route_cargo_to_qualifier : PortConnection
      connect cargo_observation to resource_qualification.raw_cargo;
    // @trace INT-02 PART-03 PART-01
    connection qualified_cargo_to_owner : PortConnection
      connect resource_qualification.qualified_cargo to principal_decision_owner.cargo_input;

    // @generated-support inbound refinement hop for INT-03
    // @trace INT-03
    connection route_capacitor_to_qualifier : PortConnection
      connect capacitor_observation to resource_qualification.raw_capacitor;
    // @trace INT-03 PART-03 PART-01
    connection qualified_capacitor_to_owner : PortConnection
      connect resource_qualification.qualified_capacitor to principal_decision_owner.capacitor_input;

    // @generated-support inbound refinement hop for INT-04
    // @trace INT-04
    connection route_request_to_qualifier : PortConnection
      connect request_observation to request_availability_qualification.raw_request;
    // @trace INT-04 PART-04 PART-01
    connection qualified_request_to_owner : PortConnection
      connect request_availability_qualification.qualified_request to principal_decision_owner.request_input;

    // @generated-support inbound refinement hop for INT-05
    // @trace INT-05
    connection route_mining_availability_to_qualifier : PortConnection
      connect mining_availability_observation to request_availability_qualification.raw_mining_availability;
    // @trace INT-05 PART-04 PART-01
    connection qualified_mining_availability_to_owner : PortConnection
      connect request_availability_qualification.qualified_mining_availability to principal_decision_owner.mining_availability_input;

    // @generated-support inbound refinement hop for INT-06
    // @trace INT-06
    connection route_defense_availability_to_qualifier : PortConnection
      connect defense_availability_observation to request_availability_qualification.raw_defense_availability;
    // @trace INT-06 PART-04 PART-01
    connection qualified_defense_availability_to_owner : PortConnection
      connect request_availability_qualification.qualified_defense_availability to principal_decision_owner.defense_availability_input;

    // @generated-support inbound refinement hop for INT-07
    // @trace INT-07
    connection route_retreat_availability_to_qualifier : PortConnection
      connect retreat_availability_observation to request_availability_qualification.raw_retreat_availability;
    // @trace INT-07 PART-04 PART-01
    connection qualified_retreat_availability_to_owner : PortConnection
      connect request_availability_qualification.qualified_retreat_availability to principal_decision_owner.retreat_availability_input;

    // @trace INT-08 PART-01
    connection service_progress_to_owner : PortConnection
      connect service_progress_observation to principal_decision_owner.service_progress_input;

    // @trace INT-09 PART-01 PART-05
    connection mining_decision_to_delivery : PortConnection
      connect principal_decision_owner.mining_decision to mining_command_delivery.mining_in;
    // @generated-support outbound refinement hop for INT-09
    // @trace INT-09
    connection mining_delivery_to_boundary : PortConnection
      connect mining_command_delivery.mining_out to mining_command;

    // @trace INT-10 PART-01 PART-06
    connection defense_decision_to_delivery : PortConnection
      connect principal_decision_owner.defense_decision to defense_command_delivery.defense_in;
    // @generated-support outbound refinement hop for INT-10
    // @trace INT-10
    connection defense_delivery_to_boundary : PortConnection
      connect defense_command_delivery.defense_out to defense_command;

    // @trace INT-11 PART-01 PART-07
    connection movement_service_decision_to_delivery : PortConnection
      connect principal_decision_owner.movement_service_decision to movement_service_command_delivery.movement_service_in;
    // @generated-support outbound refinement hop for INT-11
    // @trace INT-11
    connection movement_service_delivery_to_boundary : PortConnection
      connect movement_service_command_delivery.movement_service_out to movement_service_command;

    // @trace INT-12 PART-01
    connection phase_decision_to_boundary : PortConnection
      connect principal_decision_owner.phase_decision to phase_report;
    // @trace INT-13 PART-01
    connection fault_decision_to_boundary : PortConnection
      connect principal_decision_owner.fault_decision to input_fault;
  }

  // @trace SYN-01 PURPOSE-01 SCOPE-01 BOUND-01 STRUCT-01
  part def Mining_Threat_Retreat_System :> System {
    // @generated-support sole behavior-free containment usage
    // @trace STRUCT-02 GEN-SUPPORT-01
    part supervisor_process : Supervisor_Process;

    // @trace INT-01 MON-01 CTX-02
    port threat_observation : DataPort { in :>> type : Threat_Observation; }
    // @trace INT-02 MON-02 CTX-02
    port cargo_observation : DataPort { in :>> type : Cargo_Observation; }
    // @trace INT-03 MON-03 CTX-02
    port capacitor_observation : DataPort { in :>> type : Capacitor_Observation; }
    // @trace INT-04 MON-04 CTX-01
    port request_observation : DataPort { in :>> type : Request_Observation; }
    // @trace INT-05 MON-05 CTX-02
    port mining_availability_observation : DataPort { in :>> type : Mining_Availability_Observation; }
    // @trace INT-06 MON-06 CTX-02
    port defense_availability_observation : DataPort { in :>> type : Defense_Availability_Observation; }
    // @trace INT-07 MON-07 CTX-02
    port retreat_availability_observation : DataPort { in :>> type : Retreat_Availability_Observation; }
    // @trace INT-08 MON-08 CTX-02
    port service_progress_observation : DataPort { in :>> type : Service_Progress_Observation; }
    // @trace INT-09 CTRL-01 CTX-03
    port mining_command : DataPort { out :>> type : Mining_Command; }
    // @trace INT-10 CTRL-02 CTX-03
    port defense_command : DataPort { out :>> type : Defense_Command; }
    // @trace INT-11 CTRL-03 CTX-03
    port movement_service_command : DataPort { out :>> type : Movement_Service_Command; }
    // @trace INT-12 CTRL-04 CTX-01
    port phase_report : DataPort { out :>> type : Operational_Phase; }
    // @trace INT-13 CTRL-05 CTX-01
    port input_fault : DataPort { out :>> type : Input_Fault; }

    // @generated-support root-to-Process route for INT-01
    // @trace INT-01
    connection boundary_threat : PortConnection
      connect threat_observation to supervisor_process.threat_observation;
    // @generated-support root-to-Process route for INT-02
    // @trace INT-02
    connection boundary_cargo : PortConnection
      connect cargo_observation to supervisor_process.cargo_observation;
    // @generated-support root-to-Process route for INT-03
    // @trace INT-03
    connection boundary_capacitor : PortConnection
      connect capacitor_observation to supervisor_process.capacitor_observation;
    // @generated-support root-to-Process route for INT-04
    // @trace INT-04
    connection boundary_request : PortConnection
      connect request_observation to supervisor_process.request_observation;
    // @generated-support root-to-Process route for INT-05
    // @trace INT-05
    connection boundary_mining_availability : PortConnection
      connect mining_availability_observation to supervisor_process.mining_availability_observation;
    // @generated-support root-to-Process route for INT-06
    // @trace INT-06
    connection boundary_defense_availability : PortConnection
      connect defense_availability_observation to supervisor_process.defense_availability_observation;
    // @generated-support root-to-Process route for INT-07
    // @trace INT-07
    connection boundary_retreat_availability : PortConnection
      connect retreat_availability_observation to supervisor_process.retreat_availability_observation;
    // @generated-support root-to-Process route for INT-08
    // @trace INT-08
    connection boundary_service_progress : PortConnection
      connect service_progress_observation to supervisor_process.service_progress_observation;
    // @generated-support Process-to-root route for INT-09
    // @trace INT-09
    connection boundary_mining_command : PortConnection
      connect supervisor_process.mining_command to mining_command;
    // @generated-support Process-to-root route for INT-10
    // @trace INT-10
    connection boundary_defense_command : PortConnection
      connect supervisor_process.defense_command to defense_command;
    // @generated-support Process-to-root route for INT-11
    // @trace INT-11
    connection boundary_movement_service_command : PortConnection
      connect supervisor_process.movement_service_command to movement_service_command;
    // @generated-support Process-to-root route for INT-12
    // @trace INT-12
    connection boundary_phase_report : PortConnection
      connect supervisor_process.phase_report to phase_report;
    // @generated-support Process-to-root route for INT-13
    // @trace INT-13
    connection boundary_input_fault : PortConnection
      connect supervisor_process.input_fault to input_fault;
  }

  // @trace SYN-01 PURPOSE-01 GOAL-01 GOAL-02 GOAL-03 GOAL-04 STRUCT-01
  part mining_threat_retreat_supervisor : Mining_Threat_Retreat_System;
}
