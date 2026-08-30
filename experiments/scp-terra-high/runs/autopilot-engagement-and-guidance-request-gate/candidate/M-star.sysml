package FAA_Autopilot_Engagement {

  private import HAMR::*;

  enum def Engage_AP_Command {
    enum Requested;
    enum Not_Requested;
  }

  enum def Engage_Command_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Guidance_Readiness {
    enum Ready;
    enum Not_Ready;
  }

  enum def Attitude_Acceptability {
    enum Acceptable;
    enum Not_Acceptable;
  }

  enum def AP_Availability {
    enum Available;
    enum Failed;
  }

  enum def AP_Guidance_Request {
    enum Requested;
    enum Not_Requested;
  }

  enum def AP_Status {
    enum Failed;
    enum Off;
    enum On;
  }

  enum def AP_On_Indication {
    enum Enabled;
    enum Disabled;
  }

  part def FCI_Command_Intake_Thread :> Thread {
    port engage_ap_in : DataPort { in :>> type : Engage_AP_Command; }
    port command_status_in : DataPort { in :>> type : Engage_Command_Status; }
    port engage_ap_out : DataPort { out :>> type : Engage_AP_Command; }
    port command_status_out : DataPort { out :>> type : Engage_Command_Status; }

    language "GUMBO" /*{
      compute
        compute_cases
          case PART_01_PRESERVE_ENGAGE_COMMAND:
            assume true;
            guarantee engage_ap_out == engage_ap_in;
          case PART_01_PRESERVE_COMMAND_STATUS:
            assume true;
            guarantee command_status_out == command_status_in;
    }*/
       
  }

  part def Engagement_Decision_Thread :> Thread {
    port engage_ap : DataPort { in :>> type : Engage_AP_Command; }
    port command_status : DataPort { in :>> type : Engage_Command_Status; }
    port guidance_valid : DataPort { in :>> type : Guidance_Readiness; }
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    port ap_availability : DataPort { in :>> type : AP_Availability; }
    port ap_guidance_request : DataPort { out :>> type : AP_Guidance_Request; }
    port ap_status : DataPort { out :>> type : AP_Status; }
    port ap_on : DataPort { out :>> type : AP_On_Indication; }

    language "GUMBO" /*{
      compute
        compute_cases
          case FAULT_01_FAILED:
            assume ap_availability == AP_Availability.Failed;
            guarantee ap_guidance_request == AP_Guidance_Request.Not_Requested & ap_status == AP_Status.Failed & ap_on == AP_On_Indication.Disabled;
          case FAULT_02_INVALID_COMMAND:
            assume ap_availability == AP_Availability.Available & command_status == Engage_Command_Status.Invalid;
            guarantee ap_guidance_request == AP_Guidance_Request.Not_Requested & ap_status == AP_Status.Off & ap_on == AP_On_Indication.Disabled;
          case BEH_01_NOT_REQUESTED:
            assume ap_availability == AP_Availability.Available & command_status == Engage_Command_Status.Valid & engage_ap == Engage_AP_Command.Not_Requested;
            guarantee ap_guidance_request == AP_Guidance_Request.Not_Requested & ap_status == AP_Status.Off & ap_on == AP_On_Indication.Disabled;
          case FAULT_03_ATTITUDE_NOT_ACCEPTABLE:
            assume ap_availability == AP_Availability.Available & command_status == Engage_Command_Status.Valid & engage_ap == Engage_AP_Command.Requested & attitude_acceptable == Attitude_Acceptability.Not_Acceptable;
            guarantee ap_guidance_request == AP_Guidance_Request.Not_Requested & ap_status == AP_Status.Off & ap_on == AP_On_Indication.Disabled;
          case BEH_02_WAITING_FOR_GUIDANCE:
            assume ap_availability == AP_Availability.Available & command_status == Engage_Command_Status.Valid & engage_ap == Engage_AP_Command.Requested & attitude_acceptable == Attitude_Acceptability.Acceptable & guidance_valid == Guidance_Readiness.Not_Ready;
            guarantee ap_guidance_request == AP_Guidance_Request.Requested & ap_status == AP_Status.Off & ap_on == AP_On_Indication.Disabled;
          case BEH_03_ENGAGED:
            assume ap_availability == AP_Availability.Available & command_status == Engage_Command_Status.Valid & engage_ap == Engage_AP_Command.Requested & attitude_acceptable == Attitude_Acceptability.Acceptable & guidance_valid == Guidance_Readiness.Ready;
            guarantee ap_guidance_request == AP_Guidance_Request.Not_Requested & ap_status == AP_Status.On & ap_on == AP_On_Indication.Enabled;
    }*/
       
  }

  part def Guidance_Request_Delivery_Thread :> Thread {
    port request_in : DataPort { in :>> type : AP_Guidance_Request; }
    port request_out : DataPort { out :>> type : AP_Guidance_Request; }

    language "GUMBO" /*{
      compute
        compute_cases
          case PART_03_PRESERVE_GUIDANCE_REQUEST:
            assume true;
            guarantee request_out == request_in;
    }*/
       
  }

  part def Status_Reporting_Thread :> Thread {
    port status_in : DataPort { in :>> type : AP_Status; }
    port status_out : DataPort { out :>> type : AP_Status; }

    language "GUMBO" /*{
      compute
        compute_cases
          case PART_04_PRESERVE_AP_STATUS:
            assume true;
            guarantee status_out == status_in;
    }*/
       
  }

  part def CSA_Enable_Delivery_Thread :> Thread {
    port ap_on_in : DataPort { in :>> type : AP_On_Indication; }
    port ap_on_out : DataPort { out :>> type : AP_On_Indication; }

    language "GUMBO" /*{
      compute
        compute_cases
          case PART_05_PRESERVE_AP_ON:
            assume true;
            guarantee ap_on_out == ap_on_in;
    }*/
       
  }

  part def Autopilot_Control_Process :> Process {
    part fci_command_intake : FCI_Command_Intake_Thread;
    part engagement_decision : Engagement_Decision_Thread;
    part guidance_request_delivery : Guidance_Request_Delivery_Thread;
    part status_reporting : Status_Reporting_Thread;
    part csa_enable_delivery : CSA_Enable_Delivery_Thread;

    port engage_ap : DataPort { in :>> type : Engage_AP_Command; }
    port command_status : DataPort { in :>> type : Engage_Command_Status; }
    port guidance_valid : DataPort { in :>> type : Guidance_Readiness; }
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    port ap_availability : DataPort { in :>> type : AP_Availability; }
    port ap_guidance_request : DataPort { out :>> type : AP_Guidance_Request; }
    port ap_status : DataPort { out :>> type : AP_Status; }
    port ap_on : DataPort { out :>> type : AP_On_Indication; }

    connection route_engage_ap_to_intake : PortConnection
      connect engage_ap to fci_command_intake.engage_ap_in;
    connection route_command_status_to_intake : PortConnection
      connect command_status to fci_command_intake.command_status_in;
    connection route_guidance_to_decision : PortConnection
      connect guidance_valid to engagement_decision.guidance_valid;
    connection route_attitude_to_decision : PortConnection
      connect attitude_acceptable to engagement_decision.attitude_acceptable;
    connection route_availability_to_decision : PortConnection
      connect ap_availability to engagement_decision.ap_availability;

    connection int_01_engage_command : PortConnection
      connect fci_command_intake.engage_ap_out to engagement_decision.engage_ap;
    connection int_02_command_status : PortConnection
      connect fci_command_intake.command_status_out to engagement_decision.command_status;
    connection int_03_guidance_request : PortConnection
      connect engagement_decision.ap_guidance_request to guidance_request_delivery.request_in;
    connection int_04_ap_status : PortConnection
      connect engagement_decision.ap_status to status_reporting.status_in;
    connection int_05_ap_on : PortConnection
      connect engagement_decision.ap_on to csa_enable_delivery.ap_on_in;

    connection route_guidance_request_to_boundary : PortConnection
      connect guidance_request_delivery.request_out to ap_guidance_request;
    connection route_status_to_boundary : PortConnection
      connect status_reporting.status_out to ap_status;
    connection route_ap_on_to_boundary : PortConnection
      connect csa_enable_delivery.ap_on_out to ap_on;
  }

  part def Autopilot_Engagement_System :> System {
    part control_process : Autopilot_Control_Process;

    port engage_ap : DataPort { in :>> type : Engage_AP_Command; }
    port command_status : DataPort { in :>> type : Engage_Command_Status; }
    port guidance_valid : DataPort { in :>> type : Guidance_Readiness; }
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    port ap_availability : DataPort { in :>> type : AP_Availability; }
    port ap_guidance_request : DataPort { out :>> type : AP_Guidance_Request; }
    port ap_status : DataPort { out :>> type : AP_Status; }
    port ap_on : DataPort { out :>> type : AP_On_Indication; }

    connection boundary_engage_ap : PortConnection
      connect engage_ap to control_process.engage_ap;
    connection boundary_command_status : PortConnection
      connect command_status to control_process.command_status;
    connection boundary_guidance_valid : PortConnection
      connect guidance_valid to control_process.guidance_valid;
    connection boundary_attitude_acceptable : PortConnection
      connect attitude_acceptable to control_process.attitude_acceptable;
    connection boundary_ap_availability : PortConnection
      connect ap_availability to control_process.ap_availability;
    connection boundary_ap_guidance_request : PortConnection
      connect control_process.ap_guidance_request to ap_guidance_request;
    connection boundary_ap_status : PortConnection
      connect control_process.ap_status to ap_status;
    connection boundary_ap_on : PortConnection
      connect control_process.ap_on to ap_on;
  }

  part autopilot_engagement : Autopilot_Engagement_System;
}
