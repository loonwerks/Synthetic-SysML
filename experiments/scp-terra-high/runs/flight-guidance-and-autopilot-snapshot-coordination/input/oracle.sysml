package FAA_FCS_Coordination {

  private import HAMR::*;

  // @trace MON-01 MON-02 MON-03 ASM-01 ABS-01
  enum def Request_Value {
    enum Requested;
    enum Not_Requested;
  }

  // @trace MON-01 MON-02 MON-03 ASM-01 ABS-01
  enum def Input_Validity {
    enum Valid;
    enum Invalid;
  }

  // @trace PART-01 INT-01 INT-02 INT-03
  enum def Qualified_Request {
    enum Requested;
    enum Not_Requested;
  }

  // @trace MON-04 ABS-01 ASM-02 FAULT-01
  enum def Attitude_Data_Validity {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-05 ABS-02 ASM-02
  enum def Attitude_Acceptability {
    enum Acceptable;
    enum Not_Acceptable;
  }

  // @trace MON-06 ABS-03 ASM-03
  enum def Reference_State {
    enum Synchronized;
    enum Not_Synchronized;
  }

  // @trace MON-07 ABS-04 ASM-04 FAULT-02
  enum def AP_Availability {
    enum Available;
    enum Failed;
  }

  // @trace CTRL-01 BEH-01 BEH-02 BEH-03 BEH-04 BEH-05 BEH-06 BEH-07 BEH-08 BEH-09 BEH-10
  enum def FD_Indication {
    enum On;
    enum Off;
  }

  // @trace CTRL-02 FAULT-01
  enum def FCS_Failed_Indication {
    enum Asserted;
    enum Clear;
  }

  // @trace CTRL-03 FAULT-01 FAULT-02
  enum def AP_Status {
    enum On;
    enum Off;
    enum Failed;
  }

  // @trace CTRL-04 FAULT-01 FAULT-02
  enum def AP_Enable {
    enum Enabled;
    enum Disabled;
  }

  // @trace CTRL-05 CTRL-06 INT-12
  enum def Request_Indication {
    enum Asserted;
    enum Not_Asserted;
  }

  // @trace PART-01 MON-01 MON-02 MON-03 GOAL-01
  part def FCI_Command_Intake_i :> Thread {
    // @trace PART-01 MON-01 CTX-01
    port display_fd_request_in : DataPort { in :>> type : Request_Value; }
    // @trace PART-01 MON-01 CTX-01
    port display_fd_validity_in : DataPort { in :>> type : Input_Validity; }
    // @trace PART-01 MON-02 CTX-01
    port sync_fd_request_in : DataPort { in :>> type : Request_Value; }
    // @trace PART-01 MON-02 CTX-01
    port sync_fd_validity_in : DataPort { in :>> type : Input_Validity; }
    // @trace PART-01 MON-03 CTX-01
    port engage_ap_request_in : DataPort { in :>> type : Request_Value; }
    // @trace PART-01 MON-03 CTX-01
    port engage_ap_validity_in : DataPort { in :>> type : Input_Validity; }

    // @trace PART-01 INT-01 MON-01
    port qualified_display_request : DataPort { out :>> type : Qualified_Request; }
    // @trace PART-01 INT-02 MON-02
    port qualified_sync_request : DataPort { out :>> type : Qualified_Request; }
    // @trace PART-01 INT-03 MON-03
    port qualified_engage_request : DataPort { out :>> type : Qualified_Request; }

    language "GUMBO" /*{
      compute
        // @trace PART-01 MON-01 INT-01 BEH-03 BEH-04 BEH-05 BEH-06 BEH-07 BEH-08 BEH-09 BEH-10
        guarantee PART_01_QUALIFY_DISPLAY "D is requested exactly for a valid requested display command":
          (qualified_display_request == Qualified_Request.Requested) ==
            (display_fd_request_in == Request_Value.Requested &
             display_fd_validity_in == Input_Validity.Valid);
        // @trace PART-01 MON-02 INT-02 BEH-03 BEH-04 BEH-05 BEH-06 BEH-07 BEH-08 BEH-09 BEH-10
        guarantee PART_01_QUALIFY_SYNC "S is requested exactly for a valid requested synchronization command":
          (qualified_sync_request == Qualified_Request.Requested) ==
            (sync_fd_request_in == Request_Value.Requested &
             sync_fd_validity_in == Input_Validity.Valid);
        // @trace PART-01 MON-03 INT-03 BEH-03 BEH-04 BEH-05 BEH-06 BEH-07 BEH-08 BEH-09 BEH-10
        guarantee PART_01_QUALIFY_ENGAGE "E is requested exactly for a valid requested engagement command":
          (qualified_engage_request == Qualified_Request.Requested) ==
            (engage_ap_request_in == Request_Value.Requested &
             engage_ap_validity_in == Input_Validity.Valid);
    }*/
  }

  // @trace PART-02 MON-04 MON-05
  part def Attitude_Condition_Intake_i :> Thread {
    // @trace PART-02 MON-04 CTX-02
    port attitude_data_in : DataPort { in :>> type : Attitude_Data_Validity; }
    // @trace PART-02 MON-05 CTX-02
    port attitude_acceptable_in : DataPort { in :>> type : Attitude_Acceptability; }
    // @trace PART-02 INT-04 INT-06 MON-04
    port attitude_data_out : DataPort { out :>> type : Attitude_Data_Validity; }
    // @trace PART-02 INT-05 INT-07 MON-05
    port attitude_acceptable_out : DataPort { out :>> type : Attitude_Acceptability; }

    language "GUMBO" /*{
      compute
        // @trace PART-02 MON-04 INT-04 INT-06
        guarantee PART_02_PRESERVE_ATTITUDE_DATA "Attitude intake preserves the current attitude-data validity":
          attitude_data_out == attitude_data_in;
        // @trace PART-02 MON-05 INT-05 INT-07
        guarantee PART_02_PRESERVE_ATTITUDE_ACCEPTABILITY "Attitude intake preserves current attitude acceptability":
          attitude_acceptable_out == attitude_acceptable_in;
    }*/
  }

  // @trace PART-03 MON-06
  part def Reference_State_Intake_i :> Thread {
    // @trace PART-03 MON-06 CTX-03 ASM-03
    port reference_state_in : DataPort { in :>> type : Reference_State; }
    // @trace PART-03 INT-08 INT-09 MON-06
    port reference_state_out : DataPort { out :>> type : Reference_State; }

    language "GUMBO" /*{
      compute
        // @trace PART-03 MON-06 INT-08 INT-09 ASM-03
        guarantee PART_03_PRESERVE_REFERENCE_STATE "Reference intake preserves the current synchronization state without persistence":
          reference_state_out == reference_state_in;
    }*/
  }

  // @trace PART-04 MON-07
  part def AP_Availability_Intake_i :> Thread {
    // @trace PART-04 MON-07 CTX-04 ASM-04
    port ap_availability_in : DataPort { in :>> type : AP_Availability; }
    // @trace PART-04 INT-10 MON-07
    port ap_availability_out : DataPort { out :>> type : AP_Availability; }

    language "GUMBO" /*{
      compute
        // @trace PART-04 MON-07 INT-10 ASM-04
        guarantee PART_04_PRESERVE_AP_AVAILABILITY "AP availability intake preserves the supplied current availability":
          ap_availability_out == ap_availability_in;
    }*/
  }

  // @trace PART-05 GOAL-02 GOAL-03 RISK-01 FAULT-01
  part def Flight_Guidance_Coordination_i :> Thread {
    // @trace PART-05 INT-01 MON-01
    port qualified_display_request : DataPort { in :>> type : Qualified_Request; }
    // @trace PART-05 INT-02 MON-02
    port qualified_sync_request : DataPort { in :>> type : Qualified_Request; }
    // @trace PART-05 INT-04 MON-04
    port attitude_data : DataPort { in :>> type : Attitude_Data_Validity; }
    // @trace PART-05 INT-05 MON-05
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    // @trace PART-05 INT-08 MON-06
    port reference_state : DataPort { in :>> type : Reference_State; }
    // @trace PART-05 PART-06 INT-12 CTRL-06 GOAL-02 BEH-03 BEH-04 BEH-06 BEH-07
    port reference_sync_trigger : DataPort { in :>> type : Request_Indication; }

    // @trace PART-05 INT-11 INT-13 CTRL-01
    port fd_on : DataPort { out :>> type : FD_Indication; }
    // @trace PART-05 INT-14 CTRL-02 FAULT-01
    port fcs_failed : DataPort { out :>> type : FCS_Failed_Indication; }
    // @trace PART-05 INT-15 CTRL-06
    port reference_sync_request : DataPort { out :>> type : Request_Indication; }

    language "GUMBO" /*{
      compute
        // @trace PART-05 CTRL-01 INT-11 INT-13 BEH-01 BEH-02 BEH-03 BEH-04 BEH-05 BEH-06 BEH-07 BEH-08 BEH-09 BEH-10 FAULT-01
        guarantee PART_05_FD_ON_POLICY "FD is on exactly when attitude data is valid and D is requested":
          (fd_on == FD_Indication.On) ==
            (attitude_data == Attitude_Data_Validity.Valid &
             qualified_display_request == Qualified_Request.Requested);
        // @trace PART-05 CTRL-02 INT-14 BEH-01 BEH-02 BEH-03 BEH-04 BEH-05 BEH-06 BEH-07 BEH-08 BEH-09 BEH-10 FAULT-01
        guarantee PART_05_FCS_FAILED_POLICY "FCS failed is asserted exactly when attitude data is invalid":
          (fcs_failed == FCS_Failed_Indication.Asserted) ==
            (attitude_data == Attitude_Data_Validity.Invalid);
        // @trace PART-05 PART-06 CTRL-06 INT-12 INT-15 BEH-01 BEH-02 BEH-03 BEH-04 BEH-05 BEH-06 BEH-07 BEH-08 BEH-09 BEH-10 FAULT-01
        guarantee PART_05_REFERENCE_SYNC_POLICY "Reference synchronization is requested exactly for valid attitude and S or the distinct engagement-derived trigger":
          (reference_sync_request == Request_Indication.Asserted) ==
            (attitude_data == Attitude_Data_Validity.Valid &
             (qualified_sync_request == Qualified_Request.Requested |
              reference_sync_trigger == Request_Indication.Asserted));
    }*/
  }

  // @trace PART-06 GOAL-02 GOAL-03 RISK-02 FAULT-01 FAULT-02
  part def Autopilot_Coordination_i :> Thread {
    // @trace PART-06 INT-03 MON-03
    port qualified_engage_request : DataPort { in :>> type : Qualified_Request; }
    // @trace PART-06 INT-06 MON-04
    port attitude_data : DataPort { in :>> type : Attitude_Data_Validity; }
    // @trace PART-06 INT-07 MON-05
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    // @trace PART-06 INT-09 MON-06
    port reference_state : DataPort { in :>> type : Reference_State; }
    // @trace PART-06 INT-10 MON-07
    port ap_availability : DataPort { in :>> type : AP_Availability; }
    // @trace PART-06 INT-11 CTRL-01
    port fd_on : DataPort { in :>> type : FD_Indication; }

    // @trace PART-06 PART-05 INT-12 CTRL-06 GOAL-02 BEH-03 BEH-04 BEH-06 BEH-07
    port reference_sync_trigger : DataPort { out :>> type : Request_Indication; }
    // @trace PART-06 INT-16 CTRL-03 FAULT-01 FAULT-02
    port ap_status : DataPort { out :>> type : AP_Status; }
    // @trace PART-06 INT-17 CTRL-04 FAULT-01 FAULT-02
    port ap_on : DataPort { out :>> type : AP_Enable; }
    // @trace PART-06 INT-18 CTRL-05 FAULT-01 FAULT-02
    port ap_guidance_request : DataPort { out :>> type : Request_Indication; }

    language "GUMBO" /*{
      compute
        // @trace PART-06 PART-05 INT-12 CTRL-06 GOAL-02 BEH-03 BEH-04 BEH-06 BEH-07
        guarantee PART_06_REFERENCE_SYNC_TRIGGER "The internal trigger is exactly valid attitude, E, acceptable attitude, and an unsynchronized reference, independent of FD and AP availability":
          (reference_sync_trigger == Request_Indication.Asserted) ==
            (attitude_data == Attitude_Data_Validity.Valid &
             qualified_engage_request == Qualified_Request.Requested &
             attitude_acceptable == Attitude_Acceptability.Acceptable &
             reference_state == Reference_State.Not_Synchronized);

        compute_cases
          // @trace PART-06 BEH-01 BEH-03 BEH-04 FAULT-01 FAULT-02
          case PART_06_AP_UNAVAILABLE "Unavailable AP reports failed, remains disabled, and suppresses AP guidance request":
            assume ap_availability == AP_Availability.Failed;
            guarantee ap_status == AP_Status.Failed &
              ap_on == AP_Enable.Disabled &
              ap_guidance_request == Request_Indication.Not_Asserted;

          // @trace PART-06 BEH-05
          case PART_06_AP_ENGAGED_SYNCHRONIZED "Available AP is on only for valid attitude, E, acceptable attitude, FD on, and synchronized reference":
            assume ap_availability == AP_Availability.Available &
              attitude_data == Attitude_Data_Validity.Valid &
              qualified_engage_request == Qualified_Request.Requested &
              attitude_acceptable == Attitude_Acceptability.Acceptable &
              fd_on == FD_Indication.On &
              reference_state == Reference_State.Synchronized;
            guarantee ap_status == AP_Status.On &
              ap_on == AP_Enable.Enabled &
              ap_guidance_request == Request_Indication.Not_Asserted;

          // @trace PART-06 BEH-06
          case PART_06_AP_WAITING_FOR_REFERENCE "Available AP with every engagement condition except reference synchronization remains off and requests AP guidance":
            assume ap_availability == AP_Availability.Available &
              attitude_data == Attitude_Data_Validity.Valid &
              qualified_engage_request == Qualified_Request.Requested &
              attitude_acceptable == Attitude_Acceptability.Acceptable &
              fd_on == FD_Indication.On &
              reference_state == Reference_State.Not_Synchronized;
            guarantee ap_status == AP_Status.Off &
              ap_on == AP_Enable.Disabled &
              ap_guidance_request == Request_Indication.Asserted;

          // @trace PART-06 BEH-02 BEH-07 BEH-08 BEH-09 BEH-10 FAULT-01
          case PART_06_AP_AVAILABLE_OTHERWISE "Every other available-AP condition remains off, disabled, and suppresses AP guidance request":
            assume ap_availability == AP_Availability.Available &
              not (attitude_data == Attitude_Data_Validity.Valid &
                   qualified_engage_request == Qualified_Request.Requested &
                   attitude_acceptable == Attitude_Acceptability.Acceptable &
                   fd_on == FD_Indication.On);
            guarantee ap_status == AP_Status.Off &
              ap_on == AP_Enable.Disabled &
              ap_guidance_request == Request_Indication.Not_Asserted;
    }*/
  }

  // @trace PART-07 GOAL-01 FAULT-03
  part def FCS_Snapshot_Publication_i :> Thread {
    // @trace PART-07 INT-13 CTRL-01
    port fd_on_in : DataPort { in :>> type : FD_Indication; }
    // @trace PART-07 INT-14 CTRL-02
    port fcs_failed_in : DataPort { in :>> type : FCS_Failed_Indication; }
    // @trace PART-07 INT-16 CTRL-03
    port ap_status_in : DataPort { in :>> type : AP_Status; }
    // @trace PART-07 INT-17 CTRL-04
    port ap_on_in : DataPort { in :>> type : AP_Enable; }
    // @trace PART-07 INT-18 CTRL-05
    port ap_guidance_request_in : DataPort { in :>> type : Request_Indication; }
    // @trace PART-07 INT-15 CTRL-06
    port reference_sync_request_in : DataPort { in :>> type : Request_Indication; }

    // @trace PART-07 CTRL-01 CTX-05
    port fd_on_out : DataPort { out :>> type : FD_Indication; }
    // @trace PART-07 CTRL-02 CTX-05
    port fcs_failed_out : DataPort { out :>> type : FCS_Failed_Indication; }
    // @trace PART-07 CTRL-03 CTX-05
    port ap_status_out : DataPort { out :>> type : AP_Status; }
    // @trace PART-07 CTRL-04 CTX-06
    port ap_on_out : DataPort { out :>> type : AP_Enable; }
    // @trace PART-07 CTRL-05 CTX-07
    port ap_guidance_request_out : DataPort { out :>> type : Request_Indication; }
    // @trace PART-07 CTRL-06 CTX-03
    port reference_sync_request_out : DataPort { out :>> type : Request_Indication; }

    language "GUMBO" /*{
      compute
        // @trace PART-07 INT-13 CTRL-01
        guarantee PART_07_PRESERVE_FD_ON "Publication preserves fd_on":
          fd_on_out == fd_on_in;
        // @trace PART-07 INT-14 CTRL-02
        guarantee PART_07_PRESERVE_FCS_FAILED "Publication preserves fcs_failed":
          fcs_failed_out == fcs_failed_in;
        // @trace PART-07 INT-16 CTRL-03
        guarantee PART_07_PRESERVE_AP_STATUS "Publication preserves ap_status":
          ap_status_out == ap_status_in;
        // @trace PART-07 INT-17 CTRL-04
        guarantee PART_07_PRESERVE_AP_ON "Publication preserves ap_on":
          ap_on_out == ap_on_in;
        // @trace PART-07 INT-18 CTRL-05
        guarantee PART_07_PRESERVE_AP_GUIDANCE_REQUEST "Publication preserves ap_guidance_request":
          ap_guidance_request_out == ap_guidance_request_in;
        // @trace PART-07 INT-15 CTRL-06
        guarantee PART_07_PRESERVE_REFERENCE_SYNC_REQUEST "Publication preserves reference_sync_request":
          reference_sync_request_out == reference_sync_request_in;
    }*/
  }

  // @generated-support legal HAMR containment and boundary routing for PART-01 through PART-07; owns no policy or PART
  // @trace ARCH-01 STRUCT-02 STRUCT-04 STRUCT-06
  part def FCS_Coordination_Process_i :> Process {
    // @generated-support Process boundary port for MON-01 from root to PART-01
    // @trace MON-01 CTX-01
    port display_fd_request : DataPort { in :>> type : Request_Value; }
    // @generated-support Process boundary port for MON-01 from root to PART-01
    // @trace MON-01 CTX-01
    port display_fd_validity : DataPort { in :>> type : Input_Validity; }
    // @generated-support Process boundary port for MON-02 from root to PART-01
    // @trace MON-02 CTX-01
    port sync_fd_request : DataPort { in :>> type : Request_Value; }
    // @generated-support Process boundary port for MON-02 from root to PART-01
    // @trace MON-02 CTX-01
    port sync_fd_validity : DataPort { in :>> type : Input_Validity; }
    // @generated-support Process boundary port for MON-03 from root to PART-01
    // @trace MON-03 CTX-01
    port engage_ap_request : DataPort { in :>> type : Request_Value; }
    // @generated-support Process boundary port for MON-03 from root to PART-01
    // @trace MON-03 CTX-01
    port engage_ap_validity : DataPort { in :>> type : Input_Validity; }
    // @generated-support Process boundary port for MON-04 from root to PART-02
    // @trace MON-04 CTX-02
    port attitude_data : DataPort { in :>> type : Attitude_Data_Validity; }
    // @generated-support Process boundary port for MON-05 from root to PART-02
    // @trace MON-05 CTX-02
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    // @generated-support Process boundary port for MON-06 from root to PART-03
    // @trace MON-06 CTX-03
    port reference_state : DataPort { in :>> type : Reference_State; }
    // @generated-support Process boundary port for MON-07 from root to PART-04
    // @trace MON-07 CTX-04
    port ap_availability : DataPort { in :>> type : AP_Availability; }
    // @generated-support Process boundary port for CTRL-01 from PART-07 to root
    // @trace CTRL-01 CTX-05
    port fd_on : DataPort { out :>> type : FD_Indication; }
    // @generated-support Process boundary port for CTRL-02 from PART-07 to root
    // @trace CTRL-02 CTX-05
    port fcs_failed : DataPort { out :>> type : FCS_Failed_Indication; }
    // @generated-support Process boundary port for CTRL-03 from PART-07 to root
    // @trace CTRL-03 CTX-05
    port ap_status : DataPort { out :>> type : AP_Status; }
    // @generated-support Process boundary port for CTRL-04 from PART-07 to root
    // @trace CTRL-04 CTX-06
    port ap_on : DataPort { out :>> type : AP_Enable; }
    // @generated-support Process boundary port for CTRL-05 from PART-07 to root
    // @trace CTRL-05 CTX-07
    port ap_guidance_request : DataPort { out :>> type : Request_Indication; }
    // @generated-support Process boundary port for CTRL-06 from PART-07 to root
    // @trace CTRL-06 CTX-03
    port reference_sync_request : DataPort { out :>> type : Request_Indication; }

    // @trace PART-01 MON-01 MON-02 MON-03
    part fci_command_intake : FCI_Command_Intake_i;
    // @trace PART-02 MON-04 MON-05
    part attitude_condition_intake : Attitude_Condition_Intake_i;
    // @trace PART-03 MON-06
    part reference_state_intake : Reference_State_Intake_i;
    // @trace PART-04 MON-07
    part ap_availability_intake : AP_Availability_Intake_i;
    // @trace PART-05 CTRL-01 CTRL-02 CTRL-06
    part flight_guidance_coordination : Flight_Guidance_Coordination_i;
    // @trace PART-06 CTRL-03 CTRL-04 CTRL-05
    part autopilot_coordination : Autopilot_Coordination_i;
    // @trace PART-07 CTRL-01 CTRL-02 CTRL-03 CTRL-04 CTRL-05 CTRL-06
    part fcs_snapshot_publication : FCS_Snapshot_Publication_i;

    // @generated-support Process-to-Thread boundary route for MON-01 PART-01
    // @trace MON-01 PART-01
    connection support_display_request_to_intake : PortConnection
      connect display_fd_request to fci_command_intake.display_fd_request_in;
    // @generated-support Process-to-Thread boundary route for MON-01 PART-01
    // @trace MON-01 PART-01
    connection support_display_validity_to_intake : PortConnection
      connect display_fd_validity to fci_command_intake.display_fd_validity_in;
    // @generated-support Process-to-Thread boundary route for MON-02 PART-01
    // @trace MON-02 PART-01
    connection support_sync_request_to_intake : PortConnection
      connect sync_fd_request to fci_command_intake.sync_fd_request_in;
    // @generated-support Process-to-Thread boundary route for MON-02 PART-01
    // @trace MON-02 PART-01
    connection support_sync_validity_to_intake : PortConnection
      connect sync_fd_validity to fci_command_intake.sync_fd_validity_in;
    // @generated-support Process-to-Thread boundary route for MON-03 PART-01
    // @trace MON-03 PART-01
    connection support_engage_request_to_intake : PortConnection
      connect engage_ap_request to fci_command_intake.engage_ap_request_in;
    // @generated-support Process-to-Thread boundary route for MON-03 PART-01
    // @trace MON-03 PART-01
    connection support_engage_validity_to_intake : PortConnection
      connect engage_ap_validity to fci_command_intake.engage_ap_validity_in;
    // @generated-support Process-to-Thread boundary route for MON-04 PART-02
    // @trace MON-04 PART-02
    connection support_attitude_data_to_intake : PortConnection
      connect attitude_data to attitude_condition_intake.attitude_data_in;
    // @generated-support Process-to-Thread boundary route for MON-05 PART-02
    // @trace MON-05 PART-02
    connection support_attitude_acceptable_to_intake : PortConnection
      connect attitude_acceptable to attitude_condition_intake.attitude_acceptable_in;
    // @generated-support Process-to-Thread boundary route for MON-06 PART-03
    // @trace MON-06 PART-03
    connection support_reference_state_to_intake : PortConnection
      connect reference_state to reference_state_intake.reference_state_in;
    // @generated-support Process-to-Thread boundary route for MON-07 PART-04
    // @trace MON-07 PART-04
    connection support_ap_availability_to_intake : PortConnection
      connect ap_availability to ap_availability_intake.ap_availability_in;

    // @trace INT-01 PART-01 PART-05 MON-01
    connection int_01_qualified_display : PortConnection
      connect fci_command_intake.qualified_display_request to flight_guidance_coordination.qualified_display_request;
    // @trace INT-02 PART-01 PART-05 MON-02
    connection int_02_qualified_sync : PortConnection
      connect fci_command_intake.qualified_sync_request to flight_guidance_coordination.qualified_sync_request;
    // @trace INT-03 PART-01 PART-06 MON-03
    connection int_03_qualified_engage : PortConnection
      connect fci_command_intake.qualified_engage_request to autopilot_coordination.qualified_engage_request;
    // @trace INT-04 PART-02 PART-05 MON-04
    connection int_04_attitude_data_to_fgs : PortConnection
      connect attitude_condition_intake.attitude_data_out to flight_guidance_coordination.attitude_data;
    // @trace INT-05 PART-02 PART-05 MON-05
    connection int_05_attitude_acceptable_to_fgs : PortConnection
      connect attitude_condition_intake.attitude_acceptable_out to flight_guidance_coordination.attitude_acceptable;
    // @trace INT-06 PART-02 PART-06 MON-04
    connection int_06_attitude_data_to_ap : PortConnection
      connect attitude_condition_intake.attitude_data_out to autopilot_coordination.attitude_data;
    // @trace INT-07 PART-02 PART-06 MON-05
    connection int_07_attitude_acceptable_to_ap : PortConnection
      connect attitude_condition_intake.attitude_acceptable_out to autopilot_coordination.attitude_acceptable;
    // @trace INT-08 PART-03 PART-05 MON-06
    connection int_08_reference_state_to_fgs : PortConnection
      connect reference_state_intake.reference_state_out to flight_guidance_coordination.reference_state;
    // @trace INT-09 PART-03 PART-06 MON-06
    connection int_09_reference_state_to_ap : PortConnection
      connect reference_state_intake.reference_state_out to autopilot_coordination.reference_state;
    // @trace INT-10 PART-04 PART-06 MON-07
    connection int_10_ap_availability_to_ap : PortConnection
      connect ap_availability_intake.ap_availability_out to autopilot_coordination.ap_availability;
    // @trace INT-11 PART-05 PART-06 CTRL-01
    connection int_11_fd_outcome_to_ap : PortConnection
      connect flight_guidance_coordination.fd_on to autopilot_coordination.fd_on;
    // @trace INT-12 PART-06 PART-05 CTRL-06 GOAL-02 BEH-03 BEH-04 BEH-06 BEH-07
    connection int_12_reference_sync_trigger_to_fgs : PortConnection
      connect autopilot_coordination.reference_sync_trigger to flight_guidance_coordination.reference_sync_trigger;
    // @trace INT-13 PART-05 PART-07 CTRL-01
    connection int_13_fd_on_to_publication : PortConnection
      connect flight_guidance_coordination.fd_on to fcs_snapshot_publication.fd_on_in;
    // @trace INT-14 PART-05 PART-07 CTRL-02
    connection int_14_fcs_failed_to_publication : PortConnection
      connect flight_guidance_coordination.fcs_failed to fcs_snapshot_publication.fcs_failed_in;
    // @trace INT-15 PART-05 PART-07 CTRL-06
    connection int_15_reference_sync_to_publication : PortConnection
      connect flight_guidance_coordination.reference_sync_request to fcs_snapshot_publication.reference_sync_request_in;
    // @trace INT-16 PART-06 PART-07 CTRL-03
    connection int_16_ap_status_to_publication : PortConnection
      connect autopilot_coordination.ap_status to fcs_snapshot_publication.ap_status_in;
    // @trace INT-17 PART-06 PART-07 CTRL-04
    connection int_17_ap_on_to_publication : PortConnection
      connect autopilot_coordination.ap_on to fcs_snapshot_publication.ap_on_in;
    // @trace INT-18 PART-06 PART-07 CTRL-05
    connection int_18_ap_guidance_to_publication : PortConnection
      connect autopilot_coordination.ap_guidance_request to fcs_snapshot_publication.ap_guidance_request_in;

    // @generated-support Thread-to-Process boundary route for CTRL-01 from PART-07
    // @trace PART-07 CTRL-01 CTX-05
    connection support_fd_on_to_boundary : PortConnection
      connect fcs_snapshot_publication.fd_on_out to fd_on;
    // @generated-support Thread-to-Process boundary route for CTRL-02 from PART-07
    // @trace PART-07 CTRL-02 CTX-05
    connection support_fcs_failed_to_boundary : PortConnection
      connect fcs_snapshot_publication.fcs_failed_out to fcs_failed;
    // @generated-support Thread-to-Process boundary route for CTRL-03 from PART-07
    // @trace PART-07 CTRL-03 CTX-05
    connection support_ap_status_to_boundary : PortConnection
      connect fcs_snapshot_publication.ap_status_out to ap_status;
    // @generated-support Thread-to-Process boundary route for CTRL-04 from PART-07
    // @trace PART-07 CTRL-04 CTX-06
    connection support_ap_on_to_boundary : PortConnection
      connect fcs_snapshot_publication.ap_on_out to ap_on;
    // @generated-support Thread-to-Process boundary route for CTRL-05 from PART-07
    // @trace PART-07 CTRL-05 CTX-07
    connection support_ap_guidance_to_boundary : PortConnection
      connect fcs_snapshot_publication.ap_guidance_request_out to ap_guidance_request;
    // @generated-support Thread-to-Process boundary route for CTRL-06 from PART-07
    // @trace PART-07 CTRL-06 CTX-03
    connection support_reference_sync_to_boundary : PortConnection
      connect fcs_snapshot_publication.reference_sync_request_out to reference_sync_request;
  }

  // @trace GOAL-01 GOAL-02 GOAL-03 ARCH-01 STRUCT-01 STRUCT-02 STRUCT-03 STRUCT-04 STRUCT-05 STRUCT-06 STRUCT-07
  part def FAA_FCS_Coordination_Root :> System {
    // @trace MON-01 CTX-01 ASM-01
    port display_fd_request : DataPort { in :>> type : Request_Value; }
    // @trace MON-01 CTX-01 ASM-01
    port display_fd_validity : DataPort { in :>> type : Input_Validity; }
    // @trace MON-02 CTX-01 ASM-01
    port sync_fd_request : DataPort { in :>> type : Request_Value; }
    // @trace MON-02 CTX-01 ASM-01
    port sync_fd_validity : DataPort { in :>> type : Input_Validity; }
    // @trace MON-03 CTX-01 ASM-01
    port engage_ap_request : DataPort { in :>> type : Request_Value; }
    // @trace MON-03 CTX-01 ASM-01
    port engage_ap_validity : DataPort { in :>> type : Input_Validity; }
    // @trace MON-04 CTX-02 ASM-02 ABS-01
    port attitude_data : DataPort { in :>> type : Attitude_Data_Validity; }
    // @trace MON-05 CTX-02 ASM-02 ABS-02
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    // @trace MON-06 CTX-03 ASM-03 ABS-03
    port reference_state : DataPort { in :>> type : Reference_State; }
    // @trace MON-07 CTX-04 ASM-04 ABS-04
    port ap_availability : DataPort { in :>> type : AP_Availability; }

    // @trace CTRL-01 CTX-05 GOAL-01 GOAL-03
    port fd_on : DataPort { out :>> type : FD_Indication; }
    // @trace CTRL-02 CTX-05 GOAL-03
    port fcs_failed : DataPort { out :>> type : FCS_Failed_Indication; }
    // @trace CTRL-03 CTX-05 GOAL-03
    port ap_status : DataPort { out :>> type : AP_Status; }
    // @trace CTRL-04 CTX-06 GOAL-03
    port ap_on : DataPort { out :>> type : AP_Enable; }
    // @trace CTRL-05 CTX-07 GOAL-02 GOAL-03
    port ap_guidance_request : DataPort { out :>> type : Request_Indication; }
    // @trace CTRL-06 CTX-03 GOAL-02
    port reference_sync_request : DataPort { out :>> type : Request_Indication; }

    // @generated-support sole legal-containment Process; policy-free and not a PART
    // @trace ARCH-01 STRUCT-02 STRUCT-04 STRUCT-06
    part fcs_coordination_process : FCS_Coordination_Process_i;

    // @generated-support root-to-Process boundary route for MON-01 CTX-01
    // @trace MON-01 CTX-01
    connection boundary_display_request : PortConnection
      connect display_fd_request to fcs_coordination_process.display_fd_request;
    // @generated-support root-to-Process boundary route for MON-01 CTX-01
    // @trace MON-01 CTX-01
    connection boundary_display_validity : PortConnection
      connect display_fd_validity to fcs_coordination_process.display_fd_validity;
    // @generated-support root-to-Process boundary route for MON-02 CTX-01
    // @trace MON-02 CTX-01
    connection boundary_sync_request : PortConnection
      connect sync_fd_request to fcs_coordination_process.sync_fd_request;
    // @generated-support root-to-Process boundary route for MON-02 CTX-01
    // @trace MON-02 CTX-01
    connection boundary_sync_validity : PortConnection
      connect sync_fd_validity to fcs_coordination_process.sync_fd_validity;
    // @generated-support root-to-Process boundary route for MON-03 CTX-01
    // @trace MON-03 CTX-01
    connection boundary_engage_request : PortConnection
      connect engage_ap_request to fcs_coordination_process.engage_ap_request;
    // @generated-support root-to-Process boundary route for MON-03 CTX-01
    // @trace MON-03 CTX-01
    connection boundary_engage_validity : PortConnection
      connect engage_ap_validity to fcs_coordination_process.engage_ap_validity;
    // @generated-support root-to-Process boundary route for MON-04 CTX-02
    // @trace MON-04 CTX-02
    connection boundary_attitude_data : PortConnection
      connect attitude_data to fcs_coordination_process.attitude_data;
    // @generated-support root-to-Process boundary route for MON-05 CTX-02
    // @trace MON-05 CTX-02
    connection boundary_attitude_acceptable : PortConnection
      connect attitude_acceptable to fcs_coordination_process.attitude_acceptable;
    // @generated-support root-to-Process boundary route for MON-06 CTX-03
    // @trace MON-06 CTX-03
    connection boundary_reference_state : PortConnection
      connect reference_state to fcs_coordination_process.reference_state;
    // @generated-support root-to-Process boundary route for MON-07 CTX-04
    // @trace MON-07 CTX-04
    connection boundary_ap_availability : PortConnection
      connect ap_availability to fcs_coordination_process.ap_availability;
    // @generated-support Process-to-root boundary route for CTRL-01 CTX-05
    // @trace CTRL-01 CTX-05
    connection boundary_fd_on : PortConnection
      connect fcs_coordination_process.fd_on to fd_on;
    // @generated-support Process-to-root boundary route for CTRL-02 CTX-05
    // @trace CTRL-02 CTX-05
    connection boundary_fcs_failed : PortConnection
      connect fcs_coordination_process.fcs_failed to fcs_failed;
    // @generated-support Process-to-root boundary route for CTRL-03 CTX-05
    // @trace CTRL-03 CTX-05
    connection boundary_ap_status : PortConnection
      connect fcs_coordination_process.ap_status to ap_status;
    // @generated-support Process-to-root boundary route for CTRL-04 CTX-06
    // @trace CTRL-04 CTX-06
    connection boundary_ap_on : PortConnection
      connect fcs_coordination_process.ap_on to ap_on;
    // @generated-support Process-to-root boundary route for CTRL-05 CTX-07
    // @trace CTRL-05 CTX-07
    connection boundary_ap_guidance_request : PortConnection
      connect fcs_coordination_process.ap_guidance_request to ap_guidance_request;
    // @generated-support Process-to-root boundary route for CTRL-06 CTX-03
    // @trace CTRL-06 CTX-03
    connection boundary_reference_sync_request : PortConnection
      connect fcs_coordination_process.reference_sync_request to reference_sync_request;
  }

  // @trace GOAL-01 GOAL-02 GOAL-03 STRUCT-01
  part faa_fcs_coordination : FAA_FCS_Coordination_Root;
}
