package FAA_Autopilot_Engagement {

  private import HAMR::*;

  // @trace MON-01 CTX-01 ASM-01
  enum def Engage_AP_Command {
    enum Requested;
    enum Not_Requested;
  }

  // @trace MON-02 CTX-01 ASM-01
  enum def Engage_Command_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-03 CTX-02 ASM-02
  enum def Guidance_Readiness {
    enum Ready;
    enum Not_Ready;
  }

  // @trace MON-04 PILOT-01 CTX-03 ASM-03
  enum def Attitude_Acceptability {
    enum Acceptable;
    enum Not_Acceptable;
  }

  // @trace MON-05 PILOT-02 CTX-04 ASM-03
  enum def AP_Availability {
    enum Available;
    enum Failed;
  }

  // @trace CTRL-01 CTX-02
  enum def AP_Guidance_Request {
    enum Requested;
    enum Not_Requested;
  }

  // @trace CTRL-02 CTX-06
  enum def AP_Status {
    enum Failed;
    enum Off;
    enum On;
  }

  // @trace CTRL-03 CTX-05
  enum def AP_On_Indication {
    enum Enabled;
    enum Disabled;
  }

  // @trace PART-01 ARCH-01
  part def FCI_Command_Intake_Thread :> Thread {
    // @trace MON-01 CTX-01 PART-01
    port engage_ap_in : DataPort { in :>> type : Engage_AP_Command; }
    // @trace MON-02 CTX-01 PART-01
    port command_status_in : DataPort { in :>> type : Engage_Command_Status; }
    // @trace MON-01 INT-01 PART-01
    port engage_ap_out : DataPort { out :>> type : Engage_AP_Command; }
    // @trace MON-02 INT-02 PART-01
    port command_status_out : DataPort { out :>> type : Engage_Command_Status; }

    language "GUMBO" /*{
      compute
        // @trace LC-02 PART-01 INT-01 MON-01
        guarantee PART_01_PRESERVE_ENGAGE_COMMAND "FCI intake delivers the current command value unchanged":
          engage_ap_out == engage_ap_in;
        // @trace LC-02 PART-01 INT-02 MON-02
        guarantee PART_01_PRESERVE_COMMAND_STATUS "FCI intake delivers the current command status unchanged":
          command_status_out == command_status_in;
    }*/
  }

  // @trace PART-02 ARCH-01
  part def Engagement_Decision_Thread :> Thread {
    // @trace MON-01 INT-01 PART-02
    port engage_ap : DataPort { in :>> type : Engage_AP_Command; }
    // @trace MON-02 INT-02 PART-02
    port command_status : DataPort { in :>> type : Engage_Command_Status; }
    // @trace MON-03 CTX-02 PART-02
    port guidance_valid : DataPort { in :>> type : Guidance_Readiness; }
    // @trace MON-04 PILOT-01 CTX-03 PART-02
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    // @trace MON-05 PILOT-02 CTX-04 PART-02
    port ap_availability : DataPort { in :>> type : AP_Availability; }
    // @trace CTRL-01 INT-03 PART-02
    port ap_guidance_request : DataPort { out :>> type : AP_Guidance_Request; }
    // @trace CTRL-02 INT-04 PART-02
    port ap_status : DataPort { out :>> type : AP_Status; }
    // @trace CTRL-03 INT-05 PART-02
    port ap_on : DataPort { out :>> type : AP_On_Indication; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace FAULT-01 GOAL-03 RISK-01 LC-01 MON-05 CTRL-01 CTRL-02 CTRL-03
          case FAULT_01_FAILED "A failed AP reports Failed, disables AP On, and does not request guidance":
            assume ap_availability == AP_Availability.Failed;
            guarantee ap_guidance_request == AP_Guidance_Request.Not_Requested &
                      ap_status == AP_Status.Failed &
                      ap_on == AP_On_Indication.Disabled;

          // @trace FAULT-02 GOAL-01 GOAL-03 RISK-01 LC-01 MON-02 MON-05 CTRL-01 CTRL-02 CTRL-03
          case FAULT_02_INVALID_COMMAND "An available AP with an invalid command reports Off, disables AP On, and does not request guidance":
            assume ap_availability == AP_Availability.Available &
                   command_status == Engage_Command_Status.Invalid;
            guarantee ap_guidance_request == AP_Guidance_Request.Not_Requested &
                      ap_status == AP_Status.Off &
                      ap_on == AP_On_Indication.Disabled;

          // @trace BEH-01 GOAL-01 GOAL-03 LC-01 MON-01 MON-02 MON-05 CTRL-01 CTRL-02 CTRL-03
          case BEH_01_NOT_REQUESTED "A valid current Not Requested command reports Off, disables AP On, and does not request guidance":
            assume ap_availability == AP_Availability.Available &
                   command_status == Engage_Command_Status.Valid &
                   engage_ap == Engage_AP_Command.Not_Requested;
            guarantee ap_guidance_request == AP_Guidance_Request.Not_Requested &
                      ap_status == AP_Status.Off &
                      ap_on == AP_On_Indication.Disabled;

          // @trace FAULT-03 GOAL-01 GOAL-03 RISK-02 LC-01 MON-01 MON-02 MON-04 MON-05 CTRL-01 CTRL-02 CTRL-03
          case FAULT_03_ATTITUDE_NOT_ACCEPTABLE "A valid request at a not-acceptable attitude reports Off, disables AP On, and does not request guidance":
            assume ap_availability == AP_Availability.Available &
                   command_status == Engage_Command_Status.Valid &
                   engage_ap == Engage_AP_Command.Requested &
                   attitude_acceptable == Attitude_Acceptability.Not_Acceptable;
            guarantee ap_guidance_request == AP_Guidance_Request.Not_Requested &
                      ap_status == AP_Status.Off &
                      ap_on == AP_On_Indication.Disabled;

          // @trace BEH-02 GOAL-02 GOAL-03 LC-01 MON-01 MON-02 MON-03 MON-04 MON-05 CTRL-01 CTRL-02 CTRL-03
          case BEH_02_WAITING_FOR_GUIDANCE "An otherwise engageable request waiting for guidance requests synchronization while remaining Off and disabled":
            assume ap_availability == AP_Availability.Available &
                   command_status == Engage_Command_Status.Valid &
                   engage_ap == Engage_AP_Command.Requested &
                   attitude_acceptable == Attitude_Acceptability.Acceptable &
                   guidance_valid == Guidance_Readiness.Not_Ready;
            guarantee ap_guidance_request == AP_Guidance_Request.Requested &
                      ap_status == AP_Status.Off &
                      ap_on == AP_On_Indication.Disabled;

          // @trace BEH-03 GOAL-01 GOAL-03 LC-01 MON-01 MON-02 MON-03 MON-04 MON-05 CTRL-01 CTRL-02 CTRL-03
          case BEH_03_ENGAGED "An available valid request at acceptable attitude with ready guidance reports On and enables AP On without requesting synchronization":
            assume ap_availability == AP_Availability.Available &
                   command_status == Engage_Command_Status.Valid &
                   engage_ap == Engage_AP_Command.Requested &
                   attitude_acceptable == Attitude_Acceptability.Acceptable &
                   guidance_valid == Guidance_Readiness.Ready;
            guarantee ap_guidance_request == AP_Guidance_Request.Not_Requested &
                      ap_status == AP_Status.On &
                      ap_on == AP_On_Indication.Enabled;
    }*/
  }

  // @trace PART-03 ARCH-01
  part def Guidance_Request_Delivery_Thread :> Thread {
    // @trace CTRL-01 INT-03 PART-03
    port request_in : DataPort { in :>> type : AP_Guidance_Request; }
    // @trace CTRL-01 CTX-02 PART-03
    port request_out : DataPort { out :>> type : AP_Guidance_Request; }

    language "GUMBO" /*{
      compute
        // @trace LC-03 PART-03 INT-03 CTRL-01
        guarantee PART_03_PRESERVE_GUIDANCE_REQUEST "Guidance-request delivery preserves the current decision unchanged":
          request_out == request_in;
    }*/
  }

  // @trace PART-04 ARCH-01
  part def Status_Reporting_Thread :> Thread {
    // @trace CTRL-02 INT-04 PART-04
    port status_in : DataPort { in :>> type : AP_Status; }
    // @trace CTRL-02 CTX-06 PART-04
    port status_out : DataPort { out :>> type : AP_Status; }

    language "GUMBO" /*{
      compute
        // @trace LC-03 PART-04 INT-04 CTRL-02
        guarantee PART_04_PRESERVE_AP_STATUS "Status reporting preserves the current decision unchanged":
          status_out == status_in;
    }*/
  }

  // @trace PART-05 ARCH-01
  part def CSA_Enable_Delivery_Thread :> Thread {
    // @trace CTRL-03 INT-05 PART-05
    port ap_on_in : DataPort { in :>> type : AP_On_Indication; }
    // @trace CTRL-03 CTX-05 PART-05
    port ap_on_out : DataPort { out :>> type : AP_On_Indication; }

    language "GUMBO" /*{
      compute
        // @trace LC-03 PART-05 INT-05 CTRL-03
        guarantee PART_05_PRESERVE_AP_ON "CSA-enable delivery preserves the current decision unchanged":
          ap_on_out == ap_on_in;
    }*/
  }

  // @generated-support legal HAMR Process containment for PART-01 through PART-05
  // @trace ARCH-02 BND-01 BND-03 BND-04 LC-04
  part def Autopilot_Control_Process :> Process {
    // @trace PART-01
    part fci_command_intake : FCI_Command_Intake_Thread;
    // @trace PART-02
    part engagement_decision : Engagement_Decision_Thread;
    // @trace PART-03
    part guidance_request_delivery : Guidance_Request_Delivery_Thread;
    // @trace PART-04
    part status_reporting : Status_Reporting_Thread;
    // @trace PART-05
    part csa_enable_delivery : CSA_Enable_Delivery_Thread;

    // @generated-support typed Process boundary port for MON-01 boundary routing
    // @trace MON-01 CTX-01 PART-01
    port engage_ap : DataPort { in :>> type : Engage_AP_Command; }
    // @generated-support typed Process boundary port for MON-02 boundary routing
    // @trace MON-02 CTX-01 PART-01
    port command_status : DataPort { in :>> type : Engage_Command_Status; }
    // @generated-support typed Process boundary port for MON-03 boundary routing
    // @trace MON-03 CTX-02 PART-02
    port guidance_valid : DataPort { in :>> type : Guidance_Readiness; }
    // @generated-support typed Process boundary port for MON-04 boundary routing
    // @trace MON-04 PILOT-01 CTX-03 PART-02
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    // @generated-support typed Process boundary port for MON-05 boundary routing
    // @trace MON-05 PILOT-02 CTX-04 PART-02
    port ap_availability : DataPort { in :>> type : AP_Availability; }
    // @generated-support typed Process boundary port for CTRL-01 boundary routing
    // @trace CTRL-01 CTX-02 PART-03
    port ap_guidance_request : DataPort { out :>> type : AP_Guidance_Request; }
    // @generated-support typed Process boundary port for CTRL-02 boundary routing
    // @trace CTRL-02 CTX-06 PART-04
    port ap_status : DataPort { out :>> type : AP_Status; }
    // @generated-support typed Process boundary port for CTRL-03 boundary routing
    // @trace CTRL-03 CTX-05 PART-05
    port ap_on : DataPort { out :>> type : AP_On_Indication; }

    // @generated-support Process-to-Thread route for MON-01
    // @trace MON-01 PART-01 BND-04
    connection route_engage_ap_to_intake : PortConnection
      connect engage_ap to fci_command_intake.engage_ap_in;
    // @generated-support Process-to-Thread route for MON-02
    // @trace MON-02 PART-01 BND-04
    connection route_command_status_to_intake : PortConnection
      connect command_status to fci_command_intake.command_status_in;
    // @generated-support Process-to-Thread route for MON-03
    // @trace MON-03 PART-02 BND-04
    connection route_guidance_to_decision : PortConnection
      connect guidance_valid to engagement_decision.guidance_valid;
    // @generated-support Process-to-Thread route for MON-04
    // @trace MON-04 PILOT-01 PART-02 BND-04
    connection route_attitude_to_decision : PortConnection
      connect attitude_acceptable to engagement_decision.attitude_acceptable;
    // @generated-support Process-to-Thread route for MON-05
    // @trace MON-05 PILOT-02 PART-02 BND-04
    connection route_availability_to_decision : PortConnection
      connect ap_availability to engagement_decision.ap_availability;

    // @trace INT-01 PART-01 PART-02 MON-01
    connection int_01_engage_command : PortConnection
      connect fci_command_intake.engage_ap_out to engagement_decision.engage_ap;
    // @trace INT-02 PART-01 PART-02 MON-02
    connection int_02_command_status : PortConnection
      connect fci_command_intake.command_status_out to engagement_decision.command_status;
    // @trace INT-03 PART-02 PART-03 CTRL-01
    connection int_03_guidance_request : PortConnection
      connect engagement_decision.ap_guidance_request to guidance_request_delivery.request_in;
    // @trace INT-04 PART-02 PART-04 CTRL-02
    connection int_04_ap_status : PortConnection
      connect engagement_decision.ap_status to status_reporting.status_in;
    // @trace INT-05 PART-02 PART-05 CTRL-03
    connection int_05_ap_on : PortConnection
      connect engagement_decision.ap_on to csa_enable_delivery.ap_on_in;

    // @generated-support Thread-to-Process route for CTRL-01
    // @trace CTRL-01 PART-03 BND-04
    connection route_guidance_request_to_boundary : PortConnection
      connect guidance_request_delivery.request_out to ap_guidance_request;
    // @generated-support Thread-to-Process route for CTRL-02
    // @trace CTRL-02 PART-04 BND-04
    connection route_status_to_boundary : PortConnection
      connect status_reporting.status_out to ap_status;
    // @generated-support Thread-to-Process route for CTRL-03
    // @trace CTRL-03 PART-05 BND-04
    connection route_ap_on_to_boundary : PortConnection
      connect csa_enable_delivery.ap_on_out to ap_on;
  }

  // @trace GOAL-01 GOAL-02 GOAL-03 ARCH-01 ARCH-02 BND-01 BND-03
  part def Autopilot_Engagement_System :> System {
    // @generated-support legal HAMR containment for the behavior-free Control Process
    // @trace ARCH-02 BND-01 BND-03
    part control_process : Autopilot_Control_Process;

    // @trace MON-01 CTX-01 ASM-01
    port engage_ap : DataPort { in :>> type : Engage_AP_Command; }
    // @trace MON-02 CTX-01 ASM-01
    port command_status : DataPort { in :>> type : Engage_Command_Status; }
    // @trace MON-03 CTX-02 ASM-02
    port guidance_valid : DataPort { in :>> type : Guidance_Readiness; }
    // @trace MON-04 PILOT-01 CTX-03 ASM-03
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    // @trace MON-05 PILOT-02 CTX-04 ASM-03
    port ap_availability : DataPort { in :>> type : AP_Availability; }
    // @trace CTRL-01 CTX-02
    port ap_guidance_request : DataPort { out :>> type : AP_Guidance_Request; }
    // @trace CTRL-02 CTX-06
    port ap_status : DataPort { out :>> type : AP_Status; }
    // @trace CTRL-03 CTX-05
    port ap_on : DataPort { out :>> type : AP_On_Indication; }

    // @generated-support root-to-Process route for MON-01 boundary routing
    // @trace MON-01 CTX-01 BND-04
    connection boundary_engage_ap : PortConnection
      connect engage_ap to control_process.engage_ap;
    // @generated-support root-to-Process route for MON-02 boundary routing
    // @trace MON-02 CTX-01 BND-04
    connection boundary_command_status : PortConnection
      connect command_status to control_process.command_status;
    // @generated-support root-to-Process route for MON-03 boundary routing
    // @trace MON-03 CTX-02 BND-04
    connection boundary_guidance_valid : PortConnection
      connect guidance_valid to control_process.guidance_valid;
    // @generated-support root-to-Process route for MON-04 boundary routing
    // @trace MON-04 PILOT-01 CTX-03 BND-04
    connection boundary_attitude_acceptable : PortConnection
      connect attitude_acceptable to control_process.attitude_acceptable;
    // @generated-support root-to-Process route for MON-05 boundary routing
    // @trace MON-05 PILOT-02 CTX-04 BND-04
    connection boundary_ap_availability : PortConnection
      connect ap_availability to control_process.ap_availability;
    // @generated-support Process-to-root route for CTRL-01 boundary routing
    // @trace CTRL-01 CTX-02 BND-04
    connection boundary_ap_guidance_request : PortConnection
      connect control_process.ap_guidance_request to ap_guidance_request;
    // @generated-support Process-to-root route for CTRL-02 boundary routing
    // @trace CTRL-02 CTX-06 BND-04
    connection boundary_ap_status : PortConnection
      connect control_process.ap_status to ap_status;
    // @generated-support Process-to-root route for CTRL-03 boundary routing
    // @trace CTRL-03 CTX-05 BND-04
    connection boundary_ap_on : PortConnection
      connect control_process.ap_on to ap_on;
  }

  // @trace GOAL-01 GOAL-02 GOAL-03 BND-01
  part autopilot_engagement : Autopilot_Engagement_System;
}

